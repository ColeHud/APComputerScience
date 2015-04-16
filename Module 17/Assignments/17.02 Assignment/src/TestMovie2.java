/*
 * By Cole Hudson
 * Date: 4/8/2015
 * Purpose: Use sorting methods to sort movies by title, year, and studio
 * 
 * PMR in README.txt
 */
public class TestMovie2 
{
	public static void main(String[] args)
	{
		//array of movies
		Movie2[] myMovies = {
				new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
				new Movie2("Mulan Special Edition", 2004, "Disney"),
				new Movie2("Shrek 2", 2004, "Dreamworks"),
				new Movie2("The Incredibles", 2004, "Pixar"),
				new Movie2("Nanny McPhee", 2006, "Universal"),
				new Movie2("The Curse of the Were‐Rabbit", 2006, "Aardman"),
				new Movie2("Ice Age", 2002, "20th Century Fox"),
				new Movie2("Lilo & Stitch", 2002, "Disney"),
				new Movie2("Robots", 2005, "20th Century Fox"),
				new Movie2("Monsters Inc", 2001, "Pixar")
		};

		//original
		System.out.println("Before Sorting: ");
		printMovies(myMovies);
		System.out.println();
		
		//title ascending
		System.out.println("Sorted by Title - ascending:");
		myMovies = sortTitles(myMovies, 1);
		printMovies(myMovies);
		System.out.println();
		
		//year descending
		System.out.println("Sorted by Year - descending");
		myMovies = sortYears(myMovies, 2);
		printMovies(myMovies);
		System.out.println();
		
		//studio ascending
		System.out.println("Sorted by Studio - ascending:");
		myMovies = sortStudios(myMovies, 1);
		printMovies(myMovies);
		System.out.println();
	}

	//methods

	//print each movie name, year, and studio
	public static void printMovies(Movie2[] movies)
	{
		System.out.println("========================================================");
		for(Movie2 movie : movies)
		{
			System.out.println(movie);
		}
	}

	//sort movies by title 1 = ascending, 2 = descending
	public static Movie2[] sortTitles(Movie2[] source, int direction)
	{
		Movie2[] returnArray = new Movie2[source.length];

		for ( int i = 0 ; i < source.length ; i++ )
		{
			Movie2 next = source[ i ];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				//ascending
				if (next.getTitle().compareTo(returnArray[k - 1].getTitle()) > 0 && direction == 1)
				{
					insertindex = k;
				}
				//descending
				else if(next.getTitle().compareTo(returnArray[k - 1].getTitle()) < 0 && direction == 2)
				{
					insertindex = k;
				}
				else
				{
					returnArray[ k ] = returnArray[ k - 1 ];
				}
				k--;

			}

			returnArray[ insertindex ] = next;
		}

		return returnArray;
	}

	//sort movies by the year they were made
	public static Movie2[] sortYears(Movie2[] source, int direction)
	{
		Movie2[] returnArray = new Movie2[source.length];

		for (int i = 0 ; i < source.length ; i++)
		{
			Movie2 next = source[i];
			int insertindex = 0;
			int k = i;
			while ( k > 0 && insertindex == 0 )
			{
				//ascending
				if (next.getYear() > returnArray[k - 1].getYear() && direction == 1)
				{
					insertindex = k;
				}
				//descending
				else if(next.getYear() < returnArray[k - 1].getYear() && direction == 2)
				{
					insertindex = k;
				}
				else
				{
					returnArray[k] = returnArray[k - 1];
				}
				k--;
			}
			returnArray[insertindex] = next;
		}
		return returnArray;
	}


	//sort movies by the studio name
	public static Movie2[] sortStudios(Movie2[] source, int direction)
	{
		Movie2[] returnArray = new Movie2[source.length];

		//loop over each element in the source array
		for (int i = 0 ; i < source.length ; i++)
		{
			//the next element to be sorted
			Movie2 next = source[i];
			
			//the index at which to place the next element
			int insertindex = 0;
			
			//variable to take care of the current index
			//k is sort of like i, but it is used to go down through the array, not up
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				//ascending
				if (next.getStudio().compareTo(returnArray[k - 1].getStudio()) > 0 && direction == 1)
				{
					insertindex = k;
				}
				//descending
				else if(next.getStudio().compareTo(returnArray[k - 1].getStudio()) < 0 && direction == 2)
				{
					insertindex = k;
				}
				else
				{
					//duplicate the element to make room below it
					returnArray[k] = returnArray[k - 1];
				}
				k--;
			}

			//insert the element
			returnArray[ insertindex ] = next;
		}

		return returnArray;
	}

}
