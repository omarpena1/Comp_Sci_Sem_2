import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What class would you like to be?");
	String playerclass = sc.nextLine();
		myCharacter one = new myCharacter(playerclass);
		
		one.setAll("Wizard", 4, 5, 7, 12, 1);
		one.myToString();
	}
}
