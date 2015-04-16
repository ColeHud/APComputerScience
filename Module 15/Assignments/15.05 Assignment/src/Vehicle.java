/*
 * By Cole Hudson
 * 
 * Date: 3/22/2015
 * 
 * PMR in README.txt
 */
public abstract class Vehicle implements Product 
{
	String name;
	double cost;
	
	Vehicle(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() 
	{
		return name;
	}

	public double getCost() 
	{
		return cost;
	}

}
