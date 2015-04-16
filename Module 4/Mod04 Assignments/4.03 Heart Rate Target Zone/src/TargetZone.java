/*
 * By Cole Hudson
 * 10/11/2014
 * Version 1
 * 
 * Purpose: Calculate heart rate and target zone
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
public class TargetZone {
	public static void main(String[] args)
	{
		System.out.println("Determine your Target Heart Rate Zone for Cardiovascular Exercise (50% - 85%)\n");
		Scanner in = new Scanner(System.in);
		
		//get age
		System.out.print("Enter your age: ");
		String ageInput = in.next();
		int age = Integer.parseInt(ageInput);
		

		//get resting heart rate
		System.out.print("Enter your resting heart rate: ");
		String restingHeartRateInput = in.next();
		int restingHeartRate = Integer.parseInt(restingHeartRateInput);
		
		
		//get heart rate after exercising
		System.out.print("Enter your heart rate after exercising: ");
		String exerciseHeartRateInput = in.next();
		int exerciseHeartRate = Integer.parseInt(exerciseHeartRateInput);
		
		//calculate and print out target zone
		int maximumHeartRate = 220 - age;
		int heartRateReserve = maximumHeartRate - restingHeartRate;
		
		int upperZone = (int)(heartRateReserve * .85) + restingHeartRate;
		int lowerZone = (int)(heartRateReserve * .5) + restingHeartRate;
		
		System.out.println("Your heart rate target zone is between " + lowerZone + " and " + upperZone);
		
		
		//conditional deciding if your heart rate is in the target zone
		boolean isInZone = (lowerZone < exerciseHeartRate && exerciseHeartRate < upperZone);
		String isInZoneText = "";
		
		if(isInZone){
			isInZoneText = " ";
		}
		
		if(isInZone == false){
			isInZoneText = " not ";
		}
					
		
		System.out.println("After exercising, your heart rate is" + isInZoneText + "within your target zone");
		
	}

}
