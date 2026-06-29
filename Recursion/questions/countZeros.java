// Count Number of Zeros


// Normal Code

// public class countZeros{
//     public static void main(String[] args) {
//         int n=1004002;
//         System.out.println(count(n));
//     }

//     public static int count(int n){
//         if(n==0) return 1;
//         int count=0;

//         while(n!=0){
//             int rem=n%10;
//             if(rem==0) {
//                 count++;
//             }
//             n/=10;
//         }
//         return count;
//     }
// }

// Recursive Approach

public class countZeros{
    public static void main(String[] args) {
        int n=1004002;

        if(n==0) {
            System.out.println(1);
        }else{
        System.out.println(count(n));
        }
    }

    public static int count(int n){
        if(n==0) return 0;

        int curr = (n%10 == 0) ? 1 : 0;
        return curr+count(n/=10);
}
}