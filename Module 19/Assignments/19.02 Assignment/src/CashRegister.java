/*
 * By Cole Hudson
 * Date: 4/26/2015
 * Purpose: Use assertions and exceptions to create a candy machine
 * 
 * PMR in README.txt
 */
public class CashRegister 
{
	//instance variables
	private int cashOnHand;
	
	//getter
	public int getCashOnHand()
	{
		return cashOnHand;
	}
	
	//default constructor
	CashRegister()
	{
		cashOnHand = 500;
	}
	
	//alternate
	CashRegister(int cashOnHand)
	{
		if(cashOnHand < 0)
		{
			throw new IllegalArgumentException("cash on hand can't be less than zero");
		}
		
		this.cashOnHand = cashOnHand;
	}
	
	//other methods
	
	//set cash
	public void setCashOnHand(int cashOnHand)
	{
		if(cashOnHand < 0)
		{
			throw new IllegalArgumentException("cash on hand can't be less than zero");
		}
		
		this.cashOnHand = cashOnHand;
	}
	
	//accept amount
	public void acceptAmount(int amount)
	{
		if(amount < 0)
		{
			throw new IllegalArgumentException("We don't accept negative amounts here");
		}
		
		cashOnHand += amount;
	}
}
