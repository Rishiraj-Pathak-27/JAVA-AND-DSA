// Given an integer array nums of unique elements, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.

import java.util.ArrayList;
import java.util.List;

public class subsets{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(subsequences(arr));
    }

    public static void helper(List<Integer> res, int[] arr, int idx, List<List<Integer>> ans){
        int n=arr.length;

        if(idx==n){
            ans.add(new ArrayList<>(res));
            return;
        }

        res.add(arr[idx]);
        helper(res,arr,idx+1,ans);
        res.remove(res.size()-1);
        helper(res,arr,idx+1,ans);
    }

    public static List<List<Integer>> subsequences(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        helper(res,arr,0,ans);
        return ans;
    }
}