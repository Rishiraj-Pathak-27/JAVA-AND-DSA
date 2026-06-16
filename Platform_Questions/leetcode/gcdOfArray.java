// 1979. Find Greatest Common Divisor of Array

import java.util.Scanner;
public class gcdOfArray{

    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

    public static int gcdNum(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele:arr){
            min = Math.min(ele,min);
            max = Math.max(ele,max);
        }
        return gcd(min,max);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n=5;

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }

        System.out.println(gcdNum(arr));
    }
}