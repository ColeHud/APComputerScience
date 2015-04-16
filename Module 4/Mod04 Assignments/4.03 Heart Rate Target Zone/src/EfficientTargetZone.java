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
public class EfficientTargetZone {
	public static void main(String[] args)
	{
		System.out.println("Determine your Target Heart Rate Zone for Cardiovascular Exercise (50% - 85%)\n");
		Scanner in = new Scanner(System.in);
		
		//get age
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(in.next());
		

		//get resting heart rate
		System.out.print("Enter your resting heart rate: ");
		int restingHeartRate = Integer.parseInt(in.next());
		
		
		//get heart rate after exercising
		System.out.print("Enter your heart rate after exercising: ");
		int exerciseHeartRate = Integer.parseInt(in.next());
		
		//calculate and print out target zone
		
		int heartRateReserve = (220 - age) - restingHeartRate;
		
		int upperZone = (int)(heartRateReserve * .85) + restingHeartRate;
		int lowerZone = (int)(heartRateReserve * .5) + restingHeartRate;
		
		System.out.println("Your heart rate target zone is between " + lowerZone + " and " + upperZone);
		
		
		//conditional deciding if your heart rate is in the target zone
		String isInZoneText = "";
		
		if(lowerZone < exerciseHeartRate && exerciseHeartRate < upperZone){
			isInZoneText = " ";
		}else{
			isInZoneText = " not ";
		}
		
		System.out.println("After exercising, your heart rate is" + isInZoneText + "within your target zone");
		
	}

}
