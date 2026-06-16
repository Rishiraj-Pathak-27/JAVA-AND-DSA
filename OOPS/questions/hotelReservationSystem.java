// Design Guest and Reservation classes. 
// Store guest details, room type, and bill amount. 
// Find the guest with the highest bill and display a detailed reservation summary

import java.util.Scanner;
class Guest {

    String guestId;
    String name;
    String phno;
    int age;
    String location;

    Guest(String guestId, String name, String phno, int age, String location) {
        this.guestId = guestId;
        this.name = name;
        this.phno = phno;
        this.age = age;
        this.location = location;
    }
}

class Reservation extends Guest {

    String room_type;
    int bill_amt;
    String pay_mode;

    Reservation(String guestId, String name, String phno, int age, String location, String room_type, int bill_amt, String pay_mode) {
        super(guestId, name, phno, age, location);
        this.room_type = room_type;
        this.bill_amt = bill_amt;
        this.pay_mode = pay_mode;
    }

    void display() {
        System.out.println("Guest Id = " + this.guestId);
        System.out.println("Guest Name = " + this.name);
        System.out.println("Guest Phone Number = " + this.phno);
        System.out.println("Guest age = " + this.age);
        System.out.println("Guest Location = " + this.location);
        System.out.println("Guest Room type = " + this.room_type);
        System.out.println("Room Bill amount = " + this.bill_amt);
        System.out.println("Payment mode = " + this.pay_mode);
    }
}

public class hotelReservationSystem {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter guest entries: ");
        int n = ip.nextInt();
        ip.nextLine();

        String[] guestId = new String[n];
        String[] name = new String[n];
        String[] phno = new String[n];
        int[] age = new int[n];
        String[] location = new String[n];
        String[] room_type = new String[n];
        int[] bill_amt = new int[n];
        String[] pay_mode = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Enter Guest Id = ");
            guestId[i] = ip.nextLine();

            System.out.println("Enter Guest name = ");
            name[i] = ip.nextLine();

            System.out.println("Enter Guest Phone Number = ");
            phno[i] = ip.nextLine();

            System.out.println("Enter Guest age = ");
            age[i] = ip.nextInt();
            ip.nextLine();

            System.out.println("Enter Guest location = ");
            location[i] = ip.nextLine();

            System.out.println("Enter Guest Room Type = ");
            room_type[i] = ip.nextLine();

            System.out.println("Enter Room price = ");
            bill_amt[i] = ip.nextInt();
            ip.nextLine();

            System.out.println("Enter Pay Mode = ");
            pay_mode[i] = ip.nextLine();
        }
        Reservation[] rev = new Reservation[n];
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < n; i++) {
            rev[i] = new Reservation(guestId[i], name[i], phno[i], age[i], location[i], room_type[i], bill_amt[i], pay_mode[i]);
            if (bill_amt[i] > max) {
                max = bill_amt[i];
                maxIdx = i;
            }
        }

        System.out.println("Hotel Reservation Summary !!!");
        if (maxIdx != -1) {
            rev[maxIdx].display();
        } else {
           System.out.println("No Reservations Available!");
        }
    }
}
