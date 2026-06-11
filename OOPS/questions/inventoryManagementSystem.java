// Create two classes: Product and Inventory.
// The system should maintain information about products, their stock quantities, prices, and categories.
// It should also monitor stock availability, identify out-of-stock products, and calculate the total value of the inventory.

import java.util.Scanner;

class Product {

    private String prodId;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    // setters
    Product(String prodId, String name, String category, double price, int stockQuantity) {
        this.prodId = prodId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // getters
    String getId() {
        return this.prodId;
    }

    String getName() {
        return this.name;
    }

    String getCategory() {
        return this.category;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.stockQuantity;
    }
}

class Inventory extends Product {

    Inventory(String prodId, String name, String category, double price, int stockQuantity) {
        super(prodId, name, category, price, stockQuantity);
    }

    void display() {
        System.out.println("Product Id = " + getId());
        System.out.println("Product name = " + getName());
        System.out.println("Product Category = " + getCategory());
        System.out.println("Product Price = " + getPrice());
        System.out.println("Product Stock Quantity = " + getQuantity());
    }

    // search product by category
    void prodSearch(Inventory[] inv, String searchItem) {
        boolean isFound = false;

        for (Inventory ele : inv) {
            if (ele.getCategory().equalsIgnoreCase(searchItem)) {
                ele.display();
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No Item Found of this Category");
        }
    }

}

public class inventoryManagementSystem {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total product entries: ");
        int n = ip.nextInt();
        ip.nextLine();

        Inventory[] inv = new Inventory[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product id = ");
            String prodId = ip.nextLine();

            System.out.println("Enter product name = ");
            String name = ip.nextLine();

            System.out.println("Enter product category = ");
            String category = ip.nextLine();

            System.out.println("Enter product price = ");
            double price = ip.nextDouble();
            ip.nextLine();

            System.out.println("Enter product Stock Quantity = ");
            int stockQuantity = ip.nextInt();
            ip.nextLine();

            inv[i] = new Inventory(prodId, name, category, price, stockQuantity);
        }

        // out of stock checking & // product valuation
        double totalVal = 0;
        for (Inventory ele : inv) {
            double total = 0;
            if (ele.getQuantity() == 0) {
                total += ele.getPrice() * ele.getQuantity();
                totalVal += ele.getPrice() * ele.getQuantity();
                ele.display();
                System.out.printf("The Product having Product Id = %s is out of stock\n", ele.getId());
                System.out.println("The Total Product valuation = " + total);
                System.out.println();

                // low stock functionality
                } else if(ele.getQuantity() < 10){
                    total += ele.getPrice() * ele.getQuantity();
                    totalVal += ele.getPrice() * ele.getQuantity();
                    ele.display();
                    System.out.printf("The Product having Product Id = %s has low stock\n", ele.getId());
                    System.out.println("The Total Product valuation = " + total);
                    System.out.println();

                    // normal display
            } else {
                total += ele.getPrice() * ele.getQuantity();
                totalVal += ele.getPrice() * ele.getQuantity();
                ele.display();
                System.out.println("The Total Product valuation = " + total);
                System.out.println();
            }
        }
        System.out.println("Total Value of Inventory = " + totalVal);

        System.out.println();

        System.out.println("----------Search By Category------------");

        // search by category functionality
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the category: ");
            String category = ip.nextLine();

            if (n > 0) {
                inv[i].prodSearch(inv, category);
            } else {
                System.out.println("Product of this category not found");
            }
        }
    }
}
