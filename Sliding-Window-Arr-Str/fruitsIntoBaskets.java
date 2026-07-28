// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.

// Brute Force Approach 
// TC -> O(N^2) & SC -> O(N)

// import java.util.HashSet;
// public class fruitsIntoBaskets {
//     public static void main(String[] args){
//         int[] arr = {1,2,3,2,2};
//         System.out.println(addFruits(arr));
//     }    

//     public static int addFruits(int[] arr){
//         int n=arr.length;
//         int max=0; 
//         for(int i=0; i<n; i++){
//             HashSet<Integer> set = new HashSet<>();
//             for(int j=i; j<n; j++){
//                 set.add(arr[j]);
//                 if(set.size()<=2){
//                     max=Math.max(max,j-i+1);
//                 }
//             }
//         }
//         return max;
//     }
// }

// Optimal Approach -> Sliding Window
// TC -> O(N+N) SC -> O(N)

import java.util.HashMap;
public class fruitsIntoBaskets{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,2};
        System.out.println(addFruits(arr));
    }

    public static int addFruits(int[] arr){
        int n=arr.length;
        int left=0;
        int right=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen=0;

        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right], 0)+1);
            while(map.size()>2){
                int leftFruit=arr[left];
                map.put(leftFruit,map.get(leftFruit)-1);
                if(map.get(leftFruit)==0){
                    map.remove(leftFruit);
                    left++;
                }
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}