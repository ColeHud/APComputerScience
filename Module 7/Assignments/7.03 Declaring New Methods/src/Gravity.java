
/*
 * Purpose: Write a program to determine the surface gravity on each planet in our solar system.
 * Author: Cole Hudson
 * Date: 11/23/2014
 * PMR in README.txt
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravity
{
	// calcGravity returns an array of doubles containing the gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass
	public static double[] calcGravity(double[] radius, double[] mass)
	{
		// fill in code here
		// The formula to calculate gravity is:
		// 6.67E-17 times the massOfPlanet divided by the radius of the planet squared
		double[] gravity = new double[mass.length];
		for(int i = 0; i < mass.length; i++)
		{
			gravity[i] = (6.67E-17 * mass[i]) / Math.pow(radius[i], 2);
		}
		
		return gravity;
	}

	
	// printResults will print the table to output screen
	// return type is void because no values are returned
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
		//print header
		System.out.printf("%38s%n", "Planetary Data");
		System.out.printf("  ");
		System.out.printf("%-13s", "Planet");
		System.out.printf("%-19s", "Diameter (km)");
		System.out.printf("%-15s", "Mass (kg)");
		System.out.printf("%9s%n", "g (m/s^2)");
		System.out.println("____________________________________________________________");
		
		//print out data
		for(int i = 0; i < name.length; i++)
		{
			System.out.printf("  ");
			System.out.printf("%-17s", name[i]);
			System.out.printf("%-15.1f", (radius[i] * 2));
			System.out.printf("%-18.2E", mass[i]);
			System.out.printf("%-7.2f%n", gravity[i]);
		}
	}

	//print the gravity values to text file
	public static void printToFile(double[] gravity)throws IOException
	{
		// fill in code here
		PrintWriter print = new PrintWriter(new File("gravity.txt"));
		for(double gravityValue: gravity)
		{
			print.printf("%.2f%n",gravityValue);
		}
		print.close();
	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
		double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26), 1.312 * Math.pow(10,22)};
        // or using big E notation:
		// double [] mass = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22}; // See IMACS double lesson for big E notation

		// Processing
		double[] gravities = calcGravity(radii, masses);

		// Output
		printResults(names, radii, masses, gravities);
		printToFile(gravities);


    } //end main
}//end class