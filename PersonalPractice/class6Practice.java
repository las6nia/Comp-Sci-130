package Class6Practice;
import java.util.Scanner;


public class Practice6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//task 4 - Create a switch program that asks 
		//the user for a day number (1–7) and prints the day of the week:
		
		int mainResponse;
		int counter = 0;
		
		
		while(true) {
			counter ++;
			
			System.out.println("Enter your day of the week in number format:");
			mainResponse = input.nextInt();
		
		switch (mainResponse) {
			case 1: {
				System.out.println("Your day is Monday");
				break;
				
			}
			case 2: {
				System.out.println("Your day is Tuesday");
				break;
			}
			case 3: {
				System.out.println("Your day is Wednesday");
				break;
			}
			case 4: {
				System.out.println("Your day is Thursday!");
				break;
			}
			case 5: {
				System.out.println("Your day is Friday!");
				break;
			}
			case 6: {
				System.out.println("Your day is Saturday!");
				break;
			
			}
			case 7: {
				System.out.println("Your day is Sunday!");
				break;
			}
			default:
					System.out.println("Invalid");
					switch(counter) 3:{
							System.out.print("ugh, stop it already, just ");
						}
						case 5:{
							System.out.print("Stop it!!!");
							///this is where I left off!!!
						}
					}
					
					continue;
			}
			break;
		}
		
		System.out.printf("Cograts!\nIt took you", counter,"tries to get a day!");
		

		
		//task 3 - max and min values: 
		double num1;
		double num2;
		
		//num1
		System.out.print("enter first number: ");
		num1 = input.nextInt();
		
		//num2 
		System.out.print("enter first number: ");
		num2 = input.nextInt();
		
		
		double largestNum = Math.max(num1, num2);
		double smallestNum = Math.min(num1, num2);
		
		System.out.printf("Your largest number is: %.0f\n",largestNum);
		System.out.printf("Your smallest number is: %.0f",smallestNum);
		

	
		//task 2 - radius to circumference (area)
		
		double radius;
		double area;
		
		System.out.println("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		area = (Math.PI) * (Math.pow(radius,2));
		System.out.printf("The area of the circle is: %.2f",area);
		
		
		
		
		
		
		//Prints the result of Math.ceil(-5.7) and Math.floor(-5.7).
		//Tasks 1 
		
		System.out.printf("Math.ceil(-5.7) = {%.1f} and Math.floor(-5.7) will give {%.1f}\n\n",Math.ceil(-5.7),Math.floor(-5.7));
		
		//calculates (5)^4 using math.pow
		System.out.printf("The calculation of 5^4 is %.1f\n\n",Math.pow(5, 4));
		
		System.out.printf("The square root of 144 is: {%.1f}\n\n",Math.sqrt(144));
		
		System.out.printf("The absolute value of -15.5 is {%.1f}",Math.abs(-15.5));

		
		
		
		

	}

}
