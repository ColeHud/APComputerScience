/*
 * By Cole Hudson
 * Date: 2/19/2015
 * Purpose: Create a triangle class
 */
public class Triangle 
{
	//variables
	private double sideA;
	private double sideB;
	private double sideC;
	
	//getter methods
	public double getSideA() 
	{
		return sideA;
	}

	public double getSideB() 
	{
		return sideB;
	}

	public double getSideC() 
	{
		return sideC;
	}

	//constructor
	Triangle(double a, double b, double c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}
}
