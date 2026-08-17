// 575. Distribute Candies

import java.util.HashSet;

public class distributeCandies {
    public static void main(String[] args){
        int[] arr = {1,1,2,3};
        System.out.println(distribute(arr));
    }

    public static int distribute(int[] arr){
        int n=arr.length;

        int max=n/2;

        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr){
            set.add(ele);
        }

        if(set.size()>max){
            return max;
        }

        return set.size();
    }
}
