// 3658. GCD of Odd and Even Sums

// public class gcdOfEvenOdd{

//     public static int helper(int a, int b){
//         if(a==0) return b;
//         return helper(b%a,a);
//     }

//     public static int evenOddGCD(int n){
//         int evenCount=0;
//         int oddCount=0;

//         for(int i=1; i<=n; i++){
//             evenCount += (2*i);
//             oddCount += (2*i-1);
//         }
        
//         return helper(Math.min(evenCount,oddCount),Math.max(evenCount,oddCount));
//     }

//     public static void main(String[] args) {
//         int n=5;

//         System.out.println(evenOddGCD(n));
//     }
// }

// OR

public class gcdOfEvenOdd{

    public static int evenOddGCD(int n){
        return n;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(evenOddGCD(n));
    }
}