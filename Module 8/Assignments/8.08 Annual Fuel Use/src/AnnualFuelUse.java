/*
 * By Cole Hudson
 * Purpose: Write a program to project your annual fuel usage based on at least three fill ups of your car
 * Date: 14 December, 2014
 * 
 * PMR in README.txt
 */
public class AnnualFuelUse {
	//variables
	private int number;
	private int day;
	private int start;
	private int end;
	private int distance;
	private double gallons;
	private double mpg;
	private double price;
	private double cost;
	
	//getters
	public int getDay()
	{
		return day;
	}
	
	public int getStart()
	{
		return start;
	}
	
	public int getEnd()
	{
		return end;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public double getGallons()
	{
		return gallons;
	}
	
	public double getMPG()
	{
		return mpg;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	//constructor
	public AnnualFuelUse(int dayVal, int startVal, int endVal, double gallonsVal, double priceVal)
	{
		day = dayVal;
		start = startVal;
		end = endVal;
		distance = end - start;
		gallons = gallonsVal;
		mpg = distance / gallons;
		price = priceVal;
		cost = price * gallons;
	}
	
	public void printData()
	{
		System.out.printf("%4d", number);
		System.out.printf("%9d", day);
		System.out.printf("%12d", start);
		System.out.printf("%13d", end);
		System.out.printf("%11d", distance);
		System.out.printf("%14.2f", gallons);
		System.out.printf("%9.1f", mpg);
		System.out.printf("%8.2f", price);
		System.out.printf("%8.2f%n", cost);
	}
	
	public static void printTitle()
	{
		System.out.printf("%-10s", "Fill Up");
		System.out.printf("%-7s", "Days");
		System.out.printf("%-14s", "Start Miles");
		System.out.printf("%-12s", "End Miles");
		System.out.printf("%-11s", "Distance");
		System.out.printf("%-15s", "Gallons Used");
		System.out.printf("%-6s", "MPG");
		System.out.printf("%-9s", "Price");
		System.out.printf("%-4s%n", "Cost");
	}
	
	//calculate fill-up number
	public static void fillUpNumber(AnnualFuelUse[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i].number = i + 1;
		}
	}
	
}
