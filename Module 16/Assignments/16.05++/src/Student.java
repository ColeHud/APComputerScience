/*
 * By Cole Hudson
 * Date: 4/5/2015
 * Purpose: 
 * 
 * PMR in README.txt
 */
public class Student 
{
	//instance variables
	private String name;
	private int qz1;
	private int qz2;
	private int qz3;
	private int qz4;
	private int qz5;
	
	//getters
	public int getQuiz(int number)
	{
		switch (number)
		{
			case 1: return qz1;
			case 2: return qz2;
			case 3: return qz3;
			case 4: return qz4;
			case 5: return qz5;
			default: return (Integer) null;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	//setters
	public void setQuiz(int number, int score)
	{
		switch (number)
		{
			case 1: qz1 = score;
				break;
			case 2: qz2 = score;
				break;
			case 3: qz3 = score;
				break;
			case 4: qz4 = score;
				break;
			case 5: qz5 = score;
				break;
			default: System.out.println("Invalid setQuiz!!!");
				break;
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	//constructor
	Student(String name)
	{
		this.name = name;
	}
	
	//alternate constructor
	Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
	{
		this.name = name;
		qz1 = quiz1;
		qz2 = quiz2;
		qz3 = quiz3;
		qz4 = quiz4;
		qz5 = quiz5;
	}
	
	//other methods
	
	//to string
	public String toString()
	{
		//            ||  fancy! Like printf for strings!
		//            \/   
		return String.format("%-16s%-8d%-8d%-8d%-8d%-8d", name, qz1, qz2, qz3, qz4, qz5);
	}
	
}
