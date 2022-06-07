import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String playername = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("What is your title? ");
		String playertitle = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Would you like to be Wizard, Warrior, or Rogue?");
		String playerrole = sc.nextLine();
		System.out.println(" ");
		
		if (playerrole.equals("Wizard") || playerrole.equals("wizard"))
		{
			System.out.println("You are a Wizard! Magic is your passion.");
			System.out.println(" ");
		}
		
		else if (playerrole.equals("Warrior") || playerrole.equals("warrior"))
		{
			System.out.println("You are a Warrior! You win through might.");
			System.out.println(" ");
			
		}
		
		else if (playerrole.equals("Rogue") || playerrole.equals("rogue"))
		{
			System.out.println("You have chosen to be a Rogue.");
			System.out.println(" ");
		}
		
		else 
		{
			System.out.println("The employment officer does not recognize that role. Rerun program for an official role.");
		}
		
			System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
			
			int initialpoints;
			initialpoints = 25;
		
		System.out.println(" ");
		System.out.print("Strength (1-10): ");
		int playerstrength = sc.nextInt();
		
		int availablepointsforstats = 10;
		
		 if (playerstrength>availablepointsforstats)
		{
			System.out.println("Please input a smaller value.");
			System.out.println(" ");
		}
		
		else if (playerstrength<availablepointsforstats)
		{
			int availablepoints = ((initialpoints)-(playerstrength));
			System.out.println("you have " + availablepoints + " points left to spend.");
	System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.print("Dexterity (1-10): ");
		int playerdexterity = sc.nextInt();
		
			 if (playerdexterity>availablepointsforstats)
		{
			System.out.println("Please input a smaller value.");
	System.out.println(" ");
		}
		
		else if (playerdexterity<availablepointsforstats)
		{
			int availablepoints2 = ((initialpoints)-(playerstrength)-(playerdexterity));
			System.out.println("you have " + availablepoints2 + " points left to spend.");
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.print("Intelligence (1-10): ");
		int playerintelligence = sc.nextInt();
				
				if (playerintelligence>availablepointsforstats)
			{
				System.out.println("Please input a smaller value.");
	System.out.println(" ");
			}
			
			if ((playerintelligence+playerstrength+playerdexterity)<=25)
			{ 
				if (playerintelligence<availablepointsforstats)
			{
				int availablepoints3 = ((initialpoints)-(playerstrength)-(playerdexterity)-(playerintelligence));
				System.out.println("you have " + availablepoints3 + " points left to spend.");
			System.out.println(" ");
			}
			
			}
			else 
			{
				System.out.println("You have surpasssed the available points for your stats");
		System.out.println(" ");
			}
			
			System.out.println(" ");
			System.out.print("Constitution (1-10): ");
			int playerconstitution = sc.nextInt();
		
			if (playerconstitution>availablepointsforstats)
			{
				System.out.println("Please input a smaller value.");
				System.out.println(" ");
			}
			
			if ((playerintelligence+playerstrength+playerdexterity+playerconstitution)<=25)
			{ 
				if (playerintelligence<availablepointsforstats)
			{
				int availablepoints4 = ((initialpoints)-(playerstrength)-(playerdexterity)-(playerintelligence)-(playerconstitution));
				System.out.println("you have " + availablepoints4 + " points left to spend.");
				System.out.println(" ");
			}
			
			}
			else 
			{
				System.out.println("You have surpasssed the available points for your stats");
			System.out.println(" ");
			}
			
			System.out.println(" ");
			System.out.print("Charisma (1-10): ");
			int playercharisma = sc.nextInt();
			
				if (playercharisma>availablepointsforstats)
			{
				System.out.println("Please input a smaller value. Charisma (1-10):");
				System.out.println(" ");
			}
			
			if ((playerintelligence+playerstrength+playerdexterity+playercharisma+playerconstitution)<25)
			{ 
				if (playercharisma<availablepointsforstats)
			{
				int availablepoints5 = ((initialpoints)-(playerstrength)-(playerdexterity)-(playerintelligence)-(playerconstitution)-(playercharisma));
				 
				 if (availablepoints5<25)
				 {
				 System.out.println("you have " + availablepoints5 + " to spend for next time.");
				 	System.out.println(" ");
				 }
			}
			
			}
			if ((playerintelligence+playerstrength+playerdexterity+playercharisma+playerconstitution)>25)
			{
				System.out.println("You have surpasssed the available points for your stats");
			}
			
		System.out.println(" ");
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + playername + ", the " +playertitle+ " of CVHS.");
		System.out.println ("You're a " + playerrole + " with the following stats!");
		System.out.println( "Strength: " +playerstrength);
		System.out.println( "Dexterity: " +playerdexterity);
		System.out.println( "Intelligence: " +playerintelligence);
		System.out.println( "Constitution: " + playerconstitution);
		System.out.println( "Charisma: " + playercharisma);
		
		System.out.println( "Good luck on your quest " + playername + "!");
	}
}
