// Given a string s, generate all possible subsequences of the string (including the empty subsequence) and return them in lexicographical order.
// A subsequence is obtained by deleting zero or more characters from the string without changing the relative order of the remaining characters.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsequencesString {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(powerSet(s));
    }

    public static List<String> powerSet(String s) {
        List<String> list = new ArrayList<>();
        helper("", s, 0, list);
        Collections.sort(list);
        return list;
    }

    public static void helper(String ans, String s, int idx, List<String> list) {
        int n = s.length();

        if (n == idx) {
            list.add(ans);
            return;
        }

        char ch = s.charAt(idx);
        helper(ans + ch, s, idx + 1, list);
        helper(ans, s, idx + 1, list);
    }
}
