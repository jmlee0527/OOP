package selfTest;

import java.util.Scanner;

public class TestScores {
	public static final int MAX_NUMBER_SCORES = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] scores = new double[MAX_NUMBER_SCORES];
		int counting = 0;
		
		System.out.println("This program reads test scores and shows");
		System.out.println("how much each differs from the average.");
		System.out.println("Enter test scores:");
		
		counting = fillArray(scores);
		showDifference(scores, counting);
		
	}

	public static int fillArray(double[] scores)
	{
		System.out.println("Mark the end of the list with a negative number.");	
		Scanner scanner = new Scanner(System.in);
		/* your code */
		int counting = 0;
		
	    while (scanner.hasNextDouble()) {
	        double input = scanner.nextDouble();
	        if (input < 0 || counting >= scores.length) {
	            break;
	        }
	        scores[counting] = input;
	        counting++;
	    }

	    scanner.close();
	    return counting;
	}
	
	public static void showDifference(double[] scores, int counting)
	{
		double average = computeAverage(scores, counting);
		
		System.out.println("Average of " + counting + " scores = " + average);
		System.out.println("The scores are: ");
		
		for (int i = 0; i < counting; i++) {
			System.out.printf("%1.1f differs from average by %1.2f%n", scores[i], scores[i] - average);
		}
	}
	
	public static double computeAverage(double[] scores, int counting)
	{	
		/* your code */
		double sum = 0;
		
		for (int i = 0; i < counting; i++) {
			sum += scores[i];
		}
		
		return sum / counting;
	}
}
