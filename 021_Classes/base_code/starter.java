import java.util.Scanner;
import java.util.Random;

 class Character{
 	String role = ("Wizard");
		int Strength = 3;
		int Dexterity = 8;
		int Intelligence = 15;
		int Constitution = 15;
		int Charisma = 15;
		
		
		String stats = ("Your Strength is: " + Strength + ", " + "Your Dexterity is: " + Dexterity +  ", " + "Your intelligence: " + Intelligence + ", " + "Your Constitution is: " + Constitution + ", " + "Your Charisma is: " + Charisma);
 }

class starter {
	public static void main(String args[]) {
		// Your code goes below here

Character Gandolf = new Character();
System.out.println(Gandolf.stats);


		
	}
}
