/*FIX ERRORS*/

package Labs;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String major;
		
		int freshman = 1; int sophmore = 2; int junior = 3; int senior = 4;
		int year;
		
		System.out.print("Enter your major: ");
		major = input.nextLine().toLowerCase();
		
		System.out.print("Enter your year: ");
		year = input.nextInt();
		
		if ((major.charAt(0) == 'm'))
		{
			if (year >= freshman || year < sophmore) {
				System.out.println("Hello");

			}
			else if (year > freshman || year < junior) {
				System.out.println("Hello Mathematics Sophmore");
				}
			else if (year > sophmore|| year < senior) {
				System.out.println("Hello Mathematics Junior");
				}
			else {
				System.out.println("Hello Mathematics Senior");
			}
		}
		else if ((major.charAt(0) == 'c')) {
			if (year >= freshman || year < sophmore) {
				System.out.println("Hello Computer Science Freshman");
		}
			
		
		
		
	}

}
