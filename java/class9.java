package Lecture9;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
								//Character Library
		//this library contains a set of methids that can be applied over single characters, no import statement
		//for this library
		
		// PART 1 - CHARACTER LIBRARY -
		//To access the library - type character.				METHOD = 
		// Character.isAlphabetic(); 								if it's a character
		// Character.isDigit(0) - 									if it's number
		// Character.isLetter(0) - 									If it's an emoji
		//Character.isLowerCase(0) - 								true if lower, false otherwise
		//Character.isSpace(0) - 									True if white space, otherwise false
		//Character.isUpperCase(0) -								True if upperCase, otherwise false
		// Character.isWhitespace(0) - 								True if white space false otherwise
		// Character.toString(0) - 									Convert Character into String
		
								// ----------- Exercise 3 - slide 32, -------------

	/*	String SSN;
		
		boolean isValid = true; //testing flag
		
		//step 1= ask the user for SSN
		System.out.println("Enter your SSN: ");
		SSN = input.nextLine();
		
		if (SSN.length() != 11)
		{
			isValid = false;
		}
		
		//requirement 2 = we should have a digit at index 0,1,2,4,5,7,8,9,and 10
		if (Character.isDigit(SSN.charAt(0))== false || Character.isDigit(SSN.charAt(1))== false 
			|| Character.isDigit(SSN.charAt(2)) == false || Character.isDigit(SSN.charAt(4))== false 
			|| Character.isDigit(SSN.charAt(5))== false  || Character.isDigit(SSN.charAt(7))== false 
			|| Character.isDigit(SSN.charAt(8))== false 	|| Character.isDigit(SSN.charAt(9))== false 
			|| Character.isDigit(SSN.charAt(10))== false )
		{
			isValid = false;
		}
		
		// requirement 2 = we should have - at index 3 and 6
		if (SSN.charAt(3) != '-' || SSN.charAt(6) != '-')
		{
			isValid = false;
		}
		
		if (isValid == true)
			//meets all requirements
		{
			System.out.printf("%s is a VALID SSN", SSN);
		}
		else {
			System.out.printf("%s is a NOT A VALID SSN", SSN);

		}
		*/
		
		//3 - requirement 1: 
	
		String password;
		
		boolean isValid = true; //testing flag
		
		System.out.print("Create a password: ");
		password = input.next();
		
		if (password.length() < 10) //requirement 1: length >= 10 needs to be greater 
		{
			isValid = false;
		}
		
		if (Character.isUpperCase(password.charAt(0)) == false) {//the first char is Upper: the first 
		isValid = false;	
		} 
		
		if (Character.isLowerCase(password.charAt(password.length() -1 )) == false ) {   // the last char (the index of last char is length -1 is lower clase)
			isValid = false;
		}   
		
		if (isValid == true) {
			System.out.printf("Your password %s is VALID",password);
		}
		else
		{
			System.out.printf("Your password %s is IN-VALID",password);
		}
		
		
		
		
		

		
		
		
		
		
