/*
 * By Cole Hudson
 * Date: 3/26/2015
 * Purpose: Use traversal methods for voting
 * 
 * PMR in README.txt
 */
public class TestCandidate 
{
	public static void main(String[] args)
	{
		//array of candidates
		Candidate[] election = {new Candidate("John Smith", 5000), 
				new Candidate("Mary Miller", 4000), 
				new Candidate("Michael Duffy", 6000), 
				new Candidate("Tim Robinson", 2500), 
				new Candidate("Joe Ashtony", 1800)};
		
		//print header
		System.out.println("Results per candidate:");
		System.out.println("----------------------");
		
		//print individual votes
		printVotes(election);
		System.out.println();
		
		//print results
		printResults(election);
		
	}

	//print out each candidate
	public static void printVotes(Candidate[] candidates)
	{
		//individual candidates
		for(Candidate candidate: candidates)
		{
			System.out.println(candidate.getName() + " received " + candidate.getVotes() + " votes.");
		}
	}

	//get the total votes
	public static int getTotal(Candidate[] candidates)
	{
		int votes = 0;
		for(Candidate candidate: candidates)
		{
			votes += candidate.getVotes();
		}
		
		return votes;
	}
	
	//print the results
	public static void printResults(Candidate[] candidates)
	{
		System.out.printf("%-24s", "Candidate");
		System.out.printf("%-24s", "Votes Received");
		System.out.printf("%-24s %n", "% of Total Votes");
		
		for(Candidate candidate: candidates)
		{
			System.out.printf("%-24s", candidate.getName());
			System.out.printf("%-24d", candidate.getVotes());
			System.out.printf("%-24f %n", ((double)candidate.getVotes() / getTotal(candidates) * 100));
			
		}
		
		System.out.println();
		System.out.println("Total number of votes in election: " + getTotal(candidates));
	}


}
