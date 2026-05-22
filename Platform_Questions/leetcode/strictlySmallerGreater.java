// package questions;

// public class strictlySmallerGreater {

//     public static int smallerGreater(int[] arr){
//         int n=arr.length;
//         int count=0;

//         int min=arr[0];
//         int max=arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i] > max) max=arr[i];
//             if(arr[i] < min) min=arr[i];
//         }

//         for(int i=0; i<n; i++){
//             if(arr[i] == min || arr[i] == max){
//                 count++;
//             }
//         }
//         return n-count;
//     }
    
//     public static void main(String[] args){
//         int[] arr = {11,7,2,15};
//         System.out.println(smallerGreater(arr));
//     }
// }

// OR

import java.util.Arrays;
public class strictlySmallerGreater {

    public static int smallerGreater(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;

        int min=arr[0];
        int max=arr[n-1];

        for(int i=0; i<n; i++){
            if(arr[i]>min && arr[i]<max){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        int[] arr = {11,7,2,15};
        System.out.println(smallerGreater(arr));
    }
}

