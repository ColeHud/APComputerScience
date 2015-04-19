/*
 * By Cole Hudson
 * Date: 4/14/2015
 * Purpose: Use Binary Search to sort through lists of music.
 * 
 * PMR in README.txt
 */
public class Music2 
{
	//variables
	private String title;
	private int year;
	private String singer;
	
	//getters
	public String getTitle() 
	{
		return title;
	}
	public int getYear() 
	{
		return year;
	}
	public String getSinger() 
	{
		return singer;
	}
	
	//setters
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public void setSinger(String singer) 
	{
		this.singer = singer;
	}
	
	//constructor
	Music2(String title, int year, String singer)
	{
		this.title = title;
		this.year = year;
		this.singer = singer;
	}
	
	//alternate constructor
	Music2()
	{
		
	}
	
	//other methods
	
	//to string
	public String toString()
	{
		return String.format("%-20s %-7d %-15s", title, year, singer);
	}
	
	
}
