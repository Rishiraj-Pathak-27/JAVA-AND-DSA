// 739. Daily Temperatures

// No Optimal Approach T.C(O(N^2))

// import java.util.Arrays;

// public class dailyTemperature {

//     public static void main(String[] args) {
//         int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};

//         System.out.println(Arrays.toString(dailyTemp(arr)));
//     }

//     public static int[] dailyTemp(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];

//         for (int i = 0; i < n; i++) {
//             int j = i + 1;
//             while (j < n && arr[j] <= arr[i]) {
//                 j++;
//             }

//             if (j < n) {
//                 ans[i] = j - i;
//             } else {
//                 ans[i] = 0;
//             }
//         }
//         return ans;
//     }
// }

// Optimal Approach T.C (O(N))

import java.util.Arrays;
public class dailyTemperature{
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemp(arr)));
    }

    public static int[] dailyTemp(int[] arr){
        int n=arr.length;
        int[] ans = new int[n];

        for(int i=n-2; i>=0; i--){
            int j=i+1;
            while(j<n && arr[j]<=arr[i]){
                if(ans[j]==0){
                    j=n;
                }else{
                    j+=ans[j];
                }
            }
            if(j<n){
                ans[i] = j-i;
            }
        }
        return ans;
    }
}