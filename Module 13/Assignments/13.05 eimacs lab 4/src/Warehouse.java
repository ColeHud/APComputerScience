import java.util.ArrayList;

/*
 * By Cole Hudson
 * Date: 2/26/2015
 * Purpose: Create footwear representation for eimacs lab 4
 * 
 * PMR in README.txt
 */
public class Warehouse 
{
	//variables
	private int myBinMax;
	private ArrayList<Footwear> myCatalog;
	private ArrayList<Bin> myBins;

	//getters

	//constructor
	Warehouse(int binMax)
	{
		myBinMax = binMax;
		myCatalog = new ArrayList();
		myBins = new ArrayList(myBinMax);

		for(int i = 0; i <= 5; i++)
		{
			addBin();
		}
	}

	//other methods
	public void addBin()
	{
		int bins = myBins.size();
		myBins.add(new Bin("B" + bins));
	}

	//to string
	public String toString()
	{
		String returnString = "";
		for(Bin bin : myBins)
		{
			//get the head
			String firstLine = bin + "";
			firstLine = firstLine.substring(0, firstLine.indexOf(':') + 1) + "\n";

			//contents of bin
			String contents = "";
			ArrayList<BinItem> contentsOfBin = bin.getContents();

			//for each content, look up the sku and add in the definition
			for(BinItem item : contentsOfBin)
			{
				String text = Lab04Runner.lookupFootwear(myCatalog, item.getSKU());
				String sku = item.getSKU();

				String line = text + ", SKU " + sku + ": " + item.getQuantity() + "\n";
				contents += line;
			}

			//add teh head and contents to the return string
			returnString += firstLine + contents;
		}
		return returnString;
	}

	//receive items
	public void receive(Footwear footwear, int quantity)
	{
		//check and see if the item is already in the catalog
		if(myCatalog.contains(footwear))
		{
			return;
		}
		else
		{
			//add to catalog
			myCatalog.add(footwear);
			
			//place the footwear
			placeItems(footwear, quantity);
		}
	}

	//place items into bin
	public void placeItems(Footwear footwear, int quantity)
	{
		Bin emptiestBin = emptiestBin();
		int leftOver = quantity - myBinMax;
		
		//add the items
		myBins.get(myBins.indexOf(emptiestBin)).add(new BinItem(footwear.getSKU(), quantity));
		
		//add leftovers
		if(leftOver > 0)
		{
			//RECURSION!!!!!!!!
			placeItems(footwear, leftOver);
		}
	}
	
	//find emptiest bin
	public Bin emptiestBin()
	{
		//find the bin with the least amount of items
		Bin emptiestBin = new Bin("Emptiest");
		int emptiestQuantity = Integer.MAX_VALUE;

		for(Bin bin : myBins)
		{
			//if the bin is empty
			if(bin.totalQuantity() == 0)
			{
				emptiestBin = bin;
				break;
			}

			//if the bin contains less than the emptiest bin
			if(bin.totalQuantity() < emptiestQuantity)
			{
				emptiestBin = bin;
			}
		}
		return emptiestBin;
	}
}
