// Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
// Note : Keep the first of the array unaltered. 
// Example 1:
// 5  —Value of N
// {10, 20, 30, 40, 50}  —Element of Arr[ ]
// 2  —–Value of K

import java.util.Arrays;

public class cyclicallyRotate {
    public static int[] reverse(int[] arr, int start, int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k = k % n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int k=2;

        int[] res = rotate(arr,k);
        System.out.println(Arrays.toString(res));
    }

}
