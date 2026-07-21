// Sum of Even Numbers up to N

public class sumOfEven{
    public static void main(String[] args) {
        int n=10;
        System.out.println(evenSum(n));
    }

    public static int evenSum(int n){
        if(n==0) return 0;


        if(n%2==0){
        return n+(evenSum(n-1));
        } 
        return evenSum(n-1);
    }
}