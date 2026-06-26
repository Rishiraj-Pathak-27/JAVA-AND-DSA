// WAP to find the sum of natural numbers

public class sumOfNaturalNums { 
    public static void main(String[] args){
        int n=5;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);      // n*(n+1)/2

        // ((((5+4)+3)+2)+1)  recursive implementation
    }
}
