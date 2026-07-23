// Find the second largest element.

// Normal Approach

// public class secondLargestElement {
//     public static void main(String[] args){
//         int[] arr = {5,2,8,9,10};
//         System.out.println(secondMax(arr));
//     }

//     public static int secondMax(int[] arr){
//         int n=arr.length;

//         int max=Integer.MIN_VALUE;

//         for(int ele:arr){
//             if(ele>max){
//                 max=ele;
//             }
//         }

//         int secMax=Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             if(arr[i]>secMax && arr[i]<max){
//                 secMax=arr[i];
//             }
//         }
//         return secMax;
//     }
// }


// Recursive Approach

public class secondLargestElement{
    public static void main(String[] args){
        int[] arr = {5,2,8,9,10};
        System.out.println(secondMax(arr,0));
    }

    public static int max(int[] arr, int idx){
        int n=arr.length;
        if(n-1==idx) return arr[idx];

        int maxRem = max(arr,idx+1);

        if(arr[idx]>maxRem){
            return arr[idx];
        }else{
            return maxRem;
        }
    }

    public static int secondMax(int[] arr, int idx){
        int maxVal=max(arr,0);
        int n=arr.length;
        if(n==idx) return Integer.MIN_VALUE;

        int secMax=secondMax(arr,idx+1);

        if(arr[idx]<maxVal && arr[idx]>secMax){
            return arr[idx];
        }else{
            return secMax;
        }
    }
}
