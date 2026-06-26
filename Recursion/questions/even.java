// Print Even Numbers from 2 to N

public class even{
    public static void main(String[] args) {
        int n=100;
        print(n);
    }

    public static void print(int n){
        if(n==0) return;
        print(n-2);
        System.out.print(n+" ");
    }
}