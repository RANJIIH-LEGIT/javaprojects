package emailapp;

import java.util.Scanner;

public class Emailwom {
	private String Fristname;
	private String Lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity=600;
	private int defaultpasswordlength=10;
	private String alternateEmail;
	private String companySuffix="groupofcompany.com";
	
	
	//CONSTRUCTOR to recieve the frist name ans lastname
	public Emailwom(String Fristname,String Lastname) {
		this.Fristname=Fristname;
		this.Lastname=Lastname;
		
		
		//call the method for department  and return department
		this.department=setDepartment();
		//System.out.println("Department : "+this.department);
		
		//call a method that return a random password
		this.password=randomPassword(8);
		System.out.println("your password :"+this.password);
		
		//combine elements to generate email
		email =Fristname.toLowerCase() + Lastname.toLowerCase()+"@"+department+companySuffix;
		
		//System.out.println("your email is : "+email);
		
		
	}
	
	
	
 //ask the department
			
	private String setDepartment() {
		System.out.println("new worker : "+Fristname+ " "+"\ndepartment codes\n1 for sales\n2 for Development\n3 for Account\n0 for null\n Enter the department code :");
		Scanner user=new Scanner(System.in);
		int depchoice=user.nextInt();
		if(depchoice == 1) {
			return "sales";
		}
		else if(depchoice ==2) {
			return "dev";
			
		}
		else if(depchoice ==3) {
			return "Account";
		}
		else {
			
			return "";
		}
		
	}
	//genernatre a random password
	//call a method retrun a random password
			private String randomPassword(int length) {
				String passwordSet="ABCDEFGHIJKLMNOPQRSTUVXYZ!^#@$*%";
				char[] password=new char[length];
				for(int i=0;i<length;i++) {
				int rand=(int) (Math.random() * passwordSet.length());
				password[i]=passwordSet.charAt(rand);
				}
				return new String(password);
			}
			
	
	
	//set the mailbox capacity
			public void setMailboxCapacity(int capacity) {
				this.mailboxcapacity=capacity;
			}
			
			//set alnernate email
			public void setAlternateEmail(String altEmail) {
				this.alternateEmail=altEmail;
			}
			
	//change password
			public void changePassword(String password) {
				this.password=password;
			}
			public int getMailCapacity(){
				return mailboxcapacity;
			}
			public String getAlternateEmail() {
				return alternateEmail;
			}
			public String getPassword() {
				return password;
			}
			public String showInfo() {
				return "Display Name : "+Fristname+" "+Lastname+"\nCompany Email : "+email+"\nMailBoxCapacity : "+mailboxcapacity +"mb";
			}
	
	

}
