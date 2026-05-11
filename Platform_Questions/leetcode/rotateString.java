/* 796. Rotate String
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false
*/

public class rotateString {
    
    public static boolean isRotated(String s, String g){
        if(s.length() != g.length()){
            return false;
        }

        String word = s+s;

        if(word.contains(g)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        String s = "abcde";
        String g = "abced";

        System.out.println(isRotated(s,g));
    }  
}
