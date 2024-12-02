import java.lang.*;
public class Start
{
	public static void main(String []agrs)
	{
		Product product1 = new Product("MOMO", "M24", 149, 6, "Food", "All Nighters Basundhara", "24/11/24");
		Product product2 = new Product("Chick Veg Pitha", "Pitha24", 119, 6, "Food", "All Nighters Basundhara", "25/11/24");
		
		System.out.println("Product 1 Details: ");
		product1.showDetails();
		
		System.out.println("\nProduct 2 Details: ");
		product2.showDetails();
		
		double discountPrice1 = product1.applyDiscount(10);
		System.out.println("Discount Price Of "+product1.getName() + ": $"+discountPrice1);
		
		double discountPrice2 = product2.applyDiscount(10);
		System.out.println("Discount Price Of "+product2.getName() + ": $"+discountPrice2);
	}
}