package class22;
import java.util.Arrays; // same path like the Scanner - upper 'A'
import java.util.Scanner;

public class lecture22 {

	public static void main(String[] args) {
		// how can we use a library? from november 18th, right click, copy, and paste in new project.
		
		
	//-	-	-	-	-	-	--		-	--	-	topic - Arrays library	-	-	-	-	-	--	-	-	-	-	-	--	-	-
		//December 18th - Final exam, december 12th? - check dates
		
	/*	
		int [] test1 = {10,-9,88,100,22};
		int [] test2 = {10,-9,88,100,22};
		System.out.println("Test 1 before sorting is: ");
		ArrayMethods.displayArray(test1); // using the display from library
		//this will sort array
		Arrays.sort(test1);
		//This will show after the sorting
		System.out.println("Test 1 before sorting is: ");
		ArrayMethods.displayArray(test1);
		
		//Arrays - searching for a string - YOU HAVE TO SORT THE ARRAY FIRST
		System.out.printf("This is using the binary search, the index of 22 is: %d\n", Arrays.binarySearch(test1, 22));
		
		//Seaching for value that isn't in array - if searching for 20 and not in ****need to do -(insertion index+1)****
		System.out.printf("This is using the binary search, the index of 22 is: %d\n", Arrays.binarySearch(test1, 20));
		System.out.printf("This is using the binary search, the index of 90 is: %d\n", Arrays.binarySearch(test1, 90)); 
		//If negative, it is not there, else, the ngative it will help you where it should be - chat - help me explain this
		
		//Arrays equal method - this will check if arrays are EXACTLY the same............
		System.out.println("Test 1 before sorting is: ");
		
		//Arrays fill method() - this will...............
		double [] test3 = new double [100];
		Arrays.fill(test3, 11.52);
		System.out.println("Test 3 after calling the fill method: ");
		ArrayMethods.displayArray(test3);
		//All values in array
	*/
		
		//	-	-	-	-	--	-	-	-	-PART 2 - TWO-DIMENTIONAL ARRAYS(Matrix in math)--------------------------------
		
		//EXAMPLE - This is similar to Microsoft Excel - rows and columns - 
		//#1 - requirements - all values in the table should have the same data type - we cannot have a mix
		//#2 - each 2d array - has a name, 
		//#3 - number of rows
		//#4 - Number of columns - any 2d array needs to have # 
		//#5 - number of rows * number of columns - the intersection represents the spot on those types, a table of 4x4 can store 16 values
		
							//QUESTION - To create a 2d- array we have 2 ways
		//#1 - to create an empty array (table)  - Empty array:
							//You need type, [][], name, = new, type[Row][Columns]
		
		//Task 1 : create a 2d array called AA that has 3 rows and 4 columns:
		
		int [] [] AA = new int[3][4]; //This is empty - each row has an index, we start from 0, each row and column has index
		//Each spot is called a 'cell', 'element' - ***********IMPORTANT - this has 2 index, one for row, one for column***********
		
		
		
		
		//Way2 - an array with initial values
					//you need type, [] [] , name = { {list values @ row 0 }, {list of values @ row1}]
		//Task 2: create a 2d array 
		double [][] arr1 = {{1.9, 3.5,2.4}, 
						   {-1.8,2.3, 5.1}, //this is the array, it goes row by row, 3X3
						   {9.7, 1.1, 4.8}};  
		double [][] arr2 = {{1.9, 3.5,2.4}, 
				   {-1.8,2.3}, //Del}, //this is the array, it goes row by row, 3X3
				   {9.7, 1.1, 4.8}};   //My question  -what if you try to return a value in which a value doesn't exist?
		
		//Answer: out of bound
		
		
		//Task 3 - write a statement that display the first element (row 0 and col 0)
		System.out.printf("%.2f is at [0][0]\n", arr1[0][0]); //this will display the value at this matrix
		System.out.printf("%.2f is at [1][2]\n", arr1[1][2]);
		
		//in 1d array, the length = size (#spots) of the array
		//2d?
		//Display the length = equals the length of rows in the array(check AA)
		System.out.printf("The length of AA= %d\n", AA.length);
		
		System.out.printf("The length of Arr1 = %d\n", arr1.length);
		//Sysout the index on arr2
		
		//the second row, each row is a one dimentional array
		//Question - How 
		//The length of each row is ????
		
		//printing number of columns:
		System.out.printf("The # of columns of Arr1 = %d\n", arr1[0].length);
		//In java - each row may have a different number of columns
		
		//4 forms of accessing the element in a 2d arrays
		//WE can access a signle value
		//We can access a single row
		//We can access a single columns
		//#4 - OR we can access all elements of the array (array processing)
		
		
		//WE will access code to access all elements in our array
		//The Z way - We will start with 0,0 and ++ to next row (creating a Z)
		//we need the outer loop for rows, and inner loop for number of columns
		
		
		//task4 - write a code that displays the content of arr1: 
		//access first row, once done, move to next
		System.out.println("............... arr1 ..................");
		for (int i =0; i <arr1.length; i++) { //outter loop for rows: to visit rows in the array
			for (int j = 0; j<arr1[i].length; j++) {//Inner loop for columns in the row that we're visiting now
				//Access each elements using indexes = i and j - 
				System.out.printf("%.2f\t", arr1[i][j]); // this will print the values
			}//end of inner
			System.out.println(); //before moving to the next line, we have to make a new line
		}//end of outer
		
		//summary - we need 2 loops. 1 outer, 1 inner - we are visiting 
		
		//task 5: I will code a method to display Matrix.2dArray
		
		//System.out.printf("This is the matrix:\n%d",Matrix.display2dArray(arr1)); //-chat - get help to fix 
		
		//A method named load2d array that takes a 2d integer arra as a parameter and then prompts the user to enter 
		//integer values ans store them in that taken array
		
		//task 6: create a 2d array named myList with 3 rows and 2 columns
		int [] [] myList = new int [3][2];
		
		//write a code that prompts the user to enter the values for myList
		
		System.out.println("Enter vaues for an array for 3 rows and 2 columns (4 values): ");
		Matrix.load2dArray(myList);
		
		//write a code to display myList from the library
		Matrix.display2dArray(myList);
		
		
		Matrix.calcStat(myList);
		
		
		
											//The Z and W ways - 
		
		

	}

}
