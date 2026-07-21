// Smallest Subarray with Sum ≥ S

public class smallestSubarraySum{
    public static void main(String[] args){
        int[] arr = {2,1,5,2,3,2};
        int target=7;
        System.out.println(sumGreaterThanK(arr,target));
    }

    public static int sumGreaterThanK(int[] arr, int target){
        int n=arr.length;
        int sum=0;
        int left=0, right=0;
        int min=Integer.MAX_VALUE;

        while(right<n){
            sum+=arr[right];

            while(sum>=target) { 
                min=Math.min(min,right-left+1);
                sum-=arr[left];
                left++;
            }

            right++;
        }
        if(min>n){
            return 0;
        }else{
            return min;
        }
    }
}   