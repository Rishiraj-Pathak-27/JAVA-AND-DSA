// 3471. Find the Largest Almost Missing Integer

// You are given an integer array nums and an integer k.
// An integer x is almost missing from nums if x appears in exactly one subarray of size k within nums.
// Return the largest almost missing integer from nums. If no such integer exists, return -1.
// A subarray is a contiguous sequence of elements within an array.

import java.util.HashMap;

public class largestAlmostMissing{
    public static void main(String[] args){
        int[] arr = {3,9,2,1,7};
        int k=3;
        System.out.println(almostMissing(arr,k));
    }

    public static int almostMissing(int[] arr, int k){
        int n=arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele:arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        if(k==1){
            int ans=-1;

            for(int i=0; i<n; i++){
                if(map.get(arr[i])==1 && arr[i]>ans){
                    ans=arr[i];
                }
            }
            return ans;
        }

        else if(k==n){
            int max=0;
            for(int i=0; i<n; i++){

                max=Math.max(max,arr[i]);
            }
            return max;
        }

        else{
            int left=arr[0], right=arr[n-1];

            boolean leftCount=map.get(left)==1;
            boolean rightCount=map.get(right)==1;

            if(leftCount && rightCount) return Math.max(left,right);

            if(leftCount) return left;

            if(rightCount) return right;

            return -1;
        }

    }
}