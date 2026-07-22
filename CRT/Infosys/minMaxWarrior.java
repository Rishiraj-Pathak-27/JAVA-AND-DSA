// In the Valley of Titans, warriors are ranked by strength values stored in array arr[].
// The King requires immediate identification of:
// The weakest warrior (minimum strength)
// The strongest warrior (maximum strength)
// Return both values in the format:
// min max
// The scan must be done in a single traversal.

import java.util.Scanner;
public class minMaxWarrior {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }

        minMax(arr);

    }

    public static void minMax(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }

        System.out.println(min+" "+max);
    }
}
