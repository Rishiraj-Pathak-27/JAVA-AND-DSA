public class partitioningPalindrome{
    public static void main(String[] args) {
        String s = "abaaccabb";
        System.out.println(partitioning(s,0));
    }

    public static int partitioning(String s, int left){
        int n=s.length();
        if(n==left) return 0;
        int min=Integer.MAX_VALUE;

        for(int right=left; right<n; right++){
            if(isPalindrome(s,left,right)){
                int minPartition = 1+partitioning(s,right+1);
                min=Math.min(min,minPartition);
            }
        }
        return min;
    }

    public static boolean isPalindrome(String s, int left, int right){
            while(left<right){
                if(s.charAt(left) == s.charAt(right)){
                    right--;
                    left++;
                }else{
                    return false;
                }
            }
        return true;
    }
}