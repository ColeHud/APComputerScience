/**
 * Calculates the amount of carbon dioxide emitted for each gallon of gas consumed.
 * 
 * @author Cole Hudson
 * @version 1/4/2015
 *
 */
public class CO2FootprintV1 
{
	//instance variables
	private double myGallonsUsed;
	private double myTonsCO2;
	private double myPoundsCO2;
	
	//getters
	
	/**
	 * getter for myGallonsUsed
	 * @return myGallonsUsed - gallons used in one year.
	 */
	public double getMyGallonsUsed() 
	{
		return myGallonsUsed;
	}

	/**
	 * getter for myTonsCO2
	 * @return myTonsCO2 - tons of CO2
	 */
	public double getMyTonsCO2() 
	{
		return myTonsCO2;
	}
	
	/**
	 * getter for myPoundsCO2
	 * @return myPoundsCO2 - Pounds of CO2
	 */
	public double getMyPoundsCO2() 
	{
		return myPoundsCO2;
	}
	
	
	/**
	 * Creates a CO2FootprintV1 Object
	 * @param gals - number of gallons used in one year 
	 */
	public CO2FootprintV1(double gals)
	{
		//set instance variables
		myGallonsUsed = gals;
		calcTonsCO2(myGallonsUsed);
		convertTonsToPoundsCO2(myTonsCO2);
	}
	
	/**
	 * Calculates the number of tons of CO2 from the number of gallons used.
	 * @param myGallonsUsed - number of gallons used in one year
	 */
	public void calcTonsCO2(double myGallonsUsed)
	{
		myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
	}
	
	/**
	 * Converts tons to pounds
	 * @param tons - tons of CO2
	 */
	public void convertTonsToPoundsCO2(double tons)
	{
		myPoundsCO2 = tons * 2204.62;
	}
	
	/**
	 * Prints out the data
	 */
	public void printFootprint()
	{
		System.out.printf("%24s%n", "CO2 Emissions");
		
		System.out.printf("%-10s", "Gallons");
		System.out.printf("%-11s", "Pounds");
		System.out.printf("%-6s%n", "Tons");
		
		System.out.printf("%-9s", "of Gas");
		System.out.printf("%-10s", "from Gas");
		System.out.printf("%-6s%n", "from Gas");
		
		System.out.printf("***************************%n");
		
		System.out.printf("%-9.1f", myGallonsUsed);
		System.out.printf("%-11.2f", myPoundsCO2);
		System.out.printf("%-7.3f", myTonsCO2);
		
		
		
	}
}
