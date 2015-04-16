/*
 * By Cole Hudson
 * Date: 4/12/2015
 * Purpose: Use selection sort to sort movies by title, year, and studio.
 * 
 * PMR in README.txt
 */
public class TestMovie3 
{
	public static void main(String[] args)
	{
		//array of movies
		Movie3[] myMovies = {
				new Movie3("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
				new Movie3("Mulan Special Edition", 2004, "Disney"),
				new Movie3("Shrek 2", 2004, "Dreamworks"),
				new Movie3("The Incredibles", 2004, "Pixar"),
				new Movie3("Nanny McPhee", 2006, "Universal"),
				new Movie3("The Curse of the Were‐Rabbit", 2006, "Aardman"),
				new Movie3("Ice Age", 2002, "20th Century Fox"),
				new Movie3("Lilo & Stitch", 2002, "Disney"),
				new Movie3("Robots", 2005, "20th Century Fox"),
				new Movie3("Monsters Inc", 2001, "Pixar")
		};

		//original
		System.out.println("Before Sorting: ");
		printMovies(myMovies);
		System.out.println();

		//title ascending
		System.out.println("Sorted by Title - descending:");
		myMovies = sortTitles(myMovies, 2);
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
	public static void printMovies(Movie3[] movies)
	{
		System.out.println("========================================================");
		for(Movie3 movie : movies)
		{
			System.out.println(movie);
		}
	}

	//sort movies by title 1 = ascending, 2 = descending
	public static Movie3[] sortTitles(Movie3[] source, int direction)
	{
		int posmax;

		for (int i = source.length - 1 ; i > 0 ; i-- )
		{
			posmax = 0;

			for (int k = 1 ; k <= i ; k++ )
			{
				String kTitle = source[k].getTitle();
				String posmaxTitle = source[posmax].getTitle();

				if (kTitle.compareTo(posmaxTitle) > 0 && direction == 1)
				{
					posmax = k;
				}
				else if(kTitle.compareTo(posmaxTitle) < 0 && direction == 2)
				{
					posmax = k;
				}
			}

			Movie3 temp = source[i];
			source[ i ] = source[ posmax ];
			source[ posmax ] = temp;
		}
		return source;
	}


	//sort movies by the year they were made
	public static Movie3[] sortYears(Movie3[] source, int direction)
	{
		int posmax;

		for (int i = source.length - 1 ; i > 0 ; i-- )
		{
			posmax = 0;

			for (int k = 1 ; k <= i ; k++ )
			{
				int kYear = source[k].getYear();
				int posmaxYear = source[posmax].getYear();

				if (kYear > posmaxYear && direction == 1)
				{
					posmax = k;
				}
				else if(kYear < posmaxYear && direction == 2)
				{
					posmax = k;
				}
			}

			Movie3 temp = source[i];
			source[ i ] = source[ posmax ];
			source[ posmax ] = temp;
		}
		return source;

	}


	//sort movies by the studio name
	public static Movie3[] sortStudios(Movie3[] source, int direction)
	{
		int posmax;

		//loop over every element in the array, starting from the back
		for (int i = source.length - 1 ; i > 0 ; i-- )
		{
			//position of the maximum
			posmax = 0;

			//loop over the objects that haven't been sorted yet
			for (int k = 1 ; k <= i ; k++ )
			{
				//two objects to be compared
				String kStudio = source[k].getStudio();
				String posmaxStudio = source[posmax].getStudio();

				//compare the iterator with the max
				if (kStudio.compareTo(posmaxStudio) > 0 && direction == 1)
				{
					posmax = k;
				}
				else if(kStudio.compareTo(posmaxStudio) < 0 && direction == 2)
				{
					posmax = k;
				}
			}

			//move them into position
			Movie3 temp = source[i];
			source[ i ] = source[ posmax ];
			source[ posmax ] = temp;
		}
		return source;
	}
}
