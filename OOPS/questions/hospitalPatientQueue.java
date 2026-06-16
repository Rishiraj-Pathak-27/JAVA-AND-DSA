
// Create two classes: Patient and QueueManager.
// The system should store patient information, track their waiting times, maintain the queue order, identify the patient who has been waiting the longest, and generate useful queue statistics for hospital administration.

import java.util.Scanner;
class Patient{
    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String disease;
    private int waitingTime;

    // setters

    Patient(int patientId, String name, int age, String gender, String disease, int waitingTime){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        this.waitingTime = waitingTime;
    }

    int getId(){
        return this.patientId;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    String getGender(){
        return this.gender;
    }

    String getDisease(){
        return this.disease;
    }

    int getWaitingTime(){
        return this.waitingTime;
    }
}

class QueueManager extends Patient{

    public QueueManager(int patientId, String name, int age, String gender, String disease, int waitingTime) {
        super(patientId, name, age, gender, disease, waitingTime);
    }

    void display(){
        System.out.println("Patient Id = "+getId());
        System.out.println("Patient Name = "+getName());
        System.out.println("Patient Age = "+getAge());
        System.out.println("Patient Gender = "+getGender());
        System.out.println("Patient Disease = "+getDisease());
        System.out.println("Patient Waiting Time = "+getWaitingTime());
    }
}


public class hospitalPatientQueue{

    public static void main(String[] args){

        Scanner ip = new Scanner(System.in);

        System.out.println("Enter total patient entries: ");
        int n = ip.nextInt();
        ip.nextLine();

        QueueManager[] qm = new QueueManager[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter Patient ID = ");
            int patientId = ip.nextInt();
            ip.nextLine();

            System.out.println("Enter Patient Name = ");
            String name = ip.nextLine();

            System.out.println("Enter Patient Age = ");
            int age = ip.nextInt();
            ip.nextLine();

            System.out.println("Enter Patient Gender = ");
            String gender = ip.nextLine();

            System.out.println("Enter Patient Disease = ");
            String disease = ip.nextLine();

            System.out.println("Enter Patient Waiting Time = ");
            int waitingTime = ip.nextInt();
            ip.nextLine();
            System.out.println();
            qm[i] = new QueueManager(patientId, name, age, gender, disease, waitingTime);
        }

        // display the patients
        for(int i=0; i<n; i++){
            qm[i].display();
            System.out.println();
        }

        // time waiting
        int totalWaitingTime = 0;
        QueueManager longestWaitingTime = qm[0];

        for(int i=0; i<n; i++){
            totalWaitingTime += qm[i].getWaitingTime();
            if(qm[i].getWaitingTime() > longestWaitingTime.getWaitingTime()){
                longestWaitingTime = qm[i];
            }
        }   

        System.out.println("Total Waiting Time = "+totalWaitingTime);
        System.out.println("Longest Waiting Time = "+longestWaitingTime.getName()+"("+longestWaitingTime.getWaitingTime()+" mins)");
        System.out.println("Average Waiting Time = "+((n>0) ? ((double)totalWaitingTime/n):0));





        


    }
}