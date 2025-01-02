import java.lang.*;

public class Car
{
	private int carId;
	private String model;
	private String brand;
	private int noOfSeat;
	private int noOfWheel;
	private Engine engine;
	
	public Car()
	{
		
	}
	
	public Car (int carID, String model, String brand, int noOfSeat, int noOfWheel)
	{
		this.carId = carID;
		this.model = model;
		this.brand = brand;
		this.noOfSeat = noOfSeat;
		this.noOfWheel = noOfWheel;
	}
	
	public void setCarId (int carId)
	{
		this.carId = carId;
	}
	
	public void setModel (String model)
	{
		this.model = model;
	}
	
	public void setBrand (String Brand)
	{
		this.brand = brand;
	}
	
	public void setNoOfSeat (int noOfSeat)
	{
		this.noOfSeat = noOfSeat;
	}
	
	public void setNoOfWheel (int noOfWheel)
	{
		this.noOfWheel = noOfWheel;
	}
	
	public int getCarId()
	{
		return this.carId;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public int getNoOfSeat()
	{
		return this.noOfSeat;
	}
	
	public int getNoOfWheel()
	{
		return this.noOfWheel;
	}
	
	public void setEngine(Engine engine)
	{
		this.engine = engine;
	}
	
	public Engine getEngine()
	{
		return this.engine;
	}
	
	public void showDetails()
	{
		System.out.println("Car ID: "+this.carId);
		System.out.println("Car Model: "+this.model);
		System.out.println("Car Brand: "+this.brand);
		System.out.println("Number of Seat: "+this.noOfSeat);
		System.out.println("Number of Wheel: "+this.noOfWheel);
		this.engine.ShowDetails();
	}
	
}