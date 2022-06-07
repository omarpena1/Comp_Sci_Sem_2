import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your first number: "); 
		int firstnumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Please enter a second different number: "); 
		int secondnumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Please enter a third different number: "); 
		int thirdnumber = sc.nextInt();
		sc.nextLine();
		
		if ((firstnumber>secondnumber) && (firstnumber>thirdnumber))
		{
			System.out.println("Your first number is the largest of the three.");
				System.out.println("The number was " + firstnumber + ".");
		}
		
		if ((secondnumber>firstnumber) && (secondnumber>thirdnumber))
		{
			System.out.println("Your second number is the largest of the three.");
				System.out.println("The number was " + secondnumber + ".");
		}
		
		
		if ((thirdnumber>firstnumber) && (thirdnumber>secondnumber))
		{
			System.out.println("Your third number is the largest of the three.");
				System.out.println("The number was " + thirdnumber + ".");
		}
		
	
		if ((firstnumber<secondnumber) && (firstnumber<thirdnumber))
		{
			System.out.println("Your first number is the smallest of the three.");
				System.out.println("The number was " + firstnumber + ".");
		}
		
		if ((secondnumber<firstnumber) && (secondnumber<thirdnumber))
		{
			System.out.println("Your second number is the smallest of the three.");
				System.out.println("The number was " + secondnumber + ".");
		}
		
		
		if ((thirdnumber<firstnumber) && (thirdnumber<secondnumber))
		{
			System.out.println("Your third number is the smallest of the three.");
				System.out.println("The number was " + thirdnumber + ".");
		}
		
	}
}
