/*
 * By Cole Hudson
 * Purpose: Calculate the fuel economy of your family or personal car for one fill-up in terms of MPG and cost
 * Date: 7 December, 2014
 * 
 * PMR in README.txt
 */
public class CarV5 
{
	//private instance variables
	private int startMiles;
	private int endMiles;
	private double gallons;
	private String typeOfCar;
	private int distance;
	private double mpg;
	private double gallonCost;
	private double totalCost;
	private double gpm;
	
	//default constructor
	CarV5(int startMiles1, int endMiles1, double gallons1, String typeOfCar1, double gallonCost1)
	{
		startMiles = startMiles1;
		endMiles = endMiles1;
		gallons = gallons1;
		typeOfCar = typeOfCar1;
		gallonCost = gallonCost1;
		
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

	//print data
	public void printData()
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
		
		//print data
		System.out.printf("%13s", typeOfCar);
		System.out.printf("%11d", startMiles);
		System.out.printf("%13d", endMiles);
		System.out.printf("%13d", distance);
		System.out.printf("%11.1f", gallons);
		System.out.printf("%9.2f", gallonCost);
		System.out.printf("%8.2f", totalCost);
		System.out.printf("%10.1f", mpg);
		System.out.printf("%12.1f", gpm);
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
	
	//main method
	public static void main(String[] args)
	{
		//construct car
		CarV5 car1 = new CarV5(98606, 98846, 13.277, "06 Toyota Sienna", 2.56);
		
		//variable methods
		car1.distance = car1.calculateDistance();
		car1.mpg = car1.calculateMPG();
		car1.totalCost = car1.totalCost(car1.gallonCost);
		car1.gpm = car1.calculateGPM();
		
		//print data
		car1.printData();
	}
}
