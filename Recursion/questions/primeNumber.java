// Check Prime Number Using Recursion

// Normal Approach
// public class primeNumber {
//     public static void main(String[] args) {
//         int n = 102;
//         if (prime(n)) {
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not Prime");
//         }
//     }
//     public static boolean prime(int n) {
//         if (n < 2) {
//             return false;
//         }
//         if(n==2) return true;
//         int m = (int) Math.sqrt(n);
//         for (int i = 3; i <= m; i+=2) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
// Recursive Approach
public class primeNumber {

    public static void main(String[] args) {
        int n = 104;
        int divisor = 2;
        if (prime(n, divisor)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static boolean prime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        // if(divisor>(int) Math.sqrt(n)) return true;

        // OR

        if(divisor*divisor > n) return true;

        if (n % divisor == 0) return false;

        return prime(n,divisor+1);
    }
}
