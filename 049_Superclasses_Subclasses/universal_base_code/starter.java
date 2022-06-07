import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer one = new Performer();
		Performer two = new Performer("Omar", 17);
		
		Musician cvband = new Musician();
		Musician Josias = new Musician("Quad");
		
		one.practice();
		two.practice();
		cvband.playInstrument();
		cvband.perform();
		Josias.playInstrument();
		Josias.perform();
		
	}
}
