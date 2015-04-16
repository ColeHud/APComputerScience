/*
 * By Cole Hudson
 * Date: 2/21/2015
 * Purpose: Create a class hierarchy of simple terrains
 * 
 * PMR in README.txt
 */
public class Terrain 
{
	//variables
	private int dimensionX;
	private int dimensionY;
	
	//getters
	public int getDimensionX()
	{
		return dimensionX;
	}
	
	public int getDimensionY()
	{
		return dimensionY;
	}
	
	//constructor
	Terrain(int x, int y)
	{
		dimensionX = x;
		dimensionY = y;
	}
}
