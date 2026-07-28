// Rotate an array left by one recursively.

// Normal Approach

// import java.util.Arrays;
// public class rotateByOne {
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5};

//         System.out.println(Arrays.toString(rotate(arr)));
//     }

//     public static void reverse(int[] arr, int left, int right){
//         while(left<right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//     }

//     public static int[] rotate(int[] arr){
//         int n=arr.length;

//         reverse(arr,0,0);
//         reverse(arr,1,n-1);
//         reverse(arr,0,n-1);
//         return arr;

//     }
// }


// Recursive Approach

import java.util.Arrays;
public class rotateLeftByK{
    public static void main(String[ ]args){
        int[] arr = {1,2,3,4,5};
        int k=4;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }

    public static void swap(int[] arr, int left, int right){
        arr[left]=arr[right]-arr[left];
        arr[right]=arr[right]-arr[left];
        arr[left]=arr[left]+arr[right];

    }

    public static int[] reverse(int[] arr, int left, int right){
        int n=arr.length;
        if(left>=right) return arr;
       if(left<right){
            swap(arr,left,right);
        }
        return reverse(arr,left+1,right-1);

    }

    public static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k%=n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
}