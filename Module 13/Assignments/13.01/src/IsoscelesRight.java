/*
 * By Cole Hudson
 * Date: 2/19/2015
 * Purpose: Create a class to represent right isosceles triangles that extends the triangle class
 */
public class IsoscelesRight extends Triangle
{
	//constructor
	IsoscelesRight(double l) 
	{
		super(l, l, l * Math.sqrt(2));
	}

}
