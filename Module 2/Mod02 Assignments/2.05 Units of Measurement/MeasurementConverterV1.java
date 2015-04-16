/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Cole Hudson
 * Date: 09/16/14
 * PMR in README.txt
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //Head display
        System.out.println("****************************************\n     This program converts between\n     selected units of measurement.\n****************************************");

        //Initialize distance variables
        double miles;                   
        double feet;                    
        double feetPerMile = 5280;      
        double kilometers;              
        double kilometersPerMile = 1.61;

        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

        //convert miles to feet
        miles = 3.7;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft.");

        //convert miles to kilometers
        miles = 6;
        kilometers = miles * kilometersPerMile;
        System.out.println(miles + " mi. = " + kilometers + " km.");

        //convert kilometers to miles
        kilometers = 5;
        miles = kilometers / kilometersPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");

        //initialize weight variables
        double kilograms;
        double pounds;
        double poundsPerKilogram = .45;
        double kilogramsPerPound = 2.2;

        //convert pounds to kilograms
        pounds = 138;
        kilograms = pounds / kilogramsPerPound;
        System.out.println(pounds + " lb. = " + kilograms + " kg.");

        //convert kilograms to pounds
        kilograms = 1000;
        pounds = kilograms * kilogramsPerPound;
        System.out.println(kilograms + " kg. = " + pounds + " lb.");

        //initialize volume variables
        double gallons;
        double liters;
        double gallonsPerLiter = .26;
        double litersPerGallon = 3.79;

        //convert gallons to liters
        gallons = 7.3;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + " gal. = " + liters + " l.");

        //convert liters to gallons
        liters = 7.3;
        gallons = liters * gallonsPerLiter;
        System.out.println(liters + " l. = " + gallons + " gal.");

        //initialize variables of the unit of my choosing (distance)
        double meters;
        double yards;
        double metersPerYard = 0.91;
        double yardsPerMeter = 1.09;

        //convert meters to yards
        meters = 3;
        yards = meters * yardsPerMeter;
        System.out.println(meters + " m. = " + yards + " yd.");

        //convert yards to meters
        yards = 5;
        meters = yards * metersPerYard;
        System.out.println(yards + " yd. = " + meters + " m.");


    }//end of main method
}//end of class

