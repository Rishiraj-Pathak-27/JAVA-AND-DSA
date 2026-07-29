// Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
// TC->O(n) SC->O(n)

import java.util.HashSet;

public class twoSum {
    public static void main(String[] args){
        int[] arr = {1,3,-1,8,4,2};
        int target=5;
        System.out.println(targetSum(arr,target)); 
    }    

    public static boolean targetSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr){
            int rem = target-ele;
            if(set.contains(rem)){
                return true;
            }else{
                set.add(ele);
            }
        }
        return false;
    }
}