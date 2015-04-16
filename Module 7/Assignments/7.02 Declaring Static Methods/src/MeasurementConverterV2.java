
/**
 * Write a description of class MeasurementConverterV2_Key here.
 * Purpose: Convert from the English to Metric system and vice-versa.
 * @author Cole Hudson
 * @version 11/23/2014
 * PMR in README.txt
 * 
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi * 1.61;   
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km / 1.61;    
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public static double poundsToKilograms(double lb)
    {
        return lb * 0.453592;  
    } 
    
    //convert kilograms to pounds
    // method header to convert kilograms to pounds goes here
    public static double kilogramsToPounds(double kg)
    {
        return kg / 0.453592;    
    } 
    
    //gallons to liters
    public static double gallonsToLiters(double gl)
    {
    	return gl * 3.78541;
    }
    
    //liters to gallons
    public static double litersToGallons(double li)
    {
    	return li / 3.78541;
    }
    
    //two more unit conversions
    //wavelength of orange-red light from krypton-86 to meter
    //these aren't english to metric, but I thought that they'd be fun to do :)
    public static double kryptonToMeter(double kr)
    {
    	return kr / 1650763.73;
    }
    
    //convert from meters to krypton-86 wavelengths
    public static double meterToKrypton(double m)
    {
    	return m * 1650763.73;
    }
    
    
    
        
    public static void main(String[ ] args)
    {
        //local variables
        //double miles, feet, inches, pounds, krypton-86 wavelength;
    	
        //double kilometers, kilograms, meter;   	
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        double feet = 6230;
        double miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        //call method to convert kilometers to miles goes here
        miles = convertKilometersToMiles(kilometers);
        //print results goes here
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
         //call method to convert pounds to kilograms goes here
        double kilograms = poundsToKilograms(pounds);
        //print results goes here
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);
  
        //call method to convert kilograms to pounds goes here
        kilograms = 98.0;
        pounds = kilogramsToPounds(kilograms);
        //print results goes here
        System.out.printf("%8.1f kg. = %7.1f lb. %n", kilograms, pounds);
        
        
        //declare and initialize the gallons variable goes here
        double gallons = 55.0;
        double liters = gallonsToLiters(gallons);
        //call method to convert gallons to liters goes here
        //print results goes here
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons, liters);
        
        //declare and initialize the liters variable goes here
        liters = 2.0;
        gallons = litersToGallons(liters);
        //call method to convert liters to gallons goes here
        //print results goes here
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters, gallons);
        
        //two extra conversions
        
        //meters to krypton-86 wavelengths
        double meters = 100.0;
        double krypton86Wavelength = meterToKrypton(meters);
        System.out.printf("%9.1f m. = %7.1f k86w. %n", meters, krypton86Wavelength);
        
        //krypton-86 wavelengths to meters
        krypton86Wavelength = 2888836.5275;
        meters = kryptonToMeter(krypton86Wavelength);
        System.out.printf("%8.1f k86w. = %7.1f m. %n", krypton86Wavelength, meters);
           
    }//end of main method
	
}//end of class

