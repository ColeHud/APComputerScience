/*
 * By Cole Hudson
 * 11/8/2014
 * Purpose: Convert Fahrenheit to Celsius and inches to centimeters.
 * PMR in README.txt
 */
import java.util.Scanner;
public class AnnualClimate2 {
	public static void main(String[] args)
	{
		//Scanner for user input
		Scanner in = new Scanner(System.in);
		
		//collect user input choosing the temperature scale
		System.out.printf("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String temperatureScale = in.next().toUpperCase();
		
		
		//collect user input choosing the precipitation scale
		System.out.printf("Choose the precipitation scale (i = inches, c = centimeters): ");
		String precipitationScale = in.next().toLowerCase();
		System.out.println();
		System.out.println();
		
		//print out title
		System.out.printf("%31s%n", "Climate Data");
		
		//climate data
		String location = "Tallahassee, Florida";
		//in Fahrenheit and inches
		
		double[] temperature =   {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};
		double[] precipitation = {5.4,  4.6,  6.5,  3.6,  5.0,  6.9,  8.0,  7.0,  5.0,  3.3,  3.9,  4.1};
		
		
		//alternate climate data for Detroit, Michigan  (in Fahrenheit and inches)
		/*
		String location = "Detroit, Michigan";
		double[] temperature =   {22.9, 25.4, 35.7, 47.3, 58.4, 67.6, 72.3, 70.5, 63.2, 51.2, 40.2, 28.3};
		double[] precipitation = {1.8,  1.7,  2.5,  3.0,  2.9,  3.6,  3.2,  3.4,  2.9,  2.1,  2.7,  2.8};
		//the temperature average should be: 48.6 degrees Fahrenheit
		//the annual precipitation should be: 32.6 inches
		*/
		
		//variables
		String[] months = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
		double average = 0.0;
		double annual = 0.0;
		
		String precipitationMeasurement = "";
	
		
		//convert to Celsius (if necessary)
		if(temperatureScale.equals("C"))
		{
			for(int i = 0; i < temperature.length; i++)
			{
				temperature[i] = ((temperature[i] -32) * 5) / 9;
			}
		}
		
		//convert to centimeters (if necessary)
		if(precipitationScale.equals("c"))
		{
			for(int i = 0; i < precipitation.length; i++)
			{
				precipitation[i] /= 0.39370;
			}
		}
		
		//calculate the average and the annual precipitation
		
		//average
		for(int i = 0; i < temperature.length; i++)
		{
			average += temperature[i];
		}
		average /= temperature.length;
		
		
		//annual
		for(int i = 0; i < precipitation.length; i++)
		{
			annual += precipitation[i];
		}
		
		
		//convert the precipitation scale to text
		if(precipitationScale.equals("i"))
		{
			precipitationMeasurement = "in.";
		}
		else if(precipitationScale.equals("c"))
		{
			precipitationMeasurement = "cm.";
		}
		
		//print everything out to the menu
		
		//print out the location, temperature scale, and the precipitation measurement scale
		System.out.printf("%21s%s%n%n", "Location: ", location);
		System.out.printf("%23s%-5s","Temperature ",temperatureScale);
		System.out.printf("%s%s%n", "Precipitation ", precipitationMeasurement);
		System.out.println("*********************************************");
		//print out the data
		for(int i = 0; i < months.length; i++)
		{
			System.out.printf("%-17s%-19.1f%-17.1f%n", months[i], temperature[i], precipitation[i]);
		}
		System.out.println("*********************************************");
		//print out the average temperature and the annual rainfall
		System.out.printf("%17s%-10.1f", "Average: ", average);
		System.out.printf("%s%-10.1f", "Annual: ", annual);
		
		
		
		
		
	}
}
