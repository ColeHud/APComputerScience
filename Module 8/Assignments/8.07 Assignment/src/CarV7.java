/*
 * By Cole Hudson
 * Purpose: Calculate the fuel economy of your family or personal car for one fill-up in terms of MPG and cost
 * Date: 14 December, 2014
 * 
 * PMR in README.txt
 */
public class CarV7 
{
	//private instance variables (some available to the whole package)
	private int startMiles;
	private int endMiles;
	private double gallons;
	private String typeOfCar;
	int distance;
	double mpg;
	double gallonCost;
	double totalCost;
	double gpm;
	
	//default constructor
	CarV7(int startMiles1, int endMiles1, double gallons1, String typeOfCar1, double gallonCost1)
	{
		startMiles = startMiles1;
		endMiles = endMiles1;
		gallons = gallons1;
		typeOfCar = typeOfCar1;
		gallonCost = gallonCost1;
		
		//previously in main method, but removed to reduce clutter
		distance = calculateDistance();
		mpg = calculateMPG();
		totalCost = totalCost(gallonCost);
		gpm = calculateGPM();
		
	}
	
	//calculate distance traveled
	public int calculateDistance()
	{
		return endMiles - startMiles;
	}

	//calculate the MPG
	public double calculateMPG()
	{
		return distance / gallons;
	}

	//print title
	public static void printTitle()
	{
		//print title
		System.out.printf("%61s%n", "Gas Mileage Calculations");
		System.out.printf("%13s", "  Type of Car");
		System.out.printf("%16s", "Start Miles");
		System.out.printf("%13s","End Miles" );
		System.out.printf("%12s", "Distance");
		System.out.printf("%11s", "Gallons");
		System.out.printf("%8s", "Price");
		System.out.printf("%8s", "Cost");
		System.out.printf("%12s", "Miles/Gal");
		System.out.printf("%11s%n", "Gal/Mile");
		System.out.println("========================================================================================================");
		
	}
	//print data
	public void printData()
	{
		
		//print data
		System.out.printf("%13s", typeOfCar);
		System.out.printf("%11d", startMiles);
		System.out.printf("%13d", endMiles);
		System.out.printf("%13d", distance);
		System.out.printf("%11.1f", gallons);
		System.out.printf("%9.2f", gallonCost);
		System.out.printf("%8.2f", totalCost);
		System.out.printf("%10.1f", mpg);
		System.out.printf("%10.3f%n", gpm);
	}
	
	//calculate the GPM
	public double calculateGPM()
	{
		return gallons / distance;
	}
	
	//total cost
	public double totalCost(double gallonCost)
	{
		return gallonCost * gallons;
	}
}
