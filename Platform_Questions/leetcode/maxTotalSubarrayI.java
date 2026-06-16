// 3689. Maximum Total Subarray Value I

// You are given an integer array nums of length n and an integer k.
// You need to choose exactly k non-empty subarrays nums[l..r] of nums. Subarrays may overlap, and the exact same subarray (same l and r) can be chosen more than once.
// The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).
// The total value is the sum of the values of all chosen subarrays.
// Return the maximum possible total value you can achieve.

public class maxTotalSubarrayI{
    public static long maxTotal(int[] arr, int k){
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele:arr){
            min=Math.min(ele,min);
            max=Math.max(ele,max);
        }
        return 1L*k*(max-min);
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,1};
        int k=3;

        System.out.println(maxTotal(arr,k));
    }
}