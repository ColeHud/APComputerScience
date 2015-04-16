/*
 * By Cole Hudson
 * Date: 3/15/2015
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 * PMR in README.txt
 */
public abstract class Homework 
{
	//variables
	public int pagesRead;
	public String typeHomework;
	
	//constructor
	Homework()
	{
		pagesRead = 0;
		typeHomework = "none";
	}
	
	//other methods
	
	//create assignment
	public abstract void createAssignment(int p);
	
}
