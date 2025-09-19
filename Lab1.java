package lab1;
import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int credit;
		double creditValue;
		double totalGradePoints;
		int totalCredits;
		
		//sample run - test case
		//first business class (credit + value)
		System.out.println("Enter the credits for the first business class: ");
		credit = input.nextInt();
		
		System.out.println("Enter the value (4.0, 3.0,etc.) of the grade for the first business class: ");
		creditValue= input.nextInt();
		double value1 = creditValue;
		
		//second business class (credit + value)
		System.out.println("Enter the credits for the SECOND business class: ");
		credit = input.nextInt();
		
		System.out.println("Enter the value (4.0, 3.0,etc.) of the grade for the SECOND business class: ");
		creditValue= input.nextInt();
		double value2 = creditValue;
		double sum = value1 + value2;
		
		totalGradePoints = creditValue + creditValue;
		System.out.print(totalGradePoints);
		
		
		
		//double gpa = totalGradePoints / totalCredits
		
		

	}

}
