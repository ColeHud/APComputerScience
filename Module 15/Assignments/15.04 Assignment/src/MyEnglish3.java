/*
 * By Cole Hudson
 * Date: 3/22/2015
 * Purpose: implement the Comparable<T> interface
 * 
 * PMR in README.txt
 */
public class MyEnglish3 extends Homework3
{
	//constructor
	MyEnglish3()
	{
		super();
	}

	//implemented create assignment method
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "English";
	}

	//other methods
	//to string
	public String toString()
	{
		return typeHomework + " - must read " + pagesRead + " pages";
	}
	
	//implement doReading()
	public void doReading()
	{
		pagesRead -= 1;
	}
}
