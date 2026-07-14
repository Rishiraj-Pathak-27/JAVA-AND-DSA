// First Negative Integer in Every Window of Size K

import java.util.ArrayList;

public class negativeFromSubarray {

    public static void main(String[] args) {
        int[] arr = {-8,2,3,-6,10};
        int k = 2;

        System.out.println(negativeElement(arr, k));
    }

    public static ArrayList<Integer> negativeElement(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= n - k; i++) { // 0 <= 5-2=3, 1<=3, 2<=3, 3<=3

            boolean isFound = false;

            for (int j = i; j < i + k; j++) {   // 0 < 2+0=2, 1<3, 2<4, 3<5

                if (arr[j] < 0) {
                    ans.add(arr[j]);
                    isFound = true;
                    break;
                }
            }

            if(!isFound){
                ans.add(0);
            }
        }
        return ans;
    }
}
