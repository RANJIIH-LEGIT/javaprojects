package studentdatabases;

import java.util.Scanner;

public class Student {
	//constructor prompt to user to access the name ,year
	private String fristname;

	private String lastname;

	private String gradeyear;

	private String studentid;

	private String courses="";

	private int tuitionBalance=0;

	//private static int costofcourse=600;
	 private static final int JAVA_ONLY = 6000;
	    private static final int JAVA_FULLSTACK = 9000;
	    private static final int PYTHON = 7500;
	    private static final int FULLSTACK_PYTHON = 10000;
	
	private static int id=1000; //its cannot change

	private static int count=0;

	

	public Student() {   //constructor

		count++;
        System.out.println("Student "+count+" details\n-------------------");
		Scanner user=new Scanner(System.in);

		System.out.println("enter student fristname : ");

		this.fristname=user.nextLine();

		

		System.out.println("enter the lastname : ");

		this.lastname=user.nextLine();
		

		

		/*
		 * System.out.println("1- fresher\n2 for Software\n3 junior\n4 seinor"+"\n enter the class level : ");
		 

		this.gradeyear=user.nextInt();*/
		
		System.out.println("1- Fresher in IT field\n2- Fresher in non-IT field\n3- Experienced in IT field\n4- Others\nEnter the class level: ");
        int gradeyearChoice = user.nextInt();

        switch (gradeyearChoice) {
            case 1:
                this.gradeyear = "Fresher in IT field";
                break;
            case 2:
                this.gradeyear = "Fresher in non-IT field";
                break;
            case 3:
                this.gradeyear = "Experienced in IT field";
                break;
            case 4:
                this.gradeyear = "Others";
                break;
            default:
                System.out.println("Invalid choice. Setting default to 'Others'.");
                this.gradeyear = "Others";
                break;
        }
		
		setStudentID();
		
		

		

	}

	

	//generate ID
 private void setStudentID() {
	 id++;
	 //grade level + ID
	 //this.studentid=gradeyear+""+id;
	 this.studentid=String.valueOf(id);// type converstion in to string
 }
	

	

	//enroll te course
 
 public void enroll() {
	 //get inside,a loop user hits 0
	 
	 do {
         System.out.print("Enter the course to enroll (1- Java Only, 2- Fullstack Java, 3- Python, 4- Fullstack Python, Q to quit): ");
         Scanner user = new Scanner(System.in);
         String course = user.nextLine();
         if (course.equals("1")) {
             courses += "\n   Java Only";
             tuitionBalance += JAVA_ONLY;
         } else if (course.equals("2")) {
             courses += "\n   Fullstack Java";
             tuitionBalance += JAVA_FULLSTACK;
         } else if (course.equals("3")) {
             courses += "\n   Python";
             tuitionBalance += PYTHON;
         } else if (course.equals("4")) {
             courses += "\n   Fullstack Python";
             tuitionBalance += FULLSTACK_PYTHON;
         } else if (course.equalsIgnoreCase("Q")) {
             break;
         } else {
             System.out.println("Invalid option. Please try again.");
         }
     } while (true);
	 //while(true) help the code run contiuously and its break after the inside inside is came true is automatically break the loop
	 // these while loop is use to ask the user contion to enrooled the course and till the condition was not statificed
 }
	 
	 /*
	 do {
	 System.out.print("enter the course to enroll (Q to quit) : ");
	 Scanner user=new Scanner(System.in);
	 String course=user.nextLine();
	 if(!course.equals("Q") &&(!course.equals("q"))) {
		 courses=courses +"\n   "+course;
		 tuitionBalance=tuitionBalance+costofcourse;
	 }
	 else {
		
		 break;
		 }
		 
		 
	 }
	 while(1 !=0);

	
	 
 }
*/
	

	//view balance
 public void viewbalance() {
	 System.out.println("Your balance is : Rs. "+tuitionBalance+"\n");
 }

	

	//pay tution
 public void payTuition() {
	 viewbalance();
	 System.out.println("enter the amount to pay now : ");
	 Scanner user=new Scanner(System.in);
	 int payment=user.nextInt();
	 tuitionBalance=tuitionBalance-payment;
	 System.out.println("Thank you for your payment of : Rs "+payment);
	 viewbalance();
	 
 }

	

	

	//show status
 
 public String toString() {
	 return "\n"+"Name : "+fristname+" "+lastname+"\nGradeLevel: "+gradeyear+"\nStudent ID : "+studentid +"\nCourses Enrolled : "+courses+"\nBalance :"+tuitionBalance+"\n---------------------------------------";
 }



}
	
	

