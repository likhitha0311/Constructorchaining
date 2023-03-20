package Polymorphism;

public class Movie 
{
private String movieName;


public Movie(String movieName) {
	
	this.movieName = movieName;
}


public void watchMovie()
{
	System.out.println("I am watching "+movieName);
}
}

class Adventure extends Movie
{
	private String movieType;
	public Adventure(String movieName, String movieType) 
	{
		super(movieName);
		
		this.movieType =movieType;
	}
	
	public void adventureMovie()
	{
		System.out.println("I am watching "+movieType);
	}
	
}