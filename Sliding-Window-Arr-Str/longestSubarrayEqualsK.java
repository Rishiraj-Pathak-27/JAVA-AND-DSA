// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

public class longestSubarrayEqualsK{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k=3;
        System.out.println(longestSubarray(arr,k));
    }

    public static int longestSubarray(int[] arr, int k){
        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];

                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}