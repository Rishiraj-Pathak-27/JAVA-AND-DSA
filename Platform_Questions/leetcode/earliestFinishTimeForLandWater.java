// 3633. Earliest Finish Time for Land and Water Rides I


public class earliestFinishTimeForLandWater{
    public static void main(String[] args) {
        int[] landStartTime = {2,8};
        int[] landDuration = {4,1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};

        System.out.println(earlistTime(landStartTime, landDuration, waterStartTime, waterDuration));
    }

    public static int earlistTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration){
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<landStartTime.length; i++){
            for(int j=0; j<waterStartTime.length; j++){
                int landFinish = landStartTime[i]+landDuration[i];
                int finishOne = Math.max(landFinish,waterStartTime[j]+waterDuration[j]);

                int waterFinish = waterStartTime[j]+waterDuration[j];
                int finishTwo = Math.max(waterFinish,landStartTime[i]+landDuration[i]);

                ans = Math.min(finishOne,ans);
                ans = Math.min(finishTwo,ans);
               
            }
        }
        return ans;
    }
}