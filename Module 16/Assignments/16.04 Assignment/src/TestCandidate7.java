/*
 * By Cole Hudson
 * 4/5/2015
 * Purpose: Add deletion methods to the election program
 * 
 * PMR in README.txt
 */
public class TestCandidate7 
{
	public static void main(String[] args)
	{
		//array of Candidate2s
		Candidate2[] election = {new Candidate2("John Smith", 5000), 
				new Candidate2("Mary Miller", 4000), 
				new Candidate2("Michael Duffy", 6000), 
				new Candidate2("Tim Robinson", 2500), 
				new Candidate2("Joe Ashtony", 1800),
				new Candidate2("Mickey Jones", 3000),
				new Candidate2("Rebecca Morgan", 2000),
				new Candidate2("Kathleen Turner", 8000),
				new Candidate2("Tory Parker", 500),
				new Candidate2("Ashton Davis", 10000)};

		//print header
		System.out.println("Original results:");
		System.out.println();
		printResults(election);
		System.out.println();

		//perform delection 1
		System.out.println("Deleted location 6 \n");
		election = deleteByLoc(election, 6);
		printResults(election);
		System.out.println();

		//perform delection 2
		System.out.println("Deleted Kathleen Turner \n");
		election = deleteByName(election, "Kathleen Turner");
		printResults(election);
		System.out.println();

		/*INSERTIONS
		printResults(election);
		System.out.println();

		//position insertion
		System.out.println("Added Mickey Duck, 14000 votes: ");
		election = insertPosition(election, 5, "Mickey Duck", 14000);
		System.out.println();
		printResults(election);
		System.out.println();

		//insert before candidate
		System.out.println("Added Donald Mouse, 100 votes: ");
		election = insertCandidate(election, "Kathleen Turner", "Donald Mouse", 100);
		System.out.println();
		printResults(election);
		 */

		/*REPLACEMENTS
		//make changes
		election = replaceName(election, "Michael Duffy", "John Elmos");
		System.out.println("Changing Michael Duffy to John Elmos: \n");
		printResults(election);
		System.out.println();

		election = replaceVotes(election, "Mickey Jones", 2500);
		System.out.println("Changing Mickey Jones votes to 2500: \n");
		printResults(election);
		System.out.println();

		election = replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
		System.out.println("Replacing Kathleen Turner with John Kennedy: \n");
		printResults(election);
		System.out.println();
		 */


	}

	//print out each candidate
	public static void printVotes(Candidate2[] candidates)
	{
		//individual candidates
		for(Candidate2 candidate: candidates)
		{
			System.out.println(candidate.getName() + " received " + candidate.getVotes() + " votes.");
		}
	}

	//get the total votes
	public static int getTotal(Candidate2[] candidates)
	{
		int votes = 0;
		for(Candidate2 candidate: candidates)
		{
			votes += candidate.getVotes();
		}

		return votes;
	}

	//print the results
	public static void printResults(Candidate2[] candidates)
	{
		System.out.printf("%-24s", "Candidate");
		System.out.printf("%-24s", "Votes Received");
		System.out.printf("%-24s %n", "% of Total Votes");

		for(Candidate2 candidate: candidates)
		{
			System.out.printf("%-24s", candidate.getName());
			System.out.printf("%-24d", candidate.getVotes());
			System.out.printf("%-24f %n", ((double)candidate.getVotes() / getTotal(candidates) * 100));

		}

		System.out.println();
		System.out.println("Total number of votes in election: " + getTotal(candidates));
	}

	//replace the names of candidates
	public static Candidate2[] replaceName(Candidate2[] candidates, String nameToFind, String replacementName)
	{
		//create the array to be returned
		Candidate2[] returnArray = candidates;

		//find and remove instances of the replacement name
		for(int i = 0; i < returnArray.length; i++)
		{
			if(returnArray[i].getName().equalsIgnoreCase(replacementName))
			{
				returnArray = removeFromArray(returnArray, i);
			}
		}


		//loop through the array, and search for the nameToFind
		for(int i = 0; i < returnArray.length; i++)
		{
			//if the name is equal
			if(returnArray[i].getName().equalsIgnoreCase(nameToFind))
			{
				returnArray[i].setName(replacementName);
			}
		}	

		return returnArray;
	}

	//remove an element from an array
	public static Candidate2[] removeFromArray(Candidate2[] array, int index)
	{
		Candidate2[] returnArray = new Candidate2[array.length - 1];

		int indexOfReturn = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(i!=index)
			{
				returnArray[indexOfReturn] = array[i];
				indexOfReturn++;
			}
		}

		return returnArray;
	}


	//replace the votes of candidates
	public static Candidate2[] replaceVotes(Candidate2[] candidates, String nameToFind, int replacementVotes)
	{
		//create the array to be returned
		Candidate2[] returnArray = candidates;

		//loop through the array, and search for the nameToFind
		for(int i = 0; i < returnArray.length; i++)
		{
			//if the name is equal
			if(returnArray[i].getName().equalsIgnoreCase(nameToFind))
			{
				returnArray[i].setVotes(replacementVotes);
			}
		}	

		return returnArray;
	}

	//replace a complete candidate
	public static Candidate2[] replaceCandidate(Candidate2[] candidates, String nameToFind, String replacementName, int replacementVotes)
	{
		//create the array to be returned
		Candidate2[] returnArray = candidates;

		//loop through the array, and search for the nameToFind
		for(int i = 0; i < returnArray.length; i++)
		{
			//if the name is equal
			if(returnArray[i].getName().equalsIgnoreCase(nameToFind))
			{
				returnArray[i].setName(replacementName);
				returnArray[i].setVotes(replacementVotes);
			}
		}	

		return returnArray;
	}

	//insert a candidate at a position
	public static Candidate2[] insertPosition(Candidate2[] array, int index, String name, int votes)
	{
		Candidate2[] returnArray = array;

		for(int i = returnArray.length - 1; i > index; i--)
		{
			returnArray[i] = returnArray[i - 1];
		}

		returnArray[index] = new Candidate2(name, votes);

		return returnArray;
	}

	//insert a candidate before a given candidate *this only works when there is only one instance of the findName
	public static Candidate2[] insertCandidate(Candidate2[] array, String findName, String name, int votes)
	{
		//find the index of the findName candidate
		int index = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].getName().equalsIgnoreCase(findName))
			{
				index = i;
			}
		}

		//copied code from insertPosition
		Candidate2[] returnArray = array;

		for(int i = returnArray.length - 1; i > index; i--)
		{
			returnArray[i] = returnArray[i - 1];
		}

		returnArray[index] = new Candidate2(name, votes);
		return returnArray;
	}

	//delete by location
	public static Candidate2[] deleteByLoc(Candidate2[] array, int position)
	{
		Candidate2[] returnArray = new Candidate2[array.length - 1];

		//add values to the array
		for(int i = 0; i < returnArray.length; i++)
		{
			if(i < position)
			{
				returnArray[i] = array[i];
			}
			else
			{
				returnArray[i] = array[i + 1];
			}
		}

		return returnArray;
	}

	//delete by name
	public static Candidate2[] deleteByName(Candidate2[] array, String name)
	{
		//check how many times the name occurs
		int occurencesOfName = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].getName().equalsIgnoreCase(name))
			{
				occurencesOfName++;
			}
		}

		Candidate2[] returnArray = new Candidate2[array.length - occurencesOfName];

		int arrayIndex = 0;
		for(int i = 0; i < returnArray.length; i++)
		{
			boolean foundNewValue = false;

			//keep searching for a new candidate whose name isn't the name to be deleted
			while(!foundNewValue)
			{
				if(!array[arrayIndex].getName().equalsIgnoreCase(name))
				{
					returnArray[i] = array[arrayIndex];
					foundNewValue = true;
					arrayIndex++;
				}
				else
				{
					arrayIndex++;
				}
			}

		}

		return returnArray;
	}
}
