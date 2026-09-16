// 922. Sort Array By Parity II

// Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
// Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
// Return any answer array that satisfies this condition.

import java.util.Arrays;

public class sortArrayByParityII {
    public static void main(String[] args){
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static void helper(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] sort(int[] arr){
        int n=arr.length;

        int i=0, j=1;

        while(i<n && j<n){
            if(arr[i] % 2 == 0){
                i+=2;
            }else if(arr[j] % 2 == 1){
                j+=2;
            }else{
                helper(arr,i,j);
            }
        }
        return arr;
    }
}
