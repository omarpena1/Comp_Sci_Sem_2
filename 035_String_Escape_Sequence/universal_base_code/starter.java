import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
int e = 27;
String f = ""+e;

System.out.println(f);

Scanner sc = new Scanner(System.in);

System.out.println("Enter your pet peeve:");
String peeve = sc.nextLine();

System.out.println( "Wow. \t What kind of \"person\" are you? \n \\\\I would be deathly ashamed to have " + peeve +" as my pet peeve\n I don't know whether admitting it makes you brave or a fool.");
}
}