/*
 * By Cole Hudson
 * Date: 4/12/2015
 * Purpose: Use merge sort to sort movies by title, year, and studio.
 * 
 * PMR in README.txt
 */
public class TestMovie4 
{
	public static void main(String[] args)
	{
		//array of movies
		Movie4[] myMovies = {
				new Movie4("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
				new Movie4("Mulan Special Edition", 2004, "Disney"),
				new Movie4("Shrek 2", 2004, "Dreamworks"),
				new Movie4("The Incredibles", 2004, "Pixar"),
				new Movie4("Nanny McPhee", 2006, "Universal"),
				new Movie4("The Curse of the Were‐Rabbit", 2006, "Aardman"),
				new Movie4("Ice Age", 2002, "20th Century Fox"),
				new Movie4("Lilo & Stitch", 2002, "Disney"),
				new Movie4("Robots", 2005, "20th Century Fox"),
				new Movie4("Monsters Inc", 2001, "Pixar")
		};

		//original
		System.out.println("Before Sorting: ");
		printMovies(myMovies);
		System.out.println();

		int maxArray = myMovies.length - 1;

		//title ascending
		System.out.println("Sorted by Title - ascending:");
		sortTitles(myMovies, 0, maxArray, 1);
		printMovies(myMovies);
		System.out.println();
		
		//year descending
		System.out.println("Sorted by Year - descending");
		sortYears(myMovies, 0, maxArray, 2);
		printMovies(myMovies);
		System.out.println();

		//studio ascending
		System.out.println("Sorted by Studio - ascending:");
		sortStudios(myMovies, 0, maxArray, 1);
		printMovies(myMovies);
		System.out.println();
		
	}

	//methods

	//print each movie name, year, and studio
	public static void printMovies(Movie4[] movies)
	{
		System.out.println("========================================================");
		for(Movie4 movie : movies)
		{
			System.out.println(movie);
		}
	}

	//sort movies by title 
	public static void sortTitles(Movie4[] a, int low, int high, int direction)
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

	//merge two arrays of movies based on titles
	public static void mergeTitles(Movie4[] a, int low, int mid, int high, int direction)
	{
		Movie4[] temp = new Movie4[high - low + 1];

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

	//sort movies by the year they were made
	public static void sortYears(Movie4[] a, int low, int high, int direction)
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

	//merge years
	public static void mergeYears(Movie4[] a, int low, int mid, int high, int direction)
	{
		Movie4[] temp = new Movie4[high - low + 1];

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
			else if(a[i].getYear() > a[j].getYear()  && direction == 2)
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

	//sort movies by the studio name
	public static void sortStudios(Movie4[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		sortStudios(a, low, mid, direction);
		sortStudios(a, mid + 1, high, direction);

		mergeStudios(a, low, mid, high, direction);
	}

	//merge two arrays of movies based on studios
	public static void mergeStudios(Movie4[] a, int low, int mid, int high, int direction)
	{
		Movie4[] temp = new Movie4[high - low + 1];

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
			else if(a[i].getStudio().compareTo(a[j].getStudio()) < 0 && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getStudio().compareTo(a[j].getStudio()) > 0 && direction == 2)
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


}
