package myPackage;

import java.util.Scanner;

public class mainClass {  //start class

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
		inputedCommand = input.next();

		while( ! inputedCommand.equals("Quit")) 
		{ //start while
			switch (inputedCommand)
			{ //start switch
			case "Add":
				processAddCommand( );
				break;
			case "Vote":
				processVoteCommand();
				break;
			case "Output":
				processOutputCommand();
				break;
			case "Display":
				processDisplayCommand();
				break;
			default:
				break;
			}//end switch

			// read the next command
			inputedCommand = input.next();	
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
		inputedCandidateName = input.next();
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
		// read the rest of the Vote command transaction. 
		String inputedCandidateName;
		int regionNumber; 
		int numberOfVotesForTheCandidate;

		inputedCandidateName = input.next();
		regionNumber = input.nextInt();
		numberOfVotesForTheCandidate = input.nextInt();

		// explore if this candidate is in our list or not by using the linear search method 
		int returnedIndex = searchByName(inputedCandidateName);
		if(returnedIndex == -1) //this name is not in our list 
		{
			System.out.printf("Transaction can't be completed. %s doesn't exist.", inputedCandidateName);
		}
		else  //this name is in our list, so we should update the votes in the given region number 
		{
			votesByRegion[  returnedIndex  ][   regionNumber - 1  ] += numberOfVotesForTheCandidate; 
			totalVotes[  returnedIndex  ] += numberOfVotesForTheCandidate; 
			System.out.printf("Voting transaction completed successfully.\n");
		}


	} //end of processVoteCommand

	// a method that will process the Output command
	public static void processOutputCommand( )
	{ //start of processOutputCommand
		// read the rest of the Output command transaction. The rest has only the candidate's name 
		String inputedCandidateName;
		// read the candidate's name
		inputedCandidateName = input.next();
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
		
		// display the headers
		displayHeaders();
		// display the info of every candidate in our list
		for(int index = 0; index < currentNumberOfCandidates; index++)
		{ //start for
			
			System.out.printf("%15s%10d%10d%10d%10d%10d\n", candidatesName[index], 
					votesByRegion[ index][0], 
					votesByRegion[ index][1], 
					votesByRegion[ index][2], 
					votesByRegion[ index][3], 
					totalVotes[ index]);

		} //end for 
		
		// display the info of the winner
		int winnerindex = indexOfTheWinner(); // this method returns the index of the winner
		System.out.printf("Winner: %s, Votes Received: %d\n",   candidatesName[winnerindex]    ,   
			                                                totalVotes[winnerindex]);
		System.out.printf("Total Votes Polled: %d\n", totalVotesPolled());
		

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

   // a method that returns back the index of the winner 
	// note that the winner is the one who has the largest (maximum) total votes
	public static int indexOfTheWinner ( )
	{ //start indexOfTheWinner
		// recall the maximum algorithm that we covered before
		int largestTotal = totalVotes[0];
		int indexOfLargest = 0;  //index of the row that contains the largest total votes
		
		for ( int index = 0; index < currentNumberOfCandidates ; index++)
		{ //start for
			if (largestTotal < totalVotes[index])  //we catch a new maximum value
			{
				largestTotal = totalVotes[index];  // update max when we catch a new max
				indexOfLargest = index;  // update the index where we have the new max 
			}
			
		}//end for
		return indexOfLargest; 
		
	} //end of indexOfTheWinner
	
	// a method that calculates and returns the total votes polled
	public static int totalVotesPolled  () 
	{ //start of totalVotesPolled
		int total = 0;
		for ( int index = 0; index < currentNumberOfCandidates ; index++)
		{ //start for
			total += totalVotes[index];
			
		} //end for
		return total; 
		
	} //end of totalVotesPolled
	



} //end class
