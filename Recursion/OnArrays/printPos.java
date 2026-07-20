// Print only positive numbers.

public class printPos{
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,-5,6,-7,8,-9};
        positive(arr,0);
    }

    public static void positive(int[] arr, int idx){
        int n=arr.length;
        if(n==idx) return;

        if(arr[idx]>0){
            System.out.print(arr[idx]+" ");
        }

        positive(arr,idx+1);
    }
}