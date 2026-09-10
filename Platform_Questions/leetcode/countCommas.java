// 3870. Count Commas in Range

public class countCommas {
    public static void main(String[] args){
        int n=1002;

        System.out.println(count(n));
    }

    public static int count(int n){
        int count=0;

        for(int i=1; i<=n; i++){
            if(i>=1000){
                count++;
            }
        }
        return count;
    }
}
