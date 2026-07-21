// Print Numbers in Increasing Then Decreasing Order

public class increasingDecreasing{
    public static void main(String[] args) {
        int n=5;
        print(n);
    }

    public static void print(int n){
        if(n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}