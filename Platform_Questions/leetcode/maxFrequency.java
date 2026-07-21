// 3005. Count Elements With Maximum Frequency

public class maxFrequency {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(freq(arr));
    }    

    public static int freq(int[] arr){
        int max=0;

        for(int ele:arr){
            max=Math.max(max,ele);
        }

        int[] temp = new int[max+1];

        helperOne(arr,0,temp);
        return helperTwo(temp);
    }

    public static void helperOne(int[] arr, int idx, int[] temp){
        int n=arr.length;
        if(n==idx) return;

        temp[arr[idx]]++;

        helperOne(arr,idx+1,temp);
    }

    public static int helperTwo(int[] temp){
        int n=temp.length;
        int max=0,sum=0;

        for(int ele:temp){
            max=Math.max(max,ele);
        }

        for(int ele:temp){
            if(ele==max){
                sum+=ele;
            }
        }
        return sum;
    }
}
