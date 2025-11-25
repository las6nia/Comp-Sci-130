package class22;
import java.util.Scanner;

public class Matrix { //start of library
	static Scanner input = new Scanner(System.in);
	//A method named display2dArray that takes a 2d array as a parameter and then it will display the contents of that taken array
	
	//For ints
	
	public static void display2dArray (int [] [] takenArray) {	//we cannot do [], we have to do [] [] for a 2d array
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%d\t", takenArray[i][j]);
			}//end of inner
			System.out.println(); 
		}
	}
	public static void display2dArray (double [] [] takenArray) { //For double values
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%.2f\t", takenArray[i][j]);
			}//end of inner
			System.out.println(); 
		}
	}
	public static void display2dArray (char [] [] takenArray) {	//for chars
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%c\t", takenArray[i][j]);
			}//end of inner
			System.out.println(); 
		}
	}
	public static void display2dArray (String [] [] takenArray) {	//for Strings
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%s\t", takenArray[i][j]);
			}//end of inner
			System.out.println(); 
		}
	}
	
	
	//A method named load2d array that takes a 2d integer arra as a parameter and then prompts the user to enter 
			//integer values ans store them in that taken array
			
		//Z way
	public static void load2dArray (int [] [] takenArray) {
		for (int i =0; i <takenArray.length; i++) { 
			System.out.printf("Please enter the values for row %d\n",takenArray[i].length, i);
			for (int j = 0; j<takenArray[i].length; j++) { 
				//Acess each element using 2 indexes:
				takenArray[i][j] = input.nextInt();
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("%d values have been stored successfully!\n", takenArray.length * takenArray [0].length);
	}
	
	
	public static void load2dArray (double [] [] takenArray) {
		for (int i =0; i <takenArray.length; i++) { 
			System.out.printf("Please enter the values for row %d\n",takenArray[i].length, i);
			for (int j = 0; j<takenArray[i].length; j++) { 
				//Acess each element using 2 indexes:
				takenArray[i][j] = input.nextInt();
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("%.2f values have been stored successfully!\n", takenArray.length * takenArray [0].length);
	}
	
	public static void load2dArray (char [] [] takenArray) { //for char - changed to get input as char
		for (int i =0; i <takenArray.length; i++) { 
			System.out.printf("Please enter the values for row %d\n",takenArray[i].length, i);
			for (int j = 0; j<takenArray[i].length; j++) { 
				//Acess each element using 2 indexes:
				takenArray[i][j] = input.next().charAt(0);
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("%c values have been stored successfully!\n", takenArray.length * takenArray [0].length);
	}
	
	public static void load2dArray (String [] [] takenArray) { //for strings
		for (int i =0; i <takenArray.length; i++) { 
			System.out.printf("Please enter the values for row %d\n",takenArray[i].length, i);
			for (int j = 0; j<takenArray[i].length; j++) { 
				//Acess each element using 2 indexes:
				takenArray[i][j] = input.next();
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("%s values have been stored successfully!\n", takenArray.length * takenArray [0].length);
	}
	
	//write a void calcstat method that takes a 2d integer array and then it will compute and display the below:
	//Total, product and the average of all elements in that taken array
	
	public static void calcStat(int [] [] takenArray ) {
		//take arrays
		int total = 0, product = 1;
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%d\t", takenArray[i][j]);
				
				//check what this does: 
				product+=takenArray[i][j];
				total+=takenArray[i][j];
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("Total  = %d", total);
		System.out.printf("Product  = %d", product);
		System.out.printf("Total  = %d", (double) total / (takenArray.length * takenArray [0].length)); //average
		
	}
	
	public static void calcStat(double [] [] takenArray ) {
		//take arrays
		double total = 0, product = 1;
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%d\t", takenArray[i][j]);
				
				//check what this does: 
				product+=takenArray[i][j];
				total+=takenArray[i][j];
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("Total  = %.2f", total);
		System.out.printf("Product  = %.2f", product);
		System.out.printf("Total  = %.2f", (double) total / (takenArray.length * takenArray [0].length)); //average
		
	}
	//char - check if any mistakes
	public static void calcStat(char [] [] takenArray ) {
		//take arrays
		int total = 0, product = 1;
		for (int i =0; i <takenArray.length; i++) { 
			for (int j = 0; j<takenArray[i].length; j++) { 
				System.out.printf("%d\t", takenArray[i][j]);
				
				//check what this does: 
				product+=takenArray[i][j];
				total+=takenArray[i][j];
			}//end of inner
			System.out.println(); 
		}
		System.out.printf("Total  = %c", total);
		System.out.printf("Product  = %c", product);
		System.out.printf("Total  = %c", total / (takenArray.length * takenArray [0].length)); //average
		
	}
	

	
	
	
	
	//In public - 
	
	
	

}//end of library
