/*
 * By Cole Hudson
 * 10/12/2014
 * Version 1
 * Purpose: Calculate your heart basal metabolic rate.
 * 
 * PMR in README.txt
 * 
 * note: I used the revised equation which produces slightly different values than the original one
 */
import java.util.Scanner;
public class BMR {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//prompts for name, gender, age, height, and weight
		System.out.print("Enter your name: ");
		String name = in.next();
		
		System.out.print("Gender (M or F): ");
		String genderInput = in.next();
		char gender = genderInput.charAt(0);
		boolean isMale = gender == 'M';
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		System.out.print("Height in inches: ");
		double height = in.nextInt();
		
		System.out.print("Weight in pounds: ");
		double weight = in.nextInt();
		
		System.out.println();
		System.out.println();
		
		//Calculate and print out basal metabolism
		
		System.out.println("Your Basal Metabolism");
		
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		
		//convert weight variable
		weight /= 2.205;
		weight *= 10;
		weight = (int)weight;
		weight /= 10;
		
		System.out.println("Weight (kg): " + weight);
		
		//convert height variable
		height *= 2.54;
		height *= 10;
		height = (int)height;
		height /= 10;
		
		System.out.println("Height (cm): " + height);
		
		//basal metabolic rate
		double metabolicRate;
		if(isMale){
			metabolicRate = (13.397 * weight) + (4.799 * height) - (5.677 * age) + 88.362;
		}else{
			metabolicRate = (9.247 * weight) + (3.098 * height) - (4.330 * age) + 447.593;
		}
		//remove all but one decimal place 
		metabolicRate *= 10;
		metabolicRate = (int)metabolicRate;
		metabolicRate /= 10;
		
		System.out.println("Basal Metabolic Rate: " + metabolicRate + " calories per day");
		
		
		
	}

}
