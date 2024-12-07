import java.lang.*;

public class Start

{
	public static void main(String [] args)
	{
		Book book1 = new Book("242424", "Effective Java", "Joshua Bloch", 450.20, 50);
		Book book2 = new Book("252525", "Relevance Lost", "H. Thomas Johnson", 300.75, 100);
		
		System.out.println("\nBook Object Details : ");
		book1.showDetails();
		book2.showDetails();
	}
}