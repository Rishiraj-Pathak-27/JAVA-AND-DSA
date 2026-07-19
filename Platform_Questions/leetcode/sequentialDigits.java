// 1291. Sequential Digits

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sequentialDigits {

    public static void main(String[] args) {
        int low = 100, high = 300;

        System.out.println(lowHigh(low, high));
    }

    public static List<Integer> lowHigh(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String s = "123456789";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                int digits = Integer.parseInt(s.substring(i, j));
                if (digits >= low && digits <= high) {
                    ans.add(digits);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
