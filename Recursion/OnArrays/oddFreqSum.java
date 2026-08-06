// Write a function which returns the sum of elements whose frequency in the array is odd. Means find sum of elements whose Number of occurrences is odd  

public class oddFreqSum{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,4,5,5,5,5,6,7,7};
        System.out.println(oddFreq(arr));
    }

    public static void helper(int[] arr, int[] temp, int idx){
        int n=arr.length;

        if(idx==n) return;

        temp[arr[idx]]++;

        helper(arr,temp,idx+1);
    }


    public static int sum(int[] temp, int idx){
        int n=temp.length;

        if(idx==n) return 0;

        int s = (temp[idx] % 2 == 1) ? idx : 0;
        return s + sum(temp, idx+1);
    }

    public static int oddFreq(int[] arr){
        int n=arr.length;
        int max=0;

        for(int ele:arr){
            max=Math.max(max,ele);
        }

        int[] temp = new int[max+1];

        helper(arr,temp,0);
        return sum(temp,0);

    }
}