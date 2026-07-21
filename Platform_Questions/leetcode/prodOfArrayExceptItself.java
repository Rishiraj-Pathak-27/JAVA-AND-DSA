// 238. Product of Array Except Self

import java.util.Arrays;
public class prodOfArrayExceptItself{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(prodArray(arr)));
    }

    public static int[] prodArray(int[] arr){
        int n=arr.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int prod=1;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                prod*=arr[j];
            }
            ans[i]=prod;
        }
        return ans;
    }
}