// 942. DI String Match

// import java.util.Arrays;

// public class DIStringMatch {

//     public static int[] permMatch(String s){
//         int n=s.length();
//         int[] perm = new int[n+1];

//         int low=0, high=n;

//         for(int i=0; i<n;i++){
//             if(s.charAt(i) == 'I'){
//                 perm[i] = low++;
//             }else{
//                 perm[i] = high--;
//             }
//         }
//         perm[n] = low++;
//         return perm;
//     }

//     public static void main(String[] args){
//         String s = "IDID";
//         System.out.println(Arrays.toString(permMatch(s)));
//     }
// }

// OR

import java.util.Arrays;

public class DIStringMatch{

    public static int[] permMatch(String s){

        char[] ch = s.toCharArray();
        int n=ch.length;
        int[] perm = new int[n+1];
        int low=0, high=n;


        for(int i=0; i<n; i++){
            if(ch[i] == 'I'){
                perm[i]=low++;
            }else{
                perm[i]=high--;
            }
        }
        perm[n]=low++;
        return perm;
    }

    public static void main(String[] args){
        String s = "IDID";
        System.out.println(Arrays.toString(permMatch(s)));
    }
}