package Lecture7;
import java.util.Scanner;

//3 LIBRARIES - MATH, STRING, CHARACTER 
public class Class7 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
				//Strings, capital S
	// dataType: String: a data type that is used to declare a variable, where,
	//it is able to store a text, sequence of character (boolean is a string)
	//%s is for strings
	
	
	//do 1 - declarea a string variable named state
	
	//string is a data type used to store text, names, and others - sequence of characters
	String state;
	//do 2 - how can we assign a value for a string
	state = "Wisconsin"; //note: the value should be placed between double quotation
	
	
	//do 3 - US - declare a string variable named major and assigned computer science
	String major;
	major = "Computer Science";
	
	
	//do 4 - write a statement that displays the value of the variable state
	System.out.printf("State = %s\n",state);
	
	//do 5, write a statement that displays major
	System.out.printf("Major = %s\n",major);

		
								//PART 2 //STRING
	//Question = how to read a value from the user??
	//Answer = we still use scanner library
	// 2 option, .next(), and .nextLine()
	
	String city;
	//code to read the value of city from user
	System.out.print("Enter your City: ");
	city = input.next();		//Option 1 - using .next()
	
	
	System.out.printf("your city is %s\n",city);

					//re-do the above code using .nextLine();
	String city;
	System.out.print("Enter your City: ");
	city = input.nextLine(); 		//option 2 - using .nextLine() until user clicks 'enter'
	
	System.out.printf("your city is %s\n",city);
	
	
	//PART: ------------READING THE FULL NAME OF THE USER AND PROCESSING IT-----------
	String fullName;				//full name has 2 words, first name and last name
	// write a code that reads the full name from the user and store it into the variable fullName
	System.out.print("Enter your full name: ");
	fullName = input.nextLine();
	System.out.printf("Hello, %s. Nice to meet you\n",fullName);
	
	//TASK 1 - DISPLAY THE NUMBER OF CHARACTERS IN THE INPUTED FULL NAME
	System.out.printf("The number of characters in your full name is: 	%d\n",fullName.length());
	System.out.printf("You have this amount of numbers in Wisconsin: %d\n","Wisconsin".length());
	
	System.out.printf("The first character in your full name is '%c' \n",fullName.charAt(0)); //char is the one at index = 0
	
	//display the last character of fullName
	System.out.printf("The last character in your full name is '%c'\n",fullName.charAt(fullName.length()-1));
																//index of the very last one***practice****
																// you can use %s to use, but keep c for char
	//let us try an invalid index
	//Try to access the letter at index 100 of full name
//System.out.printf("The index (100 )of your full name is: %c\n",fullName.charAt(100)); //run time error, out of bounds
	
	
//System.out.printf("The character at index 100, in your full name is: %c",fullName.charAt(fullName.length()-5)); //study this!!!!!
							//task 3 - Display the inputed full name in upper case format
	System.out.printf("Your name in capital letters is this code is: %s\n)",fullName.toUpperCase());
	System.out.printf("Your name in lower letters is this code is: %s\n)",fullName.toLowerCase());
	
					//After using toLowerCase or toUpperCase
	System.out.printf("Your full name after all changes is %s\n",fullName);
	
	String UpperName = fullName.toLowerCase();
	System.out.printf("this is your name after the change: %s\n",fullName);
	//you can re-declare the same variable to plan to keep the updated changes to other 

	
								//TRIM
	String greet = "   Welcome to Green Bay!!   ";
		greet = greet.trim();
	System.out.printf(greet);
	
	
	
	
	
	

	
	
  				PART 1// RANDOMS AND 

		Scanner input = new Scanner(System.in);
		
		//finding ranges in random values 
		double myFirstRandom = Math.random();
		System.out.printf("The first random is %.1f\n",myFirstRandom);
		//second try
		double mySecondRandom = 2 + 3 * Math.random();
		//display the generated value number
		System.out.printf("The first random is %.1f\n",mySecondRandom);
		
		//try third
		double myThirdRandom = 4 * Math.random(); //-5
		System.out.printf("The first random is %.1f\n",myThirdRandom);
		//you can cast the range from the usual float to int in a random value
		
		//let the below code makes n INTERGER random number by using the casting approach
		int myFourthRandom = (int)(3+4 * Math.random()); //(int) is the casting from double to interger
		
		System.out.printf("The first random is %d\n",myFourthRandom);
		
										//practice at home to extend the random number
		//write a statement to simulate 
		int dice = (int)(1 + 6 * Math.random());     //cast from float to int
		System.out.printf("Your rolled the dice to a number %d\n",dice);

		
		

	}

}
