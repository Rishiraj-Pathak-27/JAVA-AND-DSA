// 2091. Removing Minimum and Maximum From Array

// You are given a 0-indexed array of distinct integers nums.
// There is an element in nums that has the lowest value and an element that has the highest value. We call them the minimum and maximum respectively. Your goal is to remove both these elements from the array.
// A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array.
// Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.

public class removeMinMaxFromZero {
    public static void main(String[] args){
        int[] arr = {2,10,7,5,4,1,8,6};
        System.out.println(removeMinMax(arr));
    }

    public static int removeMinMax(int[] arr){
        int n=arr.length;
        int minIdx=0, maxIdx=0;

        for(int i=0; i<n; i++){
            if(arr[i] > arr[maxIdx]) maxIdx=i; // maxIdx=1
            if(arr[i] < arr[minIdx]) minIdx=i; // minidx=5
        }

        int left=Math.min(maxIdx,minIdx);   // left=1
        int right=Math.max(maxIdx,minIdx);  // right=5

        int fr = right+1; // 6
        int bck = n-left; // 7

        int frBck = (left+1) + (n-right); // 2+3 = 5
        
        return Math.min(fr,Math.min(bck,frBck)); // (6,5) = 5 <- "ans"
    }
}
