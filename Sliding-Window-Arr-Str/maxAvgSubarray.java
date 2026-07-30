// You are given an integer array nums consisting of n elements, and an integer k.
// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

public class maxAvgSubarray{
    public static void main(String[] args){
        int[] arr = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(maxMean(arr,k));
    }

    public static double maxMean(int[] arr, int k){
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int left=0,right=0;

        // till right < n
        while(right<n){
            sum+=arr[right];
            // window sliding loop
            if(right-left+1==k){
                max=Math.max(max,sum);
                sum-=arr[left];
                left++;
            }
            right++;
        }
    return (double)max/k;
    }
}
