/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©FLVS 2007
 * @author Bill Jordan edited by Cole Hudson
 * @version 09/13/14
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        //Initialize variables for Addition
        int iNum1 = 4;
        int iNum2 = 8;
        double dNum1 = 23.51;
        double dNum2 = 8.9325;
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " = "); 
        System.out.println(iNum1 + iNum2); 
        System.out.print(dNum1 + " plus " + dNum2 + " = "); 
        System.out.println(dNum1 + dNum2);
        System.out.println();

        //Initialize the variables for Subtraction
        int iNum3 = 9;
        int iNum4 = 33;
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " minus " + iNum4 + " = ");
        System.out.println(iNum3 - iNum4);
        System.out.println(98.6 - 47.0038);
        System.out.println();
        
        //Initialize the variables for Multiplication
        int iNum5 = 15;
        int iNum6 = 3;
        int iNum7 = 201;

        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum5 + " times " + iNum6 + " times "+ iNum7 + " = "); 
        System.out.println(iNum5 * iNum6 * iNum7);
        System.out.println(3.14 * 5.0 * 5.0);
        System.out.println();

        //Initialize the variables for Division
        int iNum8 = 48;
        int iNum9 = 8;
        
        // Division
        System.out.println("Division");
        System.out.print(iNum8 + " divided by " + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        System.out.println(212.0 / 32.0);
        System.out.println();

        //Initialize the variables for Modulus
        int iNum10 = 23;
        int iNum11 = 0xf;//15 -- I switched this to 14 to test out variables, but then switched back
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum10 + " modulus " + iNum11 + " = ");
        System.out.println(iNum10 % iNum11);
        System.out.println(3298.7 % 243.1);
        System.out.println();

        //My two arithmetic expressions

        //initialize variables
        int iNum12 = 75;
        int iNum13 = 33;
        int iNum14 = 6;

        // Addition and Subtraction
        System.out.println("Additon and Subtraction");
        System.out.print(iNum12 + " plus " + iNum13 + " minus " + iNum14 + " = ");
        System.out.println(iNum12 + iNum13 - iNum14);
        System.out.println();

        //initialize variables
        int iNum15 = 6;
        int iNum16 = 3;
        int iNum17 = 7;
        int iNum18 = 4;

        // Modulus operator, division, and multiplication
        System.out.println("Modulus, Division, and Multiplication");
        System.out.print(iNum15 + " modulus " + iNum16 + " divided by " + iNum17 + " times " + iNum18 + " = ");
        System.out.println(iNum15 % iNum16 / iNum17 * iNum18);
        System.out.println();


        //Problems for the site, unsure if they are needed in the program
        /**
        *System.out.println(-10);
        *System.out.println();
        *
        *System.out.println(234);
        *System.out.println();
        *
        *System.out.println(3.2);
        *System.out.println();
        *
        *System.out.println(100);
        *System.out.println();
        **/

        

        
               
    } // end of main method
} // end of class