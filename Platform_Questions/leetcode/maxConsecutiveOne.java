public class maxConsecutiveOne {

    public static int maxOne(int[] arr){
        int n=arr.length;
        int max=0;

        for(int i=0; i<n; i++){
            int count=0;
            if(arr[i]==1){
                while(i<n && arr[i]==1){
                    count++;
                    i++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxOne(arr));
    }
}
