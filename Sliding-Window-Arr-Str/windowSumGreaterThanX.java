// Given an array arr, a window size K, and an integer X, count how many contiguous subarrays of size K have a sum strictly greater than X.

// Input:
// arr = [2,5,1,8,2]
// K = 3
// X = 10
// Output:
// 2

// Approach 1 

public class windowSumGreaterThanX {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2};
        int k = 3;
        int x = 10;
        System.out.println(windowSum(arr, k, x));
    }

    public static int windowSum(int[] arr, int k, int x) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum+=arr[j];
            }

            if(sum>x){
                count++;
            }

        }

        return count;

    }
}