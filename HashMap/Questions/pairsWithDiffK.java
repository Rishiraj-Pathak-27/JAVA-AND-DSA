// Given an array arr[] of positive integers. Find the number of pairs of integers whose absolute difference equals to a given number k

import java.util.HashMap;
public class pairsWithDiffK {
    public static void main(String[] args){
        int[] arr = {8, 16, 12, 16, 4, 0};
        int k=4;
        System.out.println(diffK(arr,k));
    }

    public static int diffK(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;

        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }

        for(int key:map.keySet()){
            int rem1=key-k;
            int rem2=key+k;

            if(map.containsKey(rem1)) count += (map.get(key))*(map.get(rem1));
            if(map.containsKey(rem2)) count += (map.get(key))*(map.get(rem2));
        }

        return count/2;
    
    }
}
