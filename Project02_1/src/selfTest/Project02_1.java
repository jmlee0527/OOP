package selfTest;

import java.util.Scanner;

//Import the library for using Scanner class

public class Project02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate the Scanner class
		
		int n = 0;
		System.out.print("Enter the number: ");
		Scanner keyboard = new Scanner(System.in);
		n  = keyboard.nextInt();
		
		if(n<0)
			System.out.println("n is less than 0");
		else if(n>=0 && n <100)
			System.out.println("n is greater than or equal to 0 and less than 100");
		else
			System.out.println("n is greater than or equal to 100");
		
		
		
		// Using Scanner object to enter the number
		
		/* "n is less than 0" for n < 0
		 * "n is greater than or equal to 0 and less than 100" for 0 <= n < 100
		 * "n is greater than or equal to 100" for n >= 100
		 * 
		 * Note: 0 <= n < 100 won't work, Use two comparison operators and one boolean operator
		 */
		
		
	}

}
