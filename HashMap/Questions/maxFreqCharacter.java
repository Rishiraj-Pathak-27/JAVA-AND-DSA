// // Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

import java.util.HashMap;

public class maxFreqCharacter {
    public static void main(String[] args){
        String s = "orqxvbq";

        System.out.println(maxFreq(s));
    }

    public static char maxFreq(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                int freq = map.get(ch);     // t -> 1
                map.put(ch,freq+1);         // t -> 2
            }else{
                map.put(ch,1);
            }
        }
        
        int max=0;
        
        for(char key : map.keySet()){
            max=Math.max(max,map.get(key));
        }

        char ch='z';

        for(char key:map.keySet()){
            int freq=map.get(key);
            if(freq==max && key<ch){
                ch=key;
            }
        }

        return ch;
    }
}
