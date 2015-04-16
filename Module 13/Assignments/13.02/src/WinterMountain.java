/*
 * By Cole Hudson
 * Date: 2/21/2015
 * Purpose: Create a class hierarchy of simple terrains
 * 
 * PMR in README.txt
 */
public class WinterMountain extends Mountain
{
	//variable(s)
	private double temperature;
	
	//getter method(s)
	public double getTemperature()
	{
		return temperature;
	}
	
	//constructor
	WinterMountain(int x, int y, int mountains, double temp)
	{
		super(x, y, mountains);
		temperature = temp;
	}
}
