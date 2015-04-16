/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author Cole Hudson 
 * @version 1
 * date: 10/14/2014
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println(" __________________________");
        System.out.println("|       [A] BMI            |");
        System.out.println("|__________________________|");
        System.out.println("|       [B] BMR            |");// provide menu item for BMR
        System.out.println("|__________________________|");
        System.out.println("|   [C] Healthy Eating     |");// provide menu item for Healthy Eating
        System.out.println("|__________________________|");
        System.out.println("|    [D] Food Pyramid      |");// provide menu item for Food Pyramid
        System.out.println("|__________________________|");
        System.out.println("|   [E] Fitness Training   |");// provide menu item for Fitness Training
        System.out.println("|__________________________|");
        // prompt user to enter A, B, C, D, or E: ");
        // accept user choice with a Scanner class method
        System.out.println();
        System.out.print("Menu Selection: ");
        String selection = in.next();
        System.out.println();
        
        if(selection.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
        	System.out.println(" __________________________________");
        	System.out.println("|                                  |");
            System.out.println("|   Testing: You chose A for BMI   |");
            System.out.println("|__________________________________|");
        }
        else if(selection.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
        	System.out.println(" __________________________________");
        	System.out.println("|                                  |");
        	System.out.println("|   Testing: You chose B for BMR   |");
        	System.out.println("|__________________________________|");
        }
        else if (selection.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
        	System.out.println(" _____________________________________________");
        	System.out.println("|                                             |");
        	System.out.println("|   Testing: You chose C for Healthy Eating   |");
        	System.out.println("|_____________________________________________|");
        }
        else if (selection.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
        	System.out.println(" ___________________________________________");
        	System.out.println("|                                           |");
        	System.out.println("|   Testing: You chose D for Food Pyramid   |");
        	System.out.println("|___________________________________________|");
        }
        else if (selection.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
        	System.out.println(" _______________________________________________");
        	System.out.println("|                                               |");
        	System.out.println("|   Testing: You chose E for Fitness Training   |");
        	System.out.println("|_______________________________________________|");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
        	System.out.println(" ___________________________________________________________________________");
        	System.out.println("|                                                                           |");
            System.out.println("|   Your data entry was invalid, please restart and choose a valid option   |");
            System.out.println("|___________________________________________________________________________|");
        }
        
        
    }
}