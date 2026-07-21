// Count frequencies of every element (without using loops inside recursion).

// Normal Approach 

// public class frequency {
//     public static void main(String[] args){
//         int[] arr = {2, 3, 2, 4, 5, 3, 2, 4, 1};

//         freq(arr);
//     }

//     public static void freq(int[] arr){
//         int max=0;

//         for(int ele:arr){
//             max=Math.max(max,ele);
//         }

//         int[] temp=new int[max+1];

//         for(int ele:arr){
//             temp[ele]++;
//         }

//         for(int i=0; i<temp.length; i++){
//             if(temp[i]>0){
//                 System.out.println(i+" = "+temp[i]);
//             }
//         }
//     }
// }


// Recursive Approach

public class frequency{
    public static void main(String[] args){
        int[] arr = {2, 3, 2, 4, 5, 3, 2, 4, 1};
        freq(arr,0);
    }

    public static void freq(int[] arr, int idx){
        int max=0;

        for(int ele:arr){
            max=Math.max(max,ele);
        }

        int[] temp=new int[max+1];
        increment(arr,idx,temp);    // output -> [0,1,3,2,2,1]
        print(temp);    
    }

    public static void increment(int[] arr, int idx, int[] temp){
        int n=arr.length;
        if(n==idx) return;  // base case
        
        temp[arr[idx]]++;   // increment the value of temp[i] corresponding to arr[i]

        increment(arr,idx+1,temp);
    }

    public static void print(int[] temp){
        int n=temp.length;

        for(int i=0; i<n; i++){
            if(temp[i]>0){
                System.out.println(i+" = "+temp[i]);
            }
        }
    }
}