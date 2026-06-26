// Print Odd Numbers from N to 1

// public class odd{
//     public static void main(String[] args) {
//         int n=100;
//         print(n);
//     }

//     public static void print(int n){

//         if(n%2==0) n--;

//         if(n<=0) return;
//         System.out.print(n+" ");
//         print(n-2);
//     }
// }

// Print Odd Numbers from 1 to N

// public class odd{
//     public static void main(String[] args) {
//         int n=100;
//         print(n);
//     }

//     public static void print(int n){
//         if(n%2==0) n--;
//         if(n<=0) return;
//         print(n-2);
//         System.out.print(n+" ");
//     }
// }

public class odd{
    public static void main(String[] args) {
        int n=5;
        System.out.println(print(n));
    }

    public static int print(int n){
        if(n==1 || n==2) return n;
        return n*print(n-1);
    }
}