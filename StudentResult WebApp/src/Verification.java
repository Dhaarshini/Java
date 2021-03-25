

public class Verification extends  DataBase{
	static boolean flag = true;
	
	protected static void verify(Integer rollno, String dob) {
		try {
//			if(!rollnoArray.isEmpty()) {
//
//				//System.out.println(rollnoArray.isEmpty());
//				for(Integer roll : rollnoArray) {
//					
//					if(roll.equals(rollno) ) {
//		     			
//						int index = rollnoArray.indexOf(rollno);
//						
//						if(dob.equals(dobArray.get(index))){
//							Display.show(index);
//							flag = false;
//							break ;
//						}
//						else {
//							System.out.println("Incorrect Dob Try again");
//							Student.main(null);
//						}
//						
//						
//					}
//					
//				}
//				if(flag) {
//					System.out.println("Invalid roll no ");
//				}
//				
//				
//			}
//			else {
//				System.out.print("Result yet to publish");
//				Student.main(null);
				//code to access the result with correct rollno and dob
				if(!rollnoArray.isEmpty()) {

					//System.out.println(rollnoArray.isEmpty());
					for(int x=0; x<rollnoArray.size();x++) {
						Integer roll = rollnoArray.get(x);
						if(roll.equals(rollno) ) {
			     			
							int index = rollnoArray.indexOf(rollno);
							
							if(dob.equals(dobArray.get(index))){
								Display.show(index);
								flag = false;
								break ;
							}
							else {
								System.out.println("Incorrect Dob Try again");
								Student.main(null);
							}
							
							
						}
						
					}
					if(flag) {
						System.out.println("Invalid roll no ");
					}
					
					
				}
				else {
					System.out.print("Result yet to publish");
					Student.main(null);
				
			
			}
			
	}
	catch(Exception e) {
		System.out.println("Exception at verification\n"+e);
	}
		
		
	}
}