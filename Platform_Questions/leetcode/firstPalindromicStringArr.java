// WAP to Find First Palindromic String in the Array

import java.util.Scanner;
public class firstPalindromicStringArr {

    public static boolean isPalindrome(String s){
        int left=0 , right=s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static String firstPalindromic(String[] arr){

        for(String ele:arr){
            if(isPalindrome(ele)){
                return ele;
            }
        }
        return "";
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total strings: ");
        int n=ip.nextInt();
        ip.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter strings: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.nextLine();
        }

        System.out.println("First Palindrome = "+firstPalindromic(arr));

    }
}
