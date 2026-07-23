// 90. Subsets II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsII {

        public static void main(String[] args){
            int[] arr = {1,2,2};
            System.out.println(subsetsWithDup(arr));
        }

        public static void helper(int[] arr, int idx,List<Integer> res, List<List<Integer>> ans){
            int n=arr.length;

            ans.add(new ArrayList<>(res));

            for(int i=idx; i<n; i++){
                if(i>idx && arr[i]==arr[i-1]){
                    continue;
                }

                res.add(arr[i]);
                helper(arr,i+1,res,ans);
                res.remove(res.size()-1);
            }
        }

        public static List<List<Integer>> subsetsWithDup(int[] arr){
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> res = new ArrayList<>();
            Arrays.sort(arr);
            helper(arr,0,res,ans);
            return ans;
        }
}
