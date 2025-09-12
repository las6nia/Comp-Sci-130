package class2;

//IMPORT SECTION:
//the below statement used to import the scanner library:
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		//PART 4 - DIVISION
		System.out.println(7 / 3); //note: int/int = interger & remainder gets discarded
		//real math: 2.3_ but in java :2
		
		System.out.println(7.0 / 3); //note: double/int = double (2.33333_)
		
		System.out.println(7 / 3.0); //note: int/double = double (2.33333_)
		
		System.out.println(7.0 / 3.0); //note: double / double = double (2.33333_)
		
		
		//example of erros
		// assume x = 2, y =3, z = 5; display the average of these numbers
		
		int x =2, y = 3,z = 5;
		
		System.out.println("Without casting, the average = "+(x+y+z)/3); //without casting the 
		// we can do CASTING between intergers and doubles
		//1: (double) A: convert/cast the value of A from int to double
		// 2 - (int) B: convert/cast the value from B from double to int
		System.out.println("Without casting, the average = "+ (double)(x+y+z)/3); //with casting
		// casting - convert the value from int to double or double to int
		
		
		//fix the below without using casting
		System.out.println("Without casting, the average = "+(x+y+z)/3.0);
		// We fixed it by adding .0 to 3 so it turns from int / double
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		//PART 3 - STARTS
		// CLASS OF SEPTEMBER 11, 2025
		
		
		//Code: make an application that reads the circle's radius and display the area of the circle
		// Area of circle -  3.14 (pie)* radius * radius
		
		//SLIDE 9 WEEK 1 PROBLEM
		// PRACTICE SELF- STUDY EXERCISES #7 
		Scanner input = new Scanner(System.in);
		
		double radius;
		
		System.out.printf("Enter your radius: ");
		//!!!!!!make sure to declare variable to later get result!!!!!!! IMPORTANT
		radius = input.nextDouble();
		
		
		double area = radius * radius * 3.14;
		
		System.out.printf("The radius is %.2f, and the area of the circle is: %.2f",radius, area);
		
		THIS IS WHERE PART 3 ENDS
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 //THIS IS PART 2 - START
		//To define a scan object:
		Scanner input = new Scanner(System.in); //do not worry about new object right now
		//ALL CODE FROM NOW ON WE WILL USE JAVA IMPORT AND FIRST STATAMENT AS ABOVE
		
		//PART 2: RECTAGLE EXAMPLE:
		//Write code that reads in the length and the width of a rectangle and then
		// it calculates and displays the area of the rectangle
		
		//step 1: declare the needed type and variables.
		double length, width, area;
		
		// step 2: read in the length from the users use double (add next.int):
		
		System.out.printf("Enter the length of the rectangle: ");
		length = input.nextDouble(); //this statement reads in a double value from the user and it will also store it into the variable 'length'
		
		//now us to practice: 
		System.out.printf("Enter the width of the rectangle: ");
		width = input.nextDouble();
		
		//step 3 - calculate the area
		area = length * width;
		//step 4 - Display the result (area)
		System.out.printf("The length is %.2f, the width is %.2f, and the area is %.2f", length,width,area);
		//THIS IS WHERE PART 2 ENDS
		*/

		
		
		
		
		
		
		
		
		
		
		/*
		//PART 1 - BACKYARD EXAMPLE:
		///HERE WE START OUR CODE
		
		double length = 7.31; //length of backyard
		double width = 3.8; //width of backyard
		
		//task - calculate of area of backyard= length * width
		double area; 
		area = length*width;
		
		double perimeter;
		perimeter = length+length+width+width;
		perimeter = 2*length+2*width;
		//or 2(length+width)
		
		// System.out.println(area);
		// System.out.println(perimeter);

		System.out.printf("The length of the backyard is %.2f\n",length);
		System.out.printf("The width of the backyard is %.1f\n",width);
		System.out.printf("The area of the backyard is %.2f\n",area);   //call this #1 
		System.out.printf("The permieter of the backyard is %.1f\n",perimeter);
		
		//Note: we may have some calculations within the printf statement
		//Example: we can rewrite statement #1 as the below:
		//
		//System.out.printf("The area of the backyard is %.2f\n",length * width);
		
		//Note: consider the following code:
		// 
		int x =5; //you can merge x and y as they're the same data type:
		int y = 7;
		double w = 1.2;
		double z = 7.8;
		//we can rewrite the above code as the following:
		
		int x = 5, y= 7;
		//END OF FIRST PART
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
