// Find all indices of a target element.

public class allIndicesOfTarget {
    public static void main(String[] args){
        int[] arr = {2,1,3,4,2,5,7,2,0};
        int target=2;
        totalIndices(arr,target,0);
    }

    public static void totalIndices(int[] arr, int target, int idx){
        int n=arr.length;
        if(n==idx) return;

        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        totalIndices(arr,target,idx+1);
    }
}
