import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Authentication {
	public static void authenticate(Integer id, Integer password) {
		HashMap <Integer,Integer> admins = new HashMap<>();//to hold credentials of admin
		admins.put(501,1234);
		admins.put(502,4321);
		int flag =0;
		//admins.forEach((k,v) ->(id.equals(k)&&(password.equals(v)))return true;);
		//to verify the credentials and allow access
		for(Map.Entry<Integer, Integer> element : admins.entrySet()) {
			if(id.equals(element.getKey())&&(password.equals(element.getValue()))) {
				flag =1;
			}
			
		}
		if (flag ==1) {
			while(true) {
				System.out.println("Select Request");
				System.out.println("addStudent -1\neditData -2\nviewall -3\nStudentlogin-4");
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				int selection = scan.nextInt();
				switch(selection) {
				case 1: DataBase.addStudent();
				        break;
				case 2: DataBase.editData();
				        break;
				case 3: DataBase.viewAll();
				        break;
				case 4: Student.loginDetails();
				        break;
				default: System.exit(0);
				
			}
			
                    			
			}
			
			
		}
		else {
			System.out.println("Access denied...  Login again");
			
		}
	}

}
