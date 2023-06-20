package selfTest;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputNum;
		while(true) {
			try {
				inputNum = keyboard.nextInt();
				
				if(inputNum == 808)
					break;
				
				exerciseMethod(inputNum);
			} catch (PositiveNumberException e) {
				System.out.println("This number is positive!");
				System.out.println("Exception is caught in main");
			}
		}
		System.out.println("End of loop");
	}
	
	public static void exerciseMethod(int number) throws PositiveNumberException {
		try {
			if (number > 0)
				throw new PositiveNumberException("This is positive number");
			else if (number < 0)
				throw new NegativeNumberException("This is negative number");
			else
				System.out.println("No Exception");
		} catch (NegativeNumberException e) {
			System.out.println("This number is negative!");
			System.out.println("Exception is caught in exerciseMethod");
		} finally {
			
			System.out.println("In finally block");
		}
		System.out.println("After finally block");
	}
}
