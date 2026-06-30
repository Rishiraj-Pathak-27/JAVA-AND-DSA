// Print Fibonacci Series

// Normal Code

// public class fibonacciSeries{
//     public static void main(String[] args) {
//         int n=6;
//         fib(n);
//     }

//     public static void fib(int n) {
//         int x=0,y=1,z=0;

//         for(int i=1; i<=n; i++){
//         System.out.print(x+" ");
//         z=x+y;
//         x=y;
//         y=z;
//         }
//     }
// }

// Recursive Approach

public class fibonacciSeries{
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i<n; i++){
        System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}

