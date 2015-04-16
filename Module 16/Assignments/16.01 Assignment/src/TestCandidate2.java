import java.util.*;
/*
 * By Cole Hudson
 * Date: 3/26/2015
 * Purpose: Use traversal methods for voting, this time with an arraylist
 * 
 * PMR in README.txt
 */
public class TestCandidate2 
{
	public static void main(String[] args)
	{
		//array of candidates
		List<Candidate> election = new ArrayList<Candidate>();
		
		//add the candidates
		election.add(new Candidate("John Smith", 5000));
		election.add(new Candidate("Mary Miller", 4000));
		election.add(new Candidate("Michael Duffy", 6000));
		election.add(new Candidate("Tim Robinson", 2500));
		election.add(new Candidate("Joe Ashtony", 1800));
		
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
	public static void printVotes(List<Candidate> candidates)
	{
		//individual candidates
		for(Candidate candidate: candidates)
		{
			System.out.println(candidate.getName() + " received " + candidate.getVotes() + " votes.");
		}
	}

	//get the total votes
	public static int getTotal(List<Candidate> candidates)
	{
		int votes = 0;
		for(Candidate candidate: candidates)
		{
			votes += candidate.getVotes();
		}
		
		return votes;
	}
	
	//print the results
	public static void printResults(List<Candidate> candidates)
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
