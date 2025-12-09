package Lecture20;

public class lecture20 {

	public static void main(String[] args) {
									//Come back - Using assignment 6
										//Arrays
	//Task 1: write a code to do the below task = create an array named tester1 that can store  
	//The following value, values: -2,4,7,10,9
		
		int [] test1= {-2,4,7,10,9}; //First array
		//task 2: do test2  with double values
		double [] test2 = {3.14,5.27,-9.8,11.2,17}; //second array 
		//we will process all values in the array, accesing every spot from index 0 to length()-1 - last

		
							//Accesing every spot test1[#number]
		//We visit every index in our arrays
		System.out.print("Test 1: ");
		//task 3 - display all elements (values) of test 1
							//Careful to add index <=test1.length()-1 because the last index is not included in array.
		for (int index =0; index<test1.length; index++) {
			//at each index, display the value at that index
			System.out.printf("%d\t",test1[index]);
			
		}
		System.out.print("\nTest 2: ");
		//T4 = our own, we do the same for test 2
		for (int index =0; index<test2.length; index++) {
			System.out.printf("%.2f\t", test2[index]);
		}
		
		System.out.println();
		System.out.print("\nAdding 10\nTest 1: ");
		//task 5: create a code to add 10 to every element to test1
		for (int index = 0; index <test1.length; index++) {
			test1[index] += 10; //adding 10 to the value in index of array
			System.out.printf("%d\t", test1[index]);
			
		}
		System.out.println();
		System.out.print("\nAdding 10\nTest 2: ");
		
		//task 6: create a code to add 10 to every element to test2
		for (int index = 0; index <test2.length; index++) {
			test2[index] +=10;
			System.out.printf("%.2f\t", test2[index]);
		}
		
		//Teacher concern = we're repeating code over and over with very little changes
		//Other concern - the main method DOES ALL TASK
		//What can we do? We can create other methods that takes an array
		
											//Solution
		
		//write a void method that takes an array of integers as a paremeter and then it will display the context
		//of that taken array, called displayArray()
											//Uses
		//The main does tasks
		//The other methods do needed tasks

		
		
		//Task 7: Redo task 1 by using the method to display array: 
		System.out.print("Test 1 using method: ");
		displayArray(test1); //takenArray == test1 - this will travel down to displayArray - the main is using the second method
		
		//Instructor question: Can we use displayArray() to display test 2? no. we have double for test2
		//We can do overloading, same name and everything but have to change 
		
		//Task 8: Redo task 4 by using the method to display array:
		System.out.print("Test 2 using method: ");
		displayArray(test2); 
		
		

	}
	//To use array: (int [] a)
	//a single value: (int a)
	public static void displayArray(int [] takenArray) { //a is a single value, if i put brackets 
		
		for (int index = 0; index <takenArray.length; index++) {
			System.out.printf("%d\t", takenArray[index]);
		}
		System.out.println();
	}
public static void displayArray(double [] takenArray) { //a is a single value, if i put brackets 
		
		for (int index = 0; index <takenArray.length; index++) {
			System.out.printf("%.2f\t", takenArray[index]);
		}
		System.out.println();
	}
public static void displayArray(char [] takenArray) { //a is a single value, if i put brackets 
	
	for (int index = 0; index <takenArray.length; index++) {
		System.out.printf("%c\t", takenArray[index]);
	}
	System.out.println();
}
public static void displayArray(String [] takenArray) { //a is a single value, if i put brackets 
	
	for (int index = 0; index <takenArray.length; index++) {
		System.out.printf("%s\t", takenArray[index]);
	
	System.out.println();
	}
}

}//Main Project /
