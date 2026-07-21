// Check Armstrong Number

// Normal Approach

// public class armstrongNumber{
//     public static void main(String[] args){
//         int n=153;
//         System.out.println(armstrong(n));
//     }

//     public static boolean armstrong(int n){

//         int count=0; 
//         int copy=n;

//         while(copy!=0){
//             copy/=10;
//             count++;
//         }

//         int sum=0;
//         copy=n;

//         while(copy!=0){
//             int rem=copy%10;
//             sum += Math.pow(rem,count);
//             copy/=10;
//         }
//         return sum==n;
//     }
// }

// Recursive Approach

public class armstrongNumber{
    public static void main(String[] args) {
        int n=153;
        System.out.println(armstrong(n));
    }

    public static int armstrongSum(int n,int power){
        if(n==0) return 0;

        return (int)Math.pow(n%10,power) + armstrongSum(n/10,count(n));
    }

    public static int count(int n){
        if(n==0) return 0;
        return 1+count(n/10);
    }

    public static boolean armstrong(int n){
        int power=count(n);
        int original = armstrongSum(n, power);

        return n==original;

    }
}