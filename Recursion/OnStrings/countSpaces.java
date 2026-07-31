// Count spaces.

public class countSpaces {
    public static void main(String[] args){
        String s = "  ri sh ir a j ";
        System.out.println(spaces(s,0));
    }

    public static int spaces(String s, int idx){
        int n=s.length();
        if(n==idx) return 0;
        char ch = s.charAt(idx);
        return (ch==' ') ? 1+spaces(s,idx+1) : spaces(s,idx+1); 
    }
}
