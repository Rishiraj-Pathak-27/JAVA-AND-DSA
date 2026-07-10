// Print All Factors of a Number

// Normal Approach O(N)

// public class factors{
//     public static void main(String[] args) {
//         int n=12;
//         fact(n);
//     }

//     public static void fact(int n){
//         for(int i=1; i<=n; i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }

// Recursive Approach

public class factors{
    public static void main(String[] args) {
        int n=12;
        fact(n,1);
    }

    public static void fact(int n, int divisor){
        if(divisor>n) return;

        if(n%divisor==0){
            System.out.print(divisor+" ");
        }

        fact(n,divisor+1);
    }
}