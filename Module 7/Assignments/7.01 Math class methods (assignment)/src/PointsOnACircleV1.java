/*
 * By Cole Hudson
 * Date: 11-19-2014
 * Version 1
 * PMR in README.txt
 * Purpose: Write a program to calculate the (x, y) coordinates of points on a circle of radius 1.0. 
 */
public class PointsOnACircleV1 {
	public static void main(String[] args)
	{
		//variables for radius and the given interval
		double radius = 1.0;
		double xInterval = .1;
		
		//Calculate the number of indices & create the arrays to store the values
		int numberOfIndices = (int) (((2 * radius) / xInterval) + 1);
		double[] xValues = new double[numberOfIndices];
		double[] yValues = new double[numberOfIndices];
		
		//calculate the x values
		double xVal = radius;
		for(int i = 0; i < numberOfIndices; i ++)
		{
			xValues[i] = xVal;
			xVal -= xInterval;
		}
		
		//calculate the y values
		double yVal = 0.0;
		for(int i = 0; i < numberOfIndices; i ++)
		{
			yVal = Math.sqrt(Math.pow(radius, 2) - Math.pow(xValues[i], 2));
			yValues[i] = yVal;
		}
		
		//create the negative y values (other side of the circle)
		double[] negYvalues = new double[numberOfIndices];
		for(int i = 0; i < numberOfIndices; i++)
		{
			negYvalues[i] = - yValues[i];
		}
		
		//print out the header
		System.out.printf("%32s%.1f%n", "Points on a Circle of Radius ", radius);
		System.out.printf("   %-8s", "x1");
		System.out.printf("%-14s", "y1");
		System.out.printf("%-8s", "x1");
		System.out.printf("%-8s%n", "y2");
		for(int i=0; i<38; i++){System.out.print("-");}
		System.out.println();
		
		//print the data
		for(int i = 0; i < numberOfIndices; i++)
		{
			//x1
			System.out.printf("%6.2f    ", xValues[i]);
			//y1
			System.out.printf("%-12.2f", yValues[i]);
			//bottom half of the circle
			//x1 (again)
			System.out.printf("%6.2f", xValues[i]);
			//y2
			System.out.printf("   %2.2f", negYvalues[i]);
			System.out.println();
		}
		
		
	}
}
