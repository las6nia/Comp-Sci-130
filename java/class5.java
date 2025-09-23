package MainClass;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 , num2;
		char typeOfOperation; //for the possible values are: + , -, /, *, %
		
		// step 1: read inputs from the user
		System.out.print("Enter 2 numbers and the type of operation (+,-,/, *, %)");
		System.out.print("example: 4 5 *\n");
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		typeOfOperation = input.next().charAt(0); //type of operation from the user
		
		if (typeOfOperation =='+') 
		{
		System.out.printf("%d + %d is: ",num1,num2, num1 + num2);	
		}
		
		else if (typeOfOperation == '-')
		{
		System.out.printf("%d - %d is: ", num1,num2, num1 - num2);	
		}
		else if (typeOfOperation == '/')
		{
		System.out.printf("%d / %d is: ", num1,num2, num1 / num2);	
		}
		
		else if (typeOfOperation == '*')
		{
		System.out.printf("%d * %d is: ",num1,num2, num1 * num2);	
		}
		else if (typeOfOperation == '%')
		{
		System.out.printf("%d %% %d is: %d", num1,num2, (num1 % num2));	
		}
		
		else {
		System.out.printf("%c is an invalid input in the mentioned format!",typeOfOperation);		
		}
		
		
		
		
		
		
		
		
		
		
/*
		//Q = how could we read in a single character from the user? 
		//A = By using the Scanner library by using the code below: 
		// input.next().charAt(0);
		
		//read in a single character from the user
		
		char x;
		
		System.out.print("Enter a single character: ");
		x = input.next().charAt(0);
		
		System.out.printf("Yout inputed char '%c'",x);
		

		

		
		
		
		
		//exercise 4 - Write a java application that lets teh user enter a year and checks whether it is a leap year. 
		// a year is a lep year if its divisible by 4 but not by 100, of if it's divisible by 400
		
		
//assuming there's 30 days in a month
		int year;
		
		System.out.printf("Enter a year: ");
		year = input.nextInt();
		
						//demorgan's law
					//digital logic - AND & OR
		if (year % 4 == 0 && year % 100 != 0 || (year % 400 ==0)) 
		{
			System.out.printf("%d is a leap year!", year);
		}
		else
		{
			System.out.printf("%d is NOT a leap year!", year);
		}
		
		
		
		
		
	//Write a program where 3 inputs are entered and the largest number is displayed
		

		double input1, input2, input3;
		
		//step 1 - get inputs from user
		System.out.print("Enter 3 numbers, all numbers MUST be separated by a single space: ");
		
		//scanner keeps reading until it hits either a space or end of the line
		input1 = input.nextDouble();
		input2 = input.nextDouble();
		input3 = input.nextDouble();
		
		//develop the if structure to make a decision for the greatest number
		if (input1 > input2 && input1 >input3)
		{
			System.out.printf("%.2f is the greatest number",input1);
		}
		else if (input2> input1 && input2 >input3)
		{
			System.out.printf("%.2f is the greatest number",input2);
		}
		else
		{
			System.out.printf("%.2f is the grest number",input3);
		}
		
		// index of value will determine which one comes first 
		
		
		  
		  
		  
		  
		  
			understanding which index will be on whos place goes when it comes to determine the same value number 
			understanding arrays and indexes 
			is it read from left to right in the back code? 
			is it ever read from right to left in a list?
			*******the first one that comes true will be the first one to print********
		*/

		// list  = {2, 15, 15 , 10}
		// 15 on space [2] comes first
		// 15 on space [3] comes second 
		
		// arrays 
		
		
		
		
		
			
		
		/*
				//applying OR || and AND &&
					//demorgan's law
		int score; //user input
		
		//get and declare variable
	
		System.out.print("Enter an interger: ");
		score = input.nextInt();
		
		if (score < 0  || score>100)
		{
			System.out.printf("%d is an invalid score",score);
		}
		else if (score >= 90 && score <= 100) 
		{	
		System.out.printf("Excellent: %d has a grade of A!",score);
		}
		else if (score <90 && score>=80)
		{
			System.out.printf("Very good, %d has a grade of B!",score);
		}
		else if (score <80 && score>=60)
		{
			System.out.printf("decent, %d has a grade of C.",score);
		}
		else //last case, no more cases after this (condition - 60 > score >=0, display F)
		{
			System.out.printf("%d has a grade of F, try next time",score);
		}
		
	*/	
		
		

	}

}
