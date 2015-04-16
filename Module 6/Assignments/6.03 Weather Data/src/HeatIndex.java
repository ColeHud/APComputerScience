/*
 * By Cole Hudson
 * 11/9/2014
 * Purpose: Write a program to calculate the monthly Heat Index for a specific city.
 * PMR in README.txt
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class HeatIndex {
	public static void main(String[] args)throws IOException
	{
		//file scanner for temperature
		Scanner temperatureScanner = new Scanner(new File("KeyWestTemp.txt"));
		//file scanner for humidity
		Scanner humidityScanner = new Scanner(new File("KeyWestHumid.txt"));
		
		//printwriter 
		PrintWriter printer = new PrintWriter(new File("results.txt"));
		
		//data arrays and name
		String location = "Key West, Florida";
		double[] temperatureSample = new double[12];
		int[] humiditySample = new int[12];
		double[] heatIndex = new double[12];
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec", "Avg"};
		
		//add the data for temperature and humidity to their respective arrays
		//create average temp and average humidity
		double averageTemp = 0.0;
		double averageHumidity = 0.0;
		for(int i = 0; i < 12 && temperatureScanner.hasNextDouble() && humidityScanner.hasNextInt(); i++)
		{
			temperatureSample[i] = temperatureScanner.nextDouble();
			humiditySample[i] = humidityScanner.nextInt();
			averageTemp += temperatureSample[i];
			averageHumidity += humiditySample[i];
		}
		averageTemp /= 12;
		averageHumidity /= 12;
		
		//calculate the heat index for each month
		//heat index variables
		double c1 = -42.379;
		double c2 = 2.04901523;
		double c3 = 10.14333127;
		double c4 = -0.22475541;
		double c5 = -6.83783 * Math.pow(10.0, -3.0);
		double c6 = -5.481717 * Math.pow(10.0, -2);
		double c7 = 1.2274 * Math.pow(10.0, -3.0);
		double c8 = 8.5282 * Math.pow(10.0, -4.0);
		double c9 = -1.99 * Math.pow(10.0, -6.0);
		
		double T = 0.0;
		double R = 0.0;
		
		double average = 0.0;
		
		//calculate the heat index
		for(int i = 0; i < 12; i++)
		{
			T = temperatureSample[i];
			R = humiditySample[i];
			if(temperatureSample[i] >= 80)
			{
				heatIndex[i] = c1 + (c2 * T) + (c3 * R) + (c4 * T * R) + (c5 * T * T) + (c6 * R * R) + (c7 * T * T * R) + (c8 * T * R * R) + (c9 * T * T * R * R);
			}
			else //handle numbers less than 80
			{
				heatIndex[i] = T;
			}
			average += heatIndex[i];
		}
		average /= 12.0;
		
		//print out results
		System.out.printf("%48s%s", "Heat Index: ", location);
		printer.printf("%48s%s", "Heat Index: ", location);
		System.out.println();
		printer.println();
		System.out.println();
		printer.println();
		System.out.printf("%52s%n" ,"Months");
		printer.printf("%52s%n" ,"Months");
		System.out.printf("                ");
		printer.printf("                ");
		
		//print months
		for(String month : months)
		{
			System.out.printf("%-7s" ,month);
			printer.printf("%-7s" ,month);
			
		}
		System.out.println();
		printer.println();
		System.out.println("********************************************************************************************************");
		printer.println("********************************************************************************************************");
		
		//print temperatures in Fahrenheit
		System.out.printf("%-13s", "Temp (F)");
		printer.printf("%-13s", "Temp (F)");
		for(double temp : temperatureSample)
		{
			System.out.printf("%7.1f", temp);
			printer.printf("%7.1f", temp);
			
		}
		System.out.printf("%7.1f", averageTemp);
		printer.printf("%7.1f", averageTemp);
		
		
		//print out humidity
		System.out.println();
		printer.println();
		System.out.printf("%-13s", "Humidity (%)");
		printer.printf("%-13s", "Humidity (%)");
		for(int humidity : humiditySample)
		{
			System.out.printf("%7d", humidity);
			printer.printf("%7d", humidity);
		}
		System.out.printf("%7.1f", averageHumidity);
		printer.printf("%7.1f", averageHumidity);
		System.out.println();
		printer.println();
		
		
		//print out the heat index
		System.out.printf("%-16s", "HI (F)");
		printer.printf("%-16s", "HI (F)");
		for(double heat : heatIndex)
		{
			System.out.printf("%-7.1f", heat);
			printer.printf("%-7.1f", heat);
		}
		//average heat index
		System.out.printf("%-1.1f", average);
		printer.printf("%-1.1f", average);
		
		
		System.out.println();
		printer.println();
		System.out.println("********************************************************************************************************");
		printer.println("********************************************************************************************************");
		
		printer.close();
		
	}
}
