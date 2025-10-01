package MainClass;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Math, String, and *****other library**** library
		
	//part 1 - Math Library, already installed,no need to import
		
		System.out.printf("Math.ceil(2.3) = %.2f\n",Math.ceil(2.3));  //be careful, use f string to display ceil (rounding) as it will show as an double
		System.out.printf("Math.ceil(2.7) = %.2f\n",Math.ceil(2.7));
		System.out.printf("Math.ceil(-2.7) = %.2f\n\n",Math.ceil(-2.7));
//floor - double
//ceil - double
		System.out.printf("Math.floor(2.3) = %.2f\n",Math.floor(2.3));  //be careful, use f string to display ceil (rounding) as it will show as an double
		System.out.printf("Math.floor(2.7) = %.2f\n",Math.floor(2.7));
		System.out.printf("Math.floor(-2.7) = %.2f\n\n",Math.floor(-2.7));
		
//to the power
		System.out.printf("4 to the power of 3 = %.2f\n\n",Math.pow(4,3));
//Square Root
		System.out.printf("The square root of 4 is = %.2f\n\n",Math.sqrt(4));
		
		System.out.printf("4 to the power of -3 = %.2f\n",Math.pow(4,-3));
		System.out.printf("The square root of 4 is = %.2f\n\n",Math.sqrt(4));
		
		//	-	-	-	-	-	-	-	-	-	-	--	-	-	-	-	-	-	-	-	-//
//Math.max()
		System.out.printf("Max.math(4,10) = %d \n",Math.max(4,10)); // if the 2 values are intergers are intergers, it will also return interger
		System.out.printf("Max.math(43.10,10.5) = %.2f \n",Math.max(4,10.50));   //the values will now be double 
							//lookout for format specifier
//Math.min()
		System.out.printf("Max.min(4,10) = %d \n",Math.min(4,10));
		
//Double and int values
		System.out.printf("Max.min(4,10.10) = %.2f \n",Math.min(4,10.10)); //INT , Double
		
		//MOD for float - study!!!!
// Math.fma(0, 0, 0)

		System.out.printf("|-2.4| = %.2f\n", Math.abs(-2.4));
		System.out.printf("|2.4| = %.2f\n\n", Math.abs(2.4));
		System.out.printf("|-2| = %d \n", Math.abs(-2)); // why does it print in %d instead of of %f? - ask later 
		
		
		
		//example: assume the radius of a circle us 2,55, find the area of the circle using math library
		
	double radius = 2.55, area;
	
	area = Math.PI * Math.pow(radius, 2);
	
	System.out.printf("the area of the circle is: %.2f", area);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*	
		// Class 6 - re-write using the SWITCH structure using the code from class 5
		//INSTEAD OF USING IF, ELSE, ELSE IF

		int num1, num2;
		char typeOfOperation;
		
		System.out.print("Enter Num1: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Num2: ");
		num2= input.nextInt();
		
		System.out.print("Enter your type of operation: ");
		typeOfOperation = input.next().charAt(0); 
		
		
		switch(typeOfOperation)
		{
		case '+':
			System.out.printf("%d + %d is: %d",num1,num2, (num1 + num2));
		break;
		case '-':
			System.out.printf("%d - %d is: %d",num1,num2, (num1 - num2));
		break;
		case '*':
			System.out.printf("%d * %d is: %d",num1,num2, (num1 * num2));
		break;
		case '/':
			System.out.printf("%d / %d is: %d",num1,num2, (num1 / num2));
		break;
		case '%':
			System.out.printf("%d %% %d is: %d",num1,num2, (num1 % num2));
		break;
		default:
			System.out.printf("Enter a valid character");
			break;
		}
		
*/
		
							/*QUESTION: how could we hande the or (||) or operator in switch structure?
								if (var == valuex || var ==valuey)
									case valuex : case vakye y:
							*/
		/*
		//TASK 9 - DO THIS SWITCH STATEMENT
		int myVar;
		System.out.print("Enter the value for myVar: ");
		myVar = input.nextInt();
		
		//objective - when myVar = 9 or 10 print out GB
		//				when myVar = 5 or 15 = print 'Madison'
		//				When myVar = 20 = print(Appleton)
		//				When myVar != anything = print(Wisconsin)
		
		switch(myVar) 
		{ //start of the switch
		
		case 9: case 10:         (myVar == 9 || myVar ==10):    - DO NOT DO THIS  ---- : - Or  
			System.out.print("Green Bay");
			break;
		case 5: case 15:
			System.out.print("Madison");
			break;
		
		case 20:
			System.out.print("Appleton");
			break;
		
		default:
			System.out.print("Wisconsin");
			break;
			
		
			
		}//end of switch
		
		
		*/
		
		
		
		
		
		
		
		
		//NOTE: 
		// WE MAY have an 'if statement' inside a switch case
		
		//month and year, how days we have in that month
		
		//exercise 4 - Write a java application that lets teh user enter a year and checks whether it is a leap year. 
		// a year is a lep year if its divisible by 4 but not by 100, of if it's divisible by 400
		
	/*
//assuming there's 30 days in a month
		int year;
		int month;
		System.out.printf("Enter the month(#) and year with a space in middle: ");
		month = input.nextInt();
		year = input.nextInt();
		
		switch(month)
		{//start of switch 
		case 1:
			System.out.printf("January of %d has 31 days ",year);
		
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || (year % 400 ==0)) 
			{
				System.out.printf("February had 29 days in the year %d", year);
			}
			else
			{
				System.out.printf("February of %d had 28 days", year);
			}
		break;
			
		case 3:
			System.out.printf("March of %d had 31 days ",year);
			break;
		
		case 4:
			System.out.printf("April of %d had 30 days ",year);
			break;
		
		case 5:
			System.out.printf("May of %d had 31 days ",year);
			break;
		
		case 6:
			System.out.printf("June of %d had 30 days ",year);
			break;
		default:
			System.out.printf("I don't know this month");
			break;
			
		
		
		}//end of switch
		
		
		
		
		
		
		
		
		
		
		

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
*/	
		
		
	}
}
