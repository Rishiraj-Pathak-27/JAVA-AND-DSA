// Develop a College Result Processing System to manage and analyze student academic performance.
// Create two classes: Student and ResultProcessor.
// The system should store student details and marks obtained in various subjects, calculate total marks, percentage, and grades, identify the topper(s), display failed students, and generate a detailed result report.

import java.util.Scanner;

class Student {

    private String stuId;
    private String name;
    private int rollno;
    private double[] marks;

    Student(String stuId, String name, int rollno, double[] marks) {
        this.stuId = stuId;
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    String getId() {
        return this.stuId;
    }

    String getName() {
        return this.name;
    }

    int getRollno() {
        return this.rollno;
    }

    double[] getMarks() {
        return this.marks;
    }

    void display() {
        System.out.println("Student ID = " + getId());
        System.out.println("Student Name = " + getName());
        System.out.println("Student Rollno = " + getRollno());
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Student Marks %d = %.2f\n", i, marks[i]);
        }
        System.out.println();
    }

    int calculateTotal() {
        int total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculatePercentage() {

        double percentage = ((calculateTotal() / 500.0) * 100);
        return percentage;
    }

    String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 70 && percentage < 90) {
            return "B";
        } else if (percentage >= 50 && percentage < 70) {
            return "C";
        } else if (percentage >= 35 && percentage < 50) {
            return "D";
        } else {
            return "F";
        }
    }

    boolean isFailed() {
        if (calculatePercentage() <= 35 && calculateGrade().equals("F") && calculateTotal() <= 125) {
            return true;
        }
        return false;
    }
}

class Result {

    private Student[] students;

    Result(Student[] students) {
        this.students = students;
    }

    // find topper function
    void getTopper() {
        Student topper = students[0];

        for (Student stu : students) {
            if (stu.calculateTotal() > topper.calculateTotal()) {
                topper = stu;
            }
        }
        System.out.println("Topper Details: ");
        topper.display();
    }

    // failed students list 
    String failedStudents() {
        for (Student stu : students) {
            if (stu.isFailed()) {
                return stu.getName();
            }
        }
        return "No students failed";
    }

    // passed students list
    String passedStudents() {
        for (Student stu : students) {
            if (!(stu.isFailed())) {
                return stu.getName();
            }
        }
        return "No Students Passed";
    }

}

public class collegeResultProcessingSystem {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the total number of students: ");
        int n = ip.nextInt();
        ip.nextLine();

        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Id = ");
            String id = ip.nextLine();

            System.out.println("Enter Student Name = ");
            String stuName = ip.nextLine();

            System.out.println("Enter Student rollno = ");
            int stuRollno = ip.nextInt();
            ip.nextLine();

            double[] marks = new double[5];
            System.out.println("Enter Student Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("Student Marks for Subject = %d\n", (j + 1));
                marks[j] = ip.nextDouble();
            }
            ip.nextLine();

            student[i] = new Student(id, stuName, stuRollno, marks);
        }

        // report summary of each student
        System.out.println("--------Student Result Report Card---------");
        for (int i = 0; i < n; i++) {
            student[i].display();
            // total marks
            System.out.println("Total Marks = " + student[i].calculateTotal());
            // percentage
            System.out.println("Percentage Secured = " + student[i].calculatePercentage());
            // grade
            System.out.println("Grade Secured = " + student[i].calculateGrade());
            System.out.println();
        }

        Result res = new Result(student);

        System.out.println("----Topper Student----");
        res.getTopper();

        System.out.println("----Passed Students----");
        System.out.println(res.passedStudents());

        System.out.println("----Failed Students----");
        System.out.println(res.failedStudents());

    }
}
