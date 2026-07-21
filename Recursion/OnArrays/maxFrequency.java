// You are given an array nums consisting of positive integers.

// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

// The frequency of an element is the number of occurrences of that element in the array.

// Approach -> 1) Find out freq of all elements from arr

public class maxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 3, 4, 5, 6};
        System.out.println(freq(arr));
    }

    public static int freq(int[] arr) {
        int max = 0;
        for (int ele : arr) {
            max = Math.max(max, ele);
        }

        int[] temp = new int[max + 1];

        helperOne(arr, 0, temp);
        return helperTwo(temp);
    }

    public static void helperOne(int[] arr, int idx, int[] temp) {
        int n = arr.length;

        if (n == idx)
            return;

        temp[arr[idx]]++;

        helperOne(arr, idx + 1, temp);
    }

    public static int helperTwo(int[] temp) {
        int max = 0;
        int sum = 0;
        for (int ele : temp) {
            max = Math.max(max, ele);   // [ 0,2,2,2,2,1,1 ]
        }

        for (int ele : temp) {
            if (ele == max) {   // max found at idx=(1,2,3,4)
                sum += ele;     // so 2+2+2+2=8
            }

        }
        return sum;
    }
}
