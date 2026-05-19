package questions;

import java.util.Scanner;
public class reversePrinting {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        print(n);
    }   

    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
