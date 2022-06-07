import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
Random rand = new Random ();

int secretnum = rand.nextInt(1000);


while (5==5)
{
System.out.print("Guess a number: ");
int playerguess = sc.nextInt();

if (playerguess>secretnum){
	System.out.println("You're too high!");
	System.out.println(" ");
}

if (playerguess<secretnum){
	System.out.println("You're too low!");
	System.out.println(" ");
}

if (playerguess==secretnum){
	
System.out.println("You guessed it!");
break;
}

}
	}
}
