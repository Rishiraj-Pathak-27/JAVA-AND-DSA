// Write an optimised approach to solve the problem of maxSumSubarray 

// Approach -> Sliding Window with the Kernal Size Constant

public class maxSumSubarray {

    public static void main(String[] args) {
        int[] arr = {-1, 4, 8, 6, -2, -3, 3};
        int k = 4;

        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k) {

        int n = arr.length;
        int right = k - 1;
        int left = 0;
        int sum = 0;

        if(n<k) return 0;

        // this loop will calculate the sum of initial first window = k size
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }

        int max=sum;

        // used to sub the recent lefting element -> move the window -> add the adding element to window
        // while(right<n-1){
        //     sum-=arr[left];
        //     left++;
        //     right++;
        //     sum+=arr[right];
        //     max=Math.max(max,sum);
        // }
        // return max;

        // OR
        
        for(int i=k; i<right-1; i++){
            sum-=arr[left];
            sum+=arr[right];
            max=Math.max(max,sum);
        }
        return max;
    }
}
