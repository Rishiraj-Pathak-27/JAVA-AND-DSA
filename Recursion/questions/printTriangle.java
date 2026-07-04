// Print Triangle

        // *
        // * *
        // * * *
        // * * * *

// Normal Approach

// public class printTriangle{
//     public static void main(String[] args) {
//         int n=4;
//         print(n);
//     }

//     public static void print(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Recursive Approach

public class printTriangle{
    public static void main(String[] args) {

        int n=4;
        print(n,1,1);
    }

    public static void print(int n, int row, int col){
        if(n<row) return;

        if(col<=row){
            System.out.print("* ");
            print(n,row,col+1);
        }else{
            System.out.println();
            print(n,row+1,1);
        }
    }
}