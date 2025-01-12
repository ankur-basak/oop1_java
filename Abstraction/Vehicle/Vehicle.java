import java.lang.*;

public abstract class Vehicle
{
	protected String name;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle (String name)
	{
		this.name = name;
	}
	
	public abstract void setName(String name);
	
	public String getName()
	{
		return this.name;
	}
	
	public abstract void ShowDetails();
}