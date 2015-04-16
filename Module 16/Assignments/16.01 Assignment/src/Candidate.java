/*
 * By Cole Hudson
 * Date: 3/26/2015
 * Purpose: Use traversal methods for voting
 * 
 * PMR in README.txt
 */
public class Candidate 
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
	
	//constructor
	Candidate(String name, int numVotes)
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
