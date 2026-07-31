// Remove all vowels.

public class removeVowels {
    public static void main(String[] args){
        String s = "rishiraj";
        System.out.println(removeVow(s));
    }

    public static String removeVow(String s){
        StringBuilder sb = new StringBuilder();
        helper(s,sb,0);
        return sb.toString();
    }

    public static void helper(String s, StringBuilder sb, int idx){
        int n=s.length();

        if(n==idx) return;
        char ch = s.charAt(idx);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
        ){
            helper(s,sb,idx+1);
        }else{
            sb.append(ch);
            helper(s,sb,idx+1);
        }
        
    }    
}
