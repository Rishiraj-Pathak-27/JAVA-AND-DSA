// 78. Subsets

// Best Recursive Approach to find out subsets

import java.util.ArrayList;
import java.util.List;

public class subsets{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsetsPrint(arr));
    }

    public static List<List<Integer>> subsetsPrint(int[] arr){

        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        helper(ans,arr,0,list);
        return list;

    }

    public static void helper(List<Integer> ans, int[] arr, int idx, List<List<Integer>> list){
        int n=arr.length;

        if(n==idx){
            list.add(new ArrayList<>(ans)); // copy created to store the complete list of ans size in 2D list 
            return;
        }

        ans.add(arr[idx]);  // adding elements to list

        helper(ans,arr,idx+1,list);
        ans.remove(ans.size()-1);   // remove the last choice and another call explores the remaining elements
        helper(ans,arr,idx+1,list);

    }
}