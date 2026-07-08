//You are given an array A of N integers. There are Q queries to process and each query consists of four integers l, r, x and y.
// For the subarray of A ranging from index l to r, you need to assign a sequence of integers for each subsequent element. 
// The sequence should start from x and increase by y. 
// This means A[l] will be assigned the value of x, A[l+1] will be assigned the value of x+y,
// A[l+2] will be assigned the value of x+2y and continuing this pattern A[l+i] will be assigned the value of x+i*y where i ranges from 0 to r-l. 
// After processing all queries find the sum of all integers in A. Since the answer can be large return it modulo 10⁹+7.

import java.util.*;

public class sequenceAssignmentQueries {

    public static void sum(int[] arr,int mod) {
        int sum = 0;
        for (int ele : arr) {
            sum = (sum+ele)%mod;
        }

        System.out.println("Final Sum = " + sum);
    }

    public static void queries(int[] arr, int l, int r, int x, int y, int q, int mod) {

        System.out.println("Query " + q);
        for (int j = l; j <= r; j++) {
            int i = j - l;
            arr[j] = (x + (i * y)) % mod;

        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String[] args) {

        // Taking Input

        Scanner ip = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        System.out.println("Enter number of queries:");
        int q = ip.nextInt();

        int mod = 1000000007;

        // Main code

        for (int queries = 1; queries <= q; queries++) {
            System.out.println("Enter l,r,x,y: ");
            int l = ip.nextInt();
            int r = ip.nextInt();
            int x = ip.nextInt();
            int y = ip.nextInt();

            System.out.println();

            queries(arr, l, r, x, y, queries, mod);
        }

        sum(arr, mod);

    }
}