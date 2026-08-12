// 2958. Length of Longest Subarray With at Most K Frequency

import java.util.HashMap;

public class longestSubarrayWithFreqK {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,3,1,2};
        int k=2;
        System.out.println(freqK(arr,k));
    }

    public static int freqK(int[] arr, int k){
        int n=arr.length;
        int left=0, right=0;
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.get(arr[right]) > k){
                map.put(arr[left],map.get(arr[left])-1);
                left++;
            }

            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
