import java.lang.*;

public class Main
{
	public static void main(String[] args)
	{
		Movie m1=new Movie(2550,"Khela Hobe","Gen-z","Bengali", 256.478);
		Movie m2=new Movie(2551,"Course Fighter","Aiubian", "English", 260.478);
		Movie m3=new Movie(2552,"Fight for freedom","Gen-z", "Bengali", 280.478);
		
		Author a1=new Author(245856, "Ankur Basak", 25, "Male");
		Author a2=new Author(245755, "Fahmida Faiza",25, "Male");
		Author a3=new Author(245654, "Shifat",25, "Male");
		
		MovieAuthor ma1=new MovieAuthor(2550,245755);
		MovieAuthor ma2=new MovieAuthor(2551, 245654);
		MovieAuthor ma3=new MovieAuthor(2552, 245856);
		MovieAuthor ma4=new MovieAuthor(2550,245856);
		MovieAuthor ma5=new MovieAuthor(2551, 245755);
		
		MovieAuthor maArr[]=new MovieAuthor[5];
		maArr[0]=ma1;
		maArr[1]=ma2;
		maArr[2]=ma3;
		maArr[3]=ma4;
		maArr[4]=ma5;
		
		
		for(int i=0;i<maArr.length;i++)
		{
			
			if(maArr[i]!=null)
			{
				if(maArr[i].getMovieId() == 2550 || maArr[i].getMovieId() == 2552 )
				{
					System.out.println(maArr[i].getAuthorId());
				}
			}
			
		}
		
		Author aArr[]=new Author[3];
		aArr[0]=a1;
		aArr[1]=a2;
		aArr[2]=a3;
		
		for(int i=0;i<aArr.length;i++)
		{
			if(aArr[i]!=null)
			{
				if(aArr[i].getAuthorId() == 245755 || aArr[i].getAuthorId() == 245856)
				{
					aArr[i].showDetails();
				}
		
			}
		}
	}
}