// Find LCM Using GCD

// Input:
// 12 18

// Output:
// 36

// GCD / HCF

// public class lcm{
//     public static void main(String[] args) {
//         int a=18;
//         int b=24;

//         System.out.println(gcd(a,b));
//     }

//     public static int gcd(int a, int b){
//         if(a==0) return b;
//         return gcd(b%a,a);
//     }
// }

// Normal Code

public class lcm{
    public static void main(String[] args) {
        int a=12, b=18;
        System.out.println(lcm(a,b));
    }

    public static int gcd(int a, int b){

        int gcd=1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}

// LCM Recursive Code

// public class lcm{
//     public static void main(String[] args) {
//         int a=12, b=24;
//         System.out.println(findLCM(a,b));

//     }

//     public static int gcd(int a, int b){
//         if(a==0) return b;
//         return gcd(b%a,a);
//     }

//     public static int findLCM(int a, int b){
//         return (a*b)/gcd(a,b);
//     }
// }

