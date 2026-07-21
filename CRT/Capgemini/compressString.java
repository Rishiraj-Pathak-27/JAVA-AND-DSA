// Problem Statement –
// Capgemini in its online written test have a coding question, wherein the students are given a string with multiple characters that are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :

// Input :
// aabbbbeeeeffggg
// Output:
// a2b4e4f2g3

public class compressString{
    public static void main(String[] args) {
        String s="aabbbbeeeeffggg";
        System.out.println(compStr(s));
    }

    public static String compStr(String s){
        int count=1;
        int n=s.length();
        String ans = s.charAt(0)+"";

        for(int i=1; i<n; i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr==prev){
                count++;
            }else{
                if(count>1){
                    ans += count;
                }
                count=1;
                ans += curr;
            }
        }

        if(count>1){
            ans+=count;
        }

        return ans;
    }
}
