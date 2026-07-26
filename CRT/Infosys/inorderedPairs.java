import java.util.Scanner;
public class inorderedPairs{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        int d=ip.nextInt();
        int m=ip.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }
        System.out.println(unorderedPairs(arr, d, m));
    }

    public static int unorderedPairs(int[] arr, int d, int m){
        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(((arr[i]+arr[j]) % d  == 0) && ((Math.abs(arr[i]-arr[j])) % m == 0)){
                    count++;
                }
            }
        }
        return count;
    }
}