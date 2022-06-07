import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Creature x = new Zombie();
	Creature y = new Spider();
	
	Role endthislab = new Paladin();
	
	System.out.println("This is " + x.getName());
	System.out.println("This is " + y.getName());
	System.out.println("This is " + endthislab.getName());
	System.out.println();
	
	while(true){
		
		if(endthislab.attack(x)){
			System.out.println(x.getName() + " is dead :)");
			break;
		}
		
	}
	
	while(true){
		
		if(endthislab.attack(y)){
			System.out.println(y.getName() + " is dead :)");
			break;
		}
		
	}
	
	}
}
