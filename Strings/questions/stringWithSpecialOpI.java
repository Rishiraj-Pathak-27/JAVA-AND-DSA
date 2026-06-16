public class stringWithSpecialOpI{

    public static String specialOperation(String str){
        int n=str.length();
        StringBuilder ans = new StringBuilder();

        for(char ch : str.toCharArray()){

            if(ch >= 'a' && ch <= 'z') ans.append(ch);
            else if(ch == '#') ans.append(ans.charAt(ans.length()-1));
            else if(ch == '%') ans.reverse();
            else if(ch == '*') ans.deleteCharAt(ans.length()-1);
            else ans.append(" ");
        }
        return ans.toString();
    }

    public static void main(String[] args){
        String str = "abc#*%";

        System.out.println(specialOperation(str));
    }
}