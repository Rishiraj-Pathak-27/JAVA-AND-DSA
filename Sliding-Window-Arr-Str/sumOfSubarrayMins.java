// Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr.
// Since the answer may be large, return the answer modulo 109 + 7.

public class sumOfSubarrayMins{
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(subarraySumMins(arr));
    }

    public static int subarraySumMins(int[] arr){
        int n=arr.length;
        long sum=0;
        long mod=1000000007;

        for(int i=0; i<n; i++){
            int min=Integer.MAX_VALUE;
            for(int j=i; j<n; j++){
                min=Math.min(min,arr[j]);
                sum=(sum+min) % mod;
            }
        }
        return (int)sum;
    }
}