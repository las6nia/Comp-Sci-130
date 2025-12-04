package class23;

import java.util.ArrayList; //this is the library where we can use array list - Dynamic - Unlimited capacity

public class NextTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// New topic - 1d and 2d arrays - these have limited capacity that you can exc
		// example:

		int[] A = new int[50]; // this is the max capacity
		int[][] B = new int[5][4];

		// Dynamic data structure - No limit , weve been using dynamic
		// In this couse - we cover array lists

		// Dynamic - no limit - Unlimited data structure

		// How can we create an array list??
		// task: create an array called AA that stores string
		ArrayList<String> AA = new ArrayList<String>();

//		 ArrayList <int> BB = new ArrayList <int>(); //error - we do this:

		ArrayList<Integer> BB = new ArrayList<Integer>();

		// we do double like this:
		ArrayList<Double> CC = new ArrayList<Double>();
		// Characters:
		ArrayList<Character> DD = new ArrayList<Character>();

		// To add value we have to use .add() for the arrays:

		// task: create an array list that stores your friends in facebook:

		ArrayList<String> friendList = new ArrayList<String>();

		// write a code to add noah, mike, and john to list

		friendList.add("Noah"); //first in list
		friendList.add("Mike");
		friendList.add("John");//last in list
		// How will it look?

		// 3 friend, Noah will be at index 0, Mike at index 1, and John at index 2.
		// Note: when we add a new element into the lsit, it will be added at the bottom
		// of the list, at index 3 in this case. (from top to bottom)

		// java gives us a simple way to display the content of an array list by using
		// the print, printLn, and printf statements

		System.out.print(friendList);//prints [noah, mike, john]
		//or
		System.out.println(friendList);
		//or 
		System.out.printf("%s",friendList);
		
		//note: The current number of elements in an array list us named or called size. 
		System.out.printf("The number of my friends in facebook now is: %d\n\n\n", friendList.size()); //.size() will show the size which equals .length() in arrays, but in ArrayList is .size()
		
		//To access any index: .get() - it will pull the element from the arrayList
		
		System.out.printf("The first name in my friend list is: %s\n", friendList.get(0));

		System.out.printf("The first name in my friend list is: %s\n", friendList.get(2)); //This willl get John.
		
		//Assume that you do not how many names in list: write a statement that displays the last name in the list
		//my guess=
		System.out.printf("The last name in list is %s", friendList.size()-1);
		
		//The index of the last element
//				System.out.printf("The last name in list is %s", friendList.get(friendList.size()); ////FIXXXXXXXXXXXXXXXX
		
		//What if we do friendList.get(10)? it will not be -1, it will be an out of bound as we do not have it, it doesn't exist


		//How to get a copy:
		//write a backup copy that copies the array list:
		ArrayList<String> backup = friendList; 
		
		//Task: to verify, write a task that displays the first name in the backup:
		System.out.printf("\nThe name in the backup is %s", backup.get(0));
		
		// We got the get(), size(), and now set()
		
		//Task: write a code to change my second friend to "Sarah"
		System.out.printf("\nThe first name in my friend list is: %s\n", friendList.get(2)); //John
		friendList.set(2, "Sarah");	//The method takes 2 input, the first one is index, second one is new value
		System.out.printf("The first name in my friend list is: %s\n", friendList.get(2)); //it now prints sarah
		
		
		//We have: .size(), get(), .search(), contains() - boolean, set()
		
		//Check if Lili is in my friendList
		
		//.contains("value youre looking for") - this does the linear search for us, and returns a boolean values - don't forget - LINEAR SEARCH
		if (friendList.contains("Lili")==true) {
			System.out.print("Yes, lili is a friend");
		}
		else {
			System.out.print("She is not my friend\n\n\n");
		}
		
		friendList.add("Lola");
		friendList.add("James");
		friendList.add("Omar");
		
		System.out.print(friendList); //list with all names
		
		//.indexOf() - this will give you the index position??
		System.out.printf("\nThe index of omar is %s",friendList.indexOf("Omar")); //if omar wasn't in the list, omar would be
		
		//Exam: very similar to the midterm - december 18th
		
		
		
		

	}

}
