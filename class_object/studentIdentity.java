import java.lang.*;
public class studentIdentity

{
	String name,id, phone;
		
	public static void main (String [] args)
	{
		studentIdentity s1 = new studentIdentity(); //s1 is object and studentIdentity() is method.
		s1.name = "Ankur Basak";
		s1.id = "24-56530-1";
		s1.phone = "+8801717257250";
		
		System.out.println("Name is : "+s1.name);
		System.out.println("Id is   : "+s1.id);
		System.out.println("Phone is: "+s1.phone);
	}
}