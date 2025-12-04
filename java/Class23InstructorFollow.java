package class23;

import java.util.Scanner;

public class Secondary{  //start class

	static Scanner input = new Scanner(System.in);
	// declare all arrays as GLOBAL
	static String [ ] candidatesName = new String [25]; // we assume that the maximum # of candidates = 25
	static int [ ][ ] votesByRegion = new int [25][4];  // all arrays have same #rows
	static int [ ] totalVotes  = new int[25];
	static int currentNumberOfCandidates = 0; // holds the current number of candidates in our system

	public static void main(String[] args) { //start main
		// TODO Auto-generated method stub
		processCommands(); 

	} //end main

	// this method will read and process commands from the user. It will keep reading commands until it reads 
	// Quit to stop

	public static void processCommands( )  // this method called Kernel method ( core method) 
	{ //start of processCommands
		String inputedCommand;

		//read the first command
		inputedCommand = input.next().toLowerCase();

		while( ! inputedCommand.equals("quit")) 
		{ //start while
			switch (inputedCommand)
			{ //start switch
			case "add":
				processAddCommand( );
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
			}//end switch

			// read the next command
			inputedCommand = input.next().toLowerCase();	
		} //end while

		// display a msg that tells the user about the termination of the run
		System.out.println("Program has been terminated!");

	} //end of processCommands

	// a method that will process the Add command
	public static void processAddCommand( )
	{ //start of processAddCommand
		// read the rest of the Add command transaction. The rest has only the candidate's name 
		String inputedCandidateName;
		// read the candidate's name
		inputedCandidateName = input.next().toLowerCase();
		// explore if this candidate is already in our list or not by using the linear search method 
		int returnedIndex = searchByName(inputedCandidateName);
		if(returnedIndex != -1) //this name has been added early 
		{
			System.out.printf("Transaction can't be completed. %s is already added.", inputedCandidateName);
		}
		else  //this name is not in our list, so we should add this name to the end of the list pointed by currentNumberOfCandidates
		{
			candidatesName[currentNumberOfCandidates] = inputedCandidateName; 

			votesByRegion[ currentNumberOfCandidates][0] = 0;  // Region1
			votesByRegion[ currentNumberOfCandidates][1] = 0;  // Region2
			votesByRegion[ currentNumberOfCandidates][2] = 0;  // Region3
			votesByRegion[ currentNumberOfCandidates][3] = 0;  // Region4
			totalVotes[ currentNumberOfCandidates]= 0; // total votes for the added candidate 

			currentNumberOfCandidates++; // increment the current number of candidates

			System.out.printf("Transaction has been completed successfully. %s has been added\n", inputedCandidateName); 
		}

	} //end of processAddCommand

	// a method that will process the Vote command
	public static void processVoteCommand( )
	{ //start of processVoteCommand
		
		 //third method that will process the vote commands
		String inputedCandidateName;
		int regionNumber;
		int numberOfVotesForTheCandidate;
		
		//reading the first 3 components in the transaction
		inputedCandidateName = input.next().toLowerCase();
		regionNumber = input.nextInt(); 
		numberOfVotesForTheCandidate = input.nextInt();
		
		//looking if user in list
		int returnedIndex = searchByName(inputedCandidateName);
		if (returnedIndex != -1) { //this has been added earlier
			System.out.printf("Transaction can't be completed.\n", inputedCandidateName); //first case - !=-1
		}
		else { 
			votesByRegion[returnedIndex] [regionNumber-1] += numberOfVotesForTheCandidate; //we do returned index as -----STUDYYYYY
			
			totalVotes [returnedIndex]+= numberOfVotesForTheCandidate; //This will update the total - based on the region #, this will add up across
			
			System.out.printf("Voting transaction completed successfully.\n");
			//Needs fix
		}
		
		
	

	} //end of processVoteCommand

