package Lecture21; //change name of your package
import java.util.Scanner;

public class myLibrary { //Change name to your class
	static Scanner input = new Scanner(System.in);
	
	public static void displayMenu() { //start of display menu
		System.out.println("\n===== Comp Sci 130 Menu =====");
		System.out.println("1 - Add a single student");
		System.out.println("2 - Add multiple students");
		System.out.println("3 - Display all students");
		System.out.println("4 - Find a student by name");
		System.out.println("5 - Display the student with the highest GPA and lowest GPA");
		System.out.println("6 - Count the number of students with an age above a given threshold");
		System.out.println("7 - Exit");
		
	}//end of display method
	
	//A method that performs the option: add a single student
	//this methods yakes from the main methid : the three arrays : Names, ages, gpa
	//then it will read the students name, age, gpa from the user
	//Finally
	
	//minute 1:07pm
	public static void addSingleStudent(String [] names, int [] ages, double [] gpa , int studentCount) {//start of option 1, along with the student Update Count
		
		System.out.println("Adding a single student....");
		String inputedName ; int inputedAge; double inputedGpa; 
		System.out.print("Enter first name: ");
		inputedName = input.next();
		System.out.print("Enter your age: ");
		inputedAge = input.nextInt();
		System.out.print("Enter GPA: ");
		inputedGpa = input.nextDouble();
		//minute: 9 on recording note
		//We will add number at input of the index??
		//Add the inputed student info @ index = studentCount
		names [studentCount] = inputedName; ages[studentCount] = inputedAge; gpa[studentCount] = inputedGpa;
		System.out.printf("Student %s added succesfully\n", inputedName);
		
		
	} //end of a single student
	
	//option 3 - a method to display all students
	//This method takes from the main method the arrays, with current studet count
	//it will display content from the taken arrays - all students from class
	
	public static void displayAllStudents (String [] names, int [] ages, double [] gpa , int studentCount) { //start of display
			System.out.println("Displaying all students: ");
			System.out.printf("%10s%15s%25s\n", "Names", "Ages", "Gpa");
			System.out.printf("%10s%15s%25s\n",	"----","---", "---");
			for (int index = 0; index < studentCount; index ++) {
				System.out.printf("%10s%15s%25s\n", names[index], ages[index], gpa[index]);
			}
			//Minute 25 - ended recording 
		
	}//end of display method
	
}
