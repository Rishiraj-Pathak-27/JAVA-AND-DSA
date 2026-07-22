// A → AND
// B → OR
// C → XOR
// The vault processes the string strictly from left to right, performing one operation at a time, ignoring conventional operator precedence.
// If the string is NULL, return -1.
// Determine the final binary result.

public class vaultProcess {
    public static void main(String[] args){
        String s = "0A1B1C1";
        System.out.println(bitwiseVault(s));
    }

    public static int bitwiseVault(String s){
        if(s==null) return -1;
        int n=s.length();
        int result = s.charAt(0)-'0';


        for(int i=1; i<n; i+=2){
            char op=s.charAt(i+1);
            if(op=='A') result=result&(s.charAt(i+1)-'0');
            else if(op=='B') result=result|(s.charAt(i+1)-'0');
            else result=result^(s.charAt(i+1)-'0');
        }

        return result;
    }
}
