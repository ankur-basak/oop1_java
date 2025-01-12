import java.lang.*;

public class Circle extends Shape
{
	private double radius;
	
	public Circle()
	{
		super();
	}
	
	public Circle(double radius)
	{
		super();
		this.radius = radius;
	}
	
	public double area()
	{
		return this.radius * this.radius;
	}
}