
/**
 * class TestListing2
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 6/25/2007
 */
public class TestListing2
{
	public static void main(String[] args)
	{
		//create array
		HouseListing[] houses = new HouseListing[5];

		houses[0] = new HouseListing("123 Any Street", "St. Cloud", "FL", "34769", 79000);
		houses[1] = new HouseListing("456 Cherry Lane", "St. Cloud", "FL", "34772", 110000);
		houses[2] = new HouseListing("1892 Ocean Blue", "Kissimmee", "FL", "34647", 212000);
		houses[3] = new HouseListing("339 Curry Ave", "Kissimee", "FL", "34647", 88000);
		houses[4] = new HouseListing("612 Orange Street", "Orlando", "FL", "32196", 451000);	   


		//print the original
		System.out.println("Before sorting: \n");
		for(int i = 0; i < houses.length; i++)
			System.out.println(houses[i] );

		//insertion sort
		houses = insertionSort(houses);

		//print after
		System.out.println("\nAfter sorting: \n");
		for(int i = 0; i < houses.length; i++)
			System.out.println(houses[i] );
	}
	
	
	public static void bubbleSort(HouseListing[] a)
	{
		int out, in;
		HouseListing temp;

		for(out=a.length-1; out>1; out--)  // outer loop (backward)
			for(in=0; in<out; in++)    // inner loop (forward)
				if( a[in].getCost() > a[in+1].getCost() )    // out of order?
				{     // swap them
					temp = a[in + 1];
					a[in + 1] = a[in];
					a[in] = temp;
				}
	}
	
	//insertion sort
	public static HouseListing[] insertionSort(HouseListing[] source)
	{
		//destination array
		HouseListing[] dest = new HouseListing[ source.length ];

		for ( int i = 0 ; i < source.length ; i++ )
		{
			HouseListing next = source[ i ];
			int insertindex = 0;
			int k = i;
			while ( k > 0 && insertindex == 0 )
			{
				if ( next.getCost() > dest[k-1].getCost() )
				{
					insertindex = k;
				}
				else
				{
					dest[ k ] = dest[ k - 1 ];
				}
				k--;
			}

			dest[ insertindex ] = next;
		} // end of for    
		return dest;
	}

} // end of class