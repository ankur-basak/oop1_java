import java.lang.*;
public class Book
{
	private String title;
	private String author;
	private int numberOfPages;
	private float price;
	private int stockQuantity;
	
	public Book()
	{
		
	}
	
	public Book (String title, String author, int numberOfPages, float price, int stockQuantity)
	{
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public void setStockQuantity(int stockQuantity)
	{
		this.stockQuantity = stockQuantity;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public int getNumberOfPages()
	{
		return this.numberOfPages;
	}
	public float getPrice()
	{
		return this.price;
	}
	public int getStockQuantity()
	{
		return this.stockQuantity;
	}
	public float getTotalValueOfStock()
	{
		return price*stockQuantity;
	}
	public boolean isLongBook()
	{
		return numberOfPages>300;
	}
	public void showDetails()
	{
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("Number Of Pages: "+this.numberOfPages);
		System.out.println("Price: "+this.price);
		System.out.println("Stock Quantity: "+this.stockQuantity);
	}
}
