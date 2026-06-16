// Develop a Bus Reservation Application that allows passengers to book seats on a bus.
// Create two classes: Passenger and Bus.

// The system should store passenger information, manage seat bookings, validate seat availability, prevent duplicate seat allocations, and generate a reservation summary.
// A passenger can book only an available seat.
// If a seat has already been allotted to another passenger, the system should reject the booking and display an appropriate message.
import java.util.Scanner;

class Passenger {

    private int passengerId;
    private String name;
    private int age;
    private String gender;
    private int seatNo;

    // setters
    Passenger(int passengerId, String name, int age, String gender, int seatNo) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.seatNo = seatNo;
    }

    // getters
    int getId() {
        return this.passengerId;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getGender() {
        return this.gender;
    }

    int getSeatNo() {
        return this.seatNo;
    }

    void passengerSummary() {
        System.out.println("Passenger Id = " + getId());
        System.out.println("Passenger Name = " + getName());
        System.out.println("Passenger Age = " + getAge());
        System.out.println("Passenger Gender = " + getGender());
        System.out.println("Passenger Requested Seat No = " + getSeatNo());
    }
}

class Bus {

    private int busNo;
    private String route;
    private int totalSeats;
    Passenger[] passenger;
    private int count;

    Bus(int busNo, String route, int totalSeats, Passenger[] passenger) {
        this.busNo = busNo;
        this.route = route;
        this.totalSeats = totalSeats;

        passenger = new Passenger[totalSeats];   
        count=0;
    }

    int getBusNo() {
        return this.busNo;
    }

    String getRoute() {
        return this.route;
    }

    int getTotalSeats() {
        return this.totalSeats;
    }

    Passenger[] getPassenger() {
        return this.passenger;
    }

    void busSummary() {
        System.out.println("Bus Number = " + getBusNo());
        System.out.println("Bus Route = " + getRoute());
        System.out.println("Bus Total Seats = " + getTotalSeats());
    }

    boolean isSeatBooked(int seatNo) {
        for (int i = 0; i < count; i++) {
            if (passenger[i] != null || passenger[i].getSeatNo() == seatNo) {
                return true;
            }
        }
        return false;
    }



if(bus.isSeatBooked(seatNo)){
        System.out.println("Seat already occupied");
    }else{
        System.out.println(passenger[count++]);
    }



}

public class busReservationApplication {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no. of entries of passenger: ");
        int n = ip.nextInt();
    }
}
