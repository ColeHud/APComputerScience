/*
 * By Cole Hudson
 * Purpose: Calculate the fuel economy of your family or personal car for one fill-up
 * Date: 7 December, 2014
 * 
 * PMR in README.txt
 */
public class CarV3 
{
	//default constructor
	CarV3()
	{
		
	}
	
	//calculate distance traveled
	public int calculateDistance(int startMiles, int endMiles)
	{
		return endMiles - startMiles;
	}

	//calculate the MPG
	public double calculateMPG(double distance, double gallons)
	{
		return distance / gallons;
	}

	//print data
	public void printData(String typeOfCar, int startMiles, int endMiles, int distance, double gallons, double mpg)
	{
		//print title
		System.out.printf("%51s%n", "Gas Mileage Calculations");
		System.out.printf("%13s", "  Type of Car");
		System.out.printf("%16s", "Start Miles");
		System.out.printf("%13s","End Miles" );
		System.out.printf("%12s", "Distance");
		System.out.printf("%11s", "Gallons");
		System.out.printf("%13s%n", "Miles/Gal");
		System.out.println("==============================================================================");
		
		//print data
		System.out.printf("%14s", typeOfCar);
		System.out.printf("%14d", startMiles);
		System.out.printf("%12d", endMiles);
		System.out.printf("%12d", distance);
		System.out.printf("%11.1f", gallons);
		System.out.printf("%12.1f", mpg);
	}
	
	//main method
	public static void main(String[] args)
	{
		//construct car
		CarV3 car1 = new CarV3();
		
		//Variables from gas mileage sheet
		int startMiles = 98561;
		int endMiles = 98606;
		double gallons = 8.383;
		String typeOfCar = "06 Toyota Sienna";
		
		//function variables
		int distance = car1.calculateDistance(startMiles, endMiles);
		double mpg = car1.calculateMPG(distance, gallons);
		
		//print data
		car1.printData(typeOfCar, startMiles, endMiles, distance, gallons, mpg);
		
	}
}
