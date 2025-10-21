package Class3;

import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
        /*
        (GPA Computation): Write a Java application to compute the GPA
        of two business courses. The application should adhere to the
        following steps:
        1. Read number of credits and value of the grade of the first
           business class.
        2. Accumulate the total grade points and total credits.
        3. Read number of credits and value of the grade of the second
           business class.
        4. Accumulate the total grade points and total credits.
        5. Calculate the GPA: GPA = totalGradePoints / totalCredits
        6. Display the computed GPA.
        */

        Scanner input = new Scanner(System.in);

        double credit1, credit2;          // credits for each class
        double grade1, grade2;            // grade values (4.0, 3.0, etc.)
        double totalGradePoints;          // sum of (credit * grade)
        double totalCredits;              // sum of credits
        double gpa;                       // final GPA

        // --- First business class ---
        System.out.print("Enter the credits for the first business class: ");
        credit1 = input.nextDouble();

        System.out.print("Enter the value (4.0, 3.0, etc.) of grade for the first business class: ");
        grade1 = input.nextDouble();

        // --- Second business class ---
        System.out.print("Enter the credits for the second business class: ");
        credit2 = input.nextDouble();

        System.out.print("Enter the value (4.0, 3.0, etc.) of grade for the second business class: ");
        grade2 = input.nextDouble();

        // --- Logic ---
        totalGradePoints = (credit1 * grade1) + (credit2 * grade2);
        totalCredits = credit1 + credit2;
        gpa = totalGradePoints / totalCredits;

        // --- Output ---
        System.out.printf("Your GPA for the 2 business classes is %.2f%n", gpa);

        input.close();
    }
}
