/*
 * By Cole Hudson
 * Date: 2/26/2015
 * Purpose: Create footwear representation for eimacs lab 4
 * 
 * PMR in README.txt
 */
public class Shoe extends Footwear
{
	//variables

	//getters

	//constructor
	Shoe(String style, double size, String sku)
	{
		super(style, size, sku);
	}

	//modified getType()
	public String getType()
	{
		return "Shoe";
	}

}
