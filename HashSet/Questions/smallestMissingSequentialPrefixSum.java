// You are given a 0-indexed array of integers nums.
// A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.
// Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.

import java.util.HashSet;

public class smallestMissingSequentialPrefixSum {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,12,14,13};
        System.out.println(missingInteger(arr));
    }

    public static int missingInteger(int[] arr){
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        int sum=arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]==(arr[i-1]+1)) sum+=arr[i];
            else break;
        }

        for(int ele:arr) {
            if(ele>=sum) set.add(ele);
        }

        while(set.contains(sum)) sum++;
        return sum;
    }
}
