import java.util.ArrayList;

/**
 * 
 * @author Cole Hudson
 * @version 1/7/2015 
 * Purpose: Model an individual's CO2 production and reduction.
 * PMR in README.txt
 *
 */

/**
 * This class is designed to access the CO2Footprint class in order to generate an individual's footprint
 */
public class CO2FootprintTester 
{
	public static void main(String[] args)
	{
		//create array
		ArrayList<CO2Footprint> footprints = new ArrayList();
		footprints.add(new CO2Footprint(34000, 160, .15, 6, true, true, false, true, 10));
		footprints.add(new CO2Footprint(0, 200, .15, 1, true, true, true, true, 30));
		footprints.add(new CO2Footprint(50000, 150, .12, 10, true, true, true, false, 30));
		footprints.add(new CO2Footprint(60000, 200, .11, 13, false, false, false, false, 0));
		footprints.add(new CO2Footprint(10000, 100, .10, 1, true, true, true, true, 1));
		footprints.add(new CO2Footprint(48000, 200, .20, 1, true, true, true, true, 1));
		
		
		//call methods on each
		for(CO2Footprint footprint:footprints)
		{
			footprint.calcBulbReduction();
			footprint.calcElectricityEmissions();
			footprint.calcRecyclingReduction();
			footprint.calcWasteEmissions();
			footprint.calcFootprint();
		}
		
		//print header
		CO2Footprint.printHeader();
		
		//print data for each
		for(int i = 0; i < footprints.size(); i++)
		{
			footprints.get(i).printData();
			if(i == footprints.size()-1)
			{
				CO2Footprint.printButt();
			}
		}
	}
}
