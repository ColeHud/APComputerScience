/**
 *
 * @author IMACS Curriculum Development Group
 * @version 2.0 January 14, 2015
 * 
 * @author Cole Hudson
 * @version 3.0 February 28,2015
 */
import java.util.ArrayList;
public class Lab04Runner
{
	public static void main( String[] args )
	{
		/*
		Footwear[] fw = new Footwear[ 5 ];
		fw[ 0 ] = new Footwear( "Moccasin", 10, "12345-50" );
		fw[ 1 ] = new Boot( "Cowboy", 12.5, "12345-51" );
		fw[ 2 ] = new Shoe( "Oxford", 8, "12345-52" );
		fw[ 3 ] = new DressShoe( "Loafer", 9.5, "12345-53" );
		fw[ 4 ] = new CasualShoe( "Sandal", 7, "12345-54" );
		for ( Footwear f : fw )
			System.out.println( f );
		 */

		Warehouse w = new Warehouse( 10 ); 
		Footwear d0 = new DressShoe( "Loafer", 10.5, "1234-13" ); 
		Footwear b = new Boot( "Riding", 8, "1234-5" ); 
		Footwear c = new CasualShoe( "Sandal", 9.5, "1234-0" ); 
		Footwear d1 = new DressShoe( "Wing-tip", 10, "1234-3" ); 
		w.receive( d0, 4 ); 
		w.receive( b, 25 ); 
		w.receive( c, 18 ); 
		w.receive( d1, 5 ); 
		System.out.println( w );

	}

	//random
	public static int random( int n )
	{
		return (int)( n * Math.random() );
	}

	//catalog generation
	public static ArrayList<Footwear> makeCatalog( int n ) 
	{ 
		String[][] styles = 
			{ 
				//Boot styles 
				{ "Cowboy", "Hiking", "Rain", "Riding" }, 
				// Dress shoe styles 
				{ "Loafer", "Oxford", "Pump", "Sling-back", "Wing-tip" }, 
				// Casual shoe styles 
				{ "Athletic", "Hightop", "Moccasin", "Sandal" } 
			}; 

		double[] sizes = { 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 
				10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14 }; 

		ArrayList<Footwear>  catalog = new ArrayList<Footwear>(); 
		Footwear fw; 

		for ( int i = 0; i < n; i++ ) 
		{ 
			int fwType = random( styles.length ); 
			String[] styleList = styles[ fwType ]; 
			String style = styleList[ random( styleList.length ) ]; 
			double size = sizes[ random( sizes.length ) ]; 
			String sku = "1234-" + i; 

			if ( fwType == 0 ) 
				fw = new Boot( style, size, sku ); 
			else if ( fwType == 1 ) 
				fw = new DressShoe( style, size, sku ); 
			else 
				fw = new CasualShoe( style, size, sku ); 

			catalog.add( fw ); 
		} 

		return catalog; 
	}

	//look up footwear
	public static String lookupFootwear( ArrayList<Footwear> catalog, String sku )
	{
		for ( Footwear fw : catalog )
		{
			if (fw.getSKU().equalsIgnoreCase(sku))
				return fw.toString();
		}

		return "SKU " + sku + " not in catalog";
	}

}
