// 1431. Kids With the Greatest Number of Candies

import java.util.*;
public class kidsWithGreaterCandies{
    public static List<Boolean> candies(int[] arr, int extraCandies){
        int max=0;
        List<Boolean> ans = new ArrayList<>(arr.length);

        for(int ele:arr){
            if(max<ele){
                max=ele;
            }
        }

        for(int ele:arr){
            if((ele+extraCandies) >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,1,3};
        int extraCandies=3;
        System.out.println(candies(arr,extraCandies));
    }
}