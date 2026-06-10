// NORMAL REGULAR CODE TO FIND GCD/HCF of a Number

// public class gcd{

//     public static int gcdNum(int a, int b){
//         int gcd = 1;
//         for(int i=1; i<=Math.min(a,b) ; i++){
//             if(a%i == 0 && b%i==0){
//                 gcd = i;
//             }
//         }
//         return gcd;
//     } 

//     public static void main(String[] args){
//         int a=12, b=16;
//         System.out.println(gcdNum(a,b));
//     }
// }

// RECURSIVE CODE TO FIND GCD/HCF of a Number

public class gcd{

    public static int gcdNum(int a, int b){
        if(a==0) return b;
        return gcdNum(b%a,a);
    }

    public static void main(String[] args) {
        int a=12, b=60;
        System.out.println(gcdNum(a,b));
    }
}