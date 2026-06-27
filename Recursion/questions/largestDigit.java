// Find Largest Digit

public class largestDigit {
    public static void main(String[] args){
        int n=39628;
        System.out.println(largest(n));
    }

    public static int largest(int n){
        if(n==0) return 0;

        if(n<10) return n;

        return Math.max(n%10,largest(n/=10));

    }
}

// non-recursive approach

// public class largestDigit {
//     public static void main(String[] args){
//         int n=39628;
//         System.out.println(largest(n));
//     }

//     public static int largest(int n){
//         int max=0;
//         while(n!=0){   
//             int rem  = n%10;
//             max = Math.max(rem,max);
//             n/=10;
//         }

//         return max;
//     }
// }
