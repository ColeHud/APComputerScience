/*
 * By Cole Hudson
 * Date: 2/26/2015
 * Purpose: Create footwear representation for eimacs lab 4
 * 
 * PMR in README.txt
 */
public class Footwear 
{
	//variables
	private String myStyle;
	private double mySize;
	private String mySKU;
	
	//accessor methods
	public String getStyle()
	{
		return myStyle;
	}
	
	public double getSize()
	{
		return mySize;
	}
	
	public String getSKU()
	{
		return mySKU;
	}
	
	public String getType()
	{
		return "Unspecified";
	}
	
	//constructor
	Footwear(String style, double size, String sku)
	{
		myStyle = style;
		mySize = size;
		mySKU = sku;
	}
	
	//methods
	
	//print size
	public String printSize()
	{
		int whole = (int)mySize;
		int round = (int) Math.round(mySize);
		
		if(round - whole > 0)
		{
			return whole + "\u00bd";
		}
		else
		{
			return whole + "";
		}
	}
	
	//to string
	public String toString()
	{
		if(getType().equals("Unspecified"))
		{
			return myStyle + " (size " + printSize() + ")";
		}
		else
		{
			return getType() + " - " + myStyle + " (size " + printSize() + ")";
		}
		
	}
}
