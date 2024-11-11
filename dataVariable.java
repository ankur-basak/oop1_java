import java.lang.*;

public class dataVariable
{
	static int c = 20; //static variable
	int a = 50; //instance variable
	public static void main (String [] args)
	{
		int b = 30; //Local variable
		dataVariable dv = new dataVariable();
		System.out.println("The value of c is:" +c);
		System.out.println("The value of b is:" +b);
		System.out.println("The value of dv.a is:" +dv.a);
	}
}