// A string is good if there are no repeated characters.
// Given a string s, return the number of good substrings of length three in s​​​​​​.
// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
// A substring is a contiguous sequence of characters in a string.

public class substringWithSizeThreeDistinct{
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(substringThree(s));
    }

    public static int substringThree(String s){
        char[] arr = s.toCharArray();
        int n=arr.length;
        int count=0;

        for(int i=0; i<n-2; i++){
            int j=i;

            if(arr[i] != arr[i+1] && arr[i] != arr[i+2] && arr[i+1] != arr[i+2]){
                count++;
            }
        }
        return count;
    }
}
 