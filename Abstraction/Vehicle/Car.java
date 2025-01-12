import java.lang.*;

public class Car extends MultiVehicle
{
	private String parts;
	
	public Car()
	{
		super();
	}
	
	public Car(String name, String model, String parts)
	{
		super(name, model);
		this.parts = parts;
	}
	public void setparts(String parts)
	{
		this.parts = parts;
	}
	
	public String getparts()
	{
		return this.parts;
	}
	
	public void ShowDetails()
	{
		System.out.println("Name  : " +this.name);
		System.out.println("Model : " +this.model);
		System.out.println("Parts : " +this.parts);
	}
}