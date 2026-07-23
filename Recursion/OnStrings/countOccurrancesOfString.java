// Count occurrences of a character.

// Using temp[] frequency array and recursive calls

public class countOccurrancesOfString {
    public static void main(String[] args){
        String s = "racecar";
        char[] arr = s.toCharArray();
        int max=0;

        for(char ele:arr){
            if(ele>max){
                max=ele;
            }
        }

        int[] temp=new int[max+1];

        freq(arr,0,temp);
        print(temp,0);
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
            System.out.println((char)idx+" = "+temp[idx]);
        }

        print(temp,idx+1);
    }
}
