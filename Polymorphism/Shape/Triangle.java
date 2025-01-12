import java.lang.*;

public class Triangle extends Shape
{
	private double base;
	private double height;
	
	public Triangle()
	{
		super();
	}
	
	public Triangle(double base, double height)
	{
		super();
		this.base = base;
		this.height = height;
	}
	
	public double area()
	{
		return 0.5* this.base * this.height;
	}
}