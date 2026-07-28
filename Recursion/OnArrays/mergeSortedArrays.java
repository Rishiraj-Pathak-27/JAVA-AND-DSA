// Merge two sorted arrays recursively.

// Normal Approach

// import java.util.Arrays;
// public class mergeSortedArrays {

//     public static void main(String[] args){
//         int[] arr1 = {1,3,5};
//         int[] arr2 = {2,4,6};
        
//         System.out.println(Arrays.toString(merge(arr1,arr2)));
//     }    

//     public static int[] merge(int[] arr1, int[] arr2){
//         int n=arr1.length;
//         int m=arr2.length;

//         int i=0,j=0,k=0;
//         int[] arr3=new int[m+n];

//         while(i<n && j<n){
//             if(arr1[i]<arr2[j]){
//                 arr3[k++] = arr1[i];
//                 i++;
//             }else{
//                 arr3[k++] = arr2[j];
//                 j++;
//             }
//         }

//         while(i<n){
//             arr3[k++]=arr1[i];
//             i++;
//         }

//         while(j<n){
//             arr3[k++]=arr2[j];
//             j++;
//         }
//         return arr3;
//     }
// }


// Recursive Approach

import java.util.Arrays;
public class mergeSortedArrays {

    public static int[] helper(int[] arr1, int[] arr2, int[] arr3, int i, int j, int k){
        if(i>=arr1.length && j>=arr2.length){
            return arr3;
        }

        if(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                return helper(arr1,arr2,arr3,i+1,j,k+1);
            }else{
                arr3[k]=arr2[j];
                return helper(arr1,arr2,arr3,i,j+1,k+1);
            }
        }

        else if(i<arr1.length){
            arr3[k]=arr1[i];
            return helper(arr1,arr2,arr3,i+1,j,k+1);
        }

        else{
            arr3[k]=arr2[j];
            return helper(arr1,arr2,arr3,i,j+1,k+1);
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int i=0,j=0,k=0;
        int[] arr3 = new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(helper(arr1,arr2,arr3,i,j,k)));
        
    }    
}
