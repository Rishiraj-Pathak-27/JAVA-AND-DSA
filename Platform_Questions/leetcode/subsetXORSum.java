// 1863. Sum of All Subset XOR Totals

import java.util.ArrayList;
public class subsetXORSum{
    public static void main(String[] args){
        int[] arr = {1,3};
        System.out.println(XORSum(arr));
    }

    public static void helper(ArrayList<Integer> ans, int[] arr, int idx, int currXOR){
        int n=arr.length;

        if(n==idx){
            ans.add(currXOR);
            return;
        }

        helper(ans,arr,idx+1,currXOR^arr[idx]);
        helper(ans,arr,idx+1,currXOR);
    }

    public static int XORSum(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        helper(ans,arr,0,0);

        int sum=0;

        for(int ele:ans){
            sum+=ele;
        }
        return sum;
    }
}