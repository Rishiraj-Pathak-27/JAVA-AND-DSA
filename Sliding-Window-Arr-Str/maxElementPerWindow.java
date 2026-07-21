// Maximum Element in Every Window

import java.util.List;
import java.util.ArrayList;
public class maxElementPerWindow {
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k=3;

        System.out.println(maxElement(arr,k));
    }    

    public static List<Integer> maxElement(int[] arr, int k){

        int n=arr.length;

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<=n-k; i++){
            int max=0;

            for(int j=i; j<i+k; j++){
                max=Math.max(max,arr[j]);
            }
            ans.add(max);

        }
        return ans;
    }
}