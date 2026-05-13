// 2956. Find Common Elements Between Two Arrays

/* import java.util.Arrays;

public class commonElements {

    public static int[] commonFromBothArr(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;

        int left=0, right=0;

        for(int ele1:arr1){
            for(int ele2:arr2){
                if(ele1==ele2){
                    left++;
                    break;
                }
            }
        }

        for(int ele1:arr2){
            for(int ele2:arr1){
                if(ele1==ele2){
                    right++;
                    break;
                }
            }
        }
        return new int[] {left,right};
    }

    public static void main(String[] args){
        int[] arr1 = {4,3,2,3,1};
        int[] arr2 = {2,2,5,2,3,6};
        
        int[] res = commonFromBothArr(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
} */


// OR

/* import java.util.Arrays;
public class commonElements{

    public static int[] commonFromBothArr(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int left=0, right=0;
        int leftCount=0;

        while(left<n && right<m){
            if(arr1[left] == arr2[right]){
                leftCount++;
                left++;
            }else if(arr1[left] > arr2[right]){
                right++;
            }else{
                left++;
            }
        }

        left=0;
        right=0;
        int rightCount=0;

        while(left<n && right<m){
            if(arr2[right] == arr1[left]){
                rightCount++;
                right++;
            }else if(arr1[left] > arr2[right]){
                right++;
            }else{
                left++;
            }
        }
        return new int[]{leftCount,rightCount};
    } 

    public static void main(String[] args){
        int[] arr1 = {4,3,2,3,1};
        int[] arr2 = {2,2,5,2,3,6};

        int[] res = commonFromBothArr(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
} */

// OR

import java.util.Arrays;
public class commonElements{
    public static boolean helper(int[] arr, int target){
        int left=0, right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) left=mid+1;
            else right=mid-1;
        }
        return false;
    }

    public static int[] commonFromBothArr(int[] arr1, int[] arr2){
        int left=0, right=0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int ele1:arr1){
            if(helper(arr2,ele1)){
                left++;
            }
        }

        for(int ele2:arr2){
            if(helper(arr1,ele2)){
                right++;
            }
        }
        return new int[] {left,right};
    }

    public static void main(String[] args){
        int[] arr1 = {4,3,2,3,1};
        int[] arr2 = {2,2,5,2,3,6};

        int[] res = commonFromBothArr(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}