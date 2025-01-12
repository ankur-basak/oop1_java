import java.lang.*;

public class Main
{
	public static void main (String [] args)
	{
		Circle c = new Circle(5.5);
		System.out.println(" Area of Circle is : "+c.area());
		
		Triangle t = new Triangle(4.5, 3.5);
		System.out.println(" Area of Triangle is : " +t.area());
		
		Rectangle r = new Rectangle(3.3, 4.5);
		System.out.println(" Area of Rectangle is : " +r.area());
	}
}