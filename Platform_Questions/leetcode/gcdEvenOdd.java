// WAP to find out gcd of sum of n odd and even numbers

public class gcdEvenOdd{
    public static void main(String[] args) {
        int n=4;
        System.out.println(gcdEO(n));
    }

    static int sum=0;

    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

    public static int evenSum(int n){
        for(int i=1; i<=n; i++){
            sum+=(2*i);
        }
        return sum;
    }

    public static int oddSum(int n){
        for(int i=1; i<=n; i++){
            sum+=(2*i-1);
        }
        return sum;
    }

    public static int gcdEO(int n){
    
        return gcd(evenSum(n),oddSum(n));

    }
}