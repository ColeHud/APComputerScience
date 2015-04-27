/*
 * By Cole Hudson
 * Date: 4/26/2015
 * Purpose: Use assertions and exceptions to keep track of students
 * 
 * PMR in README.txt
 */
public class StudentData 
{
	//instance variables
	private String firstName;
	private String lastName;
	private double[] testScores;
	private char grade;
	
	//getters
	public String getFirstName() 
	{
		return firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public double[] getTestScores() 
	{
		return testScores;
	}
	
	//setters
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setTestScores(double[] testScores) 
	{
		this.testScores = testScores;
	}
	
	//constructor
	StudentData(String firstName, String lastName, double[] testScores)
	{
		this.firstName = firstName;
		if(firstName.length() == 0)
		{
			throw new IllegalArgumentException("Name must be longer than 0");
		}
		
		this.lastName = lastName;
		if(lastName.length() == 0)
		{
			throw new IllegalArgumentException("Name must be longer than 0");
		}
		
		this.testScores = testScores;
		
		courseGrade(testScores);
	}
	
	//alternate
	StudentData()
	{
		
	}
	
	//methods
	
	//toString
	public String toString()
	{
		String returnString = String.format("%-10s %-10s ", firstName, lastName);
		
		for(double score : testScores)
		{
			returnString += String.format("%-7.2f", score);
		}
		
		returnString += "  " + courseGrade(testScores);
		
		return returnString;
	}
	
	//course grade
	public char courseGrade(double[] list)
	{
		if(list.length == 0)
		{
			throw new IllegalArgumentException("Grade list can not be empty");
		}
		
		double average = 0.0;
		
		for(double score : list)
		{
			average += score;
		}
		
		average /= list.length;
		
		//course grades based off of my school
		if(average >= 93)
		{
			grade = 'A';
			return 'A';
		}
		else if(average >= 86)
		{
			grade = 'B';
			return 'B';
		}
		else if(average >= 79)
		{
			grade = 'C';
			return 'C';
		}
		else if(average >= 72)
		{
			grade = 'D';
			return 'D';
		}
		else if(average >= 65)
		{
			grade = 'E';
			return 'E';
		}
		
		grade = 'F';
		return 'F';
	}
	
	
}
