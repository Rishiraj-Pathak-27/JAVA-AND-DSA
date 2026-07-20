// Check if the array is sorted.


// Normal Approach

// public class isArraySorted{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         System.out.println(sorted(arr));
//     }

//     public static boolean sorted(int[] arr){
//         int n=arr.length;

//         for(int i=0; i<n-1; i++){
//             if(arr[i]>arr[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// Recursive Approach

public class isArraySorted{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr,0));
    }

    public static boolean isSorted(int[] arr, int idx){
        int n=arr.length;

        if(n-1==idx) return true;

        if(arr[idx]>arr[idx]+1){
            return false;
        }

        return isSorted(arr, idx+1);
    }
}