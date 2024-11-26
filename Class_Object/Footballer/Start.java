import java.lang.*;

public class Start
{
	public static void main (String []args)
	{
		Footballer f = new Footballer();
		f.showDetails();
		System.out.println("Average: " +f.goalPerMatch());
		System.out.println("\n");
		
		Footballer g = new Footballer();
		g.setPlayerName("Cristiano Ronaldo Jr");
		g.showDetails();
		System.out.println("Average: " +g.goalPerMatch());
		System.out.println("\n");
		
		Footballer h = new Footballer("Lionel Messi", 10,(long)150l, (short)845, 99.0f);
		h.showDetails();
		System.out.println("Average: " +h.goalPerMatch());
	}
}