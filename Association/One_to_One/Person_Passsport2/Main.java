import java.lang.*;

public class Main
{
	public static void main(String [] args)
	{
		Person p1 = new Person("Ankur", 24565301);
		Person p2 = new Person("Fahim", 23565302);
		Person p3 = new Person("Fahmida Faiza", 22565303);
		
		System.out.println("Passport Information: "+"\n");
		
		Passport pp1 = new Passport("Ankur Basak", 254659, p1);
		pp1.showDetails();
		
		System.out.println("\n");
		
		Person ppArr[]= new Person[3];
		
		ppArr[0] = p1;
		ppArr[1] = p2;
		ppArr[2] = p3;
		
		System.out.println("\n"+"Passport Holder Information: "+"\n");
		
		for (int i=0; i<ppArr.length; i++)
		{
			if(ppArr[i]!=null)
			{
				if(ppArr[i].getPersonId() == 24565301)
				{
					ppArr[i].showDetails();
				}
			}
		}
	}
}