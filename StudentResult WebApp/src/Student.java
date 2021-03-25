

import java.util.Scanner;
/* Project name: Student Result portal
 * Author : Dhaarshini R
 * Starting Date: 23/03/2021
 * last modification: 24/04/2021
 */
/*
 * Student result portal application used to publish results. It also supports admins(teachers)
 * to edit, add and view data entered
 */

public class Student {
	//method to get student's rollno and dob
	public static void loginDetails() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter roll number:");
		Integer rollno = Validation.validateRollNo();
		//scan.nextLine();
		System.out.println("Enter Date of Birth in format DD/MM/YYYY:");
		String dob = scan.nextLine();
		new DataBase();
	    Verification.verify(rollno,dob);
		
	}
	//method to get admin's id and password
	public static void adminPermit() {
		System.out.println("Enter Id:");
		Integer id = Validation.validateId();
		//scan.nextLine();
		System.out.println("Enter password:");
		Integer password = Validation.validatePassword();
		new DataBase();
		Authentication.authenticate(id,password);
		
	}

	@SuppressWarnings("resource")
	public static void main(String arg[]) {
		
	System.out.println("\nEnter 1 for student and 0 for admin");
	Scanner scan = new Scanner(System.in);
	int choose = scan.nextInt();
	
	if(choose == 1) {
		Student.loginDetails();
		
	}
	else {
		Student.adminPermit();
	}
	
	}
}



 


