// 1295. Find Numbers with Even Number of Digits

// Direct Approach

// public class numbersWithEvenDigits{

//     public static int evenDigits(int[] arr){
//         int count=0;
//         int n=arr.length;

//         for(int i=0; i<n; i++){
//             int countDigit=0;
//             int num = arr[i];

//             while(num!=0){
//                 int rem = num%10;
//                 countDigit++;
//                 num/=10;
//             }

//             if(countDigit%2==0) count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr = {234,1245,8982,90902837,1,22};
//         System.out.println(evenDigits(arr));
//     }
// }

// String Based Approach 

public class numbersWithEvenDigits{

    public static int evenDigits(int[] arr){
        int count=0;
        int n=arr.length;

        for(int i=0; i<n; i++){
            int num=arr[i];
            if(String.valueOf(num).length() % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {234,1245,8982,90902837,1,22};
        System.out.println(evenDigits(arr));
    }
}