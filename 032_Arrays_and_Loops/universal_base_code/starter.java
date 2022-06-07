import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int []passengers = new int[1000];
	
	Random rand = new Random();
	int a = 0;
	
	while(a<1000){
	int drinksperpassenger = rand.nextInt(70);
	
	passengers[a] = drinksperpassenger;

	a = a+1;
	}
	
	for(int i= 0; i < passengers.length; i++){
		
		System.out.println(passengers[i]);
	}
	
	}
}
