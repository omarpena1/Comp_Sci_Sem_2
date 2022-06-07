import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input your full legal name and I will output your surname:");
	String fullname = sc.nextLine();

int fullnamelength = fullname.length();

int startingpoint = fullname.indexOf(" ");

System.out.print(fullname.substring(startingpoint+1));
	}
}
