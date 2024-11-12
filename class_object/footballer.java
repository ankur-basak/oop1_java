import java.lang.*;
public class footballer
{
	private String playerName;
	private int jersey_no;
	private long numberOfMatch;
	private short numberOfGoals;
	private float salary;
	
	public void showDetails()
	{
		System.out.println("Player Name: "+this.playerName);
		System.out.println("Jersey No: "+this.jersey_no);
		System.out.println("Nummber of Matches: "+this.numberOfMatch);
		System.out.println("Nummber of Goals: "+this.numberOfGoals);
		System.out.println("Salary: "+this.salary);
	}
	
}