// Given an integer array nums and an integer k, return the number of subarrays of nums where the greatest common divisor of the subarray's elements is k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// The greatest common divisor of an array is the largest integer that evenly divides all the array elements.

public class subarraysGCDEqualsK {
    public static void main(String[] args){
        int[] arr = {9,3,1,2,6,3};
        int k=3;
        System.out.println(gcdEqualsK(arr,k));
    }

    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

    public static int gcdEqualsK(int[] arr, int k){
        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            int gcd=0;
            for(int j=i; j<n; j++){
                gcd=gcd(gcd,arr[j]);
                if(gcd == k){
                    count++;    // count=4
                }
            }
        }
        return count;
    }
}
