import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Apprentice Omar = new Apprentice();
		Apprentice Josias = new Apprentice("Harvard", 5);
		Apprentice Jared = new Apprentice("Saxophone", "unemployed", 1);
		Apprentice Ryan = new Apprentice("Ryan", 18, "Trumpet", "CSUN", 2);
		
		Omar.playInstrument();
		System.out.println();
		Josias.practice();
		System.out.println();
		Jared.perform();
		System.out.println();
		Ryan.practiceAtUniversity();
	}
}
