
/**
 * This program prints the ASCII characters that correspond to ASCII values, and
 * prints the ASCII values that correspond to specific ASCII characters.
 * 
 * Notice that (int) is used to cast a character literal to its corresponding ASCII value, and
 * that (char) is used to cast an ASCII value to its corresponding character literal.
 * 
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 */
public class ShowASCII
{
    public static void main(String[ ] args)
    {   
        //cast a character literal to its integer ASCII value
        System.out.println("The ASCII code for " + 'A' + " is " + (int)'A');
        System.out.println("The ASCII code for " + '9' + " is " + (int)'9');
        System.out.println();
        
        //cast an integer ASCII value to its corresponding character literal
        System.out.println("93 is the ASCII code for " + (char)93);
        System.out.println("173 is the ASCII code for " + (char)173);
        System.out.println('C' + " = " + (int)'C');
        System.out.println();
        
    }//end of main method
}//end of class