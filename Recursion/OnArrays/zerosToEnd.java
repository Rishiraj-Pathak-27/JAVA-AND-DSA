// Move all zeros to the end recursively.

// Normal Approach

// import java.util.Arrays;
// public class zerosToEnd {
//     public static void main(String[] args){
//         int[] arr={0,1,0,3,12};
//         System.out.println(Arrays.toString(moveZeros(arr)));
//     }

//     public static int[] moveZeros(int[] arr){
//         int n=arr.length;

//         int j=0;
//         for(int i=0; i<n; i++){
//             if(arr[i]!=0){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 j++;
//             }
//         }
//         return arr;
//     }
// }

// Recursive Approach

import java.util.Arrays;
public class zerosToEnd{
    public static void main(String[] args){
        int[] arr = {0,0,0,19,20,0,0,0,0};
        System.out.println(Arrays.toString(moveZeros(arr,0,0)));
    }

    public static int[] moveZeros(int[] arr, int idx, int j){
        int n=arr.length;
        if(n==idx) return arr;


        if(arr[idx]!=0) {
            int temp=arr[idx];
            arr[idx]=arr[j];
            arr[j]=temp;
            j++;
        }

        moveZeros(arr,idx+1,j);
        return arr;
    }
}