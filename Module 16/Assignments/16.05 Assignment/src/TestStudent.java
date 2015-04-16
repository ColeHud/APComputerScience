import java.util.ArrayList;

/*
 * By Cole Hudson
 * Date: 4/5/2015
 * Purpose: Use standard algorithm methods to create a class of students and quiz scores
 * 
 * PMR in README.txt
 */
public class TestStudent 
{
	public static void main(String[] args)
	{
		//create array of students
		//I checked out stackoverflow, and this was as close to initializing an arraylist with values as I could get
		ArrayList<Student> myClass = new ArrayList<Student>()
				{{
					add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));	
					add(new Student("Max Gerard", 80, 85, 90, 85, 80));	
					add(new Student("Jean Smith", 50, 79, 89, 99, 100));	
					add(new Student("Betty Farm", 85, 80, 85, 88, 89));	
					add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
				}};

				//starting gradebook
				System.out.println("Starting Gradebook:\n");
				printBook(myClass);
				System.out.println();
				
				//changing a name
				System.out.println("Changing Betty's name to Betty Boop: \n");
				myClass = replaceName(myClass, "Betty Farm", "Betty Boop");
				printBook(myClass);
				System.out.println();
				
				//changing a quiz score
				System.out.println("Changing Jean's quiz 1 score to 80: \n");
				myClass = replaceQuiz(myClass, "Jean Smith", 1, 80);
				printBook(myClass);
				System.out.println();
				
				//replacing a student
				System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90: \n");
				myClass = replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
				printBook(myClass);
				System.out.println();
				
				//inserting a student
				System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100, before Betty: \n");
				myClass = insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
				printBook(myClass);
				System.out.println();
				
				//deleting a student
				System.out.println("Deleting Max Gerard: \n");
				myClass = deleteStudent(myClass, "Max Gerard");
				printBook(myClass);
				System.out.println();
				
				/* My personal tests
				//original
				printBook(myClass);
				System.out.println();

				//test replaceName
				System.out.println("Replaced Max Gerard with Daffy Duck");
				myClass = replaceName(myClass, "Max Gerard", "Daffy Duck");
				printBook(myClass);
				System.out.println();

				//test replace quiz; replaced daffy duck's quiz2 score at 100%
				System.out.println("replaced daffy duck's quiz2 score at 100%");
				myClass = replaceQuiz(myClass, "Daffy Duck", 2, 100);
				printBook(myClass);
				System.out.println();

				//test replace student
				System.out.println("replaced daffy duck with bugs bunny; perfect scores");
				myClass = replaceStudent(myClass, "Daffy Duck", "Bugs Bunny", 100, 100, 100, 100, 100);
				printBook(myClass);
				System.out.println();

				//test insert a student
				System.out.println("inserted porky pig before bugs bunny");
				myClass = insertStudent(myClass, "Bugs Bunny", "Porky Pig", 10, 10, 10, 10, 10);
				printBook(myClass);
				System.out.println();
				
				//test insert a student
				System.out.println("Deleted bugs bunny");
				myClass = deleteStudent(myClass, "Bugs Bunny");
				printBook(myClass);
				System.out.println();
				*/
	}

	//printbook method: prints out all of the students
	public static void printBook(ArrayList<Student> myClass)
	{
		System.out.println(String.format("%-16s%-8s%-8s%-8s%-8s%-8s", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5"));
		System.out.println("--------------------------------------------------");
		for(Student student: myClass)
		{
			System.out.println(student);
		}
	}

	//replace name: replaces a student's name with a new one
	public static ArrayList<Student> replaceName(ArrayList<Student> array, String nameToReplace, String newName)
	{
		ArrayList<Student> returnArray = array;

		for(int i = 0; i < array.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(nameToReplace))
			{
				returnArray.get(i).setName(newName);
			}
		}

		return returnArray;
	}

	//replace a student's quiz grade
	public static ArrayList<Student> replaceQuiz(ArrayList<Student> array, String name, int quiz, int score)
	{
		ArrayList<Student> returnArray = array;

		for(int i = 0; i < array.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(name))
			{
				returnArray.get(i).setQuiz(quiz, score);
			}
		}

		return returnArray;
	}

	//replace a student, takes new student scores and name
	public static ArrayList<Student> replaceStudent(ArrayList<Student> array, String studentToReplace, String newName, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
	{
		ArrayList<Student> returnArray = array;

		for(int i = 0; i < array.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(studentToReplace))
			{
				returnArray.set(i, new Student(newName, quiz1, quiz2, quiz3, quiz4, quiz5));
			}
		}

		return returnArray;
	}

	//insert a student
	public static ArrayList<Student> insertStudent(ArrayList<Student> array, String studentToFind, String newName, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
	{
		ArrayList<Student> returnArray = array;

		int indexToPlaceAt = 0;
		for(int i = 0; i < returnArray.size(); i++)
		{
			if(array.get(i).getName().equalsIgnoreCase(studentToFind))
			{
				indexToPlaceAt = i;
			}
		}

		returnArray.add(indexToPlaceAt, new Student(newName, quiz1, quiz2, quiz3, quiz4, quiz5));

		return returnArray;
	}

	//delete a student
	public static ArrayList<Student> deleteStudent(ArrayList<Student> array, String nameToDelete)
	{
		ArrayList<Student> returnArray = array;

		for(int i = 0; i < returnArray.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(nameToDelete))
			{
				returnArray.remove(i);
			}
		}

		return returnArray;
	}


}
