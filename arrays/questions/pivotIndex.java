// WAP to find Pivot Index in a given array

public class pivotIndex{

    public static int sum(int[] arr, int start, int end){
        int sum=0;

        for(int i=start; i<=end; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int pivot(int[] arr){
        int n=arr.length;

        for(int i=0; i<n; i++){
            int leftSum=0;
            int rightSum=0;

            if(i>0){
                leftSum+=sum(arr,0,i-1);
            }

            if(i<n-1){
                rightSum+=sum(arr,i+1,n-1);
            }

            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,7,3,6,5,6};
        System.out.format("Pivot Index = %d",pivot(arr));
    }
}