/*
 * By Cole Hudson
 * 
 * Date: 3/22/2015
 * 
 * PMR in README.txt
 */
import java.util.*;
public class InventoryDemo 
{
	public static void main(String[] args)
	{
		//create a list of products
		List<Product> products = new ArrayList<Product>();
		products.add(new Car("Jaguar", 1000000.00));
		products.add(new Car("Tesla Model S", 70000.00));
		products.add(new Truck("Ford F150", 40000.00));
		products.add(new Truck("RAM", 35700));
		products.add(new Car("Tesla Model S", 90000));
		products.add(new Truck("Ford F150", 45000));
		products.add(new Tool("Soldering Iron", 15.00));
		products.add(new Tool("Soldering Iron", 15.00));
		products.add(new Tool("Soldering Iron", 15.00));
		products.add(new Tool("Multimeter", 100));
		products.add(new Tool("CircularSaw", 200));
		products.add(new Tool("CircularSaw", 150));
		
		//take inventory
		takeInventory(products, "Jaguar");
		takeInventory(products, "Tesla Model S");
		takeInventory(products, "Ford F150");
		takeInventory(products, "RAM");
		takeInventory(products, "Soldering Iron");
		takeInventory(products, "Multimeter");
		takeInventory(products, "CircularSaw");

		System.out.println();
		
		//create saws to test the compareTo() method
		Tool saw1 = new Tool("Normal Chainsaw", 100);
		Tool saw2 = new Tool("Lightning Blade", 1000000000);
		
		//compare the prices of the 2 saws
		if(saw1.compareTo(saw2) < 0)
		{
			System.out.println(saw1.getName() + " is cheaper than " + saw2.getName());
		}
		else if(saw1.compareTo(saw2) == 0)
		{
			System.out.println(saw1.getName() + " is the same price as " + saw2.getName());
		}
		else
		{
			System.out.println(saw1.getName() + " is more expensive than " + saw2.getName());
		}
	}
	
	public static void takeInventory(List<Product> products, String name)
	{
		int quantity = 0;
		double totalCost = 0;
		
		for(Product p : products)
		{
			if(p.getName().equals(name))
			{
				quantity += 1;
				totalCost += p.getCost();
			}
		}
		
		System.out.println(name + ":Quantity = " + quantity + ", Total cost = " + totalCost);
	}
}
