
/*Calculates the batting average and slugging percentage
1+ baseball/softball players.
First, asks for the number of at bats.  For each at bat, 
asks for a result.  
*/

import java.util.*;

public class BattingLab8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		int atBat = 0;
		int result;
		int sum = 0;
		int hits = 0;
		double battingAvg = 0.000;
		double sluggingPercent = 0.000;

		// user input integer prompt
		System.out.print("Welcome to Batting Average Calculator! ");
		System.out.println();
		
		System.out.print("Enter number of times at bat: ");
		atBat = input.nextInt();
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			atBat = input.nextInt();
			int[] resultArray = new int[atBat];

	 
	while(atBat < 1 ||atBat > 5) {
		System.out.println("That is an invalid number.  Enter a number between 1 and 5.");
	result = input.nextInt();
	}
	
	resultArray = new int [sum];
	for (int i = 0; i < sum; i++) {
		System.out.println("Result for at-bat " + (i + 1) + ": ");
		resultArray[i] = input.nextInt();
	
	sum = sum + resultArray[i];
	if (resultArray[i] > 0)
	hits++;
	}
	
		battingAvg = (hits) / (double) atBat;
		System.out.println("Batting Average: ");
		System.out.println(battingAvg);
		System.out.println();
		
		sluggingPercent = (double) sum / (double) atBat;
		System.out.println("Slugging Percentage: ");
		System.out.println(sluggingPercent);
		System.out.println();
		
		
		// see if the user wants to continue
		System.out.print("Another batter?? (y/n): ");
		choice = input.nextLine();
		System.out.println();	
		
	if(choice.equalsIgnoreCase("n"))
	{
		System.out.println("Game Over");
	}
	}
}
}