//By Cole Hudson
//calculates the annual projection
public class FuelAnnualProjection 
{	
	//distance
	public static int distance(AnnualFuelUse[] array)
	{
		int maxDay = FuelExtremities.maximumDay(array);
		//             number of days              distance over that time
		return (int)((365 / maxDay) * FuelTotals.totalDistance(array));
	}
	
	//annual fuel use projection
	public static double gallons(AnnualFuelUse[] array)
	{
		int maxDay = FuelExtremities.maximumDay(array);
		return (int)((365 / maxDay) * FuelTotals.totalGallons(array));
	}
	
	//annual mpg projection
	public static double mpg(AnnualFuelUse[] array)
	{
		int maxDay = FuelExtremities.maximumDay(array);
		return (int)((365 / maxDay) * FuelTotals.totalMPG(array));
	}
	
	//total cost
	public static double cost(AnnualFuelUse[] array)
	{
		int maxDay = FuelExtremities.maximumDay(array);
		return ((365 / maxDay) * FuelTotals.totalCost(array));
	}
	
	//print
	public static void print(AnnualFuelUse[] array)
	{
		System.out.printf("%18s", "Annual Projection:");
		System.out.printf("%31d", distance(array));
		System.out.printf("%14.2f", gallons(array));
		System.out.printf("%9.2f", distance(array) / gallons(array));
		System.out.printf("%16.2f", cost(array));
	}
}
