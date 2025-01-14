import java.lang.*;

public class BasicCalculator implements ICalculation
{
	protected double value1;
	protected double value2;
	
	public BasicCalculator()
	{
		
	}
	
	public BasicCalculator(double value1, double value2)
	{
		this.value1=value1;
		this.value2=value2;
	}
	
	public void setValue1(double value1)
	{
		this.value1=value1;
	}
	
	public void setValue2(double value2)
	{
		this.value2=value2;
	}
	
	public double getValue1()
	{
		return this.value1;
	}
	
	public double getValue2()
	{
		return this.value2;
	}
	
	public double add()
	{
		return this.value1+this.value2;
	}
	
	public double subtract()
	{
		return this.value1-this.value2;
	}
	
	public double multiply()
	{
		return this.value1*this.value2;
	}
	
	public double divide()
	{
		return this.value1/this.value2;
	}
}