// Approach 1

// public class uniquePaths{

//     public static int helper(int m, int n){
//         if(m==1 || n==1) return 1;
//         return helper(m,n-1)+helper(m-1,n);
//     }

//     public static void main(String[] args) {
//         int m=3, n=7;
//         System.out.println(helper(m,n));
//     }
// }

// Approach 2

// public class uniquePaths{

//     public static int helper(int cr, int cc, int m, int n){
//         if(cr==m && cc==n) return 1;
//         if(cr>m || cc>n) return 0;

//         int right = helper(cr,cc+1,m,n);
//         int left = helper(cr+1,cc,m,n);

//         return right+left;
        
//     }

//     public static int paths(int m, int n){
//         return helper(0,0,m-1,n-1);
//     }

//     public static void main(String[] args) {
//         int m=3, n=7;
//         System.out.println(paths(m,n));
//     }
// }

// Approach 3

public class uniquePaths{

    public static int helper(int m, int n){
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;

        return helper(m,n-1)+helper(m-1,n);
        
    }

    public static int paths(int m, int n){
        return helper(m,n);
    }

    public static void main(String[] args) {
        int m=3, n=7;
        System.out.println(paths(m,n));
    }
}