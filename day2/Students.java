package Assignments.week3.day2;

public class Students {
 
	public void getStudentInfo(int id)
	{
		System.out.println("Student id is :"+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student id is :"+id+" and  Student name: "+name);
	
	}
	
	public void getStudentInfo(String email,int phoneNumber)
	{
		
		System.out.println("Student email:"+email+"and Student phone number: "+phoneNumber);
		
	}
	
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(4567899);
		s.getStudentInfo(123456,"Akash");
		s.getStudentInfo("test@gmail.com",1234567890);
	}
	
	
}
