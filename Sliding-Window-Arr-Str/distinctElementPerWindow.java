// Count Distinct Elements in Every Window
// TC->O(nk^2)

import java.util.ArrayList;
import java.util.List;

public class distinctElementPerWindow {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,4,2,3};
        int k=4;
        System.out.println(distincts(arr,k));
    }

    public static List<Integer> distincts(int[] arr, int k){
        int n=arr.length;

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<=n-k; i++){
            int count=0;
            for(int j=i; j<i+k; j++){
                
                boolean isFound=false;

                for(int l=i; l<j; l++){
                    if(arr[j] == arr[l]){
                        isFound=true;
                        break;
                    }
                }

                if(!isFound){
                    count++;
                }

            }

            ans.add(count);
        }
        return ans;
    }
}
