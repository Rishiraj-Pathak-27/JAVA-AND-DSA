// Given a binary array containing only 0s and 1s, return the maximum number of consecutive 1s.

public class maxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(maxOnes(arr));
    }

    public static int helper(int[] arr, int count, int left, int right) {
        int n = arr.length;
        int max = 0;

        for (int ele : arr) {
            if (ele == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;

    }

    public static int maxOnes(int[] arr) {
        int n = arr.length;

        return helper(arr, 0, 0, 0);
    }

}
