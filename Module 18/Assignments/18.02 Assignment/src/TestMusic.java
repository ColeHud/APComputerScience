/*
 * By Cole Hudson
 * Date: 4/14/2015
 * Purpose: 
 * 
 * PMR in README.txt
 */
public class TestMusic 
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

		System.out.println("Music Library");
		System.out.println("--------------");

		printMusic(myMusic);

		//test sort
		System.out.println("\n\nSorted:\n--------------\n");
		sortYears(myMusic, 0, myMusic.length - 1, 1);
		printMusic(myMusic);


	}

	//print out a list of music
	public static void printMusic(Music2[] library)
	{
		for(Music2 music2 : library)
		{
			System.out.println(music2);
		}
	}

	//search to see if a specific title is in a list of music
	public static int searchTitle(Music2[] library, String title)
	{
		System.out.println("Search - Title - "+ title);

		int i = 0;
		while(i < library.length)
		{
			Music2 temp = library[i];

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
	public static Music2[] loadMusic(Music2[] library, Music2 song)
	{
		Music2[] returnLibrary = new Music2[library.length + 1];

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
	public static Music2[] searchYear(Music2[] library, int year)
	{
		System.out.println("Search - Year - " + year);
		System.out.println("Find results: ");

		Music2[] returnLibrary = new Music2[0];

		int i = 0;
		while(i < library.length)
		{
			Music2 temp = library[i];

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
	public static Music2[] searchSinger(Music2[] library, String singer)
	{
		System.out.println("Search - Singer - " + singer);
		System.out.println("Find results: ");

		Music2[] returnLibrary = new Music2[0];

		int i = 0;
		while(i < library.length)
		{
			Music2 temp = library[i];

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




	//SORTING

	//merge sort titles

	//sort
	public static void sortTitles(Music2[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		sortTitles(a, low, mid, direction);
		sortTitles(a, mid + 1, high, direction);

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



	//merge sort years
	//sort
	public static void sortYears(Music2[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		sortYears(a, low, mid, direction);
		sortYears(a, mid + 1, high, direction);

		mergeYears(a, low, mid, high, direction);
	}

	//merge
	public static void mergeYears(Music2[] a, int low, int mid, int high, int direction)
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
			else if(a[i].getYear() < a[j].getYear() && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getYear() > a[j].getYear() && direction == 2)
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

	//merge sort singers

}	
