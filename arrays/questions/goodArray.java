// Givenan array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers. The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.
// Return True if the array is good otherwise return False.

public class goodArray {
    public static void main(String[] args) {
        int[] arr = {12,5,7,23};
        System.out.println(bestArray(arr));
    }

    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

    public static boolean bestArray(int[] arr){

        int gcd=arr[0];

        for(int ele:arr){
            gcd=gcd(gcd,ele);

            if(gcd==1){
                return true;
            }
        }
        return false;
    }
}
