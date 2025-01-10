import java.lang.*;

public class MovieAuthor
{
	private int movieId;
	private int authorId;
	
	public MovieAuthor()
	{
	}
	
	public MovieAuthor(int movieId, int authorId)
	{
		this.movieId=movieId;
		this.authorId=authorId;
	}
	
	public void setMovieId()
	{
		this.movieId = movieId;
	}
	
	public void setAuthorId()
	{
		this.authorId = authorId;
	}
	
	public int getMovieId()
	{
		return this.movieId;
	}
	
	public int getAuthorId()
	{
		return this.authorId;
	}
	
	public void showDetails()
	{
		System.out.println("Author Id: "+this.movieId);
		System.out.println("Author Name: "+this.authorId);
	}
}