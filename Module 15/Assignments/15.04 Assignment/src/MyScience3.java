/*
 * By Cole Hudson
 * Date: 3/22/2015
 * Purpose: implement the Comparable<T> interface
 * 
 * PMR in README.txt
 */
public class MyScience3 extends Homework3
{
	//constructor
	MyScience3()
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
