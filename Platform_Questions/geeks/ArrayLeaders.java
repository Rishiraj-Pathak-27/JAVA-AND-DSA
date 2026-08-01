
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLeaders{
    public static void main(String[] args){
        int[] arr = {16, 19, 4, 3, 8, 3};
        System.out.println(leaders(arr));
    }

    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();

        int n=arr.length;

        if(n==0) return ans;

        int rightMax=arr[n-1];
        ans.add(rightMax);

        for(int i=n-2; i>=0; i--){
            if(arr[i]>rightMax){
                rightMax=arr[i];
                ans.add(rightMax);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}