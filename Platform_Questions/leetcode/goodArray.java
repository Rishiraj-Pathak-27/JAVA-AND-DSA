// 1250. Check If It Is a Good Array

public class goodArray {

    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 23};
        System.out.println(bestArray(arr));
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static boolean bestArray(int[] arr) {
        int gcd = arr[0];

        for (int ele : arr) {
            gcd = gcd(gcd, ele);

            if (gcd == 1) {
                return true;
            }
        }
        return false;
    }
}
