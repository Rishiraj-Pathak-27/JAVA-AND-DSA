// 10. Count Digits

public class countDigits{
    public static void main(String[] args){
        int n=78263;
        System.out.println(count(n));
    }

    public static int count(int n){
        int count=0;
        if(n==0) return 0;
        return 1+count(n/=10);
    }
}