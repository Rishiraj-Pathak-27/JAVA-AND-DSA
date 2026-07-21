// Count Even Numbers in Every Window
// Given an integer array and a window size K, return the count of even numbers in every contiguous subarray of size K.

// import java.util.ArrayList;
// public class countEven{
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,5,6};
//         int k=3;
//         System.out.println(even(arr,k));
//     }

//     public static ArrayList<Integer> even(int[] arr, int k){
//         int n=arr.length;

//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int i=0; i<=n-k; i++){
//             int count=0;
//             for(int j=i; j<i+k; j++){
//                 if(arr[j]%2==0){
//                     count++;
//                 }
//             }
//             ans.add(count);

//         }
//     return ans;
//     }
// }
