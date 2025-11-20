package Lecture21;
import java.util.Scanner;
//search

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
													//Class lecture - Parallel Arrays
		//Two or more arrays that have the same length (a must)
		//What is the point? The elements @ index i of 1st 2nd, and 3rd array, belong to a single record - the value of a 
		
		//example - object oriented?? the PLU, itemName, and Price - parallel arrays - 
		
		
		
									//Second project - Data arrays - student management system
		//3 arrays  for our values
		String [] names = new String [50];
		int [] ages = new int [50];
		double [] gpas = new double [50];
		int studentCount = 0;
		
		
		int userChoice;
		//read the first input
		System.out.print("Enter your choice: ");
		userChoice = input.nextInt();
		while (userChoice != 7) {
			switch (userChoice) {
			case 1:
				myLibrary.addSingleStudent(names, ages, gpas, studentCount);
				studentCount++;
				//Increment student count after 
				break;
			case 2:
				studentCount  =  myLibrary.addMultipleStudents(names, ages, gpas, studentCount);
				break;
			case 3:
				myLibrary.displayAllStudents(names, ages, gpas, studentCount);
				
				break;
			case 4:
				myLibrary.findStudentByName(names, ages, gpas, studentCount);
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				System.out.print("Invalid option, please try again!");
			} //end of switch
			myLibrary.displayMenu();
			System.out.print("Enter your choice: ");
			userChoice = input.nextInt();
			
			
		}//end of while
		System.out.print("Exiting program. Goodbye!");
		
		//Hello, it is currently 1:02, this is where the picture and lecture starts at - the students are being added into
		//The array and where the tables are being added.
		
		//task 1: adding a single student
		
														//Linear Search - search by name:
		
		
		
		
		

	}

}
