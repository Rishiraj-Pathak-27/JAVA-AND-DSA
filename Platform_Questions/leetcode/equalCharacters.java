// 1941. Check if All Characters Have Equal Number of Occurrences

public class equalCharacters{
    public static void main(String[] args) {
        String s = "abacbc";
        equalOccurrances(s);
    }

    public static void freq(char[] arr, int idx, int[] temp){
        int n=arr.length;

        if(n==idx) return;

        temp[arr[idx]]++;

        freq(arr,idx+1,temp);
    }

    public static void print(int[] temp, int idx){
        int n=temp.length;
        if(n==idx) return;

        if(temp[idx]>0){
            
        }

        print(temp,idx+1);
    }

    public static void equalOccurrances(String s){
        int n=s.length();
        char[] arr = s.toCharArray();

        int max=0;

        for(int ele:arr){
            max=Math.max(ele,max);
        }

        int[] temp = new int[max+1];

        freq(arr,0,temp);
        print(temp,0);
    }
}