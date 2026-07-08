import java.util.*;
public class XYZMaxSum {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter total elements: ");
        int n=ip.nextInt();

        System.out.println("Enter x,y,z: ");
        int x=ip.nextInt();
        int y=ip.nextInt();
        int z=ip.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter values for arr a: ");
        for(int i=0; i<n; i++){
            a[i] = ip.nextInt();
        }

        System.out.println("Enter values for arr b: ");
        for(int j=0; j<n; j++){
            b[j] = ip.nextInt();
        }

        int sum=0;
        int mod = 1000000007;
        for(int i=0; i<n; i++){
            
            //step 1
            int op1 = sum - b[i];

            //step 2
            int op2 = Integer.MIN_VALUE;
            if(x>0 && y>0){
                op2 = sum+(a[i]*(x-1)*(y-1)*z) % mod;
            }

            // step 3
            int op3 = Integer.MIN_VALUE;
            if(y>0 && z>0){
                op3 = sum+(a[i]*x*(y-1)*(z-1)) % mod;
            }

            // return max sum from all 3 operations
            if(op1>=op2 && op1>=op3){
                
                sum=op1%mod;

            }else if(op2>=op1 && op2>=op3){

                x--;
                y--;
                sum = op2%mod;

            }else{
                y--;
                z--;
                sum = op3%mod;
            }
        }
        System.out.println(sum);
    }
}
