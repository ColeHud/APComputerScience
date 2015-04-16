
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
 * 
 * @author Cole Hudson
 * Used to create objects of the catapult class
 *
 */
public class CatapultTester 
{
	public static void main(String[] args)
	{
		//create a new table with the given dimensions and values
		Catapult table = new Catapult(25, 20, 10, 10, 5, 5);
		
		//print out this table
		table.printResults();
	}
}
