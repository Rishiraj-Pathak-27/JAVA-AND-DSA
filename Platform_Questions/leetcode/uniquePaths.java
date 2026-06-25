// 62. Unique Paths

// Approach 1

// public class uniquePaths {
//     public static int paths(int m, int n) {
//         if(m==1||n==1) return 1;
//         return paths(m,n-1)+paths(m-1,n);
//     }

//     public static void main(String[] args){
//         int m=3,n=7;
//         System.out.println(paths(m,n));
//     }
// }

// Approach 2

public class uniquePaths {
    
    public static int helper(int cr, int cc, int er, int ec){

        if(cr==er && cc==ec) return 1;
        if(cr>er || cc>ec) return 0;

        return helper(cr,cc+1,er,ec)+helper(cr+1,cc,er,ec);
    }

    public static int paths(int m, int n) {

        return helper(0,0,m-1,n-1);
    }

    public static void main(String[] args){
        int m=3,n=7;
        System.out.println(paths(m,n));
    }
}