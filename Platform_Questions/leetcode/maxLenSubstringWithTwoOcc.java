// 3090. Maximum Length Substring With Two Occurrences

import java.util.HashMap;
public class maxLenSubstringWithTwoOcc{
    public static void main(String[] args){
        String s = "bcbbbcba";
        System.out.println(maxLenSubstring(s));
    }

    public static int maxLenSubstring(String s){
        int n=s.length();
        int left=0,right=0,ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(right<n){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1);

            while(map.get(s.charAt(right)) > 2){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }

            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}