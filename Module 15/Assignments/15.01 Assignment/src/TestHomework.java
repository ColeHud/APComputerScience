import java.util.ArrayList;

/*
 * By Cole Hudson
 * Date: 3/15/2015
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 * PMR in README.txt
 */
public class TestHomework 
{
	public static void main(String[] args)
	{
		//create arraylist
		ArrayList<Homework> homework = new ArrayList<Homework>();
		
		//create each homework element
		MyMath math = new MyMath();
		math.createAssignment(4);
		
		MyScience science = new MyScience();
		science.createAssignment(6);
		
		MyEnglish english = new MyEnglish();
		english.createAssignment(10);
		
		MyJava java = new MyJava();
		java.createAssignment(5);
		
		//add each homework element
		homework.add(math);
		homework.add(science);
		homework.add(english);
		homework.add(java);
		
		
		//print each assignment
		for(Homework assignment : homework)
		{
			System.out.println(assignment);
		}
		
	}
}
