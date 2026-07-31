// Remove all spaces.

public class removeSpaces {
    public static void main(String[] args){
        String s= "ri  sh  i r aj ";
        System.out.println(remove(s));
    }

    public static String remove(String s){
        StringBuilder sb = new StringBuilder();
        
        helper(s,sb,0);
        return sb.toString();
        
    }

    public static void helper(String s, StringBuilder sb, int idx){
        int n=s.length();
        if(n==idx) return;

        char ch = s.charAt(idx);
        if(ch!=' '){
            sb.append(ch);
        }

        helper(s,sb,idx+1);
    }
}
