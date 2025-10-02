package lecture8;
import java.util.Scanner;



public class Class8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*			
		//		TASK - WRITE A CODE THAT ASKS A USER TO ENTER THE STREET ADDRESS AND THE APARTMENT #, CITY, STATE, ZIPCODE
		// THEN THE CODE WILL DISPLAY THE ADDRESS USING USPS FORMAT
		
		String streetAdress, unitNumber, city, state, zipCode;
		
		//step 1, reading the string from user
		System.out.print("Enter your Street Address: ");
		streetAdress = input.nextLine(); 
		
		System.out.print("Unit Number: ");
		unitNumber = input.nextLine(); //you can use either .nextLine() or .next()
		
		System.out.print("City: ");
		city = input.nextLine();
		
		System.out.print("State: ");
		state = input.nextLine();
		
		System.out.print("Zip Code: ");
		zipCode = input.nextLine();
		
		//Merge the input into a single string - You can connect using the '+' sign
	
		//option1
		String fullAddress1;
		fullAddress1 = streetAdress+ " #" + unitNumber+"\n" + city +", " + state +", " + zipCode;
		
		System.out.printf("your USPS address is:\n%s",fullAddress1);
		
		
		//option2 - using the Concat method
		String fullAddress2;
		fullAddress2 = streetAdress.concat(" #").concat(unitNumber).concat("\n").concat(city).concat(", ").concat(state).concat(", ".concat(zipCode));
		
		System.out.printf("your USPS address is:\n%s",fullAddress2);

		
										//Next Sections
		//note - to see if 2 strings are the same: DO NOT USE ==, INSTEAD USER:
		//equals : A != a
		//Equalsignorecase: A = a
		//these are called Booleans(true or false)
		
										//comparing strings
		String s1 = "Green", s2="Green", s3="green";
		//equals and equalsignorecase
		if (s1.equals(2)==true)
		{
			System.out.printf("Using .equals: %s and %s are the same1.\n",s1,s2);
		}
		else
		{
			System.out.printf("Using .equals: %s and %s are the same2.\n",s1,s2);
		
		}
		
						//CHANGE - NOW DO FOR .EQUALSIGNORECASE AND REPLACE WITH S3 
	
		
		
								//practice at home, compareTo() and compareToIgnoreCase()
		
		String str1= "Black", str2 = "Blue",str3 = "Black", str4= "red", str5 = "black";
		System.out.printf("%d\n",str1.compareTo(str2)); //negative means that black is less than blue, Black is greater than blue
		System.out.printf("%d\n",str2.compareTo(str1)); //str 2 is bigger than str1
		System.out.printf("%d\n",str1.compareTo(str3)); //they are the same
		System.out.printf("%d\n",str1.compareTo(str4)); //negative if black < red = negative, if black > red = positive **why are you getting negative instead of positive if it's bigger though? **
		
		System.out.printf("%d\n",str1.compareTo(str5)); // this will print (negative as str5 is greater than str1)
		System.out.printf("%d\n",str1.compareToIgnoreCase(str5)); //the equal as it is not case sensitive 
		*/	
		
		//startswith(), endswith(), contains()
		
		String myCity = "Green Bay";
		//starts with 
		
		if (myCity.startsWith("Green")== true)
		{
			System.out.printf("%s starts with Gre\n",myCity);
		}
		else
		{
			System.out.printf("%s does NOT start with Gre\n",myCity);
		}
		if (myCity.startsWith("green")== true)
		{
			System.out.printf("%s starts with Gre\n",myCity);
		}
		else
		{
			System.out.printf("%s does NOT start with Gre\n",myCity);
		}
		
		
		// ends with
		// question, how to make it not case sensitive? can we add a comparetoignorecase() statement inside the starts or end with?

		
		if (myCity.endsWith("Bay")== true)
		{
			System.out.printf("%s ends with bay\n",myCity);
		}
		else
		{
			System.out.printf("%s does NOT ends with Bay\n",myCity);
		}
		
		if (myCity.endsWith("bay")== true)
		{
			System.out.printf("%s ends with bay\n",myCity);
		}
		else
		{
			System.out.printf("%s does NOT end with bay\n",myCity);
		}

		
		
		//contains 
		if (myCity.contains("Bay")== true)
		{
			System.out.printf("%s contains bay\n",myCity);
		}
		else
		{
			System.out.printf("%s does NOT contain Bay\n",myCity);
		}
		
		if (myCity.contains("bay")== true)
		{
			System.out.printf("%s contains bay\n",myCity);
		}
		else
		{
			System.out.printf("%s does NOT contain bay\n\n",myCity);
		}
		
		
		
		//Substring Methods
		//to work with substring methods, we should draw the string as a sequence of characters
		
		
		// -	--	-	-	-	--	-	-Substring major	-	-	--		-	-	--	//
		
		String major = "Engineering"; //substring(begindex) - will keep going to the very last index....***finish***
		//									STUDYYYY
		String s6 = major.substring(4);
		String s7 = major.substring(4,7);
		
		System.out.printf("S6 = %s\n",s6);//BEGIN ONLY
		System.out.printf("S7 = %s\n\n",s7); //BEGIN AND END
		
		//-	-	-	-	-	-	-	-	-	INDEX OF -	-	-	-	-	-	-	-	-	--	--
		
		System.out.printf("The index of g in %s = is %d\n",major,major.indexOf('g')); //this will print the placeholder for engineering , first g
		// comparetoignorecase()
		System.out.printf("The index of g in %s = is %d\n",major,major.indexOf('e')); //there is NOT a way get result no matter if lower or upper, we would have to convert first
		System.out.printf("The index of M in %s = is %d\n",major,major.indexOf('M')); // this will return -1
		
		System.out.printf("The index of gin in %s = is %d\n",major,major.indexOf("gin")); //double quotations because it's a string
		System.out.printf("The index of gin in %s = is %d\n\n",major,major.indexOf("in"));
		
		//indexof(x, y) - start
		System.out.printf("Major.indexof(i, 7) = %d \n",major.indexOf("i",7)); // you will get the next available letter after the mentioned number
		System.out.printf("Major.indexof(i, 2) = %d \n",major.indexOf("i",2)); //you will get the first i at 3
		System.out.printf("Major.indexof('E', 2) = %d \n",major.indexOf("E",2));
		System.out.printf("Major.indexof('in', 2) = %d \n",major.indexOf("in",5));
		
		
		//								.indexof() - Last index 
		System.out.printf("The index of g in %s = is %d\n",major,major.lastIndexOf('g')); 
		System.out.printf("The index of e in %s = is %d\n",major,major.lastIndexOf('e')); 
		System.out.printf("The index of E in %s = is %d\n",major,major.lastIndexOf('E'));
		System.out.printf("The index of m in %s = is %d\n",major,major.lastIndexOf('m'));
		
			// get lastIndexOf() using ("n",7) - this will output using the 
		
		
	

		
		
		
		
		
		

	}

}
