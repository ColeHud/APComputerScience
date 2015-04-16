//By Cole Hudson
//calculate the totals 
public class FuelTotals 
{
	//total distance
	public static int totalDistance(AnnualFuelUse[] array)
	{
		int totalDistance = 0;
		for(AnnualFuelUse object: array)
		{
			totalDistance += object.getDistance();
		}
		return totalDistance;
	}
	
	//total gallons used
	public static double totalGallons(AnnualFuelUse[] array)
	{
		double totalGallons = 0;
		for(AnnualFuelUse object: array)
		{
			totalGallons += object.getGallons();
		}
		return totalGallons;
	}
	
	//total cost
	public static double totalCost(AnnualFuelUse[] array)
	{
		double totalCost = 0;
		for(AnnualFuelUse object: array)
		{
			totalCost += object.getCost();
		}
		return totalCost;
	}
	
	//total mpg
	public static double totalMPG(AnnualFuelUse[] array)
	{
		double totalMPG = 0;
		for(AnnualFuelUse object: array)
		{
			totalMPG += object.getMPG();
		}
		return (double)totalMPG;
	}
	
	//print
	public static void print(AnnualFuelUse[] array)
	{
		System.out.printf("%-46s", "Totals:");
		System.out.printf("%-12d", totalDistance(array));
		System.out.printf("%-24.2f", totalGallons(array));
		System.out.printf("%-9.2f%n", totalCost(array));
	}
}
