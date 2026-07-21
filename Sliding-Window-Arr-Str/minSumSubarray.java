// Minimum Sum Subarray of Size K
// Given an integer array arr and an integer K, return the minimum sum among all contiguous subarrays of size K.

public class minSumSubarray{
    public static void main(String[] args){
        int[] arr = {3,1,2,4,5,1,9,6};
        int k=3;
        System.out.println(minSum(arr,k));
    }

    public static int minSum(int[] arr, int k){
        int n=arr.length;
        int left=0,right=k-1,sum=0;

        for(int i=0; i<k; i++){
            sum+=arr[i];
        }

        int min=sum;

        while(right<n-1){
            sum-=arr[left];
            right++;
            sum+=arr[right];
            left++;
            min=Math.min(min,sum);
        }
        return min;
    }
}