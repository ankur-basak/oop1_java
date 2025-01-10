import java.lang.*;

public class Author
{
	private int authorId;
	private String authorName;
	private int age;
	private String gender;
	
	public Author()
	{
		
	}
	
	public Author( int authorId, String authorName, int age, String gender)
	{
		this.authorId = authorId;
		this.authorName = authorName;
		this.age = age;
		this.gender = gender;
	}
	
	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public int getAuthorId()
	{
		return this.authorId;
	}
	
	public String getAuthorName()
	{
		return this.authorName;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public void showDetails()
	{
		System.out.println("Author Id: "+this.authorId);
		System.out.println("Author Name: "+this.authorName);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
	}
	
}