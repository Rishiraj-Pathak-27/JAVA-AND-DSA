// 372. Super Pow

import java.util.Arrays;

public class superPow{

    static int mod=1337;

    public static int power(int a, int b){
        a%=mod;
        long ans;
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) ans = (1L*call*call)%mod;
        else ans = (1L*a*call*call)%mod;
        return (int)ans;
    }

    public static int superPower(int a, int[] b){
        int total = 1;
        for(int i=0; i<b.length; i++){
            total  = power(total,10);
            total = (total*power(a,b[i]))%mod;
        }

        return total;
    }

    public static void main(String[] args){
        int a = 2;
        int[] b = {1,0};

        int res = superPower(a,b);
        System.out.println(res);
    }
}