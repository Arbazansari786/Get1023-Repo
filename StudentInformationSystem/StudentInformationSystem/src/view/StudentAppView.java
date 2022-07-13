package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.StudentController;
import model.Qualification;
import model.Student;

public class StudentAppView {
	
	public static void main(String args[]) {
		StudentController controller=new StudentController();
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Student \n 2. Admin");
		int userType=sc.nextInt();
		if(userType==1) {
			String choice="y";
			do {
			System.out.println("1. Sign Up\n 2. Update phone number \n 3. view all courses\n 4.Register for a course"
					+ "                \n 5. Sign out");
			int option=sc.nextInt();
			switch(option) {
			
			case 1:
				System.out.println("Enter name,date of birth(mm/dd/YYYY),phone number,email and address");
				String name=sc.next();
				String dateOfBirth=sc.next();
				DateTimeFormatter  formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dob=LocalDate.parse(dateOfBirth,formatter);
				
				String phoneNumber=sc.next();
				String email=sc.next();
				String address=sc.next();
				
				System.out.println("1. Master 2/ Graduate 3. Intermediate 4. Matric");
				int q=sc.nextInt();
				Qualification qualification=null;
				
				if(q==1) qualification=Qualification.Master;
				if(q==2) qualification=Qualification.Graduate;
				if(q==3) qualification=Qualification.Intermediate;
				if(q==4) qualification=Qualification.Matric;
   
				Student student =new Student(name, dob, qualification, phoneNumber, email, address);
				
				String message=controller.addNewStudent(student);
				System.out.println(message);
				
				
				
				
				
				
			}
			
			}while(choice=="y" || choice=="Y");
		} else if(userType==2) {
			
		} else {
			System.out.println("Invalid Choice");
		}
	}

}
