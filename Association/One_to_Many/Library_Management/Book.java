import java.lang.*;
public class Book
{
	private int bookId;
	private String title;
	private String authorName;
	private int noOfPages;
	
	public Book()
	{
		
	}
	
	public Book (int bookId, String title, String authorName, int noOfPages)
	{
		this.bookId = bookId;
		this.title = title;
		this.authorName = authorName;
		this.noOfPages = noOfPages;
	}
	
	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setauthorName(String authorName)
	{
		this.authorName = authorName;
	}
	
	public void setNoOfPages(int noOfPages)
	{
		this.noOfPages = noOfPages;
	}
	
	public int getBookId()
	{
		return this.bookId;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getauthorName()
	{
		return this.authorName;
	}
	
	public double getNoOfPages()
	{
		return this.noOfPages;
	}
	
	public void showDetails()
	{
		System.out.println("Book Id: "+this.bookId);
		System.out.println("Title: "+this.title);
		System.out.println("author Name: "+this.authorName);
		System.out.println("Number Of Pages: "+this.noOfPages);
	}
}
