import java.lang.*;
public class Start
{
	public static void main (String [] args)
	{
		Movie movie1 = new Movie("Gulliver's Travels", "Jonathan Swift", (float)150, (float)8.5);
		Movie movie2 = new Movie("Tom Jones", "Henry Fielding", (float)130.25, (float)7);
		
		System.out.println("\nShowing Details of " +movie1.getTitle() +"\n");
		movie1.showDetails();
		
		System.out.println("\nShowing Details of " +movie2.getTitle() +"\n");
		movie2.showDetails();
	}
}