Comp Sci 130 - Midterm Review
First part of Midterm

Q1 - Multiple choice question
Examples: finding outputs.
Operations - (), * / %, + -  = operations from left to right. Order of Operations. 
example: 10 %2 + 5 *3*2/3-2 = 8 
Practice = 10 % 2 + 5 *3 *(2/(3-4)) - order of operations in java

Q2 - Multiple choice question
double res = Math.sqrt(16) + Math.floor(-5.1) + Math.ceil(-1.2) + Math.pow(3, 3); System.out.println ( res); = answer 24  *Practice*
Lookout for 24 and 24.0, answer is double

Q3 - Multiple Choice Questions 
case 1: Case 2: System.out.println(“Ohio”); break; -> if x =1 or x =2. Ask me what cases we will be having (CGPT). Default = else /otherwise

Q4 - Multiple Choice Questions 
Recall the following. A <B<C<Z<a<b<..<z. Capital A < a. 
if ( x <= ‘Z’ && y <= ‘Z’) System.out.println (“Green Bay”);  //true and false = false (not it) 
if ( x == ‘a’ || y == ‘b’) System.out.println (“Madison”);  //false and true = True, cuz one is OR TRUE
if (! (x == ‘B’)) System.out.println (“Appleton”); // True, not false = true. Not true = opposite. Practice AND and OR operation
Output = Madison and Appleton. 

Q5 - Multiple Choice Operation

Casting. = (int) (1 + 100 * Math.random()); - whatever the result, I will convert it into an INT. Ceil 5.4 = 5
				Any number from 0,100 , result. = any random from [1,101) (excluding 101??)
Q6 - Multiple Choice Question
int x = 5; if ( x <= 10 ) x += 10; else x -= 10; System.out.printf(“%d”, x); - add 10 the current value of x. X = 5 + 10 = 15 

Q7 - Multiple Choice Question
Character.isDigit(‘’); - is digit will resent if the character is a digit. 
Example: 
if ( Character.isDigit('$')) System.out.println (“Green Bay”); else System.out.println (“Green Bay”);. Answer = We will return the false option as the dollar sign is not a digit. It’s a symbol.

-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-
Second part of Midterm
Write ‘If’ statements

Question 2 - 

Line 19 - if the 2 num1> 0 && num2>0 && Op = ‘+’{
Line 22 - If (num1<0 ) 
Line 27 -  if any of the 2 numbers are positive(>0): go with OR
}

-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	
Third part of midterm
Q3 - Strings

A.
Note  = study indexOf(), charAt(), substring(). Others. 

String firstMajor = “Computer Science”; (0,15)
String secondMajor = “ Electrical Engineering ”; (0, 23)


String that combines both, first and second:
String newString = firstMajor + secondMajor
				OR
String newString = firstMajor.concat(secondMajor)
String S1 = firstMajor.toUpperCase(); //2
String S2 = secondMajor.trim(); //remove spaces from right and left

B. 

System.out.printf(“%d”, firstMajor.length()); //16 spots
System.out.printf(“%d”, firstMajor.indexOf(“e”); //@ 6th place. If I don’t have it, I will print -1 (doesn’t exist).
System.out.println(secondMajor.substring(1,5)); // will start from 1 and will stop 1 before the other num)

Methods - Arguments, Scoop(from where we call the method, issue in Java, Java is OOP, )

-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	

For classmate: 
Separate the answers for this using chatGPT


