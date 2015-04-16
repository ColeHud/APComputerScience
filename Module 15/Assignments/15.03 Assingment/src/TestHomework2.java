import java.util.ArrayList;
import java.util.List;


/*
 * By Cole Hudson
 * Date: 3/17/2015
 * Purpose: add an interface to process pages from your homework
 * 
 * PMR in README.txt
 */
public class TestHomework2 
{
	public static void main(String[] args)
	{
		//create the arraylist
		List<Homework2> homework = new ArrayList<Homework2>();

		//create each homework element
		MyMath2 math = new MyMath2();
		math.createAssignment(4);

		MyScience2 science = new MyScience2();
		science.createAssignment(6);

		MyEnglish2 english = new MyEnglish2();
		english.createAssignment(10);

		MyJava2 java = new MyJava2();
		java.createAssignment(5);

		//add each homework element
		homework.add(math);
		homework.add(science);
		homework.add(english);
		homework.add(java);


		//print out results
		for(Homework2 assignment : homework)
		{
			System.out.println("Before Reading:");
			System.out.println(assignment);
			System.out.println("After Reading:");
			assignment.doReading();
			System.out.println(assignment);
		}
	}
}
