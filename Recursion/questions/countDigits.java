// 10. Count Digits

public class countDigits{
    public static void main(String[] args){
        int n=83495494;
        if(n==0) {
            System.out.println(1);
        }else{
            System.out.println(count(n));
        }
    }

    public static int count(int n){
        if(n==0) return 0;

        return 1+count(n/=10);
    }
}