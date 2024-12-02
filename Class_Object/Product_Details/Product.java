import java.lang.*;
public class Product
{
	private String name;
	private String productID;
	private double price;
	private int stockQuantity;
	private String catagory;
	private String supplierName;
	private String expirationDate;
	
	public Product()
	{

	}
	public Product(String name, String productID, double price, int stockQuantity, String catagory, String supplierName, String expirationDate)
	{
		this.name = name;
		this.productID = productID;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.catagory = catagory;
		this.supplierName = supplierName;
		this.expirationDate = expirationDate;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setProductID(String productID)
	{
		this.productID = productID;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setStockQuantity(int stockQuantity)
	{
		this.stockQuantity = stockQuantity;
	}
	public void setCatagory(String catagory)
	{
		this.catagory = catagory;
	}
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}
	public void setExpirationDate(String expirationDate)
	{
		this.expirationDate = expirationDate;
	}	
	
	public String getName()
	{
		return this.name;
	}
	public String getProductID()
	{
		return this.productID;
	}
	public double price()
	{
		return this.price;
	}
	public int getStockQuantity()
	{
		return this.stockQuantity;
	}
	public String getCatagory()
	{
		return this.catagory;
	}
	public String getSupplierName()
	{
		return this.supplierName;
	}
	public String expirationDate()
	{
		return this.expirationDate;
	}
	 public double applyDiscount(double discountPercentage)
	 {
		double discountAmount = (price * discountPercentage) / 100;
		double discountedPrice = price - discountAmount;
		this.price = discountedPrice;
		return discountedPrice;
	 }
	 
	 public void showDetails()
	 
	 {
		System.out.println("Name: " +this.name);
		System.out.println("Product ID: " +this.productID);
		System.out.println("Price: " +this.price);
		System.out.println("Stock Quantity: " +this.stockQuantity);
		System.out.println("Catagory: " +this.catagory);
		System.out.println("Supplier Name: " +this.supplierName);
		System.out.println("Expiration Date: " +this.expirationDate);
	 }
}