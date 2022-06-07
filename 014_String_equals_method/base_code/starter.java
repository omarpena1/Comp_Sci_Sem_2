import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String playerrole = sc.nextLine();

		
		if (playerrole.equals("Wizard") || playerrole.equals("wizard"))
		{
			System.out.println("You are a Wizard! Magic is your passion.");
		}
		
		else if (playerrole.equals("Warrior") || playerrole.equals("warrior"))
		{
			System.out.println("You are a Warrior! You win through might.");
			
		}
		
		else if (playerrole.equals("Rogue") || playerrole.equals("rogue"))
		{
			System.out.println("You have chosen to be a Rogue.");
		}
		
		else 
		{
			System.out.println("The employment officer does not recognize that role. Try again.");
		}

	}
}
