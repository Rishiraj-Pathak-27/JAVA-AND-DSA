// Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.


// Brute Force Approach

public class subarrayProductLessThanK{
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k=100;
        System.out.println(subarrayProduct(arr, k));
    }

    public static int subarrayProduct(int[] arr, int k){
        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            int prod=1;
            for(int j=i; j<n; j++){
                prod*=arr[j];
                if(prod<k){
                    count++;
                }
            }
            
        }
        return count;
    }
}