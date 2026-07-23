// Normal Approach

// public class reverseString {
//     public static void main(String[] args){
//         String s = "Rishiraj";
//         System.out.println(reverse(s,0));
//     }    

//     public static String reverse(String s, int idx){
//         int n=s.length();
//         if(n==idx) return "";

//         char[] arr = s.toCharArray();

//         int left=0, right=n-1;

//         while(left<right){
//             char temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//             left++;
//             right--;
//         }

//         // char arr -> string use:
//         return new String(arr);
//     }
// }

// Recursive Approach

public class reverseString{
    public static void main(String[] args){
        String s = "Rishiraj";
        System.out.println(reverse(s));
    }

    public static void helper(String s, int left, int right, char[] arr){
        if(left>right) return;

        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        helper(s,left+1,right-1,arr);
    }

    public static String reverse(String s){
        char[] arr = s.toCharArray();
        helper(s,0,s.length()-1,arr);
        return new String(arr);
    }
}
