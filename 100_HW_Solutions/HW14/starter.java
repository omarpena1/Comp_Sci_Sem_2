import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor

		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
		
	Pet	[]zoo = new Pet[10];
	zoo[0]= new Snake();
	zoo[1]= new Bird();
	zoo[2]= new Snake();
	zoo[3]= new Bird();
	zoo[4]= new Snake();
	zoo[5]= new Bird();
	zoo[6]= new Snake();
	zoo[7]= new Bird();
	zoo[8]= new Snake();
	zoo[9]= new Bird();
	
	
	for(int i = 0;i < zoo.length; i++){
		zoo[i].trick();
	}
	
	}
}