// Minimum Length Subarray with Sum > X

public class minLengthSubarraySumGreaterThanX {
    public static void main(String[] args){
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x=55;
        System.out.println(minLenSubarray(arr,x));
    }   

    public static int minLenSubarray(int[] arr, int x){
        int n=arr.length;
        int left=0,right=0,sum=0;
        int min=Integer.MAX_VALUE;

        while(right<n){
            sum+=arr[right];

            while(sum>x){
                min=Math.min(min,right-left+1);
                sum-=arr[left];
                left++;
            }

            right++;
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}
