/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another countyr given the current 
 * exchange rate.
 * 
 *
 * ©CSA/FLVS 2007
 * @author Cole Hudson
 * @version 09/19/14
 */
public class CurrencyConversionV1
{   
    public static void main(String [ ] args)
    {
        //initialize conversion variables
        double usDollars = 2500.0;      
        double pesosToDollar = 13.21; 
        double yenToDollar = 109.02;
        double euroToDollar = .78;

        //initialize spending variables
        double spentInMexico = 478.00;
        double spentInJapan = 824.00;
        double spentInFrance = 1100.00;
        
        
        // purpose of program
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.\n");
        

        //starting amount of money
        System.out.println("Started with " + usDollars + "\n");

        // convert US dollars to Mexican pesos
        System.out.println(usDollars + " American dollars = " + (usDollars * pesosToDollar) + " Mexican pesos");
        usDollars -= spentInMexico; //subtract Mexican spending
        System.out.println("dollars spent: " + spentInMexico + "    pesos spent: " + (spentInMexico * pesosToDollar) + "\n");
        
        // convert US dollars to Japanese yen
        System.out.println(usDollars + " American dollars = " + (usDollars * yenToDollar) + " Japanses Yen");
        usDollars -= spentInJapan; //subtract Japanese spending
        System.out.println("dollars spent: " + spentInJapan + "    yen spent: " + (spentInJapan * yenToDollar) + "\n");
        
        // convert US dollars to Euros
        System.out.println(usDollars + " American dollars = " + (usDollars * euroToDollar) + " Euros");
        usDollars -= spentInFrance; //subtract French spending
        System.out.println("dollars spent: " + spentInFrance + "    Euros spent: " + (spentInFrance * euroToDollar) + "\n");
        
        //Display remainder
        System.out.println("Returned with " + usDollars + " American dollars");

            
    } // end of main method
} // end of class     
