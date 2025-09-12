package class2;

public class MainClass {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		//System.out.print("Hello\t");
		//System.out.print("UWGB");
		
		//System.out.print("Wisconsin\tGreen Bay\n");
		//System.out.print("Madison\tAppleton\n");
		
		//System.out.print("Wisconsin\n\tGreen Bay\n\t\tMadison");
		//Note: the above three statements could be combined in a single statement
		
		//System.out.print("Java\n");
		//the above statement can be rewritten by println command as following
		//System.out.println("Java");
		
		//rewrite S1 using println
		System.out.println("Wisconsin\n\tGreen Bay\n\t\tMadison");
		
		System.out.print("UWGB\n");
		System.out.println("UWGB");
		*/
		
		
		
		//declare a variable that named x and can be used to store interger values
		int x;
		
		//declare a variable named y and can be used to store floating values
		double y;
		
		//declare a variable named z and can be used to store character values
		char z;
		
		//declare a variable named w and can be used to store boolean values
		boolean w;
		
		//Note: 2 variables cannot have the same name
		// double y; this cannot be used as it was previously used previously 
		//Note: Java is a case-sensitive language : upper X is not the same as lower x
		
		x = 4;
		y = -2.3;
	
		//Write an statement to assign $ as the value for z
		
		z = '$'; //we must use a single quotation ' ' for a char value
		
		//write a statement to assign true as the value for w
		w = true; 
		
		//x = 2.5 // this will not work as you cant reasogn ***FIX***	but can do it with a double/float
		
		
		// Write a code to display the values of x,y,z,w by using print and println
	/*	
		System.out.println("this is the previous result: "+ x);
		x = 5; //you can reasign intergers after it runs as the code goes
		System.out.println("The value of X is: "+ x);
		System.out.println("The value of Y is: "+ y);
		System.out.println("The value of Z is: "+ z);
		System.out.println("The value of W is:" + w);
	*/
	//rewriting without using println	
	/*
		System.out.print("X is an interger: "+x+"\n");
		System.out.print("Y is a float: "+y+"\n");
		System.out.print("Z is a char: "+z+"\n");
		System.out.print("W is a boolean: "+w+"\n");
	*/
		
		// rewriting using Printf() - %d is used for intergers, *just like C programming language*
		
		System.out.printf("X is an interger: %d \n",x);
		System.out.printf("Y is a float/double: %f \n",y); //this has a lot of 0's, original: -2.3,
		System.out.printf("Z is a character: %c \n",z);
		System.out.printf("W is a boolean: %b \n",w);
		
		//task: display the value of Y with 3 decimal points
		System.out.printf("Y is a float/double: %.3f \n",y); //just change %.3f
		
		//task: display the value of Y with 2 decimal points
		System.out.printf("Y is a float/double: %.2f \n",y); //just change %.2f
		
		
		//do the following: change the value of Y to 2.345 and then display 
		//the value of Y using 2 decimal points/digits
		
		
		y = 2.345;
		System.out.printf("The value of Y is: %f \n",y);
		//rounding, add/change the %.2f
		System.out.printf("The value of Y is: %.2f \n",y);
		
		//QUESTION: what if we used %f with intergers?
		//Try Below:
		//System.out.printf("The value of X is: %f \n",x); //LEADS TO RUNTIME ERROR
		//OPPOSITE
		//System.out.printf("Z is a character: %d \n",z);
		
	/*
		//WE CAN COMBINE THE ABOVE 4 PRINTF STATEMENTS INTO ONE STATEMENT
		System.out.printf("X is an interger: %d \n",x);
		System.out.printf("Y is a float/double: %f \n",y); //this has a lot of 0's, original: -2.3,
		System.out.printf("Z is a character: %c \n",z);
		System.out.printf("W is a boolean: %b \n",w);
		

		System.out.printf("The balue of X is: %d \n Y is a float/double: %f \n The value of Z is %c\n The value of W is %b",x,y,z,w);
		
	*/
		
		//variable (can be changed)
		int qq=7;
		qq = 10;
		//constant 
		final double PI= 3.1456;
		System.out.println(PI);
		
		System.out.printf("The value of Y is: %.2f \n",y);
		
	}

}