/*
		//PROGRAMMING EXERCISE 2 - SLIDES
		//TASK 1 = DECLARE THE FOLLOWING STRINGS: s1 = " Welcome ", s2 = " welcome "
		
		String s1 = " Welcome ", s2 = " welcome ";
		boolean isEqual = s1.equals(s2); 
		
				//task 2 - check if s1 == s2 and assign the result to a boolean called isEqual;
		
		System.out.printf("isEquals = s1.equals(s2) = %b\n",isEqual);
			//task 3 = task2 but asking ignoring the case
																	//Not the same but equals when ignore case
		isEqual = s1.equalsIgnoreCase(s2);
		System.out.printf("isEquals = s1.equalsIgnoreCase(s2) = %b\n",isEqual);
		//do you agree with me that I can re-write: s1.equals(s2); as s2.equals(s1); ?? yes
		
		//explaining = (remind me to explain the above)
		
		//Task 4 = compare s1 and s2 and assign to int variable x
		
		int x = s1.compareTo(s2);    //compare!!!!! (compare) 
		//s2 is greater than s1 = negative result *!!!!study this!!!*
		System.out.printf("x = s1.compare(s2) = %d\n",x);
		
		//do you agree with me that I can re-write: s1.compareTo(s2); as s2.compareTo(s1); 
		//and will obtain the same result?? NO!
		x = s2.compareTo(s1);
		System.out.printf("x = s2.compare(s1) = %d\n",x); // not the same, result is '+' 32
		
// Task 5 = compare s1 with s2, ignoring the case and assign the result to in variable x
		x = s1.compareToIgnoreCase(s2); //what will be the value? 0, W == w which is the same
		
		System.out.printf("x = s1.compareToIgnoreCase(s2) = %d\n",x);
//Task 6 = check wether s1 has prefix "AAA" and assign the result to a boolean to variable b
		
	boolean b = s1.startsWith("AAA");
	System.out.printf("B= s1.startsWith(\"AAA\") = %b\n",b);
	
	b = s1.endsWith("AAA");
	System.out.printf("B= s1.endsWith(\"AAA\") = %b\n",b);
//task 7 = assign the length of s1 to an int variable x
	
	x = s1.length();
	System.out.print(x); //method - counts the spaces too
	
//task 8 = assign the first character if s1 to a char variable y
	
	char y = s1.charAt(0);  //the first character is the one at zero
	System.out.printf("s1.charAt(0) = %c",y); //the result is an empty space

//task 9 = Create a new string s3 that combines s1 with s2
	
	String s3 = s1.concat(s2);
	System.out.printf("s3 = s1.concat(s2) = %s\n",s3);
	//or you may do the above using + = s3 = s1 + s2;

//Task 10 = create a substring of s1 from index 1.
	String s4 = s1.substring(1);
	System.out.printf("s4 = s1.substring(1); = %s\n",s4);
	
	//Task 11 = create a substring of s1 from index 1 to 4.
		s4 = s1.substring(1,4); //we exclude at index 4
		System.out.printf("s5 = s1.substring(1,4); = %s\n",s4);
	//task 12 = create a new string s3 that converts s1 to lowercase

		s3 = s1.toLowerCase();
		System.out.printf("s3 = s1.toLowercase() = %s\n",s3);

		//task 13 = to Upper case
		s3 = s1.toUpperCase();
		System.out.printf("s3 = s1.toUpperCase() = %s\n",s3);
		
//task 14 = Create a new string s3 that trums blank spaces on both ends of s1
		s3 = s1.trim();
		System.out.printf("s3 = s1.trim() = %s\n",s3); //removes blank spaces
		
//task 15  = reaplce all lower 'e' by upper
		s3 = s1.replace('e', 'E');
		System.out.printf("s3 = s1.replace('e','E') = %s\n",s3);

//task 16 = assign the index of the first occurence of caracter e in s1 to an int variable x
		x = s1.indexOf('e');
		System.out.printf("s3 = s1.indexOf('e') = %s\n",x);
//task 17 = assign the index of the last occurence of string abc in s1 to an int variable x
		x = s1.lastIndexOf("abc");
		System.out.printf("x = s1.lastIndexOf(\"ABC\"); = %s\n",s3); //fix, it's supposed to output -1
		
*/
	
	
	
	
	
	


		
		
		
		
			
		
		
		
		
		//What if we tried to replace a character that does not exist
/*
		String city = "Green Bay Bay";
		
		String s1 = city.replace('e', 'm');
		System.out.println(s1);
		
		String s2 = city.replaceAll("Bay", "lake");
		System.out.println(s2);
		
		//write down s3 - s5
		
		
		String s6 = city.replaceFirst("e","m"); //make e and m as a String, not a Char
		System.out.printf("City =  %s, s6 = %s\n",city, s6);
		
		
		// PART 1 - REPLACING STRINGS
			
			
//write down from phone to document! october 7th
*/

	}

}
