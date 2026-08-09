// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

public class isSubsequence{
    public static void main(String[] args){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSub(s,t));
    }   

    public static boolean isSub(String s, String t){
        int n=s.length();
        int m=t.length();
        int left=0,right=0;

        while(left<n && right<m){
            if(s.charAt(left)==t.charAt())
        }
    }
}