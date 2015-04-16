import java.util.ArrayList;

/*
 * By Cole Hudson
 * Date: 2/28/2015
 * Purpose: eimacs lab4
 * 
 * PMR in README.txt
 */
public class Bin 
{
	//variables
	private String myName;
	private ArrayList<BinItem> myContents;
	
	//getters
	public String getName()
	{
		return myName;
	}
	
	public ArrayList<BinItem> getContents()
	{
		return myContents;
	}
	
	//constructor
	Bin(String name)
	{
		myName = name;
		myContents = new ArrayList();
	}
	
	//other methods
	
	//toString()
	public String toString()
	{
		String returnString = "";
		returnString += "Bin " + myName + ":\n";
		
		//add in each element
		for(int i = 0; i < myContents.size(); i++)
		{
			if(i < myContents.size() - 1)
			{
				returnString += myContents.get(i) + "\n";
			}
			else
			{
				returnString += myContents.get(i);
			}
		}
		
		return returnString;
	}
	
	//add binItems
	public BinItem oldAdd(BinItem i)
	{
		myContents.add(i);
		return i;
	}
	
	//remove binItems
	public void remove(int index)
	{
		myContents.remove(index);
	}
	
	//return sum of all quantities
	public int totalQuantity()
	{
		int total = 0;
		
		for(BinItem b: myContents)
		{
			total += b.getQuantity();
		}
		
		return total;
	}
	
	//new modified add method
	public void add(BinItem item)
	{
		boolean doesContain = false;
		BinItem duplicate = null;
		
		for(BinItem b: myContents)
		{
			if(b.getSKU().equals(item.getSKU()))
			{
				doesContain = true;
				duplicate = b;
			}
		}
		
		if(doesContain && duplicate != null)
		{
			BinItem newItem = new BinItem(item.getSKU(), item.getQuantity() + duplicate.getQuantity());
			myContents.remove(duplicate);
			myContents.add(newItem);
		}
		else
		{
			myContents.add(item);
		}
	}
}
