// Average of Every Subarray of Size K
// Given an array of integers and an integer K, return the average of every contiguous subarray of size K.

import java.util.Arrays;
public class subarrayAverageEqualsK{
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,-1,4,1,8,2};
        int k=5;
        System.out.println(Arrays.toString(subarrayAverage(arr, k)));
    }

    public static int[] subarrayAverage(int[] arr, int k){
        int n=arr.length;
        int left=0;
        int sum=0;

        int[] ans=new int[n-k+1];

        for(int right=0; right<n; right++){
            sum+=arr[left];

            if(right>=k-1){
                ans[left]=sum/2;
                sum-=arr[left];
                left++;
            }
        }
        return ans;
    }
}