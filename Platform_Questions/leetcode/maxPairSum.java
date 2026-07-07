// You are given an integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the largest digit in both numbers is equal.
// For example, 2373 is made up of three distinct digits: 2, 3, and 7, where 7 is the largest among them.
// Return the maximum sum or -1 if no such pair exists.

// Approach 1 O(N^2)

// public class maxPairSum {

//     public static void main(String[] args) {
//         int[] arr = {2536, 1613, 3366, 162};
//         System.out.println(maxSum(arr));

//     }

//     public static int max(int a) {
//         int max = 0;
//         while (a > 0) {
//             int rem = a % 10;
//             max = Math.max(max, rem);
//             a /= 10;
//         }
//         return max;
//     }

//     public static int maxSum(int[] arr) {
//         int n = arr.length;
//         int ans = -1;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {

//                 if (max(arr[i]) == max(arr[j])) {
//                     ans = Math.max(ans,arr[i]+arr[j]);
//                 }
//             }
//         }
//         return ans;
//     }
// }

// Approach 2 (O(N))

import java.util.Arrays;
public class maxPairSum{
    public static void main(String[] args) {
        int[] arr = {2536, 1613, 3366, 162};
        System.out.println(maxSum(arr));
    }

    public static int max(int a){
        int max=0;
        while(a!=0){
            int rem=a%10;
            max=Math.max(max,rem);
            a/=10;
        }
        return max;
    }

    public static int maxSum(int[] arr){
        int ans=-1;
        int[] temp=new int[10];
        Arrays.fill(temp,-1);

        for(int ele:arr){
            int maxDigit=max(ele);
            if(temp[maxDigit]!=-1){
                ans = Math.max(ans,temp[maxDigit]+ele);
            }
            temp[maxDigit] = Math.max(temp[maxDigit],ele);
        }
        return ans;
    }
}