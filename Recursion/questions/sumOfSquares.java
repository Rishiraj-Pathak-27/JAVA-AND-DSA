// Find Sum of Squares

public class sumOfSquares{

    public static void main(String[] args) {
        int n=4;
        System.out.println(print(n));
    }

    public static int print(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return n*n+print(n-1);
    }
}