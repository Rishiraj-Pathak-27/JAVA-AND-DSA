// 541. Reverse String II

public class reverseStringII {

    public static void reverse(char[] arr, int left, int right){

        while(left<=right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static String reverseStr(String s, int k){

        int n=s.length();
        char[] arr = s.toCharArray();
        int stepPoint = 2*k;

        for(int i=0; i<n; i+=stepPoint){

            int left=i;
            int right=Math.min(i+k-1,n-1);

            reverse(arr,left,right);
        }
        return new String(arr);
    }

    public static void main(String[] args){

        String s = "abcdefg";
        int k=2;
        
        System.out.println(reverseStr(s,k));
    }
}
