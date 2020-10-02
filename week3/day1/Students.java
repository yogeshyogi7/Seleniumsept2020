package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("The student Id is " +id);
	}
	
	public void getStudentInfo(int id,String name) {
		
		System.out.println("The student id and name is " +id+ ","+name);
	}
	
	public void getStudentInfo(String email,long phonenumber) {
		
		System.out.println("The student email and phonenumber is " +email+","+phonenumber);
		
	}

	public static void main(String[] args) {
		
		Students info=new Students();
		
		info.getStudentInfo(2345);
		info.getStudentInfo(2345, "boss");
		info.getStudentInfo("jgjdg@gmail.com", 9676388532l);
		
		
		

	}

}
