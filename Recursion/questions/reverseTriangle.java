// Print Reverse Triangle

        // * * * *
        // * * *
        // * *
        // * 

// Normal Approach

// public class reverseTriangle{
//     public static void main(String[] args) {
//         int n=4;
//         print(n);
//     }

//     public static void print(int n){
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Recursive Approach

public class reverseTriangle{
    public static void main(String[] args) {
        int n=4;
        print(n,n,1);
    }

    public static void print(int n, int row, int col){
        if(n==0) return;

        if(col<=row){
            System.out.print("* ");
            print(n,row,col+1);
        }else{
            System.out.println();
            print(n,row-1,1);
        }
    }
}