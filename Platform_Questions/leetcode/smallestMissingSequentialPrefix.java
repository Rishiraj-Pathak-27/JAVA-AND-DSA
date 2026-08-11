// 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

import java.util.HashSet;

public class smallestMissingSequentialPrefix {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,12,14,13};
        System.out.println(missingInteger(arr));
    }

    public static int missingInteger(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int sum=arr[0];
        for(int i=1; i<=arr.length; i++){
            if(arr[i]==(arr[i-1]+1)){
                sum+=arr[i];
            }else break;
        }

        for(int ele:arr){
            if(ele>=sum){
                set.add(ele);
            }
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}
