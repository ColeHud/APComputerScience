/*
 * By Cole Hudson
 * 4/1/2015
 * Purpose: Add insertion methods to the election program
 * 
 * PMR in README.txt
 */
import java.util.ArrayList;
public class TestCandidate6 
{
	public static void main(String[] args)
	{
		//array of Candidate2s
		ArrayList<Candidate2> election = new ArrayList<Candidate2>();
		election.add(new Candidate2("John Smith", 5000));
		election.add(new Candidate2("Mary Miller", 4000));
		election.add(new Candidate2("Michael Duffy", 6000)); 
		election.add(new Candidate2("Tim Robinson", 2500));
		election.add(new Candidate2("Joe Ashtony", 1800));
		election.add(new Candidate2("Mickey Jones", 3000));
		election.add(new Candidate2("Rebecca Morgan", 2000));
		election.add(new Candidate2("Kathleen Turner", 8000));
		election.add(new Candidate2("Tory Parker", 500));
		election.add(new Candidate2("Ashton Davis", 10000));

		//print header
		System.out.println("Original results:");
		System.out.println();

		//print results
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
	public static void printVotes(ArrayList<Candidate2> candidates)
	{
		//individual candidates
		for(Candidate2 candidate: candidates)
		{
			System.out.println(candidate.getName() + " received " + candidate.getVotes() + " votes.");
		}
	}

	//get the total votes
	public static int getTotal(ArrayList<Candidate2> candidates)
	{
		int votes = 0;
		for(Candidate2 candidate: candidates)
		{
			votes += candidate.getVotes();
		}

		return votes;
	}

	//print the results
	public static void printResults(ArrayList<Candidate2> candidates)
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
	public static ArrayList<Candidate2> replaceName(ArrayList<Candidate2> candidates, String nameToFind, String replacementName)
	{
		//create the array to be returned
		ArrayList<Candidate2> returnArray = candidates;

		//find and remove instances of the replacement name
		for(int i = 0; i < returnArray.size(); i++)
		{
			if(returnArray.get(i).getName().equalsIgnoreCase(replacementName))
			{
				returnArray = removeFromArray(returnArray, i);
			}
		}


		//loop through the array, and search for the nameToFind
		for(int i = 0; i < returnArray.size(); i++)
		{
			//if the name is equal
			if(returnArray.get(i).getName().equalsIgnoreCase(nameToFind))
			{
				returnArray.get(i).setName(replacementName);
			}
		}	

		return returnArray;
	}

	//remove an element from an array
	public static ArrayList<Candidate2> removeFromArray(ArrayList<Candidate2> array, int index)
	{
		ArrayList<Candidate2> returnArray = new ArrayList<Candidate2>(array.size() - 1);

		int indexOfReturn = 0;
		for(int i = 0; i < array.size(); i++)
		{
			if(i!=index)
			{
				returnArray.set(indexOfReturn, array.get(i));
				indexOfReturn++;
			}
		}

		return returnArray;
	}


	//replace the votes of candidates
	public static ArrayList<Candidate2> replaceVotes(ArrayList<Candidate2> candidates, String nameToFind, int replacementVotes)
	{
		//create the array to be returned
		ArrayList<Candidate2> returnArray = candidates;

		//loop through the array, and search for the nameToFind
		for(int i = 0; i < returnArray.size(); i++)
		{
			//if the name is equal
			if(returnArray.get(i).getName().equalsIgnoreCase(nameToFind))
			{
				returnArray.get(i).setVotes(replacementVotes);
			}
		}	

		return returnArray;
	}

	//replace a complete candidate
	public static ArrayList<Candidate2> replaceCandidate(ArrayList<Candidate2> candidates, String nameToFind, String replacementName, int replacementVotes)
	{
		//create the array to be returned
		ArrayList<Candidate2> returnArray = candidates;

		//loop through the array, and search for the nameToFind
		for(int i = 0; i < returnArray.size(); i++)
		{
			//if the name is equal
			if(returnArray.get(i).getName().equalsIgnoreCase(nameToFind))
			{
				returnArray.get(i).setName(replacementName);
				returnArray.get(i).setVotes(replacementVotes);
			}
		}	

		return returnArray;
	}

	//insert a candidate at a position
	public static ArrayList<Candidate2> insertPosition(ArrayList<Candidate2> array, int index, String name, int votes)
	{
		ArrayList<Candidate2> returnArray = array;
		/*
		for(int i = returnArray.size() - 1; i > index; i--)
		{
			returnArray.set(i, returnArray.get(i - 1));
		}

		returnArray.set(index, new Candidate2(name, votes));
		*/
		returnArray.add(index, new Candidate2(name, votes));
		return returnArray;
	}

	//insert a candidate before a given candidate *this only works when there is only one instance of the findName
	public static ArrayList<Candidate2> insertCandidate(ArrayList<Candidate2> array, String findName, String name, int votes)
	{
		//find the index of the findName candidate
		int index = 0;
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i).getName().equalsIgnoreCase(findName))
			{
				index = i;
			}
		}
		
		ArrayList<Candidate2> returnArray = array;
		/*
		for(int i = returnArray.size() - 1; i > index; i--)
		{
			returnArray.set(i, returnArray.get(i - 1));
		}

		returnArray.set(index, new Candidate2(name, votes));
		*/
		
		returnArray.add(index, new Candidate2(name, votes));
		return returnArray;
	}



}
