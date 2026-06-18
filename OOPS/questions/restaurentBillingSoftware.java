
// Create three classes:
// 1. MenuItem
// Stores details of food items available in the restaurant menu.
// 2. Order
// Stores customer order details, including table number and the food items ordered.
// 3. Billing
// Calculates table-wise bills, displays order summaries, and generates the restaurant's total daily revenue report.
import java.util.Scanner;

class MenuItem {

    private String menuId;
    private String name;
    private String category;
    private double unitPrice;

    MenuItem(String menuId, String name, String category, double unitPrice) {
        this.menuId = menuId;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
    }

    String getId() {
        return this.menuId;
    }

    String getName() {
        return this.name;
    }

    String getCategory() {
        return this.category;
    }

    double getPrice() {
        return this.unitPrice;
    }

    void display() {
        System.out.println("Menu Item ID = " + getId());
        System.out.println("Menu Item name = " + getName());
        System.out.println("Menu Item Category = " + getCategory());
        System.out.println("Menu Unit Price = " + getPrice());
    }
}

class OrderItem {

    private String orderId;
    private int tableNumber;
    private int choice;
    private int quantity;

    OrderItem(String orderId, int tableNumber, int choice, int quantity) {
        this.orderId = orderId;
        this.tableNumber = tableNumber;
        this.choice = choice;
        this.quantity = quantity;
    }

    String getOrderId() {
        return this.orderId;
    }

    int getTableNumber() {
        return this.tableNumber;
    }

    int getChoice() {
        return this.choice;
    }

    int getQuantity() {
        return this.quantity;
    }
}

public class restaurentBillingSoftware {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total menu Items:");
        int n = ip.nextInt();
        ip.nextLine();

        MenuItem[] mi = new MenuItem[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Menu ID:");
            String menuId = ip.nextLine();

            System.out.println("Enter Item Name:");
            String name = ip.nextLine();

            System.out.println("Enter Category:");
            String category = ip.nextLine();

            System.out.println("Enter Unit Price:");
            double price = ip.nextDouble();
            ip.nextLine();

            mi[i] = new MenuItem(menuId, name, category, price);
        }

        System.out.println("--------Menu Item Details---------");
        for (int i = 0; i < n; i++) {
            mi[i].display();
            System.out.println();
        }

        System.out.println("Enter the order details: ");
        int m = ip.nextInt();
        ip.nextLine();

        OrderItem[] oi = new OrderItem[m];

        for (int i = 0; i < m; i++) {

            System.out.println("Enter the order Id: ");
            String orderId = ip.nextLine();

            System.out.println("Enter the table number: ");
            int tableNumber = ip.nextInt();
            ip.nextLine();

            System.out.println("Enter menu Item Number (1-" + n + "):");
            int choice = ip.nextInt();
            ip.nextLine();

            System.out.println("Enter Quantity: ");
            int quantity = ip.nextInt();
            ip.nextLine();

            MenuItem selectedItem = mi[choice - 1];

            oi[i] = new OrderItem(orderId, tableNumber, choice, quantity);
        }

        double totalRevenue = 0;
        System.out.println("-------Order Details-------");
        for (int i = 0; i < m; i++) {
            int menuIdx = oi[i].getChoice() - 1;

            double bill = mi[menuIdx].getPrice() * oi[i].getQuantity();
            totalRevenue += bill;

            System.out.println("Order Id = " + oi[i].getOrderId());
            System.out.println("Order Table Number = " + oi[i].getTableNumber());
            System.out.println("Item Name = "+mi[menuIdx].getName());
            System.out.println("Order Quantity = " + oi[i].getQuantity());
            System.out.println("Bill Amount = "+bill);
            System.out.println();

        }
        System.out.println();
        System.out.println("Total Revenue = " + totalRevenue);

        
    }
}
