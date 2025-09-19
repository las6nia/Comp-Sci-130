package mainClass;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		//exercise 4 - PRACTICE
		
		// || = or
		// && = And
		
		
		int altitude = 10;
		
		if (altitude < 12)
		{
			System.out.print("Trotosphere");
		}
		else if (altitude <31)
		{
			System.out.print("Stratosphere");
			
		}
		else if (altitude <6200)
		{
			System.out.print("Exosphere");
			
		}
		
//if none of these are true the condition will exit to the 'else'

		else {
			System.out.print("outerSpcace");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*	
		// IF ELSEIF ELSE STRUCTURE(USE FLOW CHART)
		//EXAMPLE: FIND THE OUTPUT OF THE BELOW CODE WHEN X =, X = , X= , X =

		// if else if
		int x = 2; 


		if (x < 5)
		{
			System.out.print("WI");
		
			
			else if(x < 10)
				{
					System.out.print("IL");
				}
			else if(x < 20)
			{
				System.out.print("NY");
			}
			else if(x < 7)
			{
				System.out.print("OH");
			}
	
		
	
		else 
		{
			System.out.print("False");
		}
	
*/







		/*NESTED STRUCTURE () DECISIONS
		Scanner input = new Scanner(System.in);

		int inputNumber;

		//nested IF structure (IF inside another IF statements)
		//TASK 3 - modify problem 2 to test if the input is either:
		//even positive, even negative, odd positive, or odd negative

		System.out.print("Even or Odd number: ");
		inputNumber= input.nextInt();



		if( inputNumber % 2 == 0 )
		{
			if(inputNumber >= 0) {
				System.out.print("Your number is even positive");

			}
			else 
			{
				System.out.print("Your number is even negative!");
			}
		}
	else 
	{
		if (inputNumber <= 0 ) 
		{
			System.out.print("your code is odd positive");
		}
		else
		{
			System.out.print("your code is odd negative");
		}
	}

		 */




		/*
		int inputNumber;
		int isEven;

		int isOdd;

		//TASK 2 - EVEN OR ODD - simple if structures//


		System.out.print("Even or Odd number: ");
		inputNumber= input.nextInt();

		int determinedNumber = inputNumber % 2; 

		isEven = 0;
		isOdd = 1;


		if( determinedNumber == isEven)
		{
			System.out.printf("Number is even, your number is: %d",inputNumber);
		}
		else {
			System.out.printf("Number is Odd, your number is: %d",inputNumber);
		}


		 */




		/*
		//---------exercise 2:: slide 11-------//
		Scanner input = new Scanner (System.in);

//IF/ELSE STRUCTURE//

		//temperature input 
		int readTemp;
		int temp;

		System.out.print("Enter your temperature: ");
		readTemp = input.nextInt();

		if (readTemp >= 32) //when the condition is true
		{
			System.out.print("Above Freezing");
		}
		else //when the condition is false
		{
			System.out.print("Below Freezing");
		}

		 */


	}

}
