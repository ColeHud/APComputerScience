/*
 * By Cole Hudson
 * Date: 3/17/2015
 * Purpose: add an interface to process pages from your homework
 * 
 * PMR in README.txt
 */
public class MyJava2 extends Homework2
{
	//constructor
	MyJava2()
	{
		super();
	}

	//implemented create assignment
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "Java";
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
		pagesRead -= 4;
	}
}
