import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
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
		
		else if (playerguess>prizeanswer)
		{
			System.out.println("Your guess was larger than the prize number.");
			System.out.println("The prize number was " + prizeanswer + ".");
		}
		
		else if (playerguess<prizeanswer)
		{
				System.out.println("Your guess was smaller than the prize number.");
			System.out.println("The prize number was " + prizeanswer + ".");
		}
		
	
	}
}
