package questions;
import java.util.Scanner;

public class decreasingIncreasing {
    public static void main(String[] args){
    Scanner ip = new Scanner(System.in);
    int n=ip.nextInt();

    print(n);
    }

        if(n==0) return;// { 
        //     System.out.print(n+" ");  // 1
        //     return;
        // }
        
        // OR

        System.out.print(n+" ");    // 5 4 3 2 1
        print(n-1);
        if(n!=1) System.out.print(n+" ");    // 2 3 4 5
    }
}
