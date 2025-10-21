// System.out.print("");

package Lecture13;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//write a java application that prompts the user to enter two integer numbers and then displays their gratest common divisor as shown in the below sample run
		//and later - what is the lowest factor of that, and greatest factor (x itself)
		//if i is a factor of x, (in code - print)
		Scanner input = new Scanner(System.in);

		int number1, number2; //userInputs
		int gcd = 1; //wanted output(greatest common factor) - 1(IT IS NOT 0)
	
		
		//Step 1: read the 2 nums
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		//part 1: display factors of number 1
		int i = 1; //1 is the lowest factor 
		System.out.printf("The factors of %d are: ",number1);
		while (i <= number1){// the greatest factor of any number is the number itself
			if (number1 % i == 0) { //i is a factor of number 1
				System.out.printf("%d\t",i);
			}
		//Update the counter
			i++;
		}//end while

		
		
		// Part 2: re-do part 1 but for number 2
		
		int j = 1; 
		System.out.printf("\nThe factors of %d are: ",number2);
		while (j <= number2){
			if (number2 % j == 0) { 
				System.out.printf("%d\t",j);
			}

			j++;
		}//end of second while
		
		//Part 3 - Display the greatest common factor of number1 and number 2
		//explain if the factor of (5 and 300) - the largest common factor is 5
		
		int k = 1;
		while (k<= Math.min(number1, number2)) { //get help, no need to exceed 5 as the min value between the 2 values
			//test if k is a common factor of number 1 and number2
			if (number1 % k ==0 && number2 % k ==0) {
				gcd = k; //Update the GCD when we catch a new common factir: note that we are moving up (ascending)
			}
		k++;
		}
		System.out.printf("\nThe greatest common divisor for %d and %d is %d",number1, number2,gcd);
		
		//we will not cover "Do while", but we will cover 'While', 'for', and 'for each'
		

									// Exercise really close to lab4
		//write a code that reads from the user's email, the format is userID@UWGB.com, some users will enter their full email
		//but some users will enter the UserID, like joesmith@gmail.com but we should accept both joesmith@gmail.com and 
		//jsmith should work. 
		
		//john123ab@gmail.com
									//Idea, email creation/generator
		
		String email; //userInput
		int numOfLetters = 0, numOfDigits = 0, numOfSymbols = 0; //wanted results
		
		System.out.print("Enter your email: ");
		email = input.nextLine(); //your code can use .next() because your email cannot have spaces
		char copy = email.charAt(0);
		//To access every single character in the email : Index, charAt() method - ****NO SUBSTRING****
		int index = 0;
		while (index <= email.length()-1 && copy != '@') { //this will be in our assignment #GET HELP && other condition in while loop assignment
			//get a copy of the char
			copy = email.charAt(0);
				//test if the copy is a letter, digit, or symbol, and then increment according to the type
			if ( Character.isLetter(copy) ) { //you can keep it clean as it is autimatically true, but can use ->!= true
				numOfLetters++;
			}
			else if (Character.isDigit(copy)) { 
				numOfDigits++;
				
			}
			else if(copy != '@') {//you can exlude anything else other than @ is a symbol
				numOfSymbols++;
				
			}
		
		index++;
			
			
		}//end of while
		//display obtained results:
		System.out.printf("Your email has: %d characters, %d digits, and %d symbols", numOfLetters, numOfDigits,numOfSymbols);
		//we should go back and because it's printing the domain
		//get help why the the digits and symbols counter is not working
		

		
		
											//'FOR' loop
		
	//task: convert below code from while to for
		
		
	int i = 1;//declaration
	while (i<=5) //condition
	{
		System.out.print("Green Bay");//do stiff
		i++; // update counter
	}
	
	for (i=5; i<=10;i--) {
		System.out.println("Green Bay2");
		
	}

	//example 2: convert the below into for
	
	String someString = "Green123";
	int index= 0;
	
	while (index <someString.length()-1) {
		char copy = someString.charAt(index);
		System.out.printf("%c\n",copy);
		index++;
	}

		String someString = "Green123";
		int index= 0;
	
		for (index = 0; index <=someString.length()-1;index++) {
			char copy2= someString.charAt(index);
			System.out.printf("%c\n",copy2);
	}
	
		
		
		
		
		
		
	}

}
