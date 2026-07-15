// We can perform recursion on arrays by providing the index position & array to the function

// Forward Printing of Array Elements
// public class basics{
//     public static void main(String[] args) {
//         int[] arr = {39,40,5,8,1,4,50};
//         print(arr,0);
//     }
//     public static void print(int[] arr, int idx){
//         int n=arr.length;
//         if(n==idx) return;
//         System.out.print(arr[idx]+" ");
//         print(arr,idx+1);
//     }
// }
// Reverse Printing of Array ELements
// public class basics{
//     public static void main(String[] args) {
//         int[] arr = {39,40,5,8,1,4,50};
//         print(arr,0);
//     }
//     public static void print(int[] arr, int idx){
//         int n=arr.length;
//         if(idx==n) return;
//         print(arr,idx+1);
//         System.out.print(arr[idx]+" ");
//     } 
// }
// Linear Search using Array recursively
public class basics {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 5, 8, 9, 1};
        int target = 10;
        System.out.println(exists(arr, target, 0));
    }

    public static boolean exists(int[] arr, int target, int idx) {
        int n = arr.length;
        if (n == idx) {
            return false;
        }

        if (arr[idx] == target) {
            return true;
        } else {
            return exists(arr, target, idx + 1);
        }


    }
}
