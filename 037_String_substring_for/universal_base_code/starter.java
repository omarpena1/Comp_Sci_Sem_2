import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a word and I will individually print out each ASCII character:");
String input = sc.nextLine();

for(int i=0; i<input.length(); i++){
 System.out.println(i + "\t" + input.substring(i, i+1));
}
		
//for (int i=input.length()-1; i<=input.length(); i++){
//System.out.println(i + "\t" + input.substring(i));
//	}
}
}