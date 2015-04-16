package com.eimacs.lab04;

/**
 *
 * @author IMACS Curriculum Development Group
 * @version 2.0 January 14, 2015
 */
public class Lab04Runner
{
    public static void main( String[] args )
    {
        Footwear[] fw = new Footwear[ 5 ];
        fw[ 0 ] = new Footwear( "Moccasin", 10, "12345-50" );
        fw[ 1 ] = new Boot( "Cowboy", 12.5, "12345-51" );
        fw[ 2 ] = new Shoe( "Oxford", 8, "12345-52" );
        fw[ 3 ] = new DressShoe( "Loafer", 9.5, "12345-53" );
        fw[ 4 ] = new CasualShoe( "Sandal", 7, "12345-54" );
        for ( Footwear f : fw )
            System.out.println( f );
    }
}
