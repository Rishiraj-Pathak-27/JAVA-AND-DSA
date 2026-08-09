// You are given a string s consisting of lowercase English letters.

// The frequency group for a value k is the set of characters that appear exactly k times in s.

// The majority frequency group is the frequency group that contains the largest number of distinct characters.

// Return a string containing all characters in the majority frequency group, in any order. If two or more frequency groups tie for that largest size, pick the group whose frequency k is larger.

import java.util.HashMap;
public class majorityFreqCharacters {
    public static void main(String[] args){
        String s = "aaabbbccdddde";
        System.out.println(majorFreq(s));
    }

    public static String majorFreq(String s){
        // 1. add all chars into the map
        // 2. add freq of all characters in frequency hashmap
        // 3. check if max==map.get(key) sb.append(key);
        
        int n=s.length();
        
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> frequency = new HashMap<>();

        // step 1.

        for(int i=0; i<n; i++){

            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }else{
                map.put(ch,1);
            }
        }

        // step 2.

        for(char key : map.keySet()){
            int freq = map.get(key);
            if(frequency.containsKey(freq)){
                int freqCount=frequency.get(freq);
                frequency.put(freq,freqCount+1);
            }else{
                frequency.put(freq,1);
            }
        }

        // step 3.

        int max=0;
        int maxFreq=0;

        for(int key : frequency.keySet()){
            int maxCount=frequency.get(key);
            if(max<=maxCount && key>maxFreq){
                max=maxCount;
                maxFreq=key;
            }
        }

        for(char key:map.keySet()){
            int freq=map.get(key);
            if(freq==maxFreq){
                ans.append(key);
            }
        }
        return ans.toString();
    }
}
