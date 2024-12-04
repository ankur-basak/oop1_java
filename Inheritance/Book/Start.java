import java.lang.*;

public class Start

{
	public static void main(String [] args)
	{
		Book b = new Book();
		System.out.println("Book Object Details : ");
		b.showDetails();
		

		StoryBook storyBook1 = new StoryBook ("255653", "Gulliver's Travels", "Jonathan Swift", 250.50, 200, "Time Travel");
		StoryBook storyBook2 = new StoryBook ("565325", "Tom Jones", "Henry Fielding", 150.20, 150, "Drama");
		
		System.out.println("\nStory Book1 Object Details : ");
		storyBook1.showDetails();
		
		System.out.println("\nStory Book2 Object Details : ");
		storyBook2.showDetails();

		TextBook textbook1 = new TextBook("242424", "Effective Java", "Joshua Bloch", 450.20, 50, 2562);
		TextBook textbook2 = new TextBook("252525", "Relevance Lost", "H. Thomas Johnson", 300.75, 100, 2566);
		
		System.out.println("\nText Book1 Object Details : " );
		textbook1.showDetails();
		
		System.out.println("\nText Book2 Object Details : ");
		textbook2.showDetails();
	}
}