// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

public class subarrayGreaterOrLessThanThreshold {
    public static void main(String[] args){
        int[] arr = {2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;
        System.out.println(numberOfSubarray(arr,k,threshold));
    }

    public static int numberOfSubarray(int[] arr, int k, int threshold){
        int n=arr.length;
        int left=0,right=0;
        int count=0;
        int sum=0;

        while(right<n){
            sum+=arr[right];

            if(right-left+1==k){
                if((sum/k)>=threshold){
                    count++;
                }
                sum-=arr[left];
                left++;
            }
            right++;
        }
        return count;
    }
}
