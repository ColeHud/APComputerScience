/**
 * Calculate CO2 footprint based on the amount of electricity used in your home each year.
 * @author Cole Hudson
 * @version 1/4/2015
 */
public class CO2FromElectricityTester 
{
	/**
	 * Main method - creates object and executes methods on it
	 */
	public static void main(String[] args)
	{
		//variables
		double[] monthlyBill = {87.67, 83.47, 64.3, 51.01, 49.27, 52.17, 123.40, 106.14, 77.56, 96.31, 44.78, 181.38};
		double[] monthlyPrice = {.149, .149, .149, .149, .149, .149, .149, .149, .149, .149, .149, .149};
		
		CO2FromElectricity electricity = new CO2FromElectricity(monthlyBill, monthlyPrice);
		
		//methods 
		electricity.calcAverageBill(electricity.getMonthlyBill());
		electricity.calcAveragePrice(electricity.getMonthlyPrice());
		electricity.calcElectricityCO2(electricity.getAvgBill(), electricity.getAvgPrice());
		
		//print
		electricity.printData();
	}
}
