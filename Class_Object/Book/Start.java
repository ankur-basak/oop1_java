import java.lang.*;
public class Start
{
	public static void main (String [] args)
	{
		Book book1 = new Book("Gulliver's Travels", "Jonathan Swift", 356, (float)250.50, 150);
		Book book2 = new Book("Tom Jones", "Henry Fielding", 250, (float)150.25, 50);
		
		book1.showDetails();
		System.out.println ("Total Value Of Gulliver's Travels Stock: $" +book1.getTotalValueOfStock());
		System.out.println ("Is the Gulliver's Travels a long book? : " +book1.isLongBook() +"\n");
		
		book2.showDetails();
		System.out.println ("Total Value Of Tom Jones Stock: $" +book2.getTotalValueOfStock());
		System.out.println ("Is the Tom Jones a long book? : " +book2.isLongBook());
		
	}
}