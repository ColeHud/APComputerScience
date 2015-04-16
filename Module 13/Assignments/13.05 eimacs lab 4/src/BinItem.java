/*
 * By Cole Hudson
 * Date: 2/28/2015
 * Purpose: eimacs lab4
 * 
 * PMR in README.txt
 */
public class BinItem 
{
	//variables
	private String mySKU;
	private int myQuantity;

	//getter methods
	public String getSKU()
	{
		return mySKU;
	}

	public int getQuantity()
	{
		return myQuantity;
	}

	//constructor
	BinItem(String sku, int quantity)
	{
		mySKU = sku;
		myQuantity = quantity;
	}

	//other methods

	//toString()
	public String toString()
	{
		return "SKU " + mySKU + ": " + myQuantity;
	}
}
