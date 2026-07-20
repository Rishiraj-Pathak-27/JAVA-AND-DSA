// Count occurrences of a given element.

public class countOccurrances{
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,2,2,6,2};
        int n=2;
        System.out.println(occurrances(arr,n,0));
    }

    public static int occurrances(int[] arr, int n, int idx){
        if(arr.length==idx) return 0;
        if(arr[idx]==n){
            return 1+occurrances(arr, n, idx+1);
        }
        return occurrances(arr, n, idx+1);
    }
}