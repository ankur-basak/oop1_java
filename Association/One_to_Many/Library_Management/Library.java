import java.lang.*;

public class Library
{
	private int libraryId;
	private String name;
	private String location;
	
	public Library()
	{
		 
	}
	
	public Library (int LibraryId, String name, String location)
	{
		this.libraryId = libraryId;
		this.name = name;
		this.location = location;
	}
	
	public void setLibraryId (int libraryId)
	{
		this.libraryId = libraryId;
	}
	
	public void Setname (String name)
	{
		this.name = name;
	}
	
	public void setlocation (String location)
	{
		this.location = location;
	}
	
	public int getLibraryId()
	{
		return this.libraryId;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getlocation()
	{
		return this.location;
	}
	
	public void showDetails()
	{
		System.out.println("Library ID: "+this.libraryId);
		System.out.println("Name Of Library: "+this.name);
		System.out.println("Location: "+this.location);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}