import java.lang.*;

public class Person
{
	private String personName;
	private int personId;
	
	public Person()
	{
		
	}
	
	public Person (String personName, int personId)
	{
		this.personName = personName;
		this.personId = personId;
	}
	
	public void setPersonName(String personName)
	{
		this.personName = personName;
	}
	
	public void setPersonId(int personId)
	{
		this.personId = personId;
	}
	
	public String getPersonName()
	{
		return this.personName;
	}
	
	public int getPersonId()
	{
		return this.personId;
	}
	
	public void showDetails()
	{
		System.out.print("Person Name: "+this.personName + "\n");
		System.out.print("Person Id: "+this.personId);
	}
}