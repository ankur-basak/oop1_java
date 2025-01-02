import java.lang.*;

public class Engine
{
	private int engineId;
	private int horsepower;
	private String manufractureCompany;
	
	public Engine()
	{
		
	}
	
	public Engine (int engineId, int horsepower, String manufractureCompany)
	{
		this.engineId = engineId;
		this.horsepower = horsepower;
		this.manufractureCompany = manufractureCompany;
	}
	
	public void setEngineId (int engineId)
	{
		this.engineId = engineId;
	}
	
	public void SetHorsepower (int horsepower)
	{
		this.horsepower = horsepower;
	}
	
	public void setmanufractureCompany (String manufractureCompany)
	{
		this.manufractureCompany = manufractureCompany;
	}
	
	public int getEngineId()
	{
		return this.engineId;
	}
	
	public int gethorsepower()
	{
		return this.horsepower;
	}
	
	public String getmanufractureCompany()
	{
		return this.manufractureCompany;
	}
	
	public void ShowDetails()
	{
		System.out.println("Engine ID: "+this.engineId);
		System.out.println("Horsepower Of Car: "+this.horsepower);
		System.out.println("Name Of Manufracture Company: "+this.manufractureCompany);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}