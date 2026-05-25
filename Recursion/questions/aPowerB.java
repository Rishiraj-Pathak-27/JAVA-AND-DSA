// WAP to print 'a' raised to the power 'b'

// 1) a*power(a,b-1)

// import java.util.Scanner;
// public class aPowerB {
//     public static void main(String[] args){
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter base: ");
//         int a=ip.nextInt();
//         System.out.println("Enter an exponential: ");
//         int b=ip.nextInt();

//         System.out.println(power(a,b));
//     } 

//     public static int power(int a, int b){
//         if(b==0) return 1;
//         return a*power(a,b-1);
//     }
// }


// OR

/* 2)
    if(even) power(a,b/2)*power(a,b/2)
    else(odd) a*power(a,b/2)*power(a,b/2) */

import java.util.Scanner;

public class aPowerB{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter base: ");
        int a=ip.nextInt();
        System.out.println("Enter an exponential: ");
        int b=ip.nextInt();
        System.out.println(power(a,b));
    }

    public static int power(int a, int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call * call;
        else return a*call*call;
    }
}