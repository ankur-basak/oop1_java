import java.lang.*;

public class Movie
{
	private int movieId;
	private String title;
	private String genre;
	private String language;
	private double budget;
	
	public Movie()
	{
		
	}
	
	public Movie( int movieId, String title, String genre, String language, double budget)
	{
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.budget =budget;
	}
	
	public void setMovieId(int movieId)
	{
		this.movieId = movieId;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	public void setBudget(double budget)
	{
		this.budget = budget;
	}
	
	public int getMovieId()
	{
		return this.movieId;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getGenre()
	{
		return this.genre;
	}
	
	public String getLanguage()
	{
		return this.language;
	}
	
	public double getBudget()
	{
		return this.budget;
	}
	
	public void showDetails()
	{
		System.out.println("Movie Id: "+this.movieId);
		System.out.println("Movie Title: "+this.title);
		System.out.println("Genre: "+this.genre);
		System.out.println("Movie Language: "+this.language);
		System.out.println("Movie Budget : "+this.budget);
	}
	
}