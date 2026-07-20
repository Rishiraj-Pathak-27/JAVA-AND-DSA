// Approach to find the target element using binary search recursively

public class binarySearch{
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 5;

        System.out.println(biSearch(arr,target));
    }

    public static int helper(int[] arr, int target, int left, int right){
        if(left>right) return -1;
        // calculate mid
        int mid=left+(right-left)/2;

        if(arr[mid]==target) return mid;

        // if greater then shrink till mid-1
        else if(arr[mid]>target) return helper(arr,target,left,right-1);
        
        // if smaller then shrink till mid+1
        else return helper(arr,target,left+1,right);
    }

    public static int biSearch(int[] arr, int target){
        int n=arr.length;
        return helper(arr,target,0,n-1);
    }
}