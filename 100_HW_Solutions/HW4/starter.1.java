import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money."); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("   a. If two numbers match, you double your money."); 
		System.out.println("   b. If three numbers match, you triple your money."); 
		System.out.println("   c. If none match, you lose your money."); 
		System.out.println("--------------------------------------------------"); 

System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : "); 
String startgame = sc.nextLine();

int count = 100;

while (startgame.equals("Yes") || startgame.equals("yes") || startgame.equals("Y") || startgame.equals("y"))
	{

		System.out.print("You have $100. How much would you like to wager? ");
		int wageramount = sc.nextInt();
		
		while (wageramount>count)
		{
			System.out.println("You only have $" + count + ". Please enter a smaller number : ");
		}
		
		int dicerollone = rand.nextInt(10)+1;
		int dicerolltwo = rand.nextInt(10)+1;
		int dicerollthree = rand.nextInt(10)+1;
		
		System.out.println(" ");
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are:");
		System.out.println("_______________________");
		System.out.println(" | " + dicerollone + " | " + dicerolltwo + " | " + dicerollthree + " | ");
		System.out.println("_______________________");
		 
		
		 if (dicerollone == dicerolltwo || dicerollone == dicerollthree || dicerolltwo == dicerollone || dicerolltwo == dicerollthree || dicerollthree == dicerollone || dicerollthree == dicerolltwo);
				{
					if (dicerollone == dicerolltwo == dicerollthree)
						{
							System.out.println("You won the jackpot! Your wager has been TRIPLED!");
							int count = ((wageramount*3) + money);
						}
					else
						{
							System.out.println("You won! Your wager has now been doubled!");
							int count = ((wageramount*2) + money);
						}
				}
		else 
				{
				System.out.println("Didn't win this time, better luck next time!");
				int count = (money-wageramount);
				}
		 
		 
	if (count==0)
		{
		System.out.println("You've run out of money! Thanks for coming! Come back soon!");
		break;
		}
	}

}
}

