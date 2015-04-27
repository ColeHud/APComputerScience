/*
 * By Cole Hudson
 * Date: 4/26/2015
 * Purpose: Use assertions and exceptions to keep track of students
 * 
 * PMR in README.txt
 */
public class TestProgStudentData 
{
	public static void main(String[] args)
	{
		/*
		//test exceptions
		double[] scores = {100, 78, 100, 68};
		StudentData exceptionStudent = new StudentData("", "Doe", scores);
		
		*/
		
		//create students
		double[] student1Scores = {89, 78, 95, 63, 94};
		StudentData student1 = new StudentData("John", "Doe", student1Scores);
		
		double[] student2Scores = {88, 90, 100, 88, 90, 100};
		StudentData student2 = new StudentData("Lindsay", "Green", student2Scores);
		
		//print the students
		System.out.println(student1);
		System.out.println(student2);
	}
}
