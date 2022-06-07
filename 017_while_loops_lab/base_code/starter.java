import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name = sc.nextLine();
	
	System.out.println("How many times do you want your name to be repeated");
	int desiredrepeat = sc.nextInt();
	
	int count = 1;
	
		while (count<=desiredrepeat)
		{
			System.out.println(name);
			count = count+1;
		}
	}
}