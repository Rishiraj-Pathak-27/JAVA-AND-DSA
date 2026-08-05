// 448. Find All Numbers Disappeared in an Array

// arr size --> [1 -> n]


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findAllNumbersDisappeared{
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disappearedElements(arr));
    }

    public static List<Integer> disappearedElements(int[] arr){
        int n=arr.length;
        List<Integer> ans = new ArrayList<>();

        if(n==0) return ans;

        HashSet<Integer> set = new HashSet<>();

     
        for(int ele:arr){
            set.add(ele);
            
        }

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}