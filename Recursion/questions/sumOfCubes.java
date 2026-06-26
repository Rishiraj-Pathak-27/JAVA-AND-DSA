// Find Sum of Cubes

public class sumOfCubes{
    public static void main(String[] args) {
        int n=3;
        System.out.println(print(n));
    }

    public static int print(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return n*n*n+print(n-1);
    }
}