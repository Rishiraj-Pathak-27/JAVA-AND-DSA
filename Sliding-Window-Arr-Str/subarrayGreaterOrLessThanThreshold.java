// Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

import java.util.Scanner;

public class subarrayGreaterOrLessThanThreshold {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        int k = ip.nextInt();
        int threshold = ip.nextInt();

        System.out.println(helper(arr,k,threshold));

    }

    public static int helper(int[] arr, int k, int threshold) {
        int n=arr.length;
        int count=0;
        int left=0,right=0;
        int sum=0;

        while(right<n){
            sum+=arr[right];

            if(right-left+1==k){
                if((sum/k)>=threshold){
                    count++;
                }
                sum-=arr[left];
                left++;
            }
            right++;
        }
        return count;
    }
}
