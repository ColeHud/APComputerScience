/*
 * By Cole Hudson
 * Date: 2/21/2015
 * Purpose: Create a class hierarchy of simple terrains
 * 
 * PMR in README.txt
 */
public class Forest extends Terrain
{
	//variable(s)
	private int numberOfTrees;
	
	//getter method(s)
	public int getNumberOfTrees()
	{
		return numberOfTrees;
	}
	
	//constructor
	Forest(int x, int y, int trees)
	{
		super(x, y);
		numberOfTrees = trees;
	}
}
