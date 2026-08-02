// 2351. First Letter to Appear Twice

import java.util.HashSet;
public class firstRepeatingChar {
    public static void main(String[] args){
        String s = "abccbaacz";
        System.out.println(repeating(s));
    }

    public static char repeating(String s){
        int n=s.length();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(set.contains(s.charAt(i))) return s.charAt(i);
            else set.add(s.charAt(i));
        }
        return ' ';
    }
}
