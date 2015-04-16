/*
 * By Cole Hudson
 * Date: 2/21/2015
 * Purpose: Create a class hierarchy of simple terrains
 * 
 * PMR in README.txt
 */
//test different classes
public class TestTerrain 
{
	public static void main(String[] args)
	{
		//objects
		Forest forestTerrain = new Forest(100, 200, 100);
		Mountain mountainTerrain = new Mountain(300, 400, 25);
		WinterMountain winterMountainTerrain = new WinterMountain(500, 600, 15, 10.0);
		
		//print out data
		System.out.println("Forest Land has dimensions " + forestTerrain.getDimensionX() + " X " + forestTerrain.getDimensionY() + " and has " + forestTerrain.getNumberOfTrees() + " trees.");
		System.out.println("Mountain Land has dimensions " + mountainTerrain.getDimensionX() + " X " + mountainTerrain.getDimensionY() + " and has " + mountainTerrain.getNumberOfMountains() + " mountains.");
		System.out.println("Winter Mountain Land has dimensions " + winterMountainTerrain.getDimensionX() + " X " + winterMountainTerrain.getDimensionY() + " and has temperature " + winterMountainTerrain.getTemperature() + " and " + winterMountainTerrain.getNumberOfMountains() + " mountains");
	}
}
