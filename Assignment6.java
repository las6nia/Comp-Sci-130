package Lab6;

import java.util.Scanner;

public class main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        display();

        	
    }
//asking first questiuons
    public static void display() {

        System.out.print("Enter a starting value for the progression: ");
        int startingValue = input.nextInt();

        System.out.print("\nEnter the difference between values in the progression: ");
        int differenceBetweenValues = input.nextInt();

        System.out.print("\nEnter a value to locate in the progression: ");
        int valueToLocate = input.nextInt(); //progression
       
        //table array
        int[] table = new int[50];

        			//edit - finish adding the value to the array
        int currentValue = startingValue;
        for (int i = 0; i < 50; i++) { //adding current value from the original starting variable, assigning for table at row, and incrementing with the differenceBetweenValues
            table[i] = currentValue;
            currentValue += differenceBetweenValues; 
        }

        int index = indexPosition(table, valueToLocate);

 //Come back**** found array position
        if (index == -1) {
            System.out.printf("%d is not in the array.\n", valueToLocate);
        } else {
            System.out.printf("%d is in the array at index position %d.\n", valueToLocate, index);
        }

        // display how many numbers to show
        int n;
        while (true) {
            System.out.print("\nHow many would you like me to show? ");
            n = input.nextInt();
            if (n >= 0 && n <= 50) {
            	break;
            }
            else {
            System.out.println("Enter a number between 0 and 50");
            	}
            }

       // printing n numbers, 10 per line **in test case**
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d", table[i]); //error to get 7d, fix (come back)
            if ((i + 1) % 10 == 0) // if theincrementation of i comes to the mod of 10, add a space.
                System.out.println();
        }
    
    }

    			// -----	-	-	-	-	-- Methods -	-	-	-	-	-	-	--	----	-	-	-	--
    public static int indexPosition(int[] arr, int target) { //arraymethods

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found
            }
        }
        return -1; //this is if not found
    }
}
