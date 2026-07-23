// Find the second smallest element.

public class secondSmallestElement {
    public static void main(String[] args){
        int[] arr = {5,2,8,9,10};
        System.out.println(secondMin(arr,0));
    }


    public static int min(int[] arr, int idx){
        int n=arr.length;
        if(n-1==idx) return Integer.MAX_VALUE;

        int minRem=min(arr,idx+1);

        if(arr[idx]<minRem){
            return arr[idx];
        }else{
            return minRem;
        }
    }

    public static int secondMin(int[] arr, int idx){
        int minVal=min(arr,0);
        int n=arr.length;

        if(n==idx) return Integer.MAX_VALUE;

        int secMin=secondMin(arr,idx+1);

        if(arr[idx]>minVal && arr[idx]<secMin){
            return arr[idx];
        }else{
            return secMin;
        }
    }
}
