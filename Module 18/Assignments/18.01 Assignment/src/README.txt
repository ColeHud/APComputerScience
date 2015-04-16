PROJECT TITLE: 18.01 Sequential Search
PURPOSE OF PROJECT: Create sequential search methods for a music library.
VERSION or DATE: 4/13/15
AUTHORS: C.Hudson

***************************   PMR  **************************************
 
<+s>: After merge sorting, sequential searching is no problem. This assignment went
by really quickly for me. The form of this assignment was very similar to the others
in that we created an array, wrote a few static methods, and then tested them.
      
<-s>: I have nothing negative to say about this assignment; everything went perfectly for me. 
           
*************************************************************************
One thing that I think would be cool is to design a class that basically is just a container for an
array of music and it's methods. I'm not a huge fan of static methods. It could look something like this:

public class MusicLibrary
{
	//variables
	public ArrayList<Music> library
	
	//getters, setters, etc.
	public void addMusic(Music m)
	
	//constructor(s)
	MusicLibrary()
	
	//methods
	public void printMusic()
	
	public int searchTitle(String title)
	
	public Music[] loadMusic(Music song)
	
	public Music[] searchYear(int year)
	
	public Music[] searchSinger(String singer)
}

