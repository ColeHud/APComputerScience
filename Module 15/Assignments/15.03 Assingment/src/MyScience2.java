/*
 * By Cole Hudson
 * Date: 3/17/2015
 * Purpose: add an interface to process pages from your homework
 * 
 * PMR in README.txt
 */
public class MyScience2 extends Homework2
{
	//constructor
	MyScience2()
	{
		super();
	}

	//implemented create assignment method
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "Science";
	}

	//other methods
	//to string
	public String toString()
	{
		return typeHomework + " - must read " + pagesRead + " pages";
	}
	
	//implements doReading()
	public void doReading()
	{
		pagesRead -= 3;
	}
}
