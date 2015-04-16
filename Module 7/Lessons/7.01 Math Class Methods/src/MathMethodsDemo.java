
/**
 * This class demonstrates the use of several members of the Math class
 * 
 *     NOTE: There are 6 segments of code below.  The last five are commented out.
 *           Examine only one segment at a time.  Experiment by the arguments of the methods.
 *           
 *           After you understand the code in one section, delete the slash and asterisk at the beginning of the next section
 *           and the asterisk and slash at the end of the section in order to continue experimenting.
 * 
 * @author B. Jordan 
 * @version 02/01/07
 */
public class MathMethodsDemo
{
    public static void main(String[ ] args)
    {
        //example of raising a number to the nth power
//        double number = 4;
//        double nthPower = 3;
//        double powValue = Math.pow(number, nthPower);
//        System.out.println(number + " to the power of " + nthPower + ": " + powValue);
//        System.out.println();
        
        
//        //another example of raising a number to the nth power
//        
//        int number = 23;
//        int nthPower = 2;
//        int powValue = Math.pow(number, nthPower);
//        System.out.println(number + " to the power of " + nthPower + ": " + powValue);
//        System.out.println();
        
       
        
        //examples of decimal absolute values
        /*
        double decimalNumber = 4.56;        //change this to a negative number
        double decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();
        */
       
       
        //example of integer absolute values
        /*
        int anotherNumber = -14;  //notice that intNum1 has been assigned a new value, -14 replaces 23 in the intNum1 variable
        int intAbsValue = Math.abs(anotherNumber);
        System.out.println("The absolute value of " + anotherNumber + " is: " + intAbsValue);
        System.out.println();
        */

             
        //example of finding the square root of a value
//        
//        double someNumber = 81;
//        double squareRoot = Math.sqrt(someNumber);
//        System.out.println("The square root of " + someNumber + " is: " + squareRoot);
//        System.out.println();
        
                    
        
        //example of using the constant PI to calculate a circumference
        //notice that PI is not assigned a value, it has a constant value assigned by the Math class
        
		double radius = 3.5;
		double circumference = 2 * Math.PI * radius;
		System.out.println("The circumference of a circle with radius " + radius + " is: " + circumference);
		
		
         
    }//end of main method
}//end of class