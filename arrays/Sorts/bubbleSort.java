// The bubble sort is a technique used to sort an array in either ascending or descending order
// It check the each element with its corresponding elements

// Approach 1 (Worst Case)
// In this we are actually performing pass by pass operations
 
/* import java.util.Arrays;

public class bubbleSort{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }   
    public static void bubbleSortFunction(int[] arr){
        int n=arr.length;
        print(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i);
            } 
        }
        print(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i);
            } 
        }
        print(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i);
            } 
        }
        print(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i);
            } 
        }
        print(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i);
            } 
        }
        print(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i);
            } 
        }
        print(arr);
    }

    public static void main(String[] args){
        int[] arr = {5,2,9,3,4,3,1};
        bubbleSortFunction(arr);
    }
} */

///////////////////////////////////////////////////////////

// Approach 2 (Average Case)
// In this we are apply a nested loops
// Here, TC = O(n^2) & SC = O(1)

/* public class bubbleSort{
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void bubbleSortFunction(int[] arr){
        int n=arr.length;

        print(arr);
        for(int i=0; i < n-1; i++){         // n-1 passes
            for(int j=0; j < n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
    }

    public static void main(String[] args){
        int[] arr = {5,2,9,3,4,3,1};
        bubbleSortFunction(arr);
    }
} */

////////////////////////////////////////////////////////////////

// Approach 3 (Optimised Approach)
// Here we are checking that the array is swapping elements or not, if not we are assuming that array is sorted else we will continue.
// Here, TC = O(n^2) & SC = O(1), but with less no. of operations

public class bubbleSort{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+", ");
        }
        System.out.println();
    }

    public static void bubbleSortFunction(int[] arr){
        int n=arr.length;
        
        print(arr);
        
        for(int i=0; i<n-1; i++){
            int swaps =0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }

        // OR using boolean but it takes more space than integer

        // boolean isSorted = true;

        // for(int i=0; i<n-1; i++){

        //     for(int k=0; k<n-1; k++){
        //         if(arr[k]>arr[k+1]){
        //             isSorted = false;
        //             break;
        //         }
        //     }
        //     if(isSorted) break;
        // }

        print(arr);
    }

    public static void main(String[] args){
        int[] arr = {5,2,-9,3,2,4,-10,0};
        bubbleSortFunction(arr);
    }
}
