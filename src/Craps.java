/**
 * Peter Laskai
 * CISY 254
 * Lab 1: First Roll of Craps
 * Purpose of this lab is to use the random class as well as loops and other basic funds of Java to simulate 
 * the first roll of java numerous times
 */
import java.util.Scanner;
import java.util.Random; 
public class Craps 
{

	public static void main(String[] args) 
	{
		int numOfRolls;
		Random ranNumber = new Random();
		final int NUM_SIDES_DICE = 6;
		int dice1, dice2, totalValue;

		double winPercentage;
		double lossPercentage;
		double markPercentage;

		int win = 0;
		int loss = 0;
		int mark = 0;

		String result;
		String answer;
		Scanner console= new Scanner(System.in);

		System.out.print("How many first rolls do you want to roll?");
		numOfRolls = console.nextInt();
		console.nextLine();
		System.out.print("Display the Rolls? <Y/N>");
		answer = console.nextLine();

		for(int i = 1; i <= numOfRolls; i++)
		{
			dice1 = 1+ranNumber.nextInt(NUM_SIDES_DICE);
			dice2 = 1+ranNumber.nextInt(NUM_SIDES_DICE);
			totalValue = dice1 + dice2;

			if(totalValue == 2 || totalValue == 3 || totalValue == 12)
			{
				result = "Loss";
				loss++;
			}
			else if(totalValue == 7 || totalValue == 11)
			{
				result = "Win";
				win++;
			}
			else
			{
				result = "Mark";
				mark++;
			}

			if(answer.equals("Y") || answer.equals("y"))	
			{
				System.out.println(dice1 +" "+dice2+" = "+totalValue+" "+result);
			}
			else
			{
				System.out.println();
			} 
		}

		winPercentage = ((double)win /(double) numOfRolls) * 100;
		lossPercentage = ((double)loss / (double)numOfRolls) * 100;
		markPercentage = ((double)mark /(double) numOfRolls) * 100;

		System.out.printf("\n%-10s %, 11d %5.1f%%\n", "Wins: ", win, winPercentage);
		System.out.printf("\n%-10s %, 11d %5.1f%%\n", "Losses: ", loss, lossPercentage);
		System.out.printf("\n%-10s %, 11d %5.1f%%\n", "Marks: ", mark, markPercentage);


	}
}

