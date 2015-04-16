import java.util.ArrayList;

/*
 * By Cole Hudson
 * Date: 4/5/2015
 * Purpose: 
 * 
 * PMR in README.txt
 */
public class TestStudent 
{
	public static void main(String[] args)
	{
		Class array = new Class(new ArrayList<Student>(){{
			add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));	
			add(new Student("Max Gerard", 80, 85, 90, 85, 80));	
			add(new Student("Jean Smith", 50, 79, 89, 99, 100));	
			add(new Student("Betty Farm", 85, 80, 85, 88, 89));	
			add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
		}});
		
		//starting gradebook
		System.out.println("Starting Gradebook:\n");
		array.printBook();
		
		//changing a name
		System.out.println("Changing Betty's name to Betty Boop: \n");
		array.replaceName("Betty Farm", "Betty Boop");
		array.printBook();
		
		//changing a quiz score
		System.out.println("Changing Jean's quiz 1 score to 80: \n");
		array.replaceQuiz("Jean Smith", 1, 80);
		array.printBook();
		
		//replacing a student
		System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90: \n");
		array.replaceStudent("Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
		array.printBook();
		
		//inserting a student
		System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100, before Betty: \n");
		array.insertStudent("Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
		array.printBook();
		
		//deleting a student
		System.out.println("Deleting Max Gerard: \n");
		array.deleteStudent("Max Gerard");
		array.printBook();
		
	}
}
