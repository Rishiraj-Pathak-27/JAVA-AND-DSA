// WAP to find the longest subarray whose sum is <= k

// Approach 1 (T.C(O(N+N)))

// public class longestSubarrayLessThanK{
//     public static void main(String[] args) {
//         int[] arr = {2,5,1,7,10};
//         int k=14;

//         System.out.println(longestSubarray(arr, k));

//     }

//     public static int longestSubarray(int[] arr, int k){
//         int n=arr.length;
//         int left=0, right=0,sum=0;

//         int max=sum;


//         // cond to check if the right reached the end
//         while(right<n-1){
            
//             // add the right new element
//             sum+=arr[right];

//             // as the cond becomes wrong subtract the lefting element and start shrinking the left ptr until the sum<=k 
//             while(sum>k){
//                 sum -= arr[left];
//                 left++;
//             }

//             // if true add the window size into max and start expanding the right ptr
//             if(sum<=k){
//                 max=Math.max(max,right-left+1);
//                 right++;
//             }
//         }
//         return max;
//     }
// }

// Approach 2 T.C -> O(N)

public class longestSubarrayLessThanK{
    public static void main(String[] args) {
        int[] arr = {2,7,1,10,10};
        int k=14;
        System.out.println(longestSubarray(arr,k));
    }

    public static int longestSubarray(int[] arr, int k){
        int n=arr.length;
        int left=0, right=0, max=0, sum=0;

        while(right<n-1){
            sum+=arr[right];

            if(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }

            if(sum<=k){
                max=Math.max(max,right-left+1);
                right++;
            }
        }
        return max;
    }
}