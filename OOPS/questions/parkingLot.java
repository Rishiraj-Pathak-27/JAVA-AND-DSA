
import java.util.Scanner;

class Main {

    public static boolean invalidCase(String[] veh, int[] hrs) {

        for (int i = 0; i < veh.length; i++) {
            if (veh[i].contains(" ") || hrs[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static int helper(int[] hrs) {
        int count = 0;

        for (int i = 0; i < hrs.length; i++) {
            if (hrs[i] >= 5) {
                count++;
            }
        }
        return count;
    }

}

abstract class Revenue {

    abstract int revenueCal(int[] hrs);

}

class BikeRevenue extends Revenue {

    @Override
    public int revenueCal(int[] hrs) {
        int total = 0;
        for (int i = 0; i < hrs.length; i++) {
            total += hrs[i] * 20;
        }
        return total;
    }
}

class CarRevenue extends Revenue {

    @Override
    public int revenueCal(int[] hrs) {
        int total = 0;
        for (int i = 0; i < hrs.length; i++) {
            total += hrs[i] * 100;
        }
        return total;
    }
}

class AutoRevenue extends Revenue {

    @Override
    public int revenueCal(int[] hrs) {
        int total = 0;

        for (int i = 0; i < hrs.length; i++) {
            total += hrs[i] * 30;
        }
        return total;
    }
}

public class parkingLot {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total cars: ");
        int n = ip.nextInt();
        ip.nextLine();
        String[] veh = new String[n];
        int[] hrs = new int[n];
        String[] name = new String[n];
        int total=0;

        for (int i = 0; i < n; i++) {
            System.out.printf("[%d]Enter Vehicle number: ", i);
            veh[i] = ip.nextLine();

            System.out.printf("[%d]Enter Vehicle Owner name: ", i);
            name[i] = ip.nextLine();

            System.out.printf("[%d]Enter hrs: ", i);
            hrs[i] = ip.nextInt();
            ip.nextLine();
        }

        Main m = new Main();

        if (m.invalidCase(veh, hrs)) {
            System.out.println("Invalid Input");
            return;
        } else {
            for (int i = 0; i < hrs.length; i++) {
                if (veh[i].contains("A")) {
                    AutoRevenue a = new AutoRevenue();
                    System.out.printf("%s %s %d\n", veh[i], name[i], hrs[i]);
                    System.out.println("Revenue From Auto = "+(hrs[i]*30));
                    total+=hrs[i]*30;
                }else if(veh[i].contains("C")){
                    CarRevenue c = new CarRevenue();
                    System.out.printf("%s %s %d\n", veh[i], name[i], hrs[i]);
                    System.out.println("Revenue From Car = "+(hrs[i]*100));
                    total+=hrs[i]*100;
                }else{
                    BikeRevenue b = new BikeRevenue();
                    System.out.printf("%s %s %d\n", veh[i], name[i], hrs[i]);
                    System.out.println("Revenue From Bike = "+(hrs[i]*20));
                    total+=hrs[i]*20;
                }
            }
        }
        System.out.println("Total Revenue Generated = "+total);
        System.out.println("Bailed = "+m.helper(hrs));
    }
}
