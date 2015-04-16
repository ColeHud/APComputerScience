/*
 * By Cole Hudson
 * Project Purpose: Calculate a user's TDEE
 * Date: 10/15/2014
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
public class TDEE {
	public static void main(String[] args)
	{
		//create scanner object for input
		Scanner in = new Scanner(System.in);
		
		//get name, BMR and Gender
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		
		System.out.print("Please enter your BMR: ");
		String bmrInput = in.nextLine();
		Double bmr = Double.parseDouble(bmrInput);
		
		System.out.print("Please enter your Gender (M/F): ");
		String genderInput = in.next();
		String gender = genderInput.substring(0,1);
		
		System.out.println();
		//Create menu
		System.out.println("Select Your Activity Level");
		System.out.println("[A] Resting (Sleeping, Reclining)");
		System.out.println("[B] Sedentary (Minimal Movement)");
		System.out.println("[C] Light (Sitting, Standing)");
		System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike");
		System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
		System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
		System.out.println();
		
		System.out.print("Enter the letter corresponding to your activity level: ");
		String activityLevel = in.next();
		activityLevel = activityLevel.substring(0,1);
		
		Double tdee = 0.0;
		Double activityFactor = 0.0;
		boolean displayInfo = false;
		//check and calculate the menu selection
		if(activityLevel.equalsIgnoreCase("A"))
		{
			activityFactor = 1.0;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("B"))
		{
			activityFactor = 1.3;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M"))
		{
			activityFactor = 1.6;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F"))
		{
			activityFactor = 1.5;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M"))
		{
			activityFactor = 1.7;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F"))
		{
			activityFactor = 1.6;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M"))
		{
			activityFactor = 2.1;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F"))
		{
			activityFactor = 1.9;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M"))
		{
			activityFactor = 2.4;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else if(activityLevel.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F"))
		{
			activityFactor = 2.2;
			tdee = (activityFactor * bmr);
			displayInfo = true;
		}
		else
		{
			System.out.println();
			System.out.println("You chose an invalid menu option, please restart and choose a different option");
			displayInfo = false;
		}
		
		//print out information if displayInfo = true;
		if(displayInfo)
		{
			System.out.println();
			System.out.println("Name: " + name + "   Gender: " + gender);
			System.out.println("BMR: " + bmr + " calories   Activity Factor: " + activityFactor);
			System.out.println("TDEE: " + tdee + " calories");
		}
		
	}
}
