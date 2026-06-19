// 3612. Process String with Special Operations I

public class stringWithSpecialOpI{

    public static String specialOperation(String str){
        int n=str.length();
        StringBuilder ans = new StringBuilder();

        for(char ch : str.toCharArray()){

            if(ch >= 'a' && ch <= 'z') {
                ans.append(ch);
            }
            else if(ch == '#') {
                if(ans.length()>0){
                ans.append(ans);
                }
            }
            else if(ch == '%') {
                if(ans.length()>0){
                ans.reverse();
                }
            }
            else if(ch == '*') {
                if(ans.length()>0){
                ans.deleteCharAt(ans.length()-1);
                }
            }
            else ans.append(" ");
        }
        return ans.toString();
    }

    public static void main(String[] args){
        String str = "abc#*%";

        System.out.println(specialOperation(str));
    }
}