// Sum of Odd Numbers up to N

public class sumOfOdd{
    public static void main(String[] args) {
        int n=10;
        System.out.println(oddSum(n));
    }

    public static int oddSum(int n){
        if(n==0) return 0;

        if(n%2==1){
            return n+oddSum(n-1);
        }
        return oddSum(n-1);
    }
}