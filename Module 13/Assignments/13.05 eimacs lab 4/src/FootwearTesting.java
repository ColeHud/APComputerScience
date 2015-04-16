
public class FootwearTesting 
{
	public static void main( String[] args )
	{
		Bin bin = new Bin( "A" );
		bin.add( new BinItem( "1234-0", 500 ) );
		bin.add( new BinItem( "1234-1", 25 ) );
		bin.add( new BinItem( "1234-0", 243 ) );
		bin.add( new BinItem( "1234-2", 7720 ) );
		bin.add( new BinItem( "1234-0", 871 ) );
		System.out.println( bin );
	}
}
