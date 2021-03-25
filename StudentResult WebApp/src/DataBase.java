import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DataBase{
	
	static ArrayList  <Integer> rollnoArray = new ArrayList<Integer>();
	static ArrayList <String> dobArray = new ArrayList<>();
	static ArrayList <String> nameArray = new ArrayList<>();	
	static ArrayList <Marks> marksArray = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	DataBase(){// Few data already existing
		rollnoArray.add(20001);
		rollnoArray.add(20002);
		rollnoArray.add(20003);
		dobArray.add("27/08/1998");
		dobArray.add("27/08/1998");
		dobArray.add("27/08/1998");
		nameArray.add("Vivan K");
		nameArray.add("Aditiya M");
		nameArray.add("Ruban V");
		marksArray.add(new Marks(89,89,89,89,89));
		marksArray.add(new Marks(70,70,70,70,70));
		marksArray.add(new Marks(96,96,96,96,96));
		
	}
	//method that allow admin to add student to data base
	public static void addStudent() {
		System.out.println("Enter rollno:");
		rollnoArray.add(Validation.validateRollNo());
		//scan.nextLine();
		System.out.println("Enter DOB");
		dobArray.add(scan.nextLine());
		//scan.nextLine();
		System.out.println("Enter Name:");
		nameArray.add(Validation.validateName());
	    //scan.nextLine();
		System.out.println("Enter mark of subject1:");
		int s1 = Validation.validateMark();
		//scan.nextLine();
		System.out.println("Enter mark of subject2:");
		int s2 = Validation.validateMark();
		//scan.nextLine();
		System.out.println("Enter mark of subject3:");
		int s3 = Validation.validateMark();
		//scan.nextLine();
		System.out.println("Enter mark of subject4:");
		int s4 = Validation.validateMark();
		//scan.nextLine();
		System.out.println("Enter mark of subject5:");
		int s5 = Validation.validateMark();
		//scan.nextLine();
		marksArray.add(new Marks(s1,s2,s3,s4,s5));
		
	}
	// method to edit already existing data 
	public static void editData() {
		System.out.println("To edit marks enter 1");
		System.out.println("To edit name enter 2");
		System.out.println("To edit dob enter 3");
		Integer roll =null;
		int index;
		int selection = scan.nextInt();
		switch (selection){
		case 1: System.out.println("Enter rollno"); //code to edit subject marks
		         roll = Validation.validateRollNo();
		        scan.nextLine();
				System.out.println("Enter mark of subject1:");
				int s1 = Validation.validateMark();
				//scan.nextLine();
				System.out.println("Enter mark of subject2:");
				int s2 = Validation.validateMark();
				//scan.nextLine();
				System.out.println("Enter mark of subject3:");
				int s3 = Validation.validateMark();
				//scan.nextLine();
				System.out.println("Enter mark of subject4:");
				int s4 = Validation.validateMark();
				//scan.nextLine();
				System.out.println("Enter mark of subject5:");
				int s5 = Validation.validateMark();
				//scan.nextLine();
		         index = rollnoArray.indexOf(roll);
		        Marks m = (Marks)marksArray.get(index);
		        m.setSubject1(s1);
		        m.setSubject2(s2);
		        m.setSubject3(s3);
		        m.setSubject4(s4);
		        m.setSubject5(s5);
		        System.out.println("Marks updated successfully");
		        break;
		        
		
			
		case 2:System.out.println("Enter rollno");// code to edit name
                roll = Validation.validateRollNo();
               scan.nextLine();
               System.out.println("Enter new name");
               String newName = Validation.validateName();
               index = rollnoArray.indexOf(roll);
               String oldName=nameArray.get(index);
               Collections.replaceAll(nameArray, oldName,newName);
               System.out.println("Name updated successfully");
		        break;
			
		case 3:System.out.println("Enter rollno");// code to edit dob
               roll = Validation.validateRollNo();
               scan.nextLine();
               System.out.println("Enter new dob");
               String newDob = scan.nextLine();
               index = rollnoArray.indexOf(roll);
               String oldDob=dobArray.get(index);
               Collections.replaceAll(dobArray, oldDob,newDob);
               System.out.println("Dob updated successfully");
               break;
			
		default: 
		         System.exit(0);
		         break;
	
		
		}
		
			
		}
		
    //method to view all the data in db
	public static void viewAll() {
		int i = 0;
		int index;
		try{
			for(Integer roll : rollnoArray) {
		
			
			index = rollnoArray.indexOf(roll);
			Display.show(index);
					i++;
				
			}
		System.out.println("Total records : "+ i);
		System.exit(0);
		}
		catch (Exception e) {
			System.out.println("Error at viewall");
		}
	}
	
	
}