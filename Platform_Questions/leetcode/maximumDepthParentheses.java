// 1614. Maximum Nesting Depth of the Parentheses

//Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

public class maximumDepthParentheses {
    public static void main(String[] args){
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s){
        int max=0,sum=0;

        for(char ch:s.toCharArray()){
            if(ch==')'){
                sum--;
                continue;
            }

            if(ch!='('){
                continue;
            }

            sum++;
            max=Math.max(max,sum);
        }
        return max;     
    }
}