public class earliestFinishTimeForLandWaterII{
    public static void main(String[] args) {
        int[] landStartTime = {2,8};
        int[] landDuration = {4,1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};

        System.out.println(earliestTime(landStartTime,landDuration,waterStartTime,waterDuration));

    }

    public static int earliestTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration){
        int ans = Integer.MAX_VALUE;

        // for land --> water
        int landFirst = Integer.MAX_VALUE;

        for(int i=0; i<landStartTime.length; i++){
            landFirst = Math.min(landFirst,landStartTime[i]+landDuration[i]);
        }

        for(int j=0; j<waterStartTime.length; j++){
            int waterFirst = Math.max(landFirst,waterStartTime[j])+waterDuration[j];
            ans = Math.min(ans,waterFirst); 
        }

        // for water --> land
        int waterSecond = Integer.MAX_VALUE;

        for(int i=0; i<waterStartTime.length; i++){
            waterSecond = Math.min(waterSecond,waterStartTime[i]+waterDuration[i]);
        }

        for(int j=0; j<landStartTime.length; j++){
            int landSecond = Math.max(waterSecond,landStartTime[j])+landDuration[j];
            ans = Math.min(landSecond,ans);
        }
        return ans;
    }
}