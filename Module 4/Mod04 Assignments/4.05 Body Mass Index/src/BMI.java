/*
 * By Cole Hudson
 * 10/12/2014
 * Version 1
 * Purpose: Calculate a person's Body Mass Index
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
public class BMI {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//ask for info
		System.out.print("Enter your name (first last): ");
		String firstName = in.next();
		String lastName = in.next();
		
		System.out.print("Enter your weight in pounds (e.g. 175): ");
		int weight = in.nextInt();
		//convert to metric system
		double kgWeight = weight * 0.45;
		kgWeight *= 10;
		kgWeight = (int)kgWeight;
		kgWeight /= 10;
		
		System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
		int feetHeight = in.nextInt();
		int inchesHeight = in.nextInt();
		inchesHeight = (feetHeight * 12) + inchesHeight;
		//convert to metric system
		double metersHeight = inchesHeight * 0.025;
		metersHeight *= 10;
		metersHeight = (int)metersHeight;
		metersHeight /= 10;
		
		System.out.println();
		System.out.println("Body Mass Index Calculator");
		System.out.println("==========================");
		
		//print out info
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Height (m): " + metersHeight);
		System.out.println("Weight (kg): " + kgWeight);
		
		//calculate bmi
		double bmi = kgWeight / (metersHeight * metersHeight);
		//remove extra decimal places
		bmi *= 10;
		bmi = (int)bmi;
		bmi /= 10;
		
		//calculate conditionals
		String weightStatus = "";
		
		if(bmi < 18.5){
			weightStatus = "Underweight";
		}else if(18.5 <= bmi && bmi < 25){
			weightStatus = "Normal";
		}else if(25 <= bmi && bmi < 30){
			weightStatus = "Overweight";
		}else{
			weightStatus = "Obese";
		}
		
		//print out BMI and weight status
		System.out.println("BMI: " + bmi);
		System.out.println("Category: " + weightStatus);
		
		
		
		
	}
}
