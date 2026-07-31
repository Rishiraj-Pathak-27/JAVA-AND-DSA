// You are given an integer array nums and an integer k.
// The frequency of an element x is the number of times it occurs in an array.
// An array is called good if the frequency of each element in this array is less than or equal to k.
// Return the length of the longest good subarray of nums.
// A subarray is a contiguous non-empty sequence of elements within an array.

public class longestSubarrayWithAtmostKFreq {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,3,1,2};
        int k=2;
        System.out.println(longestSubarray(arr,k));
    }    

    public static int longestSubarray(int[] arr, int k){
        int n=arr.length;
        int left=0,right=0;
        int max=0;

        for(int i=0; i<n; i++){
            max=Math.max(arr[i],max);
        }

        int[] temp = new int[max+1];
        int maxLen=0;
        while(right<n){
            temp[arr[right]]++;
            if(temp[arr[right]] > k){
                temp[arr[left]]--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
