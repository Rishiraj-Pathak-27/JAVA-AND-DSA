// Given a string s, find the length of the longest substring without duplicate characters.
 public class longestSubstringDistinct{
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }

    public static int longestSubstring(String s){
        char[] arr = s.toCharArray();

        int n=arr.length;

        int max=0;

        int[] temp = new int[128];

        int left=0;

        for(int right=0; right<n; right++){

            char currChar = arr[right];

            if(temp[currChar] > left){

                left = temp[currChar];

            }

            temp[currChar] = right+1;
            max = Math.max(max,right-left+1);
        }
        return max;
    }
 }