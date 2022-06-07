import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int prizeanswer = rand.nextInt((1000)+1);
		
		System.out.println("Welcome to the number game!");
	
		System.out.println("Pick a number between 1 - 1000: ");
		int playerguess = sc.nextInt();
		sc.nextLine();
		
		if (playerguess == prizeanswer)
		{
			System.out.println("CONGRATULATIONS! You have won!");
		}
		else
		{
			System.out.println("Sorry. Your number wasn't the prize answer. Try again.");
			System.out.println("The prize answer was " + prizeanswer + ".");
		}
		
	}
}
