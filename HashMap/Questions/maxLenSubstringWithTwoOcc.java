// Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.

import java.util.HashMap;

public class maxLenSubstringWithTwoOcc {  
    public static void main(String[] args){
        String s = "bcbbbcba";
        System.out.println(maxLenSubstring(s));
    }

    public static int maxLenSubstring(String s){
        int n=s.length();
        int left=0, ans=0;
        HashMap<Character, Integer> map=new HashMap<>();

        for(int right=0; right<n; right++){
            char rChar = s.charAt(right);
            map.put(rChar, map.getOrDefault(rChar, 0)+1);

            while(map.get(rChar)>2){
                char lChar = s.charAt(left);
                map.put(lChar,map.get(lChar)-1);
                left++;
            }

            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
