// Count Distinct Elements in Every Window
// TC->O(nk^2)

// import java.util.ArrayList;
// import java.util.List;

// public class distinctElementPerWindow {
//     public static void main(String[] args){
//         int[] arr = {1,2,1,3,4,2,3};
//         int k=4;
//         System.out.println(distincts(arr,k));
//     }

//     public static List<Integer> distincts(int[] arr, int k){
//         int n=arr.length;

//         List<Integer> ans = new ArrayList<>();

//         for(int i=0; i<=n-k; i++){
//             int count=0;
//             for(int j=i; j<i+k; j++){
                
//                 boolean isFound=false;

//                 for(int l=i; l<j; l++){
//                     if(arr[j] == arr[l]){
//                         isFound=true;
//                         break;
//                     }
//                 }

//                 if(!isFound){
//                     count++;
//                 }

//             }

//             ans.add(count);
//         }
//         return ans;
//     }
// }


// Approach 2 -> freq array

import java.util.List;
import java.util.ArrayList;

public class distinctElementPerWindow{
    public static void main(String[] args){
        int[] arr = {1,2,1,3,4,2,3};
        int k=4;
        System.out.println(distincts(arr,k));
    }

    public static void freq(int[] arr, int left, int right, int[] temp){

        for(int i=left; i<right; i++){
            temp[arr[i]]++;
        }
    }

    public static List<Integer> distincts(int[] arr, int k){

        List<Integer> ans = new ArrayList<>();
        int n=arr.length;

        
        int left=0, right=k;
        
        while(right<=n){
            int max=0;
            int count=0;

            for(int i=left; i<right; i++){
            max=Math.max(max,arr[i]);
            }

            int[] temp=new int[max+1];
            freq(arr,left,right,temp);

            for(int ele:temp){
                if(ele>0){
                    count++;
                }
            }
            ans.add(count);
            right++;
            left++;
        }
        return ans;
    }
}