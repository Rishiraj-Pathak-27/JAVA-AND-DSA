// In the Temple of Numbers, a sacred integer n is declared "Pure" only if it has exactly two divisors - 1 and itself. ris
// The priests must verify whether n is pure.
// Return:
// 1 if prime
// 0 otherwise
// Efficiency is critical - the temple forbids checking beyond Vn.

import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=ip.nextInt();

        System.out.println(templeNumbers(n));
    }

    public static int templeNumbers(int n){
        if(n<=2) return 0; 
        int count=0;
        for(int i=3; i<=Math.sqrt(n); i++){
            if(n%i==0){
                count++;
                break;
            }
        }

        if(count==0) return 1;
        return 0;
    }
}
