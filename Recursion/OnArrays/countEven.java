// Count even numbers

public class countEven{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(even(arr,0));
    }

    public static int even(int[] arr,int idx){
        int count;
        int n=arr.length;

        if(n==idx){
            return 0;
        }

        if(arr[idx] % 2==0){
           count=1;
        }else{
            count=0;
        }

        return count+even(arr,idx+1);
    }
}