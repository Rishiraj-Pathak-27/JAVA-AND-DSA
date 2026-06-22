public class reverseStringII {

    public static void reverse(char[] arr, int left, int right) {
        while (left <= right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static String reverseStr(String s, int k) {

        int reversePoint = 2*k;
        char[] arr = s.toCharArray();
        int n=s.length();
        for(int i=0; i<n; i+=reversePoint){

            int left = i;
            int right = Math.min(i+k-1,n-1);

            reverse(arr,left,right);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "acbdefghijk";
        int k = 4;
        System.out.println(reverseStr(str,k));
    }
}
