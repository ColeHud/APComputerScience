/*
 * By Cole Hudson
 * Date: 4/26/2015
 * Purpose: Use assertions and exceptions to create a candy machine
 * 
 * PMR in README.txt
 */
public class CandyMachine 
{
	//main
	public static void main(String[] args)
	{
		//create the dispenser and the cash register
		Dispenser dispenser = new Dispenser(100, 50);
		CashRegister cashRegister = new CashRegister();
		
		//print starting stats
		System.out.println("Dispenser: " + dispenser.getCount() + " items, " + " each costing " + dispenser.getProductionCost() + " cents");
		System.out.println("Cash Register: " + cashRegister.getCashOnHand() + " cents");
		System.out.println();
		
		//sell some products
		sellProduct(dispenser, cashRegister, 10);
		System.out.println();
		
		//print the stats
		System.out.println("Dispenser: " + dispenser.getCount() + " items, " + " each costing " + dispenser.getProductionCost() + " cents");
		System.out.println("Cash Register: " + cashRegister.getCashOnHand() + " cents");
	}
	
	//sell product
	public static void sellProduct(Dispenser dispenser, CashRegister cashRegister, int amount)
	{
		System.out.println("Made sale: " + amount + " items");
		
		//make sales from the dispenser
		for(int i = 0; i < amount; i++)
		{
			dispenser.makeSale();
		}
		
		//accept the funds
		cashRegister.acceptAmount(amount * dispenser.getProductionCost());
	}
}