	// a method that will process the Output command
	public static void processOutputCommand( )
	{ //start of processOutputCommand
		// read the rest of the Output command transaction. The rest has only the candidate's name 
		String inputedCandidateName;
		// read the candidate's name
		inputedCandidateName = input.next().toLowerCase();
		// explore if this candidate is already in our list or not by using the linear search method 
		int returnedIndex = searchByName(inputedCandidateName);
		if(returnedIndex == -1) //this name is not in our list
		{
			System.out.printf("Transaction can't be completed. %s doesn't exist.", inputedCandidateName);
		}
		else  //this name is  in our list, so we should display his/her results
		{
			displayHeaders();
			System.out.printf("%15s%10d%10d%10d%10d%10d\n", candidatesName[returnedIndex], 
					                                          votesByRegion[ returnedIndex][0], 
					                                          votesByRegion[ returnedIndex][1], 
					                                          votesByRegion[ returnedIndex][2], 
					                                          votesByRegion[ returnedIndex][3], 
					                                          totalVotes[ returnedIndex]);
		}









		} //end of processOutputCommand

		// a method that will process the Display command
		public static void processDisplayCommand( )
		{ //start of processDisplayCommand
			//
			displayHeaders();
			//
			for (int index = 0; index < currentNumberOfCandidates; index++) { //adding for every customer in our index
				System.out.printf("%15s%10d%10d%10d%10d%10d\n", candidatesName[index], 
                        votesByRegion[ index][0], 
                        votesByRegion[ index][1], 
                        votesByRegion[ index][2], 
                        votesByRegion[ index][3], 
                        totalVotes[ index]);
	
				
			}//end looking for candidates
			
			//Display the info for the winner:
			int winnerIndex = indexOfTheWinner(); //the index of the winner
			System.out.printf("Winner: %s, Votes received: %d\n", candidatesName[winnerIndex], totalVotes[ winnerIndex] ); //this will be the updated value by the winner
			//We're grabbing the value from the algorithm to use from the previous maximum value of indexOfTheWinner to grab it and insert it into the 
			
			//last sysout
			System.out.printf("The total votes polled: %d\n", totalVotesPolled()); //this will print the total across the total 
			
			
		

		} //end of processDisplayCommand

		// ---------------- Supportive Methods -----------------------------------------------------
		// a method that does "Linear search": the method takes a key candidate's name and then it will explore
		// if this name is already in our list(arrays). if so, it will return back the index where I have this candidate's name.
		// Otherwise, the method should return -1. 
		public static int searchByName(String keyName)
		{//start of searchByName
			for ( int index = 0; index < currentNumberOfCandidates ; index++)   // currentNumberOfCandidates points at the end of the list 
			{//start for
				if (candidatesName[index].equals(keyName) == true )  //we have a matching
				{
					return index; // here the index means where we have this matching. 
					// Note that: returns here will force you to leave the method right now 
				}

			}//end for
			// if we reach this point that means the above if statement never be true and so the keyName is not in our list
			return -1;

		} //end searchByName

		// a method that displays the headers of the ytable that contains the results of the election process
		public static void displayHeaders ( )
		{// start displayHeaders
			System.out.println("\t\t------------ Election Results----------------");
			System.out.printf("%15s%10s%10s%10s%10s%10s\n", "Candidate Name", "Region1", "Region2", "Region3", "Region4", "Total");
			System.out.printf("%15s%10s%10s%10s%10s%10s\n", "--------------", "-------", "-------", "-------", "-------", "-----");

		} //end displayHeaders
		
		//A method that returns back the index of the winner - - - - - - - Note that the winner is the one who has the max total votes
		public static int indexOfTheWinner() {
			//recall the max algorithm that we covered before - we will re-write the code to see largest total
			
			
								
			//We will update the new max when we catch a new largest value:::::::::::::::Study!!!!!!!!!!!!!!!!!!
			int largestTotal = totalVotes[0]; //we care about total votes
			int indexOfLargest = 0; //index of the row that contains the largest total votes - we care about this index - 
			
			for (int index =0; index < currentNumberOfCandidates; index ++) {
				if (largestTotal < totalVotes[index]) {
					largestTotal =totalVotes[index];
					indexOfLargest = index; //we have to update the index where we have the new max - index of the winner
				}
				
				
			}
			return indexOfLargest; //This will send back the index of the winner - 
			
			
		}
		//Make a new method that calculates the total votes ()
		public static int totalVotesPolled() {
			int total = 0;
			//maybe adding the total from the rows? of the current number of candidate:
			//answer: a method that add the total votes pulled
			
			for (int index =0; index <currentNumberOfCandidates; index++) {
				total += totalVotes[index];
			
			}
			return total; //this will return the totals across all the indexes across the total
					
					
			
			
		}
		
		





	} //end class
