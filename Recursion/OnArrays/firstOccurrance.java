// Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.
// If k doesn't exist in arr[] return -1. 

// Approach Linear Search Recursively
// public class firstOccurrance{
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 1, 1, 2};
//         int target=1;
//         System.out.println(firstOcc(arr, target));
//     }
//     public static int helper(int[] arr, int target, int idx){
//         int n=arr.length;
//         if(idx==n) return -1;
//         if(arr[idx]==target){
//             return idx;
//         }
//         return helper(arr,target,idx+1);
//     }
//     public static int firstOcc(int[] arr, int target){
//         int n=arr.length;
//         return helper(arr,target,0);
//     }
// }

// Binary Search Approach Recursively
public class firstOccurrance {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2};
        int target = 1;

        System.out.println(firstOcc(arr, target));
    }

    public static int helper(int[] arr, int target, int left, int right) {
        int n = arr.length;
        int ans = -1;
        if (left > right) {
            return ans;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            ans = helper(arr, target, left, right - 1);
            if (ans != -1) {
                return ans;
            }
            return mid;
        } else if (arr[mid] > target) {
            return helper(arr, target, left, right - 1); 
        }else {
            return helper(arr, target, right + 1, right);
        }
    }

    public static int firstOcc(int[] arr, int target) {
        int n = arr.length;
        return helper(arr, target, 0, n - 1);
    }
}
