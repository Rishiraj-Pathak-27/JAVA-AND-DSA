// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output


import java.util.*;
public class findAllDuplicates {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(hasDuplicates(arr));
    }

    public static List<Integer> hasDuplicates(int[] arr){
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr){
            if(set.contains(ele)) ans.add(ele);
            else set.add(ele);
        }
        return ans;
       
    }
}


 // LinkedHashSet<Integer> ans = new LinkedHashSet<>();

        // for(int ele:arr){
        //     ans.add(ele);
        // }
        // return ans;
