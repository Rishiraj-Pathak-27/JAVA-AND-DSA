// Write a recursive Approach to complete the tower of hanoi

public class towerOfHanoi {
    public static void main(String[] args){
        int n=3;
        hanoi(n,'a','b','c');
    }

    public static void hanoi(int n, char a, char b, char c){       // a -> src, b -> via, c -> dest
        if(n==0) return;

        hanoi(n-1,a,c,b);   // 1. Move n-1 disks from a -> b via c 
        
        System.out.println(a+" -> "+c);     // 2. move largest directly from a -> c

        hanoi(n-1,b,a,c);   // 2. Move n-1 disks from b -> c via a
    }
}
