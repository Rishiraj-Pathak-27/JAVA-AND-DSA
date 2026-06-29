// Check if Number is Palindrome

public class palindromeNumber{
    public static void main(String[] args){
        int n=1256521;
        if(n==1){
        System.out.println("Palindromic Number");
        }else{
            System.out.println("Palindrome Number = "+palindrome(n));
        }
    }

    public static int reverse(int n, int reverse){
        if(n==0) return reverse;

        return reverse(n/10,reverse*10+(n%10));
    }
    public static boolean palindrome(int n){  
        return n==reverse(n,0);
    }
}

// Normal Code

// public class palindromeNumber{
//     public static void main(String[] args){
//         int n=1221;
//         System.out.println(palindrome(n));
//     }

//     public static boolean palindrome(int n){
//         if(n==0) return false;
//         int reverse=0;
//         int copy=n;
//         while(n!=0){
//             int rem=n%10;
//             reverse = (reverse * 10) + rem;
//             n/=10;
//         }
//         return reverse == copy;
//     }
// }