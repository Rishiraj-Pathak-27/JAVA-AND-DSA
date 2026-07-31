// Count digits in a string.


// Normal Approach

// public class countDigits{
//     public static void main(String[] args){
//         String s = "r1s2i3a4";
//         System.out.println(count(s));
//     }

//     public static int count(String s){
//         int n=s.length();
//         int count=0;

//         for(int i=0; i<n; i++){
//             char ch=s.charAt(i);
//             if(ch>='0' && ch<='9'){
//                 count++;
//             }
//         }
//         return count;
//     }
// }

// Recursive Approach

public class countDigits{
    public static void main(String[] args){
        String s="r1s2i3a4";
        System.out.println(count(s,0));
    }

    public static int count(String s, int idx){
        int n=s.length();
        
        if(n==idx) return 0;

        char ch = s.charAt(idx);
        
        // if(ch>='0' && ch<='9'){
        //     return 1+count(s,idx+1);
        // }
        // return count(s,idx+1);

        // OR

        return (ch>='0' && ch<='9') ? 1+count(s,idx+1) : count(s,idx+1);
    }
}