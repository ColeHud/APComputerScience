/*
 * By Cole Hudson
 * 4/5/2015
 * Purpose: Add deletion methods to the election program
 * 
 * PMR in README.txt
 */
public class Candidate2 
{
	//variables
	private String name;
	private int numVotes;

	//getters
	public String getName()
	{
		return name;
	}

	public int getVotes()
	{
		return numVotes;
	}

	//setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setVotes(int numVotes)
	{
		this.numVotes = numVotes;
	}

	//constructor
	Candidate2(String name, int numVotes)
	{
		this.name = name;
		this.numVotes = numVotes;
	}

	//methods

	//to string
	public String toString()
	{
		return name + ": " + numVotes;
	}
}
