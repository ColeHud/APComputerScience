import java.util.ArrayList;

/**
 * Purpose: Calculate the amount of carbon dioxide produced in a year from waste by your household and compare how
 * recycling can reduce your CO2 footprint.
 * @author Cole Hudson
 * @version 1/4/2015
 *
 */
public class CO2FromWasteTester 
{
	public static void main(String[] args)
	{
		//create arraylist
		ArrayList<CO2FromWaste> families = new ArrayList<CO2FromWaste>();
		
		//add families
		families.add(new CO2FromWaste(1, true, true, true, true, families));
		families.add(new CO2FromWaste(6, true, true, true, true, families));
		families.add(new CO2FromWaste(6, false, false, false, false, families));
		families.add(new CO2FromWaste(10, false, false, false, false, families));
		families.add(new CO2FromWaste(13, true, true, true, true, families));
		families.add(new CO2FromWaste(1, false, false, false, false, families));
		
		//methods on individual objects
		for(CO2FromWaste family : families)
		{
			family.assignIndex(families);
			family.calcGrossWasteEmission();
			family.calcWasteReduction();
			family.calcNetWasteEmission();
		}
		
		
		
		//print out results
		CO2FromWaste.printTitle();
		for(CO2FromWaste family : families)
		{
			family.printRow();
		}
		CO2FromWaste.printEnd();
	}
}
