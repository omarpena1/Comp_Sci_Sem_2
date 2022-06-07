import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician award = new Musician ("Omar", "Clarinet");
		Musician winterline = new Musician("Josias", 16, "Quads");
		
		System.out.println("This musicians name is " + award.getName() + ".");
		award.practice();
		System.out.println("This award-winning musician plays the " + award.getInstrument() + ".");

System.out.println();

	System.out.println("The award-winning musicians' name is " + winterline.getName() + ".");
	winterline.perform();
	winterline.playInstrument();
	}
}
