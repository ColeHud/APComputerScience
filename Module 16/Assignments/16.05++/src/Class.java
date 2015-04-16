import java.util.ArrayList;

/*
 * By Cole Hudson
 * Date: 4/5/2015
 * Purpose: Use standard algorithm methods to create a class of students and quiz scores
 * 
 * PMR in README.txt
 */
public class Class 
{
	//variables
	private ArrayList<Student> myClass;

	//getters
	public ArrayList<Student> getMyClass()
	{
		return myClass;
	}

	//constructor
	Class()
	{
		myClass = new ArrayList<Student>();
	}
	//alternate constructor
	Class(ArrayList<Student> array)
	{
		myClass = array;
	}


	//printbook method: prints out all of the students
	public void printBook()
	{
		System.out.println(String.format("%-16s%-8s%-8s%-8s%-8s%-8s", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5"));
		System.out.println("--------------------------------------------------");
		for(Student student: myClass)
		{
			System.out.println(student);
		}
		System.out.println();
	}

	//replace name: replaces a student's name with a new one
	public ArrayList<Student> replaceName(String nameToReplace, String newName)
	{
		ArrayList<Student> returnArray = myClass;

		for(int i = 0; i < myClass.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(nameToReplace))
			{
				returnArray.get(i).setName(newName);
			}
		}

		return returnArray;
	}

	//replace a student's quiz grade
	public ArrayList<Student> replaceQuiz(String name, int quiz, int score)
	{
		ArrayList<Student> returnArray = myClass;

		for(int i = 0; i < myClass.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(name))
			{
				returnArray.get(i).setQuiz(quiz, score);
			}
		}

		return returnArray;
	}

	//replace a student, takes new student scores and name
	public ArrayList<Student> replaceStudent(String studentToReplace, String newName, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
	{
		ArrayList<Student> returnArray = myClass;

		for(int i = 0; i < myClass.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(studentToReplace))
			{
				returnArray.set(i, new Student(newName, quiz1, quiz2, quiz3, quiz4, quiz5));
			}
		}

		return returnArray;
	}

	//insert a student
	public ArrayList<Student> insertStudent(String studentToFind, String newName, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
	{
		ArrayList<Student> returnArray = myClass;

		int indexToPlaceAt = 0;
		for(int i = 0; i < returnArray.size(); i++)
		{
			if(myClass.get(i).getName().equalsIgnoreCase(studentToFind))
			{
				indexToPlaceAt = i;
			}
		}

		returnArray.add(indexToPlaceAt, new Student(newName, quiz1, quiz2, quiz3, quiz4, quiz5));

		return returnArray;
	}

	//delete a student
	public ArrayList<Student> deleteStudent(String nameToDelete)
	{
		ArrayList<Student> returnArray = myClass;

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
