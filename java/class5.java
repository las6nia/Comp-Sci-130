package MainClass;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int score; //user input
		
		//get and declare variable
		System.out.print("Enter an interger: ");
		score = input.nextInt();
		
		if (score < 0  || score>100)
		{
			System.out.printf("%d is an invalid score",score);
		}
		else if (score >= 90 && score <= 100) 
		{	
		System.out.printf("Excellent: %d has a grade of A!",score);
		}
		else if (score <90 && score>=80)
		{
			System.out.printf("Very good, %d has a grade of B!",score);
		}
		else if (score <80 && score>=60)
		{
			System.out.printf("decent, %d has a grade of C.",score);
		}
		else 
		{
			System.out.printf("%d has a grade of F, try next time",score);
		}
		
		
		
		

	}

}
