                                          //Voting system - in class activity
package class23;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	
	//GLOBAL ARRAYS: 
	static String [] candidateName = new String [25]; //Assume it's 25 candidates
	static int [] [] votesByRegion = new int [25][4]; //25 rows , 4 columns - all arrays have to have the same # of rows
	static int [] totalVotes = new int [25]; 
	//we have to have a variable that keeps track of the current # of candidates in our system
	
	static int currentNumberOfCandidates = 0; //This will hold # of candidates in our system 
	//This number of candidates is important of 
	//What is the index of rows? a new candidate - we will add it to the very end of the list
	
	//keep reading and processing command until quit (end of the data that we have)
	
	
	
	
	

	public static void main(String[] args) { //start of main
		
		//Methods - to avoid pasing array to methods, you will have to change to global 
		
		//Advantage - methods will be more simple:
		//Disadvantage - The developed methods can't be used with other projects
		//Libraries - 
		
		//Survey - 90% of developers do not like this practice () - They want to make something and re-use as much as they can
		
		
		
		
				//Project #3 - We will not be able to use this for other projects like we've done with methods, we've done bank sys
				//student list, and we will do election management system
		
		//Task : we need 3 arrays, 1 for strings, then a 2d array (votes by region, we will store the votes for region 1
		//In second one, region 2, region 3, and region 4 (4 columns total)), and ALL ARRAYS WILL BE GLOBAL    
		
		processCommands(); //done with main
		
		
		
		
		
		
		
		
	}//End of main
	
	//This method will read and process commands from the user
	
	public static void processCommands () {//start of method, it will keep reading commands until it reads quit, called Kernell method - 
		//It will do everything, nothing to do more in the main, the hot, the code
		//Sentinel needed to quit while quit is applied
		
		String inputedCommand ; 
		
		inputedCommand = input.next().toLowerCase();
		
		while (!inputedCommand.equals("quit")) { //Come back to study this
			
			
			switch(inputedCommand) {
			case "add":
				processAddCommand();
				break;
			case "vote":
				processVoteCommand();
				break;
			case "output":
				processOutputCommand();
				break;
			
			case "display":
				processDisplayCommand();
				break;
			default:
				break;
			}	
		    inputedCommand = input.next();
			
			//display a msg that tells the user about termination of the run
		}
		System.out.println("Program terminated!");	
		
	}//end of method
	
	public static void processAddCommand() { //second method that will process the add command
		//Read the rest of the add command transaction. The rest has only the candidates name -- we will read the name in this process command
		String inputedCandidateName;
		//read candidate name
		inputedCandidateName = input.next(); 
		//Explore if this candidate is already in our list or not by using the linear search method
		int returnedIndex = searchByName(inputedCandidateName); //Calling the method and searching the candidate name
		if (returnedIndex != -1) { //this has been added earlier
			System.out.printf("Transaction can't be copleted. %s is already in list\n", inputedCandidateName); //first case - !=-1
		}
		else { //this name is not in our list so we should we add them to the end of the list pointed by currentNumberOfCandidates
			System.out.printf("");
			candidateName[currentNumberOfCandidates] = inputedCandidateName;
			votesByRegion[currentNumberOfCandidates][0] = 0;
			votesByRegion[currentNumberOfCandidates][1] = 0;
			votesByRegion[currentNumberOfCandidates][2] = 0;
			votesByRegion[currentNumberOfCandidates][3] = 0;
			
			totalVotes[currentNumberOfCandidates] = 0; //Total votes for the added candidate
			currentNumberOfCandidates++; //Incrememnt the current number of candidates - this will be the next inputedName as well
			
			System.out.printf("Transaction has been completed successfully. %s has been added", inputedCandidateName);
			
			
		}
		
		
		
		
	}
	
	public static void processVoteCommand() { //third method that will process the vote commands
		
		
		
	}
	
	public static void processOutputCommand() { //fourth method that will process the output command
		String inputedCandidateName;
		inputedCandidateName = input.next();
		int returnedIndex = searchByName(inputedCandidateName);

		if (returnedIndex == -1) {//change to == as if will be false if -1
		    System.out.printf("Transaction can't be copleted. %s is already in list\n", inputedCandidateName);
		}
		else {
			displayHeader();
			System.out.printf("%5s%10d%10d%10d%10d%10d\n",
			        								candidateName[returnedIndex],
			        							   votesByRegion[returnedIndex][0],
			        							   votesByRegion[returnedIndex][1],
			        							   votesByRegion[returnedIndex][2],
			        							   votesByRegion[returnedIndex][3],
			        							   totalVotes[returnedIndex]);
			
			
			
		}

		
	}
	public static void processDisplayCommand() { //fifth method that will process the display 
		
		
	}

	//-----------------------------Supportive methods----------------------------------------
	
	//Linear search - we need to see a name if already in list -  we have to search if mike is already in list
	//linear search method - method takes a lookup key name, and then it will 
	//If this name is in our list (array), if so, it will return back the index where i have this candidate's name
	//Otherwise, the method should return -1
	public static int searchByName (String keyName) {
		for (int index = 0; index <currentNumberOfCandidates; index++) {
			
		if (candidateName[index].equals(keyName)==true){
			
			return index;
			//return will force you to leave the method right now
		}
	}// end for
		//if we reach this point that means the above if statement never be true and so
		
		return -1; //the keyName is not in our list
		
		
	}
	
	//Adding a method that displays the headers of the tables that contains results of the election
	public static void displayHeader() {
		System.out.println("\t\t----------------Election Results----------------");

		// Header row
		System.out.printf("%-15s%10s%10s%10s%10s%10s\n",
		        "Candidate", "Region 1", "Region 2", "Region 3", "Region 4", "Total");

		// Underline row
		System.out.printf("%-15s%10s%10s%10s%10s%10s\n",
		        "-----------", "--------", "--------", "--------", "--------", "-----");

		
	}//end of display header
	
	
	
	
	
	
	

}
