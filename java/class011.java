package Lecture11;
import java.util.Scanner;

public class class11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //---------------max / min algortithm COUNTER CONTROL LOOPS SECTION- While Loops Slides-----------------

        //The strings can be represented as a sequence () of characters
        //where each chatavyers has it's own spot and each spot has his own index

        //example: String city = "Green Bay"; (this has 8 index)
        //the last index is .length() -1

        //example: white a code that reads the full name from the user, then your code should display the below:
        //The number of vowels in the inputed name:
        String fullName; // user input
        int index = 0;
        int vowelCounter = 0; //output

        //step 1 = get name
        System.out.println("Enter your full name");
        fullName = input.nextLine();

        while (index <= fullName.length() -1)
        {//start while
            char copy = fullName.charAt(index);

            //test if copy is vowel
            if (copy == 'a' || copy == 'e' || copy == 'i' || copy == 'o' || copy == 'u')  //isn't it
            {
                vowelCounter++;
            }

            //Move to the next spot
            index++;
        }

        //Number of Upper case and lower case letters



        //Step 1 =  declare and initialize max to  and min
        // make current max - and current min, the max number will be looking out for max numbers and condition if the input is greater than max it will update, STUDY THISS!!



        /*
        // --------------Part 1:___------------------
        //Write a code that displays all intergers between 0 and 100, then your code MUST
        //find the total product, and the average of all numbers in this range

        //HINT - this problem can be done using counter control loops

        int count = 1; //--- starting point of the range
        int total = 0;
        int product = 1; // multiply the value with the product
        while(count <= 10)
        {
            System.out.printf("%d\t",count); // show the number
            total += count;
            product *= count;

            count++; //Update the counter

        } //end of the while loop
        //Display total after the loop

        System.out.printf("\nThe total of ALL intergers between 1-10 is: %d\n",total);
        System.out.printf("\nThe product of ALL intergers between 1-10 is: %d\n",product);
        //to get average = total/value
        System.out.printf("\nThe average of ALL intergers between 1-10 is: %.2f\n",total/10.0); //casting from int to double
        //Question to study - multiplying over the counter and how to update the counter and multiplying the counter and range and get calculations
        //(ask chat gpt to a study guide)


        //---------------------------Part 2: use code from above------------------
        //Write a code that displays all intergers between 10 -1 INSTEAD now, then your code MUST
        //find the total product, and the average of all numbers in this range

        int count = 10; 
        int total = 0;
        int product = 1;
        while(count >= 1)
        {
            System.out.printf("%d\t",count);
            total += count;
            product *= count;

            count--; 
        }

        System.out.printf("\nThe total of ALL intergers between 1-10 is: %d\n",total);
        System.out.printf("\nThe product of ALL intergers between 1-10 is: %d\n",product);
        System.out.printf("\nThe average of ALL intergers between 1-10 is: %.2f\n",total/10.0);


        //--------------part 3 - initialize counter from 1-10 but only even numbers--------------
        int count = 2;
        int total = 0;
        int product = 1;
        while(count <= 10)
        {
            System.out.printf("%d\t",count);
            total += count;
            product *= count;

            count+= 2; 
        }

        System.out.printf("\nThe total of ALL intergers between 1-10 is: %d\n",total);
        System.out.printf("\nThe product of even numbers between 1-10 is: %d\n",product);
        System.out.printf("\nThe average of ALL intergers between 1-10 is: %.2f\n",total/5.0);



        //-------------PART 4 - READ AND PROCESS A SET FROM USER INPUTS. NOTE THAT WE KNOW HOW MANY INPUTS THE
        //USER WILL ENTER BEFORE THE RUN TIME, SLIDE 9 .
        //Note - since i know the number of inputs, then this problem can be solved using counter controlled loops

        int iterationCounter = 1;
        double total = 0;
        double product = 1;
        double userInput; 
        double currentMax;
        double currentMin;

        System.out.println("Enter a double value: ");
        userInput = input.nextDouble();

        currentMax = userInput;
        currentMin = userInput;
        total += userInput;
        product *= userInput;

        while (iterationCounter <= 4){
            System.out.println("Enter a double value: ");
            userInput = input.nextDouble();
            currentMax = userInput;

            total += userInput;
            product *= userInput;

            if (userInput > currentMax) {
                currentMax = userInput;
            }

            if (userInput < currentMin) {
                currentMin = userInput;
            }

            iterationCounter++;
        }
        System.out.println("The results are the following: ");
        System.out.printf("Total ---------------------%10.2f", total);
        System.out.printf("\nProduct------------------%10.2f", product);
        System.out.printf("\nAverage------------------%10.2f", total/5.0);
        System.out.printf("\nCurrent Max------------------%10.2f", currentMax);
        System.out.printf("\nCurrent Min------------------%10.2f", currentMin);
        */


        //MISSED IN CLASS 10 - Loops, show a code to display a message for 5 times!, display GB for 10 times
        //We wrote code to display name, loops
        //int count = 0;
        //while (count <10){count++;}

    }
}
