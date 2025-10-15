package Lecture11;
import java.util.Scanner;

public class class11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//---------------max / min algortithm COUNTER CONTROL LOOPS SECTION- While Loops Slides-----------------
		
		//The strings can be represented as a sequence () of characters 
		//where each chatavyers has it's own spot and each spot has his own index
		
		//example: String city = "Green Bay"; (this has 8 index)
		//the last index is .length() -1

//	String city = "Green Bay";
	//System.out.printf("Answer = ",city.lastIndexOf(city));??
				
		//String Traversal: visiting and processsing each character of a given string by using index of each character
		//By using the below while Loop structure
//int index = 0;
		
//while (index <= ExampleString.length() -1) 
		//{
			//retrieve a copy of the character indexed by the current value of the index
			//By using charAt method
			
			//process the copy as needed
			
			//move to the next spot
			//index++;
		//}
		
	//example: white a code that reads the full name from the user, then your code should display the below: 
		//The number of vowels in the inputed name:
		String fullName; // user input
		int index = 0;
		int vowelCounter = 0; //output
		
		
		//step 1 = get name
		System.out.println("Enter your full name");
		fullName = input.nextLine();
		
		while (index <= fullName.length() -1) 
		{//start while
			char copy = fullName.charAt(index);
			
			//test if copy is vowel
			if (copy == 'a' || copy == 'e' || copy == 'i' || copy == 'o' || copy == 'u')  //isn't it
			{
				vowelCounter++;
			}
			
			//Move to the next spot
			index++;
		} 
		
		
		
		
		
		//Number of Upper case and lower case letters
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Step 1 =  declare and initialize max to  and min
		// make current max - and current min, the max number will be looking out for max numbers and condition if the input is greater than max it will update, STUDY THISS!!
		
		
		
		
		
		
		
		
		
		
		/*
		// --------------Part 1:___------------------
		//Write a code that displays all intergers between 0 and 100, then your code MUST 
		//find the total product, and the average of all numbers in this range
		
		//HINT - this problem can be done using counter control loops
		
		int count = 1; //--- starting point of the range
		int total = 0;
		int product = 1; // multiply the value with the product
		while(count <= 10) 
		{
			System.out.printf("%d\t",count); // show the number
			total += count;
			product *= count;
			
			count++; //Update the counter
		
		} //end of the while loop
		//Display total after the loop
		
		System.out.printf("\nThe total of ALL intergers between 1-10 is: %d\n",total);
		System.out.printf("\nThe product of ALL intergers between 1-10 is: %d\n",product);
		//to get average = total/value 
		System.out.printf("\nThe average of ALL intergers between 1-10 is: %.2f\n",total/10.0); //casting from int to double
		//Question to study - multiplying over the counter and how to update the counter and multiplying the counter and range and get calculations
		//(ask chat gpt to a study guide)

		//---------------------------Part 2: use code from above------------------
		//Write a code that displays all intergers between 10 -1 INSTEAD now, then your code MUST 
		//find the total product, and the average of all numbers in this range

//QUESTION - WHAT CHANGES TO GET THE CHANGES IN REVERSE ORDER?
		
		int count = 10; //--- MAKE IT FROM 10 TO 1
		int total = 0;
		int product = 1; 
		while(count >= 1) //CHANGE THE CONDITION SO IT THE COUNTER IS BIGGER THAN 1 TO DECREASE LATER DOWN THE CONDITION
		{
			System.out.printf("%d\t",count); 
			total += count;
			product *= count;
			
			count--; //Update the counter TO MINUS
		
		} 
		
		System.out.printf("\nThe total of ALL intergers between 1-10 is: %d\n",total);
		System.out.printf("\nThe product of ALL intergers between 1-10 is: %d\n",product);
		//to get average = total/value 
		System.out.printf("\nThe average of ALL intergers between 1-10 is: %.2f\n",total/10.0); 
		
		
		//--------------part 3 - initialize counter from 1-10 but only even numbers--------------
		
		//INITITALIZE, CONDITION, UPDATENEEDED TO PRINT FROM A GIVEN RANGE
		int count = 2; //--- MAKE IT FROM 10 TO 1
		int total = 0;
		int product = 1; 
		while(count <= 10) //CHANGE THE CONDITION SO IT THE COUNTER IS BIGGER THAN 1 TO DECREASE LATER DOWN THE CONDITION
		{
			System.out.printf("%d\t",count); 
			total += count;
			product *= count;
			
			count+= 2; //Update the counter TO MINUS
		
		} 
		
		System.out.printf("\nThe total of ALL intergers between 1-10 is: %d\n",total);
		System.out.printf("\nThe product of even numbers between 1-10 is: %d\n",product);
		//to get average = total/value 
		System.out.printf("\nThe average of ALL intergers between 1-10 is: %.2f\n",total/5.0); 

		
		
		
		
		//-------------PART 4 - READ AND PROCESS A SET FROM USER INPUTS. NOTE THAT WE KNOW HOW MANY INPUTS THE 
		//USER WILL ENTER BEFORE THE RUN TIME, SLIDE 9 .
		//Note - since i know the number of inputs, then this problem can be solved using counter controlled loops
		
		//need a counter, counter controls the number of iterations only
		//How many iterations do we need? 5!! Number of iterations = numbers of input from the user
		
		int iterationCounter = 1;
		double total = 0;
		double product = 1;
		double userInput; //this will start the value that we read from the user
		double currentMax; // we cannot initialize max to 0
		double currentMin;
		
			
			//read tje forsy input before the while loop and use it to initialize both the current max and current min
			
		System.out.println("Enter a double value: ");
		userInput = input.nextDouble();
		
		currentMax = userInput;
		currentMin = userInput;
		total += userInput;
		product *= userInput;
		
		// 
		while (iterationCounter <= 4){ // I only have to read 4 values as I have 5 
			//My stuff = actions to be repeated at each iteration
			//action 1 = read double value from the user:
			System.out.println("Enter a double value: ");
			userInput = input.nextDouble();
			currentMax = userInput; //this is the first input from the user
			
			//Action 2: add the value to total and multiply with the product
			total += userInput;
			
			//action3 = we need to multiply the inputed value with product
			product *= userInput;
			
			// Action4 - compare the inputed value with the current: max and do any needed changes
			if (userInput > currentMax) {
				currentMax = userInput;
			}
			// action 5: compare the inputed value for the current min
			if (userInput < currentMin) {
				currentMin = userInput;
			}
			
			//update the iteration counter
			iterationCounter++;
		}//end while
		System.out.println("The results are the following: ");
		System.out.printf("Total ---------------------%10.2f", total);
		System.out.printf("\nProduct------------------%10.2f", product);
		System.out.printf("\nAverage------------------%10.2f", total/5.0);
		System.out.printf("\nCurrent Max------------------%10.2f", currentMax);
		System.out.printf("\nCurrent Min------------------%10.2f", currentMin);
		
		//solution for issue if negative numbers
		
		//2 sections - read our inputs before the While loop
		//read the other 4 values INSIDE the while loop (as before) Study this using chatGPT
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//MISSED IN CLASS 10 - Loops, show a code to display a message for 5 times!, display GB for 10 times
		//We wrote code to display name, loops
		//int count = 0;
		//while (count <10){count++;}

	}
	
*/
}

