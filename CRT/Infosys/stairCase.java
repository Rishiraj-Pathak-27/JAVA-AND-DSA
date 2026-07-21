// In the Kingdom of Arithmoria, a ritual staircase has n glowing steps. The first step emits energy 1, the second 2, the third 3, and so on.
// To activate the royal beacon, the total cumulative energy of all n steps must be calculated.However, due to time constraints, the calculation must be performed in constant time.Compute the total energy emitted by the staircase.

public class stairCase {
    public static void main(String[] args){
        long n=1000000000;
        System.out.println(emits(n));
    }    

    public static long emits(long n){
        return (n*(n+1))/2;
    }
}
