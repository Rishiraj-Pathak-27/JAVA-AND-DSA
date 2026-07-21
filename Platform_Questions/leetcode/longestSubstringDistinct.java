// 3. Longest Substring Without Repeating Characters

public class longestSubstringDistinct{
    public static void main(String[] args){
        String s = "pwwkew";
        System.out.println(longestSubstring(s));
    }

    public static int longestSubstring(String s){
        char[] arr = s.toCharArray();
        int n=arr.length;
        int[] temp = new int[128];
        int max=0;
        int left=0;

        for(int right=0; right<n; right++){
            char currChar = arr[right];

            if(temp[currChar]>left){
                left=temp[currChar];
            }

            temp[currChar]=right+1;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}