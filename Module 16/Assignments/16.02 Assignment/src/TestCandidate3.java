/*
 * By Cole Hudson
 * 3/27/2015
 * Purpose: Add replacement methods to the election program
 * 
 * PMR in README.txt
 */
public class TestCandidate3 
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

		//print results
		printResults(election);
		System.out.println();
		
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
}
