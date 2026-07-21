// Count Occurrences of a Digit

// normal approach
// public class countOccurrances {
//     public static void main(String[] args) {
//         int n = 1223122;
//         int digit = 2;
//         System.out.println(count(n, digit));
//     }
//     public static int count(int n, int digit) {
//         if (n == 0) {
//             return 0;
//         }
//         int count = 0;
//         while (n != 0) {
//             int rem = n % 10;
//             if (rem == digit) {
//                 count++;
//             }
//             n /= 10;
//         }
//         return count;
//     }
// }
// recursive approach
// public class countOccurrances {
//     public static void main(String[] args) {
//         int n = 1223122;
//         int digit=2;
//         System.out.println(count(n, digit)); 
//     }
//     public static int count(int n, int digit) {
//         if (n == 0) return 0;
//         if((n%10) == digit){
//             return 1+count(n/10,digit);
//         }
//         return count(n/10,digit);
//     }
// }
