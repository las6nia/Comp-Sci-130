package Class3; 
import java.util.Scanner;

public class module2New {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Chapter 2
		//chapter 4 on textbook (if you have it)
		// if/else and switch statements
		
	/*
		// structure
		if (condition)
		{
			if body statement
		}

		
		int x = 3;
		if (x>0)
		{
			x++;
		}
		x = 4 (if true)
*/
		
		// flow Chart is a Graphical representation of our code
		
		//programming exercise #1  chapter 2
		
						// task - STUDY!!!!//
		double salary;
		int yearOfService;
		
		//step 1 - read the 2 inputs
		System.out.println("Enter your salary: ");
		salary = input.nextDouble(); //
		
		System.out.println("Enter your years of service: ");
		yearOfService= input.nextInt();
		
		if (yearOfService>5)
		{// starting of the If body
			
			System.out.printf("the net bonus amount = $%.2f\n",0.05 * salary); //this should be before updating the value
			
			salary = salary + 0.05 * salary; //this should be after 
			
			
			
		}//end of body
		
	System.out.printf("Your salary now is $%.2f",salary); //is this the correct location of this statement?

		
		
		
	
		

	}

}
