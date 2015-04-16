/*
 * By Cole Hudson
 * Date: 4/13/2015
 * Purpose: Create sequential search methods for a music library.
 * 
 * PMR in README.txt
 */
public class TestMusic 
{
	public static void main(String[] args)
	{
		//array of music
		Music[] myMusic = {
				new Music("Pieces of You", 1994, "Jewel"),	
				new Music("Jagged Little Pill", 1995, "Alanis Morissette"),
				new Music("What If It’s You", 1995, "Reba McEntire"),
				new Music("Misunderstood", 2001, "Pink"),
				new Music("Laundry Service", 2001, "Shakira"),
				new Music("Taking the Long Way", 2006, "Dixie Chicks"),
				new Music("Under My Skin", 2004, "Avril Lavigne"),
				new Music("Let Go", 2002, "Avril Lavigne"),
				new Music("Let It Go", 2007, "Tim McGraw"),
				new Music("White Flag", 2004, "Dido")
		};

		//header
		System.out.println("Music Library:");
		System.out.println("--------------");

		//print library
		printMusic(myMusic);
		System.out.println();

		//search title
		searchTitle(myMusic, "Let Go");
		System.out.println();

		//search title
		searchTitle(myMusic, "Some Day");
		System.out.println();

		//search year
		searchYear(myMusic, 2001);
		System.out.println();

		//search year
		searchYear(myMusic, 2003);
		System.out.println();

		//search for a singer
		searchSinger(myMusic, "Avril Lavigne");
		System.out.println();

		//search for a singer
		searchSinger(myMusic, "Tony Curtis");
		System.out.println();
	}

	//print out a list of music
	public static void printMusic(Music[] library)
	{
		for(Music music : library)
		{
			System.out.println(music);
		}
	}

	//search to see if a specific title is in a list of music
	public static int searchTitle(Music[] library, String title)
	{
		System.out.println("Search - Title - "+ title);

		int i = 0;
		while(i < library.length)
		{
			Music temp = library[i];

			if(temp.getTitle().equalsIgnoreCase(title))
			{
				//print the music
				System.out.println("We found \"" + temp.getTitle() + "\" in the library:");
				System.out.println(temp.getTitle() + ", " + temp.getYear() + ", " + temp.getSinger());

				return i;
			}
			i++;
		}

		System.out.println("\"" + title + "\" is not in the library");
		return -1;
	}

	//load music
	public static Music[] loadMusic(Music[] library, Music song)
	{
		Music[] returnLibrary = new Music[library.length + 1];

		//load in originals
		for(int i = 0; i < library.length; i++)
		{
			returnLibrary[i] = library[i];
		}

		//add new
		returnLibrary[returnLibrary.length - 1] = song;

		return returnLibrary;
	}

	//find all music with the given year
	public static Music[] searchYear(Music[] library, int year)
	{
		System.out.println("Search - Year - " + year);
		System.out.println("Find results: ");

		Music[] returnLibrary = new Music[0];

		int i = 0;
		while(i < library.length)
		{
			Music temp = library[i];

			if(temp.getYear() == year)
			{
				returnLibrary = loadMusic(returnLibrary, temp);

				//print the song found
				System.out.println(temp);
			}
			i++;
		}

		if(returnLibrary.length > 0)
		{
			System.out.println("There were " + returnLibrary.length + " listings for " + year);
		}
		else
		{
			System.out.println("There are no listings for " + year);
		}

		return returnLibrary;
	}

	//find all music with a given singer
	public static Music[] searchSinger(Music[] library, String singer)
	{
		System.out.println("Search - Singer - " + singer);
		System.out.println("Find results: ");

		Music[] returnLibrary = new Music[0];

		int i = 0;
		while(i < library.length)
		{
			Music temp = library[i];

			if(temp.getSinger().equals(singer))
			{
				returnLibrary = loadMusic(returnLibrary, temp);

				//print the song found
				System.out.println(temp);
			}
			i++;
		}

		if(returnLibrary.length > 0)
		{
			System.out.println("There were " + returnLibrary.length + " listings for " + singer);
		}
		else
		{
			System.out.println("There are no listings for " + singer);
		}

		return returnLibrary;
	}

}	
