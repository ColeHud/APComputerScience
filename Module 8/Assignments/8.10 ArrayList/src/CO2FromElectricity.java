import java.util.ArrayList;

/**
 * Calculate CO2 footprint based on the amount of electricity used in your home each year.
 * @author Cole Hudson
 * @version 1/4/2015
 */
public class CO2FromElectricity 
{
	//instance variables
	private ArrayList<Double> monthlyBill = new ArrayList<Double>();
	private ArrayList<Double> monthlyPrice = new ArrayList<Double>();
	private double avgBill;
	private double avgPrice;
	private double emissions;
	private int months;

	
	//getters
	public ArrayList<Double> getMonthlyBill() {
		return monthlyBill;
	}

	public ArrayList<Double> getMonthlyPrice() {
		return monthlyPrice;
	}

	public double getAvgBill() {
		return avgBill;
	}

	public double getAvgPrice() {
		return avgPrice;
	}

	public double getEmissions() {
		return emissions;
	}

	/**
	 * Default constructor to create an object from the CO2FromElectricity class.
	 */
	CO2FromElectricity()
	{
		months = 12;
	}
	
	CO2FromElectricity(double[] monthlyBill, double[] monthlyPrice)
	{
		this.addToMonthlyBill(monthlyBill);
		this.addToMonthlyPrice(monthlyPrice);
		months = monthlyBill.length;
	}
	
	
	
	
	
	
	/**
	 * Add in an array to the ArrayLists for the monthly bill
	 * @param array - array of monthly bills
	 */
	public void addToMonthlyBill(double[] array)
	{
		for(double item: array)
		{
			monthlyBill.add(item);
		}
	}
	
	/**
	 * Add in an array to the ArrayLists for the monthly price
	 * @param array - array of monthly price
	 */
	public void addToMonthlyPrice(double[] array)
	{
		for(double item: array)
		{
			monthlyPrice.add(item);
		}
	}
	
	
	
	
	
	
	/**
	 * A mutator method that calculates the average annual electricity bill
	 * @param monthlyBill - an Arraylist containing the monthly bills for home electricity use.
	 * @return The average monthly electricity bill
	 */
	public double calcAverageBill(ArrayList<Double> monthlyBill)
	{
		double averageBill = 0.0;
		for(double bill: monthlyBill)
		{
			averageBill += bill;
		}
		averageBill /= monthlyBill.size();
		avgBill = averageBill;
		return averageBill;
	}
	
	/**
	 * A mutator method that calculates the average annual price of electricity
	 * @param monthlyPrice - an Arraylist containing the monthly price of electricity per kilowatthour.
	 * @return The average monthly price of electricity.
	 */
	public double calcAveragePrice(ArrayList<Double> monthlyPrice)
	{
		double averagePrice = 0.0;
		for(double price: monthlyPrice)
		{
			averagePrice += price;
		}
		averagePrice /= monthlyPrice.size();
		avgPrice = averagePrice;
		return averagePrice;
	}
	
	
	
	
	
	
	/**
	 * A mutator method that calculates the annual home CO2 emission from electricity
	 * @param avgBill - The average monthly home electricity bill.
	 * @param avgPrice - The average monthly price of home electricity.
	 * @param months - number of months of sample
	 * @return The annual home CO2 emission from home electricity use.
	 */
	public double calcElectricityCO2(double avgBill, double avgPrice)
	{
		emissions = (avgBill / avgPrice) * 1.37 * 12;
		return (avgBill / avgPrice) * 1.37 * months;
	}

	
	
	
	
	/**
	 * Print the data
	 */
	public void printData()
	{
		System.out.printf("%s", "Average Monthly Electricity Bill:  ");
		System.out.printf("%-10.2f%n", avgBill);
		
		System.out.printf("%s", "Average Monthly Electricity Price:  ");
		System.out.printf("%-10.2f%n", avgPrice);
		
		System.out.printf("%s", "Annual CO2 Emissions from Electricity Usage:  ");
		System.out.printf("%1.1f", emissions);
		System.out.printf(" %s", "pounds");
	}
	
	
	
	
}
