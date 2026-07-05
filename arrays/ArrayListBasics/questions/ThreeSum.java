// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum{
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(tripletSum(arr));

    }

    public static List<List<Integer>> tripletSum(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n-1; i++){

            int j=i+1;
            int k=n-1;

            // duplicate checking condition before 'i'
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            //sliding window execution based on 3 conditions

            while(j<k){

                int total=arr[i]+arr[j]+arr[k];

                if(total>0){
                    k--;
                }else if(total<0){
                    j++;
                }else{
                    ans.add(List.of(arr[i],arr[j],arr[k]));
                    j++;
                    k--;

                    // check for duplicate element before 'j'
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }

                    // check for duplicate element after 'k'
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }        
        }
        return ans;
    }
}