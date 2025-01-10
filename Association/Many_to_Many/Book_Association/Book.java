import java.lang.*;

public class Book
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	public Book()
	{
		
	}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvailableQuantiy(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public String getIsbn()
	{
		return this.isbn;
	}
	public String getBookTitle()
	{
		return this.bookTitle;
	}
	public String getAuthorName()
	{
		return this.authorName;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getAvailableQuantity()
	{
		return this.availableQuantity;
	}
	
	public void addQuantity(int amount)
	{
		this.availableQuantity += amount;
	}
	
	public void sellQuantity(int amount)
	{
		this.availableQuantity -= amount;
	}
	
	public void showDetails()
	{
		System.out.println("Isbn : "+this.isbn);
		System.out.println("Book Title : "+this.bookTitle);
		System.out.println("Author Name : "+this.authorName);
		System.out.println("Price : "+this.price);
		System.out.println("Available Quantity : "+this.availableQuantity);	
	}	
}