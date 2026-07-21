// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.

public class minimumSizeSubarraySum{
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSizeSubarray(arr,target));
    }

    public static int minSizeSubarray(int[] arr, int target){
        int n=arr.length;
        int left=0, right=0;
        int min=Integer.MAX_VALUE;
        int sum=0;

        // main while loop to add new elements and expand window
        while(right<n){
            sum+=arr[right];

            // if sum>=target we use this while loop and cal min window len -> subtract the lefting element -> shrink the window until sum<=target 
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum-=arr[left];
                left++;
            }

            // if the sum<=target then right++ proceed to expand the pointer right
            right++;
        }
                
        if(min>n){
            return 0;
        }else{
            return min;
        }
    }
}