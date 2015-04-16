/*
 * By Cole Hudson
 * Purpose: Calculate the average category, pressure, and wind speed of all Atlantic Hurricanes which have occurred from 1980 - 2006,
 * and tally the number of storms in each category.
 * Date: 11/9/2014
 * PMR in README.txt
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Hurricanes2 {
	public static void main(String[] args)throws IOException
	{
		//create a file scanner
		Scanner lineNumberScanner = new Scanner(new File("hurcdata.txt"));
		
		//find the length of the file (how many hurricanes)
		int numberOfHurricanes = 0;
		while(lineNumberScanner.hasNextLine())
		{
			lineNumberScanner.nextLine();
			numberOfHurricanes++;
		}
		lineNumberScanner.close();
		
		
		//collect the data
		Scanner fileScanner = new Scanner(new File("hurcdata.txt"));
		
		//arrays to store ifo
		int[] years = new int[numberOfHurricanes];
		int[] speeds = new int[numberOfHurricanes];
		int[] pressures = new int[numberOfHurricanes];
		String[] names = new String[numberOfHurricanes];
		
		for(int i = 0; i < numberOfHurricanes; i++)
		{
			//year
			years[i] = fileScanner.nextInt();
			//skip the month
			fileScanner.next();
			//pressure
			pressures[i] = fileScanner.nextInt();
			//speed (knots)
			speeds[i] = fileScanner.nextInt();
			//name
			names[i] = fileScanner.next();
			
		}
		fileScanner.close();
		
		//convert from knots to miles per hour
		for(int i = 0; i < speeds.length; i++)
		{
			speeds[i] *= 1.15078; //1.15078 miles to the knot
		}
		
		//calculate the category
		int[] categories = new int[numberOfHurricanes];
		for(int i = 0; i < categories.length; i++)
		{
			if(speeds[i] >= 74 && speeds[i] < 96)
			{
				categories[i] = 1;
			}
			else if (speeds [i] >= 96 && speeds[i] < 111)
			{
				categories[i] = 2;
			}
			else if(speeds[i] >= 111 && speeds[i] < 130)
			{
				categories[i] = 3;
			}
			else if(speeds[i] >= 130 && speeds[i] < 157)
			{
				categories[i] = 4;
			}
			else if(speeds[i] >= 157)
			{
				categories[i] = 5;
			}
		}
		
		//calculate the average category
		int categoryAverage = 0;
		for(int category : categories)
		{
			categoryAverage += category;
		}
		categoryAverage /= categories.length;
		
		//calculate the category maximum
		int max = Integer.MIN_VALUE;
		for(int category : categories)
		{
			if(category > max)
			{
				max = category;
			}
		}
		
		//calculate the category minimum
		int min = Integer.MAX_VALUE;
		for(int category : categories)
		{
			if(category < min)
			{
				min = category;
			}
		}
		
		//calculate the pressure average
		int pressureAverage = 0;
		for(int pressure : pressures)
		{
			pressureAverage += pressure;
		}
		pressureAverage /= pressures.length;
		
		//calculate the pressure maximum
		int pressureMax = Integer.MIN_VALUE;
		for(int pressure : pressures)
		{
			if(pressure > pressureMax)
			{
				pressureMax = pressure;
			}
		}
		
		//calculate the pressure minimum
		int pressureMin = Integer.MAX_VALUE;
		for(int pressure : pressures)
		{
			if(pressure < pressureMin)
			{
				pressureMin = pressure;
			}
		}
		
		//calculate the average wind speed
		int speedAverage = 0;
		for(int speed : speeds)
		{
			speedAverage += speed;
		}
		speedAverage /= speeds.length;
		
		//calculate the wind speed maximum
		int speedMax = Integer.MIN_VALUE;
		for(int speed : speeds)
		{
			if(speed > speedMax)
			{
				speedMax = speed;
			}
		}
		
		//calculate the wind speed minimum
		int speedMin = Integer.MAX_VALUE;
		for(int speed : speeds)
		{
			if(speed < speedMin)
			{
				speedMin = speed;
			}
		}
		
		//calculate the earliest year
		int earliestYear = Integer.MAX_VALUE;
		for(int year : years)
		{
			if(year < earliestYear)
			{
				earliestYear = year;
			}
		}
		
		//calculates the latest year
		int latestYear = Integer.MIN_VALUE;
		for(int year : years)
		{
			if(year > latestYear)
			{
				latestYear = year;
			}
		}
		
		//calculate the number of each category (I would use an array, but that doesn't make sense since there are only 5 possible categories
		int category1 = 0;
		int category2 = 0;
		int category3 = 0;
		int category4 = 0;
		int category5 = 0;
		for(int category : categories)
		{
			if(category == 1)
			{
				category1++;
			}
			else if(category == 2)
			{
				category2++;
			}
			else if(category == 3)
			{
				category3++;
			}
			else if(category == 4)
			{
				category4++;
			}
			else if(category == 5)
			{
				category5++;
			}	
		}
		
		//PRINT IT ALL OUT!
		System.out.printf("%33s%d - %d%n%n" ,"Hurricanes ", earliestYear, latestYear);
		System.out.printf("%-9s", "Year");
		System.out.printf("%-13s", "Hurricane");
		System.out.printf("%-13s", "Category");
		System.out.printf("%-18s", "Pressure (mb)");
		System.out.printf("%-16s", "Wind Speed (mph)");
		
		System.out.println();
		System.out.println("=====================================================================");
		
		//print out the data
		for(int i = 0; i < numberOfHurricanes; i++)
		{
			System.out.printf("%-10d", years[i]);
			System.out.printf("%-16s", names[i]);
			System.out.printf("%-13d", categories[i]);
			System.out.printf("%-19d", pressures[i]);
			System.out.printf("%-11d", speeds[i]);
			System.out.println();
		}
		System.out.println("=====================================================================");
		
		//file printer
		PrintWriter printer = new PrintWriter(new File("Summary.txt"));
		//print out the header to the file
		printer.printf("%-9s", "    ");
		printer.printf("%-13s", "         ");
		printer.printf("%-13s", "Category");
		printer.printf("%-18s", "Pressure (mb)");
		printer.printf("%-16s", "Wind Speed (mph)");
		printer.println();
		printer.println("=====================================================================");
		
		//averages
		System.out.printf("%-26s", "Average");
		System.out.printf("%-13d", categoryAverage);
		System.out.printf("%-19d", pressureAverage);
		System.out.printf("%-10d", speedAverage);
		System.out.println();
		
		printer.printf("%-26s", "Average");
		printer.printf("%-13d", categoryAverage);
		printer.printf("%-19d", pressureAverage);
		printer.printf("%-10d", speedAverage);
		printer.println();
		
		//maximums
		System.out.printf("%-26s", "Maximum");
		System.out.printf("%-13d", max);
		System.out.printf("%-19d", pressureMax);
		System.out.printf("%-10d", speedMax);
		System.out.println();
		
		printer.printf("%-26s", "Maximum");
		printer.printf("%-13d", max);
		printer.printf("%-19d", pressureMax);
		printer.printf("%-10d", speedMax);
		printer.println();
		
		//minimums
		System.out.printf("%-26s", "Minimum");
		System.out.printf("%-13d", min);
		System.out.printf("%-19d", pressureMin);
		System.out.printf("%-10d", speedMin);
		System.out.println();
		
		printer.printf("%-26s", "Minimum");
		printer.printf("%-13d", min);
		printer.printf("%-19d", pressureMin);
		printer.printf("%-10d", speedMin);
		printer.println();
		
		
		System.out.println();
		System.out.println();
		
		printer.println();
		printer.println();
		
		//print out the number of each category
		System.out.printf("%s%d%n", "Number of Category 1: ", category1);
		System.out.printf("%s%d%n", "Number of Category 2: ", category2);
		System.out.printf("%s%d%n", "Number of Category 3: ", category3);
		System.out.printf("%s%d%n", "Number of Category 4: ", category4);
		System.out.printf("%s%d%n", "Number of Category 5: ", category5);
		
		printer.printf("%s%d%n", "Number of Category 1: ", category1);
		printer.printf("%s%d%n", "Number of Category 2: ", category2);
		printer.printf("%s%d%n", "Number of Category 3: ", category3);
		printer.printf("%s%d%n", "Number of Category 4: ", category4);
		printer.printf("%s%d%n", "Number of Category 5: ", category5);
		
		printer.close();
	}
}
