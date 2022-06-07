import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman peter = new Spiderman(6, "Sandman");
		//peter.SetVillain("Sandman");
		peter.fight();
		peter.printArt();
		System.out.println(peter.getVillain());

		
	}
}
