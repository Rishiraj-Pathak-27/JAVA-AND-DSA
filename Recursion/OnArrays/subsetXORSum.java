// The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
// For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
// Given an array nums, return the sum of all XOR totals for every subset of nums. 

import java.util.ArrayList;
public class subsetXORSum{
    public static void main(String[] args){
        int[] arr = {1,3};
        System.out.println(XORSum(arr));
    }

    public static void helper(ArrayList<Integer> ans, int[] arr, int idx, int currXOR){
        int n=arr.length;

        if(n==idx){
            ans.add(currXOR);
            return;
        }

        helper(ans,arr,idx+1,currXOR^arr[idx]);
        helper(ans,arr,idx+1,currXOR);
    }

    public static int XORSum(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        helper(ans,arr,0,0);

        int sum=0;

        for(int ele:ans){
            sum+=ele;
        }
        return sum;
    }
}