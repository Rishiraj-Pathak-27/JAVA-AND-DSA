// Given an array arr of integers, return the sums of all subsets in the list.
// Return the sums in any order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class subsetSum{
    public static void main(String[] args){
        int[] arr = {1,2,1};
        System.out.println(sum(arr));
    }

    public static void helper(List<Integer> ans, int[] arr, int idx, int currSum){
        int n=arr.length;

        if(n==idx){
            ans.add(currSum);
            return;
        }

        helper(ans,arr,idx+1,currSum+arr[idx]);
        helper(ans,arr,idx+1,currSum);
    }

    public static List<Integer> sum(int[] arr){
        List<Integer> ans = new ArrayList<>();
        helper(ans,arr,0,0);
        Collections.sort(ans);
        return ans;
    }
}