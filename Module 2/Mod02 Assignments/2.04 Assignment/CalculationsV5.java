//View PMR in README.txt 
/*
     ______        _____
    /      \      /     \
        __          __
       |  |        |  |
       |  |        |  |
       |__|        |__|


    \                     /
     \___________________/



*/
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©FLVS 2007
 * @author Bill Jordan and Cole Hudson
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
        double dNum3 = 98.6;
        double dNum4 = 47.0038;
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " minus " + iNum4 + " = ");
        System.out.println(iNum3 - iNum4);
        System.out.print(dNum3 + " minus " + dNum4 + " = ");
        System.out.println(dNum3 - dNum4);
        System.out.println();
        
        //Initialize the variables for Multiplication
        int iNum5 = 15;
        int iNum6 = 3;
        int iNum7 = 201;
        double dNum5 = 3.14;
        double dNum6 = 5.0;
        double dNum7 = 5.0;

        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum5 + " times " + iNum6 + " times "+ iNum7 + " = "); 
        System.out.println(iNum5 * iNum6 * iNum7);
        System.out.print(dNum5 + " times " + dNum6 + " times " + dNum7 + " = ");
        System.out.println(dNum5 * dNum6 * dNum7);
        System.out.println();

        //Initialize the variables for Division
        int iNum8 = 48;
        int iNum9 = 8;
        double dNum8 = 212.0;
        double dNum9 = 32.0;
        
        // Division
        System.out.println("Division");
        System.out.print(iNum8 + " divided by " + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        System.out.print(dNum8 + " divided by " + dNum9 + " = ");
        System.out.println(dNum8 / dNum9);
        System.out.println();

        //Initialize the variables for Modulus
        int iNum10 = 23;
        int iNum11 = 0xf;//15 -- I switched this to 14 to test out variables, but then switched back
        double dNum10 = 3298.7;
        double dNum11 = 243.1; 

        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum10 + " modulus " + iNum11 + " = ");
        System.out.println(iNum10 % iNum11);
        System.out.print(dNum10 + " modulus " + dNum11 + " = ");
        System.out.println(dNum10 % dNum11);
        System.out.println();
        //My two arithmetic expressions for integers

        //initialize variables
        int iNum12 = 75;
        int iNum13 = 33;
        int iNum14 = 6;
        int iNum14andHalf = 7; //I forgot to add in the third operator, and I didn't want to mess up further variables

        // Addition and Subtraction
        System.out.println("Additon, Subtraction, and Multiplication");
        System.out.print(iNum12 + " plus " + iNum13 + " minus " + iNum14 + " times " + iNum14andHalf + " = ");
        System.out.println(iNum12 + iNum13 - iNum14 * iNum14andHalf);
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

        //My two arithmetic experssions for decimals

        //initialize variables
        double dNum12 = 212.77;
        double dNum13 = 1999.27;
        double dNum14 = 3.65;
        double dNum15 = 3.65;

        //Subtraction, addition, and modulus
        System.out.println("Subtraction, Addition, and Modulus");
        System.out.print(dNum12 + " minus " + dNum13 + " plus " + dNum14 + " modulus " + dNum15 + " = ");
        System.out.println(dNum12 - dNum13 + dNum14 % dNum15);
        System.out.println();

        //initialize variables
        double dNum16 = 3.333;
        double dNum17 = 33.333;
        double dNum18 = 7.5;
        double dNum19 = 3.5;

        //Multiplication, division, and addition
        System.out.println("Multiplication, Division, and Addition");
        System.out.print(dNum16 + " times " + dNum17 + " divided by " + dNum18 + " plus " + dNum19 + " = ");
        System.out.println(dNum16 * dNum17 / dNum18 + dNum19);
        System.out.println();

               
    } // end of main method
} // end of class