// Hash Set Approach

// import java.util.ArrayList;
// import java.util.HashSet;
// public class missingElementInRange {
//     public static void main(String[] args){
//         int[] arr = {1, 4, 11, 51, 15};
//         int low=50,high=55;
//         System.out.println(missingElement(arr,low,high));
//     }

//     public static ArrayList<Integer> missingElement(int[] arr, int low, int high){
//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int ele:arr)  set.add(ele);

//         for(int i=low; i<=high; i++){
//             if(!(set.contains(i))){
//                 ans.add(i); 
//             }
//         }
//         return ans;
//     }
// }


// OR

import java.util.ArrayList;
public class missingElementInRange {
    public static void main(String[] args){
        int[] arr = {1, 4, 11, 51, 15};
        int low=50,high=55;
        System.out.println(missingElement(arr,low,high));
    }

    public static ArrayList<Integer> missingElement(int[] arr, int low, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] temp = new int[high-low+1];

        for(int ele:arr) {
            if(ele>=low && ele<=high){
                temp[ele-low]++;
            }
        }

        for(int i=low; i<=high; i++){
            if(temp[i-low]==0) ans.add(i);
        }
        return ans;
    }
}

