import java.lang.*;

public class ScientificCalculator extends BasicCalculator implements IScientificCalculation

{
	public ScientificCalculator()
	{
		super();
	}
	
	public ScientificCalculator(double value1, double value2)
	{
		super(value1, value2);
	}
	
	public double toThePow()
	{
		return Math.pow(this.value1, this.value2);
	}
	
}