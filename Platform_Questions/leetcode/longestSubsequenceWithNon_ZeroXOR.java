// 3702. Longest Subsequence With Non-Zero Bitwise XOR
// You are given an integer array nums.

// Return the length of the longest subsequence in nums whose bitwise XOR is non-zero. If no such subsequence exists, return 0.


public class longestSubsequenceWithNon_ZeroXOR{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(longestSubsequence(arr));
    }

    public static int longestSubsequence(int[] arr){
        int xor=0;
        boolean isZero=false;
        int n=arr.length;

        for(int ele:arr){
            xor ^= ele;
            if(ele!=0) isZero=true;
        }

        if(xor>0) return n;

        if(isZero) return n-1;
        return 0;
    }
}