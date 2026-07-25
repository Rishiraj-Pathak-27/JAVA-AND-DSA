// Longest Continuous Increasing Subarray

public class longestContinuousIncreasingSubarray {
    public static void main(String[] args){
        int[] arr = {1,3,5,4,7};
        System.out.println(maxLength(arr));
    }

    public static int maxLength(int[] arr){
        int n=arr.length;

        int left=0,right=1;
        if(n==0) return 0;
        int max=1;

        while(right<n){
           if(arr[right]<=arr[right-1]){
            left=right;
           }

           max=Math.max(max,right-left+1);
           right++;
        }
        return max;
    }
}
