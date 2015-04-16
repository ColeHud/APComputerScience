/*
 * By Cole Hudson
 * Date: 4/12/2015
 * Purpose: Use different sorting algorithms on various hardware items
 * 
 * PMR in README.txt
 */
public class TestItem 
{
	public static void main(String[] args)
	{
		//array of items
		Item[] hardware = {
				new Item("1011", "Air Filters", 200, 10.5),
				new Item("1034", "Door Knobs", 60, 21.5),
				new Item("1101", "Hammers", 90, 9.99),
				new Item("1600", "Levels", 80, 19.99),
				new Item("1500", "Ceiling Fans", 100, 59),
				new Item("1201", "Wrench Sets", 55, 80),
		};

		//original
		System.out.println("Original Array: \n");
		printInventory(hardware);
		System.out.println();

		//sort by id - merge
		System.out.println("Sorted by ID: \n");
		sortID(hardware, 0, hardware.length - 1, 1);
		printInventory(hardware);
		System.out.println();

		//sort by name - insertion
		System.out.println("Sorted by Name: \n");
		sortName(hardware, 1);
		printInventory(hardware);
		System.out.println();

		//sort by number in store - selection
		System.out.println("Sorted by inStore: \n");
		sortInStore(hardware, 1);
		printInventory(hardware);
		System.out.println();
		
		//sort by price - merge
		System.out.println("Sorted by Price: \n");
		sortPrice(hardware, 0, hardware.length - 1, 1);
		printInventory(hardware);
		
	}

	//print inventory
	public static void printInventory(Item[] array)
	{	
		System.out.printf("%-7s %-10s %-9s %-5s %n", "itemID", "itemName", "inStore", "price");
		System.out.println("----------------------------------");
		for(Item item : array)
		{
			System.out.println(item);
		}
	}

	//sort id's - merge
	public static void sortID(Item[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		sortID(a, low, mid, direction);
		sortID(a, mid + 1, high, direction);

		mergeID(a, low, mid, high, direction);
	}

	//merge ID - merge
	public static void mergeID(Item[] a, int low, int mid, int high, int direction)
	{
		Item[] temp = new Item[high - low + 1];

		int i = low;
		int j = mid + 1;
		int n = 0;

		//sort the elements into temp
		while(i <= mid || j <= high)
		{
			//mid - high
			if(i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			//low - mid
			else if(j > high)
			{
				temp[n] = a[i];
				i++;
			}
			//compare
			else if(a[i].getItemID().compareTo(a[j].getItemID()) < 0 && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getItemID().compareTo(a[j].getItemID()) > 0 && direction == 2)
			{
				temp[n] = a[i];
				i++;
			}
			//smallest in j position
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}

		for(int k = low; k<= high; k++)
		{
			a[k] = temp[k - low];
		}
	}

	//sort names - insertion
	public static void sortName(Item[] a, int direction)
	{
		Item[] returnArray = a;

		for ( int i = 0 ; i < a.length ; i++ )
		{
			Item next = a[ i ];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				//ascending
				if (next.getItemName().compareTo(returnArray[k - 1].getItemName()) > 0 && direction == 1)
				{
					insertindex = k;
				}
				//descending
				else if(next.getItemName().compareTo(returnArray[k - 1].getItemName()) < 0 && direction == 2)
				{
					insertindex = k;
				}
				else
				{
					returnArray[ k ] = returnArray[ k - 1 ];
				}
				k--;

			}

			returnArray[ insertindex ] = next;
		}

		//set a
		a = returnArray;
	}

	//sort by the number in store - selection sort
	public static void sortInStore(Item[] a, int direction)
	{
		int posmax;

		for (int i = a.length - 1 ; i > 0 ; i-- )
		{
			posmax = 0;

			for (int k = 1 ; k <= i ; k++ )
			{
				int kYear = a[k].getInStore();
				int posmaxYear = a[posmax].getInStore();

				if (kYear > posmaxYear && direction == 1)
				{
					posmax = k;
				}
				else if(kYear < posmaxYear && direction == 2)
				{
					posmax = k;
				}
			}

			Item temp = a[i];
			a[ i ] = a[ posmax ];
			a[ posmax ] = temp;
		}

	}

	//sort price - merge
	public static void sortPrice(Item[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		sortPrice(a, low, mid, direction);
		sortPrice(a, mid + 1, high, direction);

		mergePrice(a, low, mid, high, direction);
	}

	//merge price
	public static void mergePrice(Item[] a, int low, int mid, int high, int direction)
	{
		Item[] temp = new Item[high - low + 1];

		int i = low;
		int j = mid + 1;
		int n = 0;

		//sort the elements into temp
		while(i <= mid || j <= high)
		{
			//mid - high
			if(i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			//low - mid
			else if(j > high)
			{
				temp[n] = a[i];
				i++;
			}
			//compare
			else if(a[i].getPrice() < a[j].getPrice() && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getPrice() > a[j].getPrice() && direction == 2)
			{
				temp[n] = a[i];
				i++;
			}
			//smallest in j position
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}

		for(int k = low; k<= high; k++)
		{
			a[k] = temp[k - low];
		}
	}
	
	
}
