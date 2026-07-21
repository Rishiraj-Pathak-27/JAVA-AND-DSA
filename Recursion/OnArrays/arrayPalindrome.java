// Check if an array is a palindrome.

public class arrayPalindrome {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(isPalindrome(arr));
    }

    public static boolean helper(int[] arr, int left, int right, int idx) {
        int n = arr.length;

        if(left>right) return true; 

        if (arr[left] == arr[right]) {

            return helper(arr, left + 1, right-1, idx + 1);
        }
        return false;
    }

    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        return helper(arr, 0, n - 1, 0);
    }
}
