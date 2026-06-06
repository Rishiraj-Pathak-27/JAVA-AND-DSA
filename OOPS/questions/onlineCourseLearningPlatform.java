// Create Student and Course classes. Track completed courses and generate certificates for
// students who complete at least 3 courses.
// Design two related classes to manage participant and activity information.
// Store participant details and track the activities completed by each participant.
// Implement functionality to identify participants who have completed a minimum required number of activities and generate a completion acknowledgment for them.

import java.util.Scanner;

class Student{
    private String stuId;
    private String name;
    private int age;
    private String email;


    public Student(String id, String stuName, int age, String email){
        stuId = id;
        stuName = name;
        this.age = age;
        this.email=email;
    }

    public String getId(){
        return stuId;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return email;
    }
}

class Course extends Student{

    private String courseId;
    private String courseName;
    private String instName;
    private int duration;
    private String[] coursesComp;

    Course(String stuId, String name, int age, String email, String courseId, String courseName, String instName, int duration, String[] coursesComp){
        super(stuId,name,age,email);

        this.courseId = courseId;
        this.courseName = courseName;
        this.instName = instName;
        this.duration = duration;
        this.coursesComp = coursesComp;
    }

    public String getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getInstName(){
        return instName;
    }

    public int getDuration(){
        return duration;
    }

    public String[] getCoursesComp(){
        return coursesComp;
    }

    public void display(){
        System.out.println("================ Student Details ===============");
        System.out.println("Student Id = "+getId());
        System.out.println("Student Name = "+getName());
        System.out.println("Student Age = "+getAge());
        System.out.println("Student Email = "+getEmail());
        System.out.println("================ Course Details ===============");
        System.out.println("Course Id = "+getCourseId());
        System.out.println("Course Name = "+getCourseName());
        System.out.println("Course Instructor Name = "+getInstName());
        System.out.println("Course Duration = "+getDuration());
        System.out.println("Courses Completed = "+getCoursesComp());
    }

}

public class onlineCourseLearningPlatform{
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no. of student entries: ");
        int n=ip.nextInt();
        ip.nextLine();

        Course[] c = new Course[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter student id = ");
            String stuId = ip.nextLine();
            System.out.println("Enter student name = ");
            String name = ip.nextLine();
            System.out.println("Enter student age = ");
            int age = ip.nextInt();
            System.out.println("Enter student email = ");
            String email = ip.nextLine();
            System.out.println("Enter course id = ");
            String courseId = ip.nextLine();
            System.out.println("Enter course name = ");
            String courseName = ip.nextLine();
            System.out.println("Enter course instructor name = ");
            String courseInstName = ip.nextLine();
            System.out.println("Enter course duration =  ");
            int duration = ip.nextInt();
            System.out.println("Enter total courses completed = ");
            int f = ip.nextInt();
            ip.nextLine();

            String[] coursesComp = new String[f];
            System.out.println("Enter courses = ");
            for(int j=0; j<f; j++){
                coursesComp[j] = ip.nextLine();
            }
        }
    }
}