/*
 * By Cole Hudson
 * Date: 4/19/2015
 * Purpose: Use search algorithms on an array of contacts
 * 
 * PMR in README.txt
 */

import java.util.*;

public class TestContact 
{
	public static void main(String[] args)
	{
		//create array
		Contact[] myContacts = {
				new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com"),
				new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com"),
				new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com"),
				new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com"),
				new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com"),
				new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com")
		};

		//print contact list
		System.out.printf("%44s%n%n", "Contact List");
		System.out.printf("%-16s %-16s %-16s %-16s %-16s%n", "Name", "Relation", "Birthday", "Phone", "Email");
		System.out.println("--------------------------------------------------------------------------------");
		printContacts(myContacts);
		System.out.println("\n");

		//search by name
		findByName(myContacts, "Johnnie");
		System.out.println("\n");

		//search by name
		findByName(myContacts, "Sam Parker");
		System.out.println("\n");

		//search by relation
		findByRelation(myContacts, "friend");
		System.out.println("\n");

		//search by relation
		findByRelation(myContacts, "aunt");
		System.out.println("\n");

		//search by phone
		findByPhone(myContacts, "(333) 555-8989");
		System.out.println("\n");

		//search by phone
		findByPhone(myContacts, "(342) 555-7011");
		System.out.println("\n");

		//search by bday
		findByMonth(myContacts, "May");
		System.out.println("\n");

		//search by bday
		findByMonth(myContacts, "Mar");
		System.out.println("\n");

		//search by email
		findByEmail(myContacts, "rgoodman@hotmail.com");
		System.out.println("\n");

		//search by email
		findByEmail(myContacts, "susieE@hotmail.com");
		System.out.println("\n");
	}

	//methods

	//print contacts
	public static void printContacts(Contact[] array)
	{
		for(Contact person : array)
		{
			System.out.println(person);
		}
	}

	//find by name

	//merge sort by name
	public static void mergeSortContactName(Contact[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		mergeSortContactName(a, low, mid, direction);
		mergeSortContactName(a, mid + 1, high, direction);

		mergeContactName(a, low, mid, high, direction);
	}

	//merge name
	public static void mergeContactName(Contact[] a, int low, int mid, int high, int direction)
	{
		Contact[] temp = new Contact[high - low + 1];

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
			else if(a[i].getName().compareTo(a[j].getName()) < 0 && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getName().compareTo(a[j].getName()) > 0 && direction == 2)
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

	//binary search name
	public static Contact findByName(Contact[] array, String searchName)
	{
		System.out.println("Find Name - " + searchName);

		//sort the array
		mergeSortContactName(array, 0, array.length - 1, 1);

		//high search, low, and middle
		int high = array.length;
		int low = -1;
		int probe;

		//as long as the search area is greater than one
		while(high - low > 1)
		{
			//set the probe to the middle
			probe = (high + low) / 2;

			//if the probe is after the search
			if(array[probe].getName().compareTo(searchName) > 0)
			{
				//set the high constraint to the middle of the current search
				high = probe;
			}
			else
			{
				//else, set the low constraint to the middle of the current search
				low = probe;
			}
		}

		//if the bottom matched 
		if((low >= 0) && (array[low].getName().compareTo(searchName) == 0))
		{
			System.out.println("Found: " + array[low]);
			return array[low];
		}
		else
		{
			System.out.println("Not found.");
			return null;
		}
	}


	//find by relation
	public static ArrayList<Contact> findByRelation(Contact[] array, String searchRelation)
	{
		System.out.println("Find Relation - " + searchRelation);

		ArrayList<Contact> returnList = new ArrayList<Contact>();

		//sequential search for contact whose relation matches the search relation
		for(Contact person : array)
		{
			if(person.getRelation().equals(searchRelation))
			{
				returnList.add(person);
			}
		}

		//print list
		System.out.println("Find results:");
		for(Contact c : returnList)
		{
			System.out.println(c);
		}

		if(returnList.size() == 0)
		{
			System.out.println("There are no listings for " + searchRelation);
		}
		else
		{
			System.out.println("There were " + returnList.size() + " listings for " + searchRelation);
		}

		return returnList;
	}

	//find by month
	public static ArrayList<Contact> findByMonth(Contact[] array, String searchMonth)
	{
		System.out.println("Find Birthday - " + searchMonth);

		ArrayList<Contact> returnList = new ArrayList<Contact>();

		//sequential search for contact whose bday matches the search month
		for(Contact person : array)
		{
			if(person.getBday().substring(0, 3).equals(searchMonth))
			{
				returnList.add(person);
			}
		}

		//print list
		System.out.println("Find results:");
		for(Contact c : returnList)
		{
			System.out.println(c);
		}

		if(returnList.size() == 0)
		{
			System.out.println("There are no listings for " + searchMonth);
		}
		else
		{
			System.out.println("There were " + returnList.size() + " listings for " + searchMonth);
		}

		return returnList;
	}

	//find by phone
	public static ArrayList<Contact> findByPhone(Contact[] array, String searchNumber)
	{
		System.out.println("Find Phone - " + searchNumber);

		ArrayList<Contact> returnList = new ArrayList<Contact>();

		//sequential search for contact whose phone number matches the search phone number
		for(Contact person : array)
		{
			if(person.getPhone().equals(searchNumber))
			{
				returnList.add(person);
			}
		}

		//print list
		System.out.println("Find results:");
		for(Contact c : returnList)
		{
			System.out.println(c);
		}

		if(returnList.size() == 0)
		{
			System.out.println("There are no listings for " + searchNumber);
		}
		else
		{
			System.out.println("There were " + returnList.size() + " listings for " + searchNumber);
		}

		return returnList;
	}


	//find by email

	//merge sort by email
	public static void mergeSortContactEmail(Contact[] a, int low, int high, int direction)
	{
		//if it's a one-long array
		if(low == high)
		{
			return;
		}

		int mid = (low + high) / 2;

		mergeSortContactEmail(a, low, mid, direction);
		mergeSortContactEmail(a, mid + 1, high, direction);

		mergeContactEmail(a, low, mid, high, direction);
	}

	//merge email
	public static void mergeContactEmail(Contact[] a, int low, int mid, int high, int direction)
	{
		Contact[] temp = new Contact[high - low + 1];

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
			else if(a[i].getEmail().compareTo(a[j].getEmail()) < 0 && direction == 1)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i].getEmail().compareTo(a[j].getEmail()) > 0 && direction == 2)
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

	//binary search email
	public static Contact findByEmail(Contact[] array, String searchEmail)
	{
		System.out.println("Find Email - " + searchEmail);
		
		//sort the array
		mergeSortContactEmail(array, 0, array.length - 1, 1);

		//high search, low, and middle
		int high = array.length;
		int low = -1;
		int probe;

		//as long as the search area is greater than one
		while(high - low > 1)
		{
			//set the probe to the middle
			probe = (high + low) / 2;

			//if the probe is after the search
			if(array[probe].getEmail().compareTo(searchEmail) > 0)
			{
				//set the high constraint to the middle of the current search
				high = probe;
			}
			else
			{
				//else, set the low constraint to the middle of the current search
				low = probe;
			}
		}

		//if the bottom matched 
		if((low >= 0) && (array[low].getEmail().compareTo(searchEmail) == 0))
		{
			System.out.println("Found: " + array[low]);
			return array[low];
		}
		else
		{
			System.out.println("Not found.");
			return null;
		}
	}


}
