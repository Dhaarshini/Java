import java.util.Scanner;

public class Validation {
	//method to validate name
	
	public static String validateName(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		boolean flag = name.matches("[A-Z]{1}[a-z]+\\s[A-Z]+");
		//System.out.println(flag);
		if(flag) {
			return name;
		}
		else {
			System.out.println("Enter valide name Example Dhaarshini R");
			return validateName();
		}
		
	}
	//method to validate rollno
	public static int validateRollNo() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String rollNo = scan.nextLine();
		boolean flag = rollNo.matches("\\d{5}");
		//System.out.println(flag);
		if(flag) {
			return Integer.parseInt(rollNo);
		}
		else {
			System.out.println("Enter valide rollno Example 12345");
			return validateRollNo();
		}
		
	}
	//method to validate dob
	//method to validate id
	public static int validateId() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String Id = scan.nextLine();
		boolean flag = Id.matches("\\d{3}");
		//System.out.println(flag);
		if(flag) {
			return Integer.parseInt(Id);
		}
		else {
			System.out.println("Enter valid id Example 501");
			return validateId();
		}
		
	}
	//method to validate password
	public static int validatePassword() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		boolean flag = password.matches("\\d{4}");
		//System.out.println(flag);
		if(flag) {
			return Integer.parseInt(password);
		}
		else {
			System.out.println("Enter valid password Example 1234");
			return validatePassword();
		}
		
	}
	//method to validate marks
	public static int validateMark() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String mark = scan.nextLine();
		boolean flag1 = mark.matches("\\d{1,3}"); //True if mark contains 1 to 3 digits
		boolean flag2 = Integer.valueOf(mark) < 101;//True if mark is less than 101
		boolean flag = flag1 && flag2;
		//System.out.println(flag);
		if(flag) {
			return Integer.parseInt(mark);
		}
		else {
			System.out.println("Enter valid mark ");
			return validateMark();
		}
		
	}

}
