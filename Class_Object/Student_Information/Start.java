import java.lang.*;
public class Start
{
	public static void main (String [] args)
	{
		Student student1 = new Student("Ankur Basak", "24-56530-1", "Java", 3.95, (short)35, "ankurb173@gmail.com");
		Student student2 = new Student("Arindom Kumar Dey", "24-5643-3", "Finance", 3.70, (short)20, "arindomgaming29@gmail.com");
		
		student1.showDetails();
		System.out.println("IS Eligible For Dean List? : " +student1.isEligibleForDeanList() +"\n");
		
		student2.showDetails();
		System.out.println("IS Eligible For Dean List? : " +student2.isEligibleForDeanList());
	}
	
}