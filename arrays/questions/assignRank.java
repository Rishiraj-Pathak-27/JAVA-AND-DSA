// Given an array of integers arr, replace each element with its rank.

// The rank represents how large the element is. The rank has the following rules:

// Rank is an integer starting from 1.
// The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
// Rank should be as small as possible.

import java.util.Arrays;
public class assignRank{
    public static void main(String[] args){
        int[] arr = {40,20,10,30};  // {4,2,1,3}
        System.out.println(Arrays.toString(rank(arr)));
    }

    public static int[] rank(int[] arr){
        int n=arr.length;

        int[] temp = arr.clone();
        int[] ans = new int[n];

        Arrays.sort(temp);

        int rank=1;
        for(int i=0; i<n; i++){
            if(i>0){
            // to skip duplicates
            if(i>0 && temp[i] == temp[i-1]) continue;      // [10,20,30,40]
            rank++;
            }

            for(int j=0; j<n; j++){
                if(temp[i]==arr[j]){
                    ans[j]=rank;
                }
            }
        }

        return ans;
    }
}