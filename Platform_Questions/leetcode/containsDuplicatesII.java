// 219. Contains Duplicate II

import java.util.HashMap;

public class containsDuplicatesII{
    public static void main(String[] args){
        int[] arr = {1,2,3,1};
        int k=3;
        System.out.println(duplicates(arr,k));
    }

    public static boolean duplicates(int[] arr, int k){
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]) && i-map.get(arr[i]) <= k) return true;
            map.put(arr[i],i);
        }
        return false;
    }
}