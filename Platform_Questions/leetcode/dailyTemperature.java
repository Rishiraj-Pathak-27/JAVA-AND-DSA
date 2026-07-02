// 739. Daily Temperatures

import java.util.Arrays;

public class dailyTemperature {

    public static void main(String[] args) {
        int[] arr = {30,40,50,60};

        System.out.println(Arrays.toString(dailyTemp(arr)));
    }

    public static int[] dailyTemp(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n && arr[j] <= arr[i]) {
                j++;
            }

            if (j < n) {
                ans[i] = j - i;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}