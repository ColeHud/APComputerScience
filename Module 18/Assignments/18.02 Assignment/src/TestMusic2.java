/*
 * By Cole Hudson
 * Date: 4/19/2015
 * Purpose: Use Binary Search to sort through lists of music.
 * 
 * PMR in README.txt
 */
public class TestMusic2 
{
	public static void main(String[] args)
	{
		//array of music
		Music2[] myMusic = {
				new Music2("Pieces of You", 1994, "Jewel"),	
				new Music2("Jagged Little Pill", 1995, "Alanis Morissette"),
				new Music2("What If It’s You", 1995, "Reba McEntire"),
				new Music2("Misunderstood", 2001, "Pink"),
				new Music2("Laundry Service", 2001, "Shakira"),
				new Music2("Taking the Long Way", 2006, "Dixie Chicks"),
				new Music2("Under My Skin", 2004, "Avril Lavigne"),
				new Music2("Let Go", 2002, "Avril Lavigne"),
				new Music2("Let It Go", 2007, "Tim McGraw"),
				new Music2("White Flag", 2004, "Dido")
		};

		//music library
		System.out.println("Music Library");
		System.out.println("--------------");
		printMusic(myMusic);

		//search for title
		System.out.println("\n");
		searchTitle(myMusic, "Misunderstood");

		//search for title
		System.out.println("\n");
		searchTitle(myMusic, "Under Paid");

		//search for year
		System.out.println("\n");
		searchYear(myMusic, 2005);

		//search for year
		System.out.println("\n");
		searchYear(myMusic, 2006);

		//search for singer
		System.out.println("\n");
		searchSinger(myMusic, "Darth Maul");
		
		//search for singer
		System.out.println("\n");
		searchSinger(myMusic, "Dido");

	}

	//print out a list of music
	public static void printMusic(Music2[] library)
	{
		for(Music2 music2 : library)
		{
			System.out.println(music2);
		}
	}

	//find all music with the given year
	public static Music2 searchYear(Music2[] library, int year)
	{
		System.out.println("Search - Year - " + year);

		for(int i = 0; i < library.length; i++)
		{
			if(library[i].getYear() == year)
			{
				System.out.println("Found: " + library[i].getTitle() + ", " + library[i].getYear() + ", " + library[i].getSinger());
				return library[i];
			}
		}

		System.out.println("Not found.");
		return null;

	}

	//find all music with a given singer
	public static Music2 searchSinger(Music2[] library, String singer)
	{
		System.out.println("Search - Singer - " + singer); 

		for(int i = 0; i < library.length; i++)
		{
			if(library[i].getSinger().equals(singer))
			{
				System.out.println("Found: " + library[i].getTitle() + ", " + library[i].getYear() + ", " + library[i].getSinger());
				return library[i];
			}
		}

		System.out.println("Not found.");
		return null;
	}


	//SORTING

	//merge sort titles

	//sort
	public static void mergeSortTitles(Music2[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		mergeSortTitles(a, low, mid, direction);
		mergeSortTitles(a, mid + 1, high, direction);

		mergeTitles(a, low, mid, high, direction);
	}

	//merge
	public static void mergeTitles(Music2[] a, int low, int mid, int high, int direction)
	{
		Music2[] temp = new Music2[high - low + 1];

		int i = low;
		int j = mid + 1;
		int n = 0;

		//sort the elements into temp
		while(i <= mid || j <= high)
		{
			//mid - high
			if(i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			//low - mid
			else if(j > high)
			{
				temp[n] = a[i];
				i++;
			}
			//compare
			else if(a[i].getTitle().compareTo(a[j].getTitle()) < 0 && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getTitle().compareTo(a[j].getTitle()) > 0 && direction == 2)
			{
				temp[n] = a[i];
				i++;
			}
			//smallest in j position
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}

		for(int k = low; k<= high; k++)
		{
			a[k] = temp[k - low];
		}
	}

	//binary search for a given title
	public static Music2 searchTitle(Music2[] library, String searchTitle)
	{
		System.out.println("Search - Title - " + searchTitle);

		//sort the library
		mergeSortTitles(library, 0, library.length - 1, 1);

		//high search, low, and middle
		int high = library.length;
		int low = -1;
		int probe;

		//as long as the search area is greater than one
		while(high - low > 1)
		{
			//set the probe to the middle
			probe = (high + low) / 2;

			//if the probe is after the search
			if(library[probe].getTitle().compareTo(searchTitle) > 0)
			{
				//set the high constraint to the middle of the current search
				high = probe;
			}
			else
			{
				//else, set the low constraint to the middle of the current search
				low = probe;
			}
		}

		//if the bottom matched 
		if((low >= 0) && (library[low].getTitle().compareTo(searchTitle) == 0))
		{
			String returnString = library[low].getTitle() + ", " + library[low].getYear() + ", " + library[low].getSinger();
			System.out.println("Found: " + returnString);
			return library[low];
		}
		else
		{
			System.out.println("Not Found.");
			return null;
		}
	}

}	
