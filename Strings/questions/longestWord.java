// WAP to Find Longest Word in a Sentence

public class longestWord {

    public static String longestInString(String s) {
        String[] arr = s.split(" ");
        int max = 0;
        int n=arr.length;

        String longest = "";

        for (int i = 0; i < n; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                longest = arr[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        String str = "Data science uses statistics";

        System.out.println(longestInString(str));

    }
}
