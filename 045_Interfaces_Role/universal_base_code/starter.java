import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Role x = new Paladin();
		Role y = new Wizard ();
		Role z = new Warrior();
		
		
		Role []arrayrole = new Role[3];
		arrayrole[0]=new Warrior();
		arrayrole[1]=new Wizard();
		arrayrole[2]=new Paladin();

		for(int i = 0; i<arrayrole.length ; i++){
			arrayrole[i].printArt();
			System.out.println("My name is " + arrayrole[i].getName());
			System.out.println();
		}
		
	}
}
