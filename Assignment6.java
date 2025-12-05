package Lab6;
import java.util.Scanner;
public class main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int value = display();
		
		
		

	}//end of main
	
	
	public static void display() {
		int startingValue;
		int differenceBetweenValues;
		int valueToLocate;
		
		System.out.println("Enter a starting value for the progression: ");
		startingValue = input.nextInt();
		System.out.println("Enter the difference between values in the progression: ");
		differenceBetweenValues= input.nextInt();
		System.out.println("Enter a value to licate in the progression: ");
		valueToLocate = input.nextInt();

		
	}
	
	

}
