// 1941. Check if All Characters Have Equal Number of Occurrences

public class equalCharacters{
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(equalOccurrances(s));
    }

    public static void freq(char[] arr, int idx, int[] temp){
        int n=arr.length;

        if(n==idx) return;

        temp[arr[idx]]++;

        freq(arr,idx+1,temp);
    }

    public static boolean checkEqual(int[] temp, int idx, int target){
        int n=temp.length;
        if(n==idx) return true;

        if(temp[idx]>0 && temp[idx] != target){
            return false;
        }

        return checkEqual(temp,idx+1,target);
    }

    public static boolean equalOccurrances(String s){
        char[] arr = s.toCharArray();

        int max=0;

        for(int ele:arr){
            max=Math.max(ele,max);
        }

        int[] temp = new int[max+1];

        freq(arr,0,temp);
        
        int target = temp[arr[0]];
        return checkEqual(temp,0,target);
    }
}