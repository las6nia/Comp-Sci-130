package lecture;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
/*
		//---------------- Topic: String Traversal, counter control and sentinel Controlled loop practice chat - GPT, remind me to study-------------------------
		//Example 1: write a code that takes a string from the user, then, it takes also a single
		//character from the user
		//then the code will count # occurance of the inputer character in the 
		//inputed string. we will find how many times we have it in the string
		
		//example: the string is 'hello green bay'
		// the letter 'e' is the one we need to count
		//output: 'e' appears 3 times in the string

		String inputedString;
		char inputedChar; 
		int charCount = 0;
		
		//the first step is to read the two inputs from the user
		System.out.print("Enter a string: ");
		inputedString = input.nextLine();
		
		System.out.print("Enter a single character: ");
		inputedChar = input.next().charAt(0); //this is how we can read a single char from the user
		
		// Access every spot in the inputed string and compare it with the inputed character if equals then increment
		// charCount, otherwise, do nothing. we need to apply the concept of String Travelsal

		int index = 0;
		while(index <= inputedString.length() -1) {
			//while it's less than the end of the last string, increment by reading the next char
		//retrieve a copy of the character indexed by the current value using charAt method
			char copy = inputedString.charAt(index);
			if (copy == inputedChar) 
			{
				charCount ++;
			}
			index++; //this will keep moving foward, change
		}
	System.out.printf("%c appears %d times in %s\n",inputedChar, charCount, inputedString);

	//we have 2 kind of string traverse, the first one we call it forward, start at 0 and keep going to the end
	// second one - backward, start from last and go left to start
	

	//example 2: backwards string traversal, write a code that takes a string from the user then the code
	//will display the string in reverse in the reverse order
		//append, writing a string as english handwriting - 'a' to green bay will be green baya

		
		String inputedString;
		String reverseString =""; //create an empty string
		int charCount = 0;
		
		System.out.print("Enter a string: ");
		inputedString = input.nextLine();
		
		
		int index = inputedString.length()-1;
		
		while(index >= 0) 
		{
			char copy = inputedString.charAt(index);//get a copy of the character indexed by the current index
			reverseString += copy; //append operation where you can add a single char to the start or end side of the string
			
			//move the next spot
			
			index--;
		
		}
		//after the end of the while loop, reverseString will be the reversed copy of the original string
		
	System.out.printf("The reverse of %s is %s\n",inputedString, reverseString);
	
*/
	//sentiner value - the value that breaks the loop
	
	//------------------------Topic: sentinel value------------------------------------
		
//Example: Keep displaying welcome to GB until the user stops you
/*
		char answer;
		System.out.print("Would you like me to display 'Welcome to GB? (y/n)");

		//read first input:
		answer = input.next().charAt(0);
		
		while(answer != 'n'&& answer != 'N') 
		{
			System.out.print("Welcome to GB");
			
			
			System.out.print("Would you like me to display 'Welcome to GB? (y/n)");
			answer =  input.next().charAt(0);
		}

// Applications of sentinel loops:
		//#1 - read and process a set of inputs until the user enters the sentinel value
	*/
	//exercise 5: slide 12 code
		double userInput;
		double total =0, product = 1, max, min; //wanted results
		int count = 0; //to count the number of values before the user inputs the sentinel values
		
		System.out.print("Enter a double value: ");
		userInput = input.nextDouble();
		
		//use the first input to initialize both max and min as we did with exercise 4
		max = userInput;
		min = userInput;
		
		//this problem can be solved using the sentinel while loops
		while(userInput >= 0) 
		{	//do Statements
			
			total += userInput;
			product *= userInput;
			count++; //count of inputs
			
			
			if (max < userInput)
			{
			max = userInput;
			}
			if (min > userInput)
			{
			min = userInput;
			}
			
			System.out.print("Enter a double value: ");
			userInput = input.nextDouble();
			
		}
		if (count != 0){// the case where the user entered values before they entered a negative number
		System.out.printf("Thank you, below are the results: %s\n",userInput);
		System.out.printf("Total-----------------------%.2f\n",total);
		System.out.printf("Product---------------------%.2f\n",product);
		System.out.printf("Max-------------------------%.2f\n",max);
		System.out.printf("Min-------------------------%.2f\n",min);
		System.out.printf("Average---------------------%.2f\n",total/count);
		}
		else //the case where the user enters a negative value at the begining
		{
			System.out.println("Closing");
		}

		// #2 - 
		//Using loop to display a meny of options for the user
		//display a meny of options revelanto convert c to F
	/*	char userInput;
		double celciusTemp, farenheitTemp;
	

		System.out.print("\nWelcome to my temp conversion, how can I be of help? ");
		System.out.print("\nC - Convert from Celcius to Farenheit");
		System.out.print("\nF - Convert from Farenheit to Celcius ");
		System.out.print("\nE - Exit\n"); //this would be our sentinel value
		//read first user choice
		userInput = input.next().charAt(0);
		
		while(userInput != 'E' && userInput != 'e') 
		{//Start while
			//case1: the user wants option C - Convert from Celcius to Farenheit
			if (userInput == 'c' || userInput =='C')
			{
				System.out.print("You selected option C - Enter your Temperature in C* ");
				celciusTemp = input.nextDouble();
				farenheitTemp = celciusTemp * 9/5 +32;
				
				System.out.printf("Your temperature is: %.2f°",farenheitTemp);
				
			}
			else if (userInput == 'f' || userInput == 'F')
			{
				System.out.print("You selected option F - Enter your Temperature in F ");
				
				farenheitTemp = input.nextDouble();
				celciusTemp = (farenheitTemp -32)/(9/5); 
			
				System.out.printf("Your temperature is: %.2f°",celciusTemp);
				
			}
			else
			{
				System.out.printf("%c is not a valid number. Try again",userInput);
			}
		
			
		System.out.print("\nWelcome to my temp conversion, how can I be of help? ");
		System.out.print("\nC - Convert from Celcius to Farenheit");
		System.out.print("\nF - Convert from Farenheit to Celcius ");
		System.out.print("E - Exit"); //this would be our sentinel value
		userInput = input.next().charAt(0);
		}//End while
		
*/
	}

}

