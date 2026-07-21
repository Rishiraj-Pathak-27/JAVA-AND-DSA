// Digital Root

// i/p : 9875 = 9+8+7+5=29=2+9=11=1+1="2" <-- ans

public class digitRoots{
    public static void main(String[] args){
        int n=8310;
        System.out.println(roots(n));
    }

    public static int roots(int n){
        if(n<10) return n;
        return roots(sum(n));
    }

    public static int sum(int n){
        if(n==0) return 0;
        return (n%10)+sum(n/10);
    }
}