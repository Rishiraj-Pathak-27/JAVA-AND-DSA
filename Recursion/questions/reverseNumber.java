// Program to reverse the number using recursion

public class reverseNumber{
    public static void main(String[] args){
        int n=234;
        // call to the reverse() function
        System.out.println(reverse(n,0));
    }
    public static int reverse(int n,int reverse){
            if(n==0) return reverse;
            int rem=n%10;       // 4 3 2
            reverse=(reverse*10)+rem;       // 4 43 432
            reverse = reverse(n/=10,reverse); // (23,4) (2,43) (0,432)
            return reverse;
    }
    
}