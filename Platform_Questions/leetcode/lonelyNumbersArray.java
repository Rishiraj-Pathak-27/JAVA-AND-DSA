// 2150. Find All Lonely Numbers in the Array

import java.util.*;

public class lonelyNumbersArray {

    public static List<Integer> findLonely(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if((i>0 && arr[i] == arr[i-1]) || (i<n-1 && arr[i] == arr[i+1])){
                continue;
            }

            if((i>0 && arr[i] == arr[i-1]+1) || (i<n-1 && arr[i] == arr[i+1]-1)){
                continue;
            }

            ans.add(arr[i]);

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 5, 8};
        System.out.println(findLonely(arr));
    }
}
