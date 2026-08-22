// 3622. Check Divisibility by Digit Sum and Product

// You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:
// The digit sum of n (the sum of its digits).
// The digit product of n (the product of its digits).
// Return true if n is divisible by this sum; otherwise, return false.

public class checkDivisibility {

    public static void main(String[] args){
        int n=99;
        System.out.println(divisibility(n));
    }

    public static int sum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static int prod(int n){
        int prod=1;

        while(n!=0){
            int rem=n%10;
            prod*=rem;
            n/=10;
        }
        return prod;
    }

    public static boolean divisibility(int n){
        if(n % (sum(n)+prod(n)) == 0)
            return true;
        return false;
    }    
}
