// 3550. Smallest Index With Digit Sum Equal to Index
// You are given an integer array nums.
// Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
// If no such index exists, return -1.

public class smallestIdxWithDigitEqualsSum {
    public static void main(String[] args){
        int[] arr = {1,10,11};
        System.out.println(smallestIdx(arr));
    }    

    public static int smallestIdx(int[] arr){
        int n=arr.length;

        for(int i=0; i<n; i++){       
            int sum=0;
            int unit = arr[i];
            while(unit!=0){
                int rem=unit%10;
                sum+=rem;
                unit/=10;
            }

            if(sum == i) return i;
        }

        return -1;
    }
}
