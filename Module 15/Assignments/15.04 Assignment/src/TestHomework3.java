import java.util.*;


/*
 * By Cole Hudson
 * Date: 3/22/2015
 * Purpose: implement the Comparable<T> interface
 * 
 * PMR in README.txt
 */
public class TestHomework3 
{
	public static void main(String[] args)
	{
		//create the arraylist
		List<Homework3> homework = new ArrayList<Homework3>();

		//create each homework element
		MyMath3 math = new MyMath3();
		math.createAssignment(4);

		MyScience3 science = new MyScience3();
		science.createAssignment(6);

		MyEnglish3 english = new MyEnglish3();
		english.createAssignment(4);

		MyJava3 java = new MyJava3();
		java.createAssignment(5);

		//add each homework element
		homework.add(math);
		homework.add(science);
		homework.add(english);
		homework.add(java);


		//print out results
		for(Homework3 assignment : homework)
		{
			System.out.println(assignment);
		}


		//sort the homework from least to greatest reading
		Collections.sort(homework);

		System.out.println();
		System.out.println("Sorted Homework");

		//print out sorted homework
		for(Homework3 assignment : homework)
		{
			System.out.println(assignment);
		}


		//check for assignments with equal value
		System.out.println();
		System.out.println("Equal sized assignments");

		List<String> combos = new ArrayList<String>();

		for(int i = 0; i < homework.size(); i++)
		{
			for(int j = 0; j < homework.size(); j++)
			{
				if(j != i)
				{
					if(!combos.contains(homework.get(i) + " " + homework.get(j)) && !combos.contains(homework.get(j) + " " + homework.get(i)))
					{
						if(homework.get(i).compareTo(homework.get(j)) == 0)
						{
							System.out.println("The homework for " + homework.get(i).typeHomework + " and " + homework.get(j).typeHomework + " are the same number of pages");
							combos.add(homework.get(i) + " " + homework.get(j));
						}
					}

				}
			}
		}


	}
}
