/*
 * By Cole Hudson
 * Date: 3/15/2015
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 * PMR in README.txt
 */
public class MyEnglish extends Homework
{
	//constructor
	MyEnglish()
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
}
