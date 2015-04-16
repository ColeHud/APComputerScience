/*
 * @author Cole Hudson
 * By Cole Hudson
 * Purpose: Write a program to project your annual fuel usage based on at least three fill ups of your car
 * Date: 14 December, 2014
 * 
 * PMR in README.txt
 */

public class AnnualFuelUseTester {
	public static void main(String[] args)
	{
		//create array of fill-ups
		AnnualFuelUse[] fillUps = new AnnualFuelUse[4];
		
		//assign objects
		fillUps[0] = new AnnualFuelUse(1, 98561, 98606, 3.838, 2.87);
		fillUps[1] = new AnnualFuelUse(4, 98606, 98846, 13.277, 2.56);
		fillUps[2] = new AnnualFuelUse(6, 98846, 99124, 13.214, 2.42);
		fillUps[3] = new AnnualFuelUse(8, 99124, 99410, 14.205, 2.499);
		
		
		//assign numbers to fill-ups
		AnnualFuelUse.fillUpNumber(fillUps);
		
		//print title
		AnnualFuelUse.printTitle();
		
		//print data
		for(AnnualFuelUse object: fillUps)
		{
			object.printData();
		}
		
		//print the maxima and minima
		FuelExtremities.print(fillUps);
		
		//print the totals
		FuelTotals.print(fillUps);
		
		//print annual projections
		FuelAnnualProjection.print(fillUps);
		
		
	}
}
