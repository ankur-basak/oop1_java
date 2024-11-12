import java.lang.*;

public class studentInfoDisplay
{
	String name, id;
	String phone;
	
	void displayinfo()
	{
		System.out.println("Name is : " +name);
		System.out.println("Id is : " +id);
		System.out.println("Phone is : " +phone);
	}
	
	public static void main(String [] args)
	{
		studentInfoDisplay s1 = new studentInfoDisplay();
		s1.name = "Ankur Basak";
		s1.id = "24-56530-1";
		s1.phone = "+8801717257250";
		s1.displayinfo();
		
		studentInfoDisplay s2 = new studentInfoDisplay();
		s2.name = "Arindom";
		s2.id = "24-565740-1";
		s2.phone = "+880146545858";
		s2.displayinfo();
	}
	
}