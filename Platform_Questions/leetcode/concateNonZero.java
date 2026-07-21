// 3754. Concatenate Non-Zero Digits and Multiply by Sum I

public class concateNonZero{
    public static void main(String[] args) {
        int n=10203004;
        System.out.println(concateNonZeroDigit(n));
    }

    public static long concateNonZeroDigit(int n){
        // int copy=n;
        long append=0;

        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                append = (append*10) + rem;
                n/=10;
            }else{
                n/=10;
            }
        }

        long reverse=0;
        long sum=0;
        while(append!=0){
            int rem=(int)append%10;
            sum+=rem;
            reverse = (reverse*10)+rem;
            append/=10;
        }
        return sum*reverse;
    }
}