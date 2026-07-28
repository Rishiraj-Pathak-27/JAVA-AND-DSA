
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class subarrayBeauty {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = ip.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        int k = ip.nextInt();
        int x = ip.nextInt();
        System.out.println(Arrays.toString(beauty(arr, k, x)));
    }

    public static int[] beauty(int[] arr, int k, int x) {
        int n = arr.length;

        int[] ans = new int[n - k + 1];
        int idx = 0;

        for (int right = 0; right <= n - k; right++) {

            ArrayList<Integer> negatives = new ArrayList<>();

            for (int left = right; left < right+k; left++) {

               if(arr[left]<0){
                negatives.add(arr[left]);
               }
            }
            Collections.sort(negatives);

                if (negatives.size() >= x) {
                    ans[idx] = negatives.get(x-1);
                } else {
                    ans[idx] = 0;
                }
                idx++;
        }
        return ans;
    }
}
