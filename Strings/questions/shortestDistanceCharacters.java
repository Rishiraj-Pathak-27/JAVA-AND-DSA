// Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
// The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

public class shortestDistanceCharacters{
    public static void main(String[] args){
        String s="loveleetcode";
        char c='e';
    }

    public static int[] shortestDistance(String s, char c){
        char[] arr=s.toCharArray();

        for(int i=0; i<arr.length; i++){
            int j=0,k=0;

            while(j<arr.length-1 && k>0){
                j--;
                k++;
            }
        }
    }
}