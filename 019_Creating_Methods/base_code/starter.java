import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sue");
		toString("lol");
		System.out.println("Sue");
		
		toStringCombined("Sue","Me");
		
	}
	public static void toString(String a)
	{
		System.out.println(a);
		return;
	}
	
	public static void toStringCombined(String c, String d)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(c+ " " +d);
		return;
	}

}
