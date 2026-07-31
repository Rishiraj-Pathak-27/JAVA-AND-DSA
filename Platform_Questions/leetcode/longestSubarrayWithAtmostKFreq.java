// 2958. Length of Longest Subarray With at Most K Frequency

public class longestSubarrayWithAtmostKFreq {
    public static void main(String[] args){
        int[] arr = {5,5,5,5,5,5,5};
        int k=4;
        System.out.println(longestSubarray(arr,k));
    }

    public static int longestSubarray(int[] arr, int k){
        int n=arr.length;
        int left=0,right=0, max=0, maxLen=0;

        for(int ele:arr){
            max=Math.max(max,ele);
        }

        int[] temp = new int[max+1];

        while(right<n){
            temp[arr[right]]++;
            if(temp[arr[right]]>k){
                temp[arr[left]]--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
