/**
 *
 * @author Cole Hudson
 * @version 1/7/2015 
 * Purpose: Model an individual's CO2 production and reduction
 * PMR in README.txt
 *
 */

/**
 * This class is the data type for an individual's CO2Footprint
 */
public class CO2Footprint 
{
	//constructor variables -used in calculations
	double annualGasolineUsed;
	double avgElectricBill;
	double avgElectricPrice;
	int people;
	boolean recyclePaper;
	boolean recyclePlastic;
	boolean recycleGlass;
	boolean recycleCans;
	int lightbulbsReplaced;
	
	//other variables -to be printed to the screen
	double totalElectricEmissions;
	double totalWaste;
	double recyclingReduction;
	double newBulbsReduction;
	double CO2Footprint;
	
	/**
	 * constructor to create a CO2Footprint object 
	 */
	CO2Footprint(int _annualGasolineUsed, int _avgElectricBill, double _avgElectricPrice, int _people, boolean _recyclePaper, boolean _recyclePlastic, boolean _recycleGlass, boolean _recycleCans, int _lightbulbsReplaced)
	{
		annualGasolineUsed = _annualGasolineUsed;
		avgElectricBill = _avgElectricBill;
		avgElectricPrice = _avgElectricPrice;
		people = _people;
		recyclePaper = _recyclePaper;
		recyclePlastic = _recyclePlastic;
		recycleCans = _recycleCans;
		lightbulbsReplaced = _lightbulbsReplaced;
	}
	
	//calcElectricityEmissions
	public void calcElectricityEmissions()
	{
		totalElectricEmissions = (avgElectricBill / avgElectricPrice) * 1.37 * 12;
	}
	
	//calcWasteEmissions
	public void calcWasteEmissions()
	{
		totalWaste = 1018.0 * people;
	}
	
	//calcRecyclingReduction
	public void calcRecyclingReduction()
	{
		if(recyclePaper)
		{
			recyclingReduction += 184.0 * people;
		}
		if(recyclePlastic)
		{
			recyclingReduction += 25.6 * people;
		}
		if(recycleGlass)
		{
			recyclingReduction += 46.6 * people;
		}
		if(recycleCans)
		{
			recyclingReduction += 165.8 * people;
		}
	}
	
	//calculate the reduction based on number of bulbs replaced
	public void calcBulbReduction()
	{
		newBulbsReduction = (double)lightbulbsReplaced * 1.37 * 73.0;
	}
	
	//calculates total footprint
	public void calcFootprint()
	{
		CO2Footprint = annualGasolineUsed + totalElectricEmissions + totalWaste - recyclingReduction - newBulbsReduction;
	}
	
	//prints individual data in table <tr>
	public void printData()
	{
		System.out.printf("|  %8.2f  |", annualGasolineUsed);
		System.out.printf("%14.2f   |", totalElectricEmissions);
		System.out.printf("%9.2f  |", totalWaste);
		System.out.printf("%11.2f   |", recyclingReduction);
		System.out.printf("%11.1f   |", newBulbsReduction);
		System.out.printf("%15.2f   |%n", CO2Footprint);
	}
	
	//prints the head of the table
	public static void printHeader()
	{
		System.out.printf("|                Pounds of CO2             |       Pounds of CO2         |                  |%n");
		System.out.printf("|                Emmitted from             |       Reduced from          |                  |%n");
		System.out.printf("|    Gas     |    Electricity  |   Waste   |   Recycling  |   New Bulbs  |   CO2 Footprint  |%n");
		System.out.printf("|============|=================|===========|==============|==============|==================|%n");
		
	}
	
	//prints the end of the table
	public static void printButt()
	{
		System.out.printf("=============================================================================================%n");
	}
}
