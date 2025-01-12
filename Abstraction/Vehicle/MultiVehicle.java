import java.lang.*;

public abstract class MultiVehicle extends Vehicle
{
	protected String model;
	
	public MultiVehicle()
	{
		super();
	}
	
	public MultiVehicle(String name, String model)
	{
		super(name);
		this.model = model;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getModel()
	{
		return this.model;
	}
}