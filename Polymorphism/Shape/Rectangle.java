import java.lang.*;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		super();
	}
	
	public Rectangle(double length, double width)
	{
		super();
		this.length = length;
		this.width = width;
	}
	
	public double area()
	{
		return this.length * this.width;
	}
}