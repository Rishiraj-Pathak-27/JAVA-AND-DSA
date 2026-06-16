// Create an Employee class with employee ID, name, and attendance percentage. Develop an
// AttendanceManager class that identifies employees below 75% attendance and generates
// attendance reports.

import java.util.Scanner;

class Employee {

    String empId;
    String name;
    int attendance;

    void display() {
        System.out.println("Employee id = " + empId);
        System.out.println("Employee name = " + name);
        System.out.println("Employee attendance = " + attendance);
    }
}

class AttendanceManager {

    boolean attendanceTracker(int attendance) {

        if (attendance < 0) {
            return false;
        }
        if (attendance < 75) {
            return false;
        } 
        return true;
    }
}

public class employeeAttendanceTracker {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no. of entries: ");
        int n = ip.nextInt();
        ip.nextLine();

        String[] empId = new String[n];
        String[] name = new String[n];
        int[] attendance = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter emp id for emp %d = ", i);
            empId[i] = ip.nextLine();

            System.out.printf("Enter emp name %d = ", i);
            name[i] = ip.nextLine();

            System.out.printf("Enter attendence for emp %d = ", i);
            attendance[i] = ip.nextInt();
            ip.nextLine();
        }

        Employee e = new Employee();
        AttendanceManager am = new AttendanceManager();

        System.out.println();
        System.out.println("Employee details: ");

        int total = 0;
        for (int i = 0; i < n; i++) {
            e.empId = empId[i];
            e.name = name[i];
            e.attendance = attendance[i];
            if (!am.attendanceTracker(e.attendance)) {
                e.display();
                System.out.println("Eligible = " + false);
                System.out.println();
                total++;
            } else {
                e.display();
                System.out.println("Eligible = " + true);
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Total Employee who are not eligible (below 75% attendance)");
        for (int i = 0; i < n; i++) {
            if (attendance[i] < 75) {
                System.out.printf("%s = %d\n", name[i], attendance[i]);
            }
        }
        System.out.println("Total ineligible employees = " + total);
        System.out.println();
    }
}
