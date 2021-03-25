
public class Display extends DataBase{
	 int total;
	 static String result;
	 //method to display result of a student
	 public static void show(int index) {
		if (marksArray.isEmpty()) {
			System.out.println("Marks not entered");
			
		}
		else {
			Marks m=(Marks) marksArray.get(index);
			int subject1 = m.getSubject1();
			int subject2 = m.getSubject2();
			int subject3 = m.getSubject3();
			int subject4 = m.getSubject4();
			int subject5 = m.getSubject5();
			
			int total = subject1+ subject2+ subject3 + subject4+subject5;
			
			if((subject1<35)||(subject2<35)||(subject3<35)||(subject4<35)||(subject5<35)) {
				result = "Not Pass";
			}
			else result = "Pass";
			System.out.println("Student Name: "+ nameArray.get(index));
			System.out.println("Student Rollno: "+ rollnoArray.get(index));
			System.out.println("Student Dob: "+ dobArray.get(index));
			System.out.println("Engineering Graphics "+ subject1);
			System.out.println("Robotics and Automation "+ subject2);
			System.out.println("Communication Theory "+ subject3);
			System.out.println("Professional Ethics "+ subject4);
			System.out.println("Digital Image Processing "+ subject5);
			System.out.println("Total "+ total);
			System.out.println("Result "+ result);
			
		}
		
		
		
		}
	    
	 
 }
