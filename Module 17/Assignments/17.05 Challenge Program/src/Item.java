/*
 * By Cole Hudson
 * Date: 4/12/2015
 * Purpose: Use different sorting algorithms on various hardware items
 * 
 * PMR in README.txt
 */
public class Item 
{
	//variables
	private String itemID;
	private String itemName;
	private int inStore;
	private double price;
	
	//getters
	public String getItemID() 
	{
		return itemID;
	}
	public String getItemName() 
	{
		return itemName;
	}
	public int getInStore() 
	{
		return inStore;
	}
	public double getPrice() 
	{
		return price;
	}
	
	//setters
	public void setItemID(String itemID) 
	{
		this.itemID = itemID;
	}
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	public void setInStore(int inStore) 
	{
		this.inStore = inStore;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	//constructor
	Item(String itemID, String itemName, int inStore, double price)
	{
		this.itemID = itemID;
		this.itemName = itemName;
		this.inStore = inStore;
		this.price = price;
	}
	
	//alternate constructor
	Item()
	{
		
	}
	
	//other methods
	
	//to string
	public String toString()
	{
		return String.format("%-5s %-15s %-5d %-5.2f", itemID, itemName, inStore, price);
	}
	
}
