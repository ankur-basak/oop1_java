import java.lang.*;

public class Movie
{
	private String title;
	private String director;
	private float duration;
	private float rating;
	
	public Movie()
	{
		
	}
	
	public Movie(String title, String director, float duration, float rating)
	{
		this.title = title;
		this.director = director;
		this.duration = duration;
		this.rating = rating;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setDirector(String director)
	{
		this.director = director;
	}
	public void setDuration(float duration)
	{
		this.duration = duration;
	}
	public void setRating(float rating)
	{
		this.rating = rating;
	}
	public String getTitle()
	{
		return this.title;
	}
	public String getDirector()
	{
		return this.director;
	}
	public float getDuration()
	{
		return this.duration;
	}
	public float getRating()
	{
		return this.rating;
	}
	public String getRatingCatagory()
	{
		if(this.rating>=9)
		{
			return "Excellent";
		}
		else if(this.rating >= 7 && this.rating <= 8.9)
		{
			return "Good";
		}
		else if(this.rating >= 5 && this.rating <= 6.9)
		{
			return "Average";
		}
		else
		{
			return "Poor";
		}
	}
	
	public void showDetails()
	{
		System.out.println("Title: " +this.title);
		System.out.println("Director: " +this.director);
		System.out.println("Duration: " +this.duration);
		System.out.println("Rating: " +this.rating);
	}
}