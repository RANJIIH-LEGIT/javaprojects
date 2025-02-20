package studentdatabases;

import java.util.Scanner;

public class studentdatabasemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//ask how many student we want to add
		System.out.println("Enter number of new students to enroll : ");
		Scanner user=new Scanner(System.in);
		int numOfStudents=user.nextInt();
		Student[] students=new Student[numOfStudents];
		
		
		//create n number of new student
		for(int n=0;n<numOfStudents;n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition();
			
		
			
			
		}
		int no=1;
		System.out.println("************************");
		System.out.println("STUDENTS DATA"+"\n");
		System.out.println("************************");
		for(int n=0;n<numOfStudents;n++) {
			
			
		System.out.println("Student "+no+" "+"Data");
		System.out.println(students[n].toString());	
		no++;
	
		
		}
		

}
}
