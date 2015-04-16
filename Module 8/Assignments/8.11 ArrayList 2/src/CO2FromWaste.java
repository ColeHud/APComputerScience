import java.util.ArrayList;

/**
 * Purpose: Calculate the amount of carbon dioxide produced in a year from waste by your household and compare how
 * recycling can reduce your CO2 footprint.
 * @author Cole Hudson
 * @version 1/4/2015
 *
 */
public class CO2FromWaste 
{
	//instance variables
	private int index;
	private int people;
	private boolean paper;
	private boolean plastic;
	private boolean glass;
	private boolean cans;
	private double totalEmission;
	private double reduction;
	private double netEmission;
	
	/**
	 * Constructor
	 * @param numPeople - number of people
	 * @param paper - recycles paper?
	 * @param plastic - recycles plastic?
	 * @param glass - recycles glass?
	 * @param cans - recycles cans?
	 */
	CO2FromWaste(int numPeople, boolean _paper, boolean _plastic, boolean _glass, boolean _cans, ArrayList<CO2FromWaste> parent)
	{
		people = numPeople;
		paper = _paper;
		plastic = _plastic;
		glass = _glass;
		cans = _cans;
		
		index = parent.indexOf(this);
		
	}
	
	//calculate the emission depending on the number of people
	public void calcGrossWasteEmission()
	{
		totalEmission = people * 1018.0;
	}
	
	//calculate the waste reduction based on recycling
	public void calcWasteReduction()
	{
		double wasteReduction = 0.0;
		
		if(paper)
		{
			wasteReduction += 184.0 * people;
		}
		if(plastic)
		{
			wasteReduction += 25.6 * people;
		}
		if(glass)
		{
			wasteReduction += 46.6 * people;
		}
		if(cans)
		{
			wasteReduction += 165.8 * people;
		}
		
		reduction = wasteReduction;
	}
	
	//figure in recycling to the total emission
	public void calcNetWasteEmission()
	{
		netEmission = totalEmission - reduction;
	}
	
	//print row
	public void printRow()
	{
		System.out.printf("%s%4d%s", "|", index, "   |");
		System.out.printf("%5d%s", people, "   |   ");
		System.out.printf("%-7b%s", paper, "|  ");
		System.out.printf("%-8b%s", plastic, "|   ");
		System.out.printf("%-7b%s", glass, "|  ");
		System.out.printf("%-7b%s", cans, "|  ");
		System.out.printf("%-10.2f%s", totalEmission, "|");
		System.out.printf("%10.2f%s", reduction, "   |");
		System.out.printf("%10.2f%s%n", netEmission, "  |");
		
	}
	
	//assign index
	public void assignIndex(ArrayList<CO2FromWaste> array)
	{
		index = array.indexOf(this);
	}
	
	
	
	
	//print title
	public static void printTitle()
	{
		System.out.printf("|       |        |                                          |             Pounds of CO2             |%n");
		System.out.printf("|       |        |       Household Waste Recycled           |   Total    |             |     Net    |%n");
		System.out.printf("| Index | People |  Paper   |  Plastic |  Glass   |  Cans   |  Emission  |  Reduction  |  Emission  |%n");
		System.out.printf("|-------|--------|----------|----------|----------|---------|------------|-------------|------------|%n");
	}
	
	//print end
	public static void printEnd()
	{
		System.out.printf("|-------|--------|----------|----------|----------|---------|------------|-------------|------------|");
	}
	
}
