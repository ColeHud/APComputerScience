/*
 * By Cole Hudson
 * Date: 4/26/2015
 * Purpose: Use assertions and exceptions to create a candy machine
 * 
 * PMR in README.txt
 */
public class Dispenser 
{
	//instance variables
	private int numberOfItems;
	private int cost;
	
	//getters
	public int getCount() 
	{
		return numberOfItems;
	}
	
	public int getProductionCost() 
	{
		return cost;
	}
	
	//setters
	public void setNumberOfItem(int numberOfItems) 
	{
		this.numberOfItems = numberOfItems;
	}
	
	public void setCost(int cost) 
	{
		this.cost = cost;
	}
	
	//default constructor
	Dispenser()
	{
		this.numberOfItems = 50;
		this.cost = 50;
	}
	
	//alternate
	Dispenser(int numberOfItems, int cost)
	{
		if(numberOfItems < 0 || cost < 0)
		{
			throw new IllegalArgumentException("Arguments to a dispenser can't be less than zero");
		}
		
		this.numberOfItems = numberOfItems;
		this.cost = cost;
	}
	
	//other methods
	
	//makeSale
	public void makeSale()
	{
		if(numberOfItems == 0)
		{
			System.out.println("Sorry, out of products :(");
			return;
		}
		
		this.numberOfItems--;
	}
}
