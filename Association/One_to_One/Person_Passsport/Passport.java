import java.lang.*;

public class Passport
{
	private String holderName;
	private int passportId;
	private int personId;
	
	public Passport() 
	{
		
	}
	
	public Passport (String holderName, int passportId, int personId)
	{
		this.holderName = holderName;
		this.passportId = passportId;
		this.personId = personId;
	}
	
	public void setHolderName(String holderName)
	{
		this.holderName = holderName;
	}
	
	public void setPassportId(int passportId)
	{
		this.passportId = passportId;
	}
	
	public void setPersonId(int personId)
	{
		this.personId = personId;
	}
	
	public String getHolderName()
	{
		return this.holderName;
	}
	
	public int getPassportId()
	{
		return this.passportId;
	}
	
	public int getPersonId()
	{
		return this.personId;
	}
	
	public void showDetails()
	{
		System.out.print("Passport Holder Name: "+this.holderName +"\n");
		System.out.print("Passport Id: "+this.passportId +"\n");
		System.out.print("Person Id: "+this.personId);
	}
}