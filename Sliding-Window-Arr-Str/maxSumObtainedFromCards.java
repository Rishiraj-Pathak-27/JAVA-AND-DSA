// There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
// Your score is the sum of the points of the cards you have taken.
// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

public class maxSumObtainedFromCards{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k=3;

        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k){
        int n=arr.length;
        int lsum=0, rsum=0, max=0;

        for(int i=0; i<k; i++){
            lsum+=arr[i];
        }
        max=lsum;

        int rightIdx=n-1;

        for(int j=k-1; j>=0; j--){
            lsum-=arr[j];
            rsum+=arr[rightIdx];
            rightIdx--;

            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}