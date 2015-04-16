/*
 * By Cole Hudson
 * Date: 2/21/2015
 * Purpose: Create a class hierarchy of simple terrains
 * 
 * PMR in README.txt
 */
public class Mountain extends Terrain
{
	//variable(s)
	private int numberOfMountains;
	
	//getter method(s)
	public int getNumberOfMountains()
	{
		return numberOfMountains;
	}
	
	//constructor
	Mountain(int x, int y, int mountains)
	{
		super(x, y);
		numberOfMountains = mountains;
	}
}
