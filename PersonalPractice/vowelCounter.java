package practiceClass011;
import java.util.Scanner;

public class PracticeClass11 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
					//#1 - practice
//Count consonants After counting vowels, try counting only the 
//consonants in the full name. Ignore spaces and non-letter characters.
	
	String name;
	int index = 0;
	int vowelCounter = 0;
	
	System.out.print("Enter your name: ");
	name = input.nextLine();
	name = name.toLowerCase();
	
	while (index <= name.length()-1) {
		char copy = name.charAt(index);
			if (copy == 'a'||copy == 'e'||copy == 'i'||copy == 'o'||copy== 'u') {
				vowelCounter++;
					if (vowelCounter>= 0 && vowelCounter <=1) {
						System.out.printf("%c is the first vocal\n",copy);
					}
					if (vowelCounter >1 && vowelCounter <= 2) {
						System.out.printf("and %c is the second vocal\n",copy);
					}
			}
	index++;
	}
	
	System.out.printf("In total, your name of '%s' has %d vowels :)\n",name, vowelCounter);


	
	
	}

}
