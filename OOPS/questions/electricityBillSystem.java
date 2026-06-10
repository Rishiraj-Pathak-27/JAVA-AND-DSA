// Create Consumer and BillCalculator classes. Store consumer details and units consumed.
// Calculate electricity bills using slab-based pricing and generate a bill summary

import java.util.Scanner;

class Consumer {

    private String consumerId;
    private String name;
    private String address;
    private double units;

    Consumer(String consumerId, String name, String address, double units) {
        this.consumerId = consumerId;
        this.name = name;
        this.address = address;
        this.units = units;
    }

    String getConsumerId() {
        return this.consumerId;
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    double getUnits() {
        return this.units;
    }
}

class BillCalculator extends Consumer {

    public BillCalculator(String consumerId, String name, String address, double units) {
        super(consumerId, name, address, units);
    }

    double billCalculate(double units) {

        if(units<=0) return 0;
        else if (units<=100) return units*2;
        else if (units<=200) return (100 * 2) + ((units-100)*4);
        else if (units<=300) return (100*2) + (100*4) + ((units-200)*6);  
        else if (units>300) return (100*2) + (100*4) + (100*6) + ((units-300)*8);
        else return -1;
    }

    void display() {
        System.out.println("Consumer Id = " + getConsumerId());
        System.out.println("Consumer name = " + getName());
        System.out.println("Consumer address = " + getAddress());
        System.out.println("Consumer units used = " + getUnits());
    }

}

public class electricityBillSystem {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total entries = ");
        int n = ip.nextInt();
        ip.nextLine();

        BillCalculator[] bc = new BillCalculator[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Consumer Id = ");
            String consumerId = ip.nextLine();

            System.out.println("Enter Consumer Name = ");
            String name = ip.nextLine();

            System.out.println("Enter Consumer address = ");
            String address = ip.nextLine();

            System.out.println("Enter Consumer Units used = ");
            double units = ip.nextDouble();
            ip.nextLine();

            bc[i] = new BillCalculator(consumerId, name, address, units);

        }

        System.out.println("----------Electricity Bill Summary------------");
        for (int i = 0; i < n; i++) {
            bc[i].display();
            System.out.println("Total Bill = "+bc[i].billCalculate(bc[i].getUnits()));
            System.out.println();
        }

    }
}
