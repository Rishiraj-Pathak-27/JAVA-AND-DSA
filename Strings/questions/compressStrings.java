// // The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.

// import java.util.Scanner;
// public class compressStrings {

//     public static String compStr(String str){
//         int n=str.length();
//         int count=1;

//         // 1st char is stored in this var as we are traversing from 1st location
//         String ans = str.charAt(0)+"";

//         for(int i=1; i<n; i++){

//             // created to check and update the count
//             char curr = str.charAt(i);
//             char prev = str.charAt(i-1);

//             if(curr==prev){
//                 count++;
//             }else{
//                 if(count>1){
//                     ans += count;
//                 }
//                 count = 1;
//                 ans += curr;
//             }
//         }

//         // used to handle the last char frequency and add it to the ans var
//         if(count>1){
//             ans += count;
//         }
//         return ans;
//     }

//     public static void main(String[] args){
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String str = ip.nextLine();

//         System.out.println(compStr(str));

//     }
// }


public class compressStrings{
    public static void main(String[] args) {
        String s = "aaaaabbbccccccccdaa";
        System.out.println(compression(s));
    }

    public static String compression(String s){
        int n=s.length();

        String str = s.charAt(0)+"";
        int count=1;
        for(int i=1; i<n; i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr==prev){
                count++;
            }else{
                if(count>1){
                    str += count;
                }
                count=1;
                str += curr;
            }
        }
        if(count>1){
            str += count;
        }
        return str;
    }
}