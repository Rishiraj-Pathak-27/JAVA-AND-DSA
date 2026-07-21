// Minimum Element in Every Window


import java.util.List;
import java.util.ArrayList;

public class minElementPerWindow {
    public static void main(String[] args){
        int[] arr = {4,2,12,3,5};
        int k=2;

        System.out.println(minElement(arr,k));
    }

    public static List<Integer> minElement(int[] arr, int k){

        List<Integer> ans = new ArrayList<>();
        int n=arr.length;
        
        for(int i=0; i<=n-k; i++){
            int min=Integer.MAX_VALUE;
            for(int j=i; j<i+k; j++){
                min=Math.min(min,arr[j]);
            }
            ans.add(min);
        }
        return ans;
    }
}
