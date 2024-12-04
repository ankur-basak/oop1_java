import java.lang.*;

public class StoryBook extends Book
{
	private String category;
	
	public StoryBook()
	{
		super();
		this.category = " ";
	}
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.category = category;
	}
	
	public void setcategory(String category)
	{
		this.category = category;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Category: "+this.category);
	}
}