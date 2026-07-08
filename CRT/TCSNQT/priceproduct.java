// A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).
// Example 1:
// Input :
// 5244 -> Value of N
// Output :
// 160 -> Price 

public class priceproduct {

    public static int product(int n){
        int prod=1;

        while(n!=0){
            int rem=n%10;
            prod*=rem;
            n/=10;
        }
        return prod;
    }

    public static void main(String[] args){
        int n=5244;
        System.out.println(product(n));
    }    
}
