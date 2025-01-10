import java.lang.*;

public class Passport
{
	private String holderName;
	private int passportId;
	private Person person;
	
	public Passport() 
	{
		
	}
	
	public Passport (String holderName, int passportId, Person p)
	{
		this.holderName = holderName;
		this.passportId = passportId;
		this.person = p;
	}
	
	public void setHolderName(String holderName)
	{
		this.holderName = holderName;
	}
	
	public void setPassportId(int passportId)
	{
		this.passportId = passportId;
	}
	
	public void setPerson(Person person)
	{
		this.person = person;
	}
	
	public String getHolderName()
	{
		return this.holderName;
	}
	
	public int getPassportId()
	{
		return this.passportId;
	}
	
	public Person getPerson()
	{
		return this.person;
	}
	
	public void showDetails()
	{
		System.out.print("Passport Holder Name: "+this.holderName+"\n");
		System.out.print("Passport Id: "+this.passportId+"\n");
		person.showDetails();
	}
}