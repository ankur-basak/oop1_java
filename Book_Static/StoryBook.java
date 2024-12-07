import java.lang.*;

public class StoryBook
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private String category;
	private static double discountRate;
	
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.category = category;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public void setbooktitle(String bookTitle)
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
	public void setCategory(String category)
	{
		this.category = category;
	}
	public void setDiscountRate(double rate)
	{
		this.discountRate = rate;
	}
	
	public String getIsbn()
	{
		return this.isbn;
	}
	public String getbookTitle()
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
	public String getCategory()
	{
		return this.category;
	}
	public static double getDiscountRate()
	{
		return discountRate;
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
		System.out.println("StoryBook Title : "+this.bookTitle);
		System.out.println("Author Name : "+this.authorName);
		System.out.println("Price : "+this.price);
		System.out.println("Available Quantity : "+this.availableQuantity);	
		System.out.println("Category : "+this.category);	
		System.out.println("Discount Rate : "+this.discountRate);	
	}	
}