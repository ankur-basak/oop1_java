import java.lang.*;

public class Main
{
	public static void main (String [] args)
	{
		Library library = new Library(15245, "Pookie library", "Dhaka");
		
		Book book1 = new Book(2556, "Gulliver's Travels","Jonathan Swift", 250);
		Book book2 = new Book(2557, "Tom Jones", "Henry Fielding", 150);
		
		Book blArr[] = new Book[2];
		
		blArr[0]= book1;
		blArr[1]= book2;
		
		for(int i=0;i<blArr.length;i++)
		{
			if(blArr[i]!=null)
			{
				if(blArr[i].getBookId() == 2556 || blArr[i].getBookId() == 2557)
				{
					System.out.println("Book information");
					blArr[i].showDetails();
				}
			}
		}
	}
}