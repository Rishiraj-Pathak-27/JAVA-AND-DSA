// Print Multiplication Table

public class multiplicationTable{
    public static void main(String[] args) {
        int n=5;
        table(n,1);
    }

    public static void table(int n, int m){
        if(m>10) return;
        System.out.println(n+" x "+m+" = "+(n*m));
        table(n,m+1);
    }
}