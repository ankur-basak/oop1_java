import java.lang.*;

public class Main
{
	public static void main (String [] args)
	{
		Car c1 = new Car(264294, "Lamborgini","volkswagen Group",2,4);
		Engine e1 = new Engine(15685, 2600,"volkswagen");
		
		c1.setEngine(e1);
		c1.showDetails();
		
	}
}