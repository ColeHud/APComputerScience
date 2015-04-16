
/**
 * 
 * @author Cole Hudson
 * @version 1/21/2015
 *
 * Purpose: calculate the trajectory of a projectile based on launch angles and launch velocities.
 * 
 * PMR in README.txt
 */

/**
 * This class creates an array of values that are calculated using the different degrees and velocities in the constructor.
 */
public class Catapult 
{
	//variables
	public double[][] output;
	public int[] degrees;
	public int[] velocities;
	
	public int degreesNumber;
	public int velocitiesNumber;

	//constructor
	
	/**
	 * Constructor for a catapult table
	 * 
	 * @param startDegree - the starting value for degrees
	 * @param startVelocity - the starting value for velocity
	 * @param numberOfDegrees - number of degrees to be used
	 * @param numberOfVelocities - number of velocities to be used
	 * @param degreeIncrement - the value by which to increment each degree
	 * @param velocityIncrement - the value ny which to increment each velocity
	 */
	Catapult(int startDegree, int startVelocity, int numberOfDegrees, int numberOfVelocities, int degreeIncrement, int velocityIncrement)
	{
		degreesNumber = numberOfDegrees;
		velocitiesNumber = numberOfVelocities;
		
		//initialize the degrees and velocities arrays
		degreesInit(startDegree, numberOfDegrees, degreeIncrement);
		velocitiesInit(startVelocity, numberOfVelocities, velocityIncrement);
		
		//calculate the ranges
		calculateOutput();
	}

	//degrees array initializer
	
	/**
	 * Creates the array of degrees
	 * 
	 * @param start - the starting value for degrees
	 * @param number - the total number of degrees
	 * @param increment - the value by which to increment the degrees
	 */
	public void degreesInit(int start, int number, int increment)
	{
		degrees = new int[number];
		
		
		int index = 0;
		for(int i = start; index < degrees.length; i += increment)
		{
			degrees[index] = i;
			index++;
		}
	}

	//velocities array initializer
	/**
	 * creates the array of velocities
	 * 
	 * @param start - the starting value for velocities
	 * @param number - the number of velocities
	 * @param increment - the value by which to increment velocities
	 */
	public void velocitiesInit(int start, int number, int increment)
	{
		velocities = new int[number];

		int index = 0;
		for(int i = start; index < number; i += increment)
		{
			velocities[index] = i;

			index++;
		}
	}

	//calculate output array
	/**
	 * Calculates the two dimensional array of distances 
	 */
	public void calculateOutput()
	{
		output = new double[velocitiesNumber][degreesNumber];
		
		//assign each cell a value
		for(int y = 0; y < velocitiesNumber; y++)
		{
			for(int x = 0; x < degreesNumber; x++)
			{
				double velocity = velocities[y];
				double degree = degrees[x];
				double radians = Math.toRadians(degree);
				double gravity = 9.8;
				double sineOfTwoTheta = Math.sin(2 * radians);
				double velocitySquared = Math.pow(velocity, 2);
				
				double range = (velocitySquared * sineOfTwoTheta) / gravity;
				
				output[y][x] = range;
			}
		}
	}


	//print the results
	/**
	 * prints the results of the calculations in an orderly table
	 */
	public void printResults()
	{
		//header
		System.out.printf("%58s%n", "Projectile Distance (feet)");
		System.out.printf("%-12s", "   MPH");
		
		//print out the degrees
		for(int degree : degrees)
		{
			System.out.printf("%-12s", degree + " deg");
		}
		
		//print out lines
		System.out.printf("%n============");
		for(int i = 0; i < degrees.length; i++)
		{
			System.out.printf("============");
		}
		System.out.println();
		
		
		//data
		for(int y = 0; y < velocities.length; y++)
		{
			//print the row header
			System.out.printf("%-12s", "    " + velocities[y] + " | ");
			
			for(int x = 0; x < degrees.length; x++)
			{
				System.out.printf("%-9.2f %-2s", output[y][x], ", ");
			}
			
			System.out.println();
		}
	}
	
	
	
}
