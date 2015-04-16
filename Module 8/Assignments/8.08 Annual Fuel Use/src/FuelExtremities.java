//By Cole Hudson
//this class contains all of the fuel extremity methods
public class FuelExtremities 
{
	//maxima and minima
	//distance
	public static int minimumDistance(AnnualFuelUse[] array)
	{
		int minimum = Integer.MAX_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getDistance() < minimum)
			{
				minimum = object.getDistance();
			}
		}
		return minimum;
	}
	
	public static int maximumDistance(AnnualFuelUse[] array)
	{
		int maximum = Integer.MIN_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getDistance() > maximum)
			{
				maximum = object.getDistance();
			}
		}
		return maximum;
	}
	
	//mpg
	public static double minimumMPG(AnnualFuelUse[] array)
	{
		double minimum = Double.MAX_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getMPG() < minimum)
			{
				minimum = object.getMPG();
			}
		}
		return minimum;
	}
	
	public static double maximumMPG(AnnualFuelUse[] array)
	{
		double maximum = Double.MIN_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getMPG() > maximum)
			{
				maximum = object.getMPG();
			}
		}
		return maximum;
	}
	
	//price
	public static double minimumPrice(AnnualFuelUse[] array)
	{
		double minimum = Double.MAX_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getPrice() < minimum)
			{
				minimum = object.getPrice();
			}
		}
		return minimum;
	}
	
	public static double maximumPrice(AnnualFuelUse[] array)
	{
		double maximum = Double.MIN_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getPrice() > maximum)
			{
				maximum = object.getPrice();
			}
		}
		return maximum;
	}
	
	//max day
	public static int maximumDay(AnnualFuelUse[] array)
	{
		int maximum = Integer.MIN_VALUE;
		for(AnnualFuelUse object: array)
		{
			if(object.getDay() > maximum)
			{
				maximum = object.getDay();
			}
		}
		return maximum;
	}
	
	//print
	public static void print(AnnualFuelUse[] array)
	{
		System.out.println();
		System.out.println();
		//min
		System.out.printf("%-46s", "Minimum:");
		System.out.printf("%-22d", minimumDistance(array));
		System.out.printf("%-8.1f", minimumMPG(array));
		System.out.printf("%-4.2f%n", minimumPrice(array));
		//max
		System.out.printf("%-46s", "Maximum:");
		System.out.printf("%-22d", maximumDistance(array));
		System.out.printf("%-8.1f", maximumMPG(array));
		System.out.printf("%-4.2f", maximumPrice(array));
		System.out.println();
		System.out.println();
	}
}
