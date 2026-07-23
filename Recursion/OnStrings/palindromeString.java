// Check if a string is a palindrome.

public class palindromeString {
    public static void main(String[] args){
        String s="racecar";
        System.out.println(isPalindrome(s));
    }

    public static boolean checkPalindrome(String s,int left, int right){

        if(left>right) return true;

        if(s.charAt(left)==s.charAt(right)){
            return checkPalindrome(s,left+1,right-1);
        }

        return false;
    }

    public static boolean isPalindrome(String s){
        int n=s.length();
        return checkPalindrome(s,0,n-1);
    }
}
