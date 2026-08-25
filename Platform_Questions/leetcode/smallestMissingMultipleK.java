// 3718. Smallest Missing Multiple of K

// Given an integer array nums and an integer k, return the smallest positive multiple of k that is missing from nums.
// A multiple of k is any positive integer divisible by k.

import java.util.HashSet;
import java.util.Scanner;
public class smallestMissingMultipleK {
   public static void main(String[] args){
    Scanner ip = new Scanner(System.in);
    int n=ip.nextInt();

    int[] arr = new int[n];

    for(int i=0; i<n; i++){
        arr[i]=ip.nextInt();
    }
    
    int k=ip.nextInt();

    System.out.println(smallestMissing(arr,k));
   } 

   public static int smallestMissing(int[]arr, int k){
        int n=arr.length;

        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr){
            set.add(ele);
        }

        for(int i=1; i<=n; i++){
            int mult = i*k;
            if(!set.contains(mult)){
                return mult;
            }
        }
        return -1;
   }
}
