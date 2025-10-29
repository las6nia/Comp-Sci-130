package lecture15;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  /*
        // Example of nested loops
        for (int i = 0; i < 2; i++) { // Outer loop - runs first; if this condition is true, the inner loop starts
            
            for (int j = 0; j <= 2; j++) { // Inner loop - repeats until its condition becomes false
                
                // Code for inner loop body goes here
                
            } // End of inner loop
            
        } // End of outer loop - if both loop conditions become false, the program exits the loops


        /* 
         ===============================
         Task 1: Display the multiplication table of 5
         ===============================
        */
        System.out.print("The multiplication table of 5 is:\n");
        
        for (int count = 0; count <= 10; count++) {
            System.out.printf("5 X %d = %d\n", count, count * 5);
        }

        
        /*
         ===============================
         Task 2: Display multiplication tables for integers between 1 and 9
         ===============================
        */
        int num = 1;
        for (num = 1; num <= 9; num++) {
            System.out.printf("The table of %d\n", num);
            
            for (int count = 1; count <= 10; count++) {
                System.out.printf("%d X %d = %d\n", num, count, num * count);
            }
            
            System.out.print("\n");
        }


        /*
         ===============================
         Application of Nested Loops: Drawing Figures
         ===============================
        */
        
        // Task 3: Print a 5x4 grid of stars
        /*
         * * * *
         * * * *
         * * * *
         * * * *
         * * * *
        */
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("*\t"); // Print one star per column
            }
            System.out.print("\n"); // Move to next row
        }

        System.out.print("\n");


        // Task 4: Replace columns 2 and 4 with a different symbol
        for (int row2 = 1; row2 <= 5; row2++) {
            for (int col2 = 1; col2 <= 4; col2++) {
                if (col2 % 2 == 0) { // Even-numbered columns (2 and 4)
                    System.out.print("$\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.print("\n");
        }


        /*
         ===============================
         Task 5: Print a triangle of stars (user input)
         ===============================
        */
        System.out.print("Enter number of rows: ");
        int userRow = input.nextInt();

        for (int row = 1; row <= userRow; row++) { 
            for (int col = 1; col < row; col++) { // Number of columns = current row number
                System.out.print("*\t");
            }
            System.out.print("\n");
        }


        /*
         Practice Challenge:
         Print the pattern below:
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
        */


        /*
         ===============================
         Task 6: Display squares of integers in different ranges
         ===============================
        */

        // T1: Display squares of numbers 1–7
        for (int k = 1; k <= 7; k++) {
            System.out.printf("The square of %d is %d\n", k, k * k);
        }
        System.out.printf("\n");
        //to use t1:
        
        displayNumbers(1,7); //
        
    //task = replace t2 with method

        // T2: Display squares of numbers 12–27
        for (int t2 = 12; t2 <= 27; t2++) {
            System.out.printf("The square of %d is %d\n", t2, t2 * t2);
        }
        displayNumbers(12,27);
        System.out.printf("\n");

        // T3: Display squares of numbers 35–50
        for (int t3 = 35; t3 <= 50; t3++) {
            System.out.printf("The square of %d is %d\n", t3, t3 * t3);
        }
        displayNumbers(35,50); // Study this


        /*
         ===============================
         Topic Introduction: Encapsulation
         ===============================
         Problem: We keep repeating similar code with small changes.
         Solution: Encapsulate code inside methods to reuse it (covered in Chapter 6).
        */
    
//IMPORTANT - METHOD STructure
        
        //to do t1: I will pass 1 as the start and 7 as the end
        //to do t2: I will pass 12 as the start and 27as the end
        //to do t2: I will pass 35 as the start and 50 as the end
        
        //Conclusion = the parameters are the values that depend on which tasks you will do sum(value 1 and value2)
        
        //What does public static mean? - not our topic until programming II
        
        //advantange of methods - AVOID repeating code!
        
        
        
        						//IN SOFTWARE ENGINEERING
        //Clone engineer - goal is to always minimize
        
        
        //exam 3 - topics 1,2,3
        
        

        
        
        
        
        
        
        
        
        
    } // End of main method 
    //method of main can be used before or after the main but preferable to use after
    //displayNumbers: prints the numbers in the range between start and the end
    
    public static void displayNumbers(int start, int end){//Void and understanding this in next class - Study


        for (int k = start; k <= end; k++) {
            System.out.printf("The square of %d is %d\n", k, k * k);
        }
        System.out.printf("\n");
    }

} // End of class
