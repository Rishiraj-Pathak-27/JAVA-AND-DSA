// Move all negative numbers to the front.

// Recusrive Approach

import java.util.Arrays;
public class moveNegatives {

    public static void main(String[] args){
        int[] arr = {2,-3,1,-1,2,-5,8,-10};     // expected ans-> {-3,-1,-5,-10,2,1,2,8}
        System.out.println(Arrays.toString(moveNegs(arr,0,0)));
    }

    public static int[] moveNegs(int[] arr, int idx, int j){
        int n=arr.length;
        if(idx==n) return arr;

        if(arr[idx]<0){
            int temp=arr[idx];
            arr[idx]=arr[j];
            arr[j]=temp;
            j++;
        }

        moveNegs(arr,idx+1,j);
        return arr;
    }
}
