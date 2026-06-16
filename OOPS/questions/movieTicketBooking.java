// Create a Customer class to store customer information such as customer ID, name, and contact details.
// Create a Booking class to manage booking details, including booking ID, customer information, and the quantity of items/services booked.
// Implement validation to prevent invalid bookings (such as zero or negative quantities). 
// Generate a report that identifies customers whose booking quantity exceeds a specified limit (for example, more than 5 units).

import java.util.Scanner;
class Customer {

    String custId;
    String name;
    String contactNo;

    Customer(String custId, String name, String contactNo) {
        this.custId = custId;
        this.name = name;
        this.contactNo = contactNo;
    }

}

class Booking extends Customer {

    private String bookId;
    private int ticketBooked;

    Booking(String custId, String name, String contactNo, String bookId, int ticketBooked) {
        super(custId, name, contactNo);
        this.bookId = bookId;
        this.ticketBooked = ticketBooked;
    }

    void reportDisplay() {
        System.out.println("Customer ID = " + this.custId);
        System.out.println("Customer name = " + this.name);
        System.out.println("Customer contact number = " + this.contactNo);
        System.out.println("Ticket Booking Id = " + this.bookId);
        System.out.println("Tickets Booked = " + this.ticketBooked);
    }

    boolean tickedFault(int ticketBooked) {
        
            if (ticketBooked <= 0) {
                return false;
            
        }
        return true;
    }

}

public class movieTicketBooking {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total entries: ");
        int n=ip.nextInt();
        ip.nextLine();

        String[] custId = new String[n];
        String[] name = new String[n];
        String[] contactNo = new String[n];
        String[] bookId = new String[n];
        int[] ticketBooked = new int[n];

        System.out.println("Enter Customer & Booking Details: ");

        for(int i=0; i<n; i++){
            System.out.println("Enter customer Id: ");
            custId[i] = ip.nextLine();

            System.out.println("Enter customer name: ");
            name[i] = ip.nextLine();

            System.out.println("Enter customer contact number: ");
            contactNo[i] = ip.nextLine();

            System.out.println("Enter Booking Id: ");
            bookId[i] = ip.nextLine();

            System.out.println("Enter tickets to be booked: ");
            ticketBooked[i] = ip.nextInt();
            ip.nextLine();
        }

        Booking[] booking = new Booking[n];

        for(int i=0; i<n; i++){
            booking[i] = new Booking(custId[i],name[i],contactNo[i],bookId[i],ticketBooked[i]);
            if(booking[i].tickedFault(ticketBooked[i])){
                if(ticketBooked[i]>5){
                    booking[i].reportDisplay();
                    System.out.println("Booking exceeds limit of 5 tickets!");
                    System.out.println();
                }else{
                    booking[i].reportDisplay();
                    System.out.println();
                }
            }else{
                System.out.println("Invalid Ticket Booking Try again!");
            }
        }
    }
}
