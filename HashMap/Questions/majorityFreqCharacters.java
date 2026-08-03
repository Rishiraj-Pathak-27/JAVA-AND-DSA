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
        // 2. find max freq from map based on value
        // 3. check if max==map.get(key) sb.append(key);
        
        int n=s.length();
        
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

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

        int max=0;

        for(char key : map.keySet()){
            int freq=map.get(key);
            max=Math.max(max,freq);
        }

        // step 3.

        for(char key:map.keySet()){
            int freq=map.get(key);
            if(freq==max){
                ans.append(key);
            }
        }



        return ans.toString();


    }
}
