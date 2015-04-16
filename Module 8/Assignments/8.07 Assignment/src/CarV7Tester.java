/*
 * By Cole Hudson
 * Purpose: Calculate the fuel economy of your family or personal car for one fill-up in terms of MPG and cost
 * Date: 14 December, 2014
 * 
 * PMR in README.txt
 */
public class CarV7Tester {
	//main method
	public static void main(String[] args)
	{
		//construct cars
		CarV7 car1 = new CarV7(98606, 98846, 13.277, "06 Toyota Sienna ", 2.56);
		CarV7 car2 = new CarV7(98606, 98846, 4.8,    "15 Toyota Prius  ", 2.56);
		CarV7 car3 = new CarV7(98606, 98846, 17.14,  "15 Toyota Sequoia", 2.56);
		
		//title
		CarV7.printTitle();
		
		//print data
		car1.printData();
		car2.printData();
		car3.printData();
	}
}
