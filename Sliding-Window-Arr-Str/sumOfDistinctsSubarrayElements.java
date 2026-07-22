// You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

// The length of the subarray is k, and
// All the elements of the subarray are distinct.
// Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

// A subarray is a contiguous non-empty sequence of elements within an array.

public class sumOfDistinctsSubarrayElements {
    public static void main(String[] args){
        int[] arr = {1,5,4,2,9,9,9};
        int k=3;
        System.out.println(sumOfDistincts(arr,k));
    }

    public static void freq(int[] arr, int left, int right, int[] temp){
        for(int i=left; i<right; i++){
            temp[arr[i]]++;
        }
    }

    public static int sumOfDistincts(int[] arr, int k){
        int n=arr.length;
        int maxSum=0;
        int left=0, right=k;
        
        while(right<=n){
            int sum=0;
            int max=0;  

            for(int i=left; i<right; i++){
                sum+=arr[i];
                max=Math.max(max,arr[i]);
            }

            int[] temp=new int[max+1];
            freq(arr,left,right,temp);

            boolean isDistincts = true;

            for(int i=0; i<temp.length; i++){
                if(temp[i]>1){
                    isDistincts=false;
                    break;
                }
            }

            if(isDistincts){
                maxSum=Math.max(maxSum,sum);
            }

            right++;
            left++;
        }
        return maxSum;
    }
}
