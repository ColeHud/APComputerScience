/*
 * By Cole Hudson
 * Date: 3/22/2015
 * Purpose: implement the Comparable<T> interface
 * 
 * PMR in README.txt
 */
public abstract class Homework3 implements Processing, Comparable<Homework3>
{
	//variables
	public int pagesRead;
	public String typeHomework;

	//constructor
	Homework3()
	{
		pagesRead = 0;
		typeHomework = "none";
	}

	//other methods

	//create assignment
	public abstract void createAssignment(int p);
	
	//compare
	public int compareTo(Homework3 homework)
	{
		if(this.pagesRead < homework.pagesRead)
		{
			return -1;
		}
		else if(this.pagesRead == homework.pagesRead)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
