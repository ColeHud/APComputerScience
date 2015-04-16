/*
 * By Cole Hudson
 * Date: 3/17/2015
 * Purpose: add an interface to process pages from your homework
 * 
 * PMR in README.txt
 */
public abstract class Homework2 implements Processing
{
	//variables
	public int pagesRead;
	public String typeHomework;

	//constructor
	Homework2()
	{
		pagesRead = 0;
		typeHomework = "none";
	}

	//other methods

	//create assignment
	public abstract void createAssignment(int p);
}
