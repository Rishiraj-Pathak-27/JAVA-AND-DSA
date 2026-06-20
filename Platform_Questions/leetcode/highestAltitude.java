// 1732. Find the Highest Altitude

public class highestAltitude {

    public static int highAltitude(int[] arr){
        int max=0;
        int currAlt=0;

        for(int ele:arr){
            currAlt+=ele;

            max=Math.max(max,currAlt);
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {-5,1,5,0,-7};
        System.out.println(highAltitude(arr));
    }
}
