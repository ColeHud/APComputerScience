/*
 * By Cole Hudson
 * Date: 3/17/2015
 * Purpose: add an interface to process pages from your homework
 * 
 * PMR in README.txt
 */
public class MyMath2 extends Homework2
{
	//constructor
	MyMath2()
	{
		super();
	}

	//implemented create assignment method
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "Math";
	}

	//other methods
	//to string
	public String toString()
	{
		return typeHomework + " - must read " + pagesRead + " pages";
	}
	
	//implement doReading
	public void doReading()
	{
		pagesRead -= 2;
	}

}
