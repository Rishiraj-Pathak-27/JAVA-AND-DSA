// Given an integer array nums, return the number of longest increasing subsequences.

// Notice that the sequence has to be strictly increasing.


public class totalLongestContinuousSubsqeuence {
    public static void main(String[] args){
        int[] arr=  {1,3,5,4,7};
        System.out.println(totalLongestSubsqeuence(arr));
    }    

    public static int totalLongestSubsqeuence(int[] arr){
        int n=arr.length;
        int left=0, right=1;
        int count=0;
        if(n==0) return 0;

        while(right<n){
            if(arr[right]<=arr[right-1]){
                left=right;
                count++;
            }

            right++;
            
        }
        count++;
        return count;

    }
}
