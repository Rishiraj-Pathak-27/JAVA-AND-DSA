package questions;
public class globalVariables {
    static int c=10;
    public static void main(String[] args){ 
        change();
    }

    public static void change(){
        c=20;
        System.out.println(c);
    }
}
