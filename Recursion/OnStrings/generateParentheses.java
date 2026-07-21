// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

import java.util.ArrayList;
import java.util.List;
public class generateParentheses{
    public static void main(String[] args) {
        int n=3;
        System.out.println(generate(n));
    }

    public static void helper(int n, int left, int right, String s,List<String> ans){
        // base case
        // if(s.length()==2*n){
        //OR
        if(right==n){
            ans.add(s);
            return;
        }

        // for left parentheses
        if(left<n) helper(n,left+1,right,s+"(",ans);
        // for right parentheses
        if(right<left) helper(n,left,right+1,s+")",ans);
    }

    public static List<String> generate(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,0,0,"",ans);   // n->given, 0->left parentheses, 0->right parentheses, ""->empty str to store well formed parentheses, ans->list to store grp of strs
        return ans;
    }
}