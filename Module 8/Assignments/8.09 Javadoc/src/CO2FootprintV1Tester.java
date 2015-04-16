/**
 * This class tests and calls the methods on the CO2FootprintV1 Class object to calculate the amount of carbon dioxide emitted for each gallon of gas consumed.
 * 
 * @author Cole Hudson
 * @version 1/4/2015
 *
 */
public class CO2FootprintV1Tester 
{
	/**
	 * Main method of program
	 * @param args - array of strings
	 */
	public static void main(String[] args)
	{
		//create CO2 Footprint
		CO2FootprintV1 footprint = new CO2FootprintV1(2004.0);
		
		//call methods on object
		footprint.calcTonsCO2(footprint.getMyGallonsUsed());
		footprint.convertTonsToPoundsCO2(footprint.getMyTonsCO2());
		
		//print out data
		footprint.printFootprint();
	}
}
