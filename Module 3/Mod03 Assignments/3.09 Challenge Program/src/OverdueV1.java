/*
 * By Cole Hudson
 * 10/01/14
 * Version 1
 * PMR in README.txt
 */
import java.util.Scanner;
public class OverdueV1 {	
	public static void main(String[] args)
	{
		//create input scanner
		Scanner in = new Scanner(System.in);
		//Ask for name and social security number	
		System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
		
		//save input
		String lastName = in.next();
		String firstName = in.next();
		String securityNumber = in.nextLine();
		
		//process input and get rid of spaces and commas
		lastName = lastName.substring(0, lastName.length()-1);
		securityNumber = securityNumber.substring(1,securityNumber.length());
		System.out.println();
		
		//Ask for the title of the book and store it as a variable
		System.out.print("Enter the title of the book: ");
		String bookTitle = in.nextLine();
		System.out.println();
		
		//Get the day checked out 
		System.out.print("Enter the date checked out (mm/dd/yyyy): ");
		String dateCheckedOut = in.nextLine();
		System.out.println();
		
		//get the number of days overdue and the daily fine
		System.out.print("Days late: ");
		String daysLate = in.nextLine();
		System.out.print("Daily fine: ");
		String dailyFine = in.next();
		//make space between note
		System.out.println();
		System.out.println();
		
		//From
		String from = "Mona";
		
		//Print out the overdue notice
		System.out.println("To: " + lastName + ", " + firstName + "\t\tAccount: " + lastName + firstName.substring(0,4) + "-" + securityNumber.substring(7,11)); 
		System.out.println("From: " + from);
		System.out.println("Subject: Overdue Notice");
		System.out.println("==========================================================");
		System.out.print(bookTitle + " was checked out on: ");
		System.out.println(dateCheckedOut.replaceAll("/", "-"));
		System.out.println("This book is currently " + daysLate + " days late.");
		System.out.println("Your fine has accumulated to " + (Double.parseDouble(daysLate) * Double.parseDouble(dailyFine)));
		
		
		
		
		
		
	}
}
