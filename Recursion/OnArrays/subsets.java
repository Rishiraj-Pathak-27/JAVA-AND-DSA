// Given an integer array nums of unique elements, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.

import java.util.ArrayList;
import java.util.List;

public class subsets{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsetsPrint(arr));
        
    }

    public static List<List<Integer>> subsetsPrint(int[] arr){

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(ans,arr,0,list);
        return list;
    }
    public static void helper(List<Integer> ans, int[] arr, int idx, List<List<Integer>> list){
        int n = arr.length;

        if(n==idx) {
            list.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[idx]);
        helper(ans,arr,idx+1,list);
        ans.remove(ans.size()-1);
        helper(ans,arr,idx+1,list);
    }
}