import java.lang.*;

public class Main
{
	public static void main(String [] args)
	{
		ScientificCalculator sc = new ScientificCalculator(10.2, 20.3);
		
		System.out.println("Addition : " +sc.add());
		System.out.println("Subtraction : " +sc.subtract());
		System.out.println("Multiplication: " +sc.multiply());
		System.out.println("Divide: " +sc.divide());
		System.out.println("Power: " +sc.toThePow());
	}
}