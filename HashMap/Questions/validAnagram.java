// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        System.out.println(anagram(s,t));
    }    

    public static boolean anagram(String s, String t){
        HashMap<Character,Integer> aMap = new HashMap<>();
        HashMap<Character,Integer> bMap = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(aMap.containsKey(ch)){
                int freq=aMap.get(ch);
                aMap.put(ch,freq+1);
            }else{
                aMap.put(ch,1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!aMap.containsKey(ch)) return false;
            if(bMap.containsKey(ch)){
                int freq=bMap.get(ch);
                bMap.put(ch,freq+1);
            }else{
                bMap.put(ch,1);
            }
        }

        for(char key:bMap.keySet()){
            int aFreq=aMap.get(key);
            int bFreq=bMap.get(key);

            if(aFreq!=bFreq) return false;
        } 
        return true;
    }
}
