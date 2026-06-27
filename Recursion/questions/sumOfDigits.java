// Sum of Digits

public class sumOfDigits {
    public static void main(String[] args){
        int n=151;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n==0) return 0;
        return (n%10)+sum(n/=10);
    }
}
