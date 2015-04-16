/*
 * By Cole Hudson
 * Date: 3/15/2015
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 * PMR in README.txt
 */
public class MyScience extends Homework 
{
	//constructor
	MyScience()
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
}
