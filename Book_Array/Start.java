import java.lang.*;

public class Start
{
	public static void main(String [] args)
	{
		Book book1 = new Book ("255653", "Gulliver's Travels", "Jonathan Swift", 250.50, 200);
		Book book2 = new Book ("565325", "Tom Jones", "Henry Fielding", 150.20, 150);
		Book book3 = new Book("242424", "Effective Java", "Joshua Bloch", 450.20, 50);
		Book book4 = new Book("252525", "Relevance Lost", "H. Thomas Johnson", 300.75, 100);
		Book book5 = new Book("262626", "Python Crash Course", "Eric Matthes", 180.26, 80);
		
		Book[] books = new Book[5];
		
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;
		books[4] = book5;
		
		for(int i = 0; i<books.length; i++)
		{
			System.out.println("\nBook" + (i+1) + " Details: ");
			books[i].showDetails();
		}
	}
}