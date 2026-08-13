// 3345. Smallest Divisible Digit Product I

public class smallestDivisibleDigit{
    public static void main(String[] args){
        int n=15, t=3;
        System.out.println(smallestDiv(n,t));
    }

    public static int digitProd(int n){
        int prod=1;
        while(n!=0){
            int rem=n%10;
            prod*=rem;
            n/=10;
        }
        return prod;
    }

    public static int smallestDiv(int n, int t){

        while(true){

            if(digitProd(n) % t == 0){
                return n;
            }
            n++;   
        }
    }
}