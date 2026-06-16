// 509. Fibonacci Number

// fibonnaci series upto n

// public class fibonacciNumber{

//     public static void fib(int n){
//         int fN = 0;
//         int sN = 1;
        
//         if(n==0 || n==1) System.out.println(n);

//         for(int i=2; i<=n; i++){
//             System.out.print(fN+", ");
//             int temp = fN + sN;
//             fN = sN;
//             sN = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int n=10;
//         fib(n);
//     }
// }

// normal code without recusrion

// import java.util.Scanner;
// public class fibonacciNumber{

//     public static int fib(int n){
//         int fN = 0;
//         int sN = 1;

//         if(n==0 || n==1) return n;

//         for(int i=2; i<=n; i++){
//             int temp = fN+sN;
//             fN = sN;
//             sN = temp;
//         }
//         return sN;
//     }

//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);
//         int n=ip.nextInt();

//         System.out.println(fib(n));
//     }
// }

// RECURSIVE CODE

public class fibonacciNumber{

    public static int fib(int n){
        if(n==0 || n==1) return n;

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}