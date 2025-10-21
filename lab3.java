package Labs;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String main;
		char major;
		int year;
		String majorTest;
		
		System.out.println("enter 2 characters: ");
		main = input.nextLine();

		major = main.toLowerCase().charAt(0);
		year = Integer.parseInt(main.substring(1));
//System.out.printf("%c and %d",major,year+1); - testing
		
	
		if (major == 'm'){
			switch (year) {
			case 1:
			{
				System.out.print("Hello, Mathematics Freshman");
				break;
			}
			case 2:
			{
				System.out.print("Hello, Mathematics Sophmore");
				break;
			}
			case 3:
			{
				System.out.print("Hello, Mathematics Junior");
				break;
			}
			case 4:
			{
				System.out.print("Hello, Mathematics Senior");
				break;
			}
			default:
				System.out.println("Invalid input");
				
		}
	}
		else if (major == 'c'){
			switch (year) {
			case 1:
			{
				System.out.print("Hello, Computer Science Freshman");
				break;
			}
			case 2:
			{
				System.out.print("Hello, Computer Science Sophmore");
				break;
			}
			case 3:
			{
				System.out.print("Hello, Computer Science Junior");
				break;
			}
			case 4:
			{
				System.out.print("Hello, Computer Science Senior");
				break;
			}
			default:
				System.out.println("Invalid input");
		}
	}
		else if (major == 'i'){
			switch (year) {
			case 1:
			{
				System.out.print("Hello, Information Science Freshman");
				break;
			}
			case 2:
			{
				System.out.print("Hello, Information Science Sophmore");
				break;
			}
			case 3:
			{
				System.out.print("Hello, Information Science Junior");
				break;
			}
			case 4:
			{
				System.out.print("Hello, Information Science Senior");
				break;
			}
			default:
				System.out.println("Invalid input");
				
			
		}
	}
		
		else {
			System.out.println("Invalid input");

		}
		
		
	
	}
}
