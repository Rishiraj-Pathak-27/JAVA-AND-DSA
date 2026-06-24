// 70. Climbing Stairs

// Recursive Approach TC(O(2^n))

// public class climbingStairs{

//     public static int stairs(int n){
//         if(n<=2) return n;
//         return stairs(n-1)+stairs(n-2);
//     }

//     public static void main(String[] args){
//         int n=5;
//         System.out.println(stairs(n));
//     }
// }

// Best Approach TC(O(N))

public class climbingStairs{

    public static int stairs(int n){
        int x=0,y=1,z=0;

        for(int i=1; i<=n; i++){
            z=x+y;
            x=y;
            y=z;
        }
        return y;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(stairs(n));
    }
}