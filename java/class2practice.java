package class2;
import java.util.Scanner;

public class Class2Practice {

	public static void main(String[] args) {
	// Division Practice Write code that divides two integers entered by the user. Show both the integer division result (discarding remainder) and the precise division result (as a double).
		
		Scanner input = new Scanner (System.in);
		/*problem 1
		double first_number;
		double second_number;
		
		
		//Number inputs
		System.out.print("Enter first number: ");
		first_number = input.nextInt();
		System.out.print("Enter second number: ");
		second_number = input.nextInt();

		double division = first_number/second_number;
		//print
		System.out.printf("The division equals to: %.1f",division);
		*/
		
		//Average Calculator (Fix Casting) Ask the user for three integers. Print the average in two ways: Without casting (integer division). With casting (double result).
		
		int variable_a;
		int variable_b;
		int variable_c;
		
		System.out.printf("Enter a number for variable A: ");
		variable_a = input.nextInt();
		System.out.printf("Enter a number for variable B: ");
		variable_b = input.nextInt();
		System.out.printf("Enter a number for variable C: ");
		variable_c = input.nextInt();
		
		System.out.printf("Your variables are: %d.2f, %d.2f, and %.2f with casting, ", variable_a,variable_b,variable_c, variable_a+variable_b+variable_c / 3);
		
		
		
		
		
		
	
		
		
	}

}
