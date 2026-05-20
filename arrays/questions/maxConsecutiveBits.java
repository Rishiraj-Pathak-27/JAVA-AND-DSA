public class maxConsecutiveBits{

    public static int maxConsecutive(int[] arr){
        int n=arr.length;
        int maxZero=0;
        int maxOne=0;
        int countZero=0;
        int countOne=0;

        for(int ele:arr){
            if(ele==1){
                countOne++;
                maxOne=Math.max(maxOne,countOne);
            }else{
                countOne=0;
            }

            if(ele==0){
                countZero++;
                maxZero=Math.max(maxZero,countZero);
            }else{
                countZero=0;
            }
        }
        return Math.max(maxOne,maxZero);
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,1,1,1,1};
        System.out.println(maxConsecutive(arr));
    }
}