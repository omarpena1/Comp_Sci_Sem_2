import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int firstnum = sc.nextInt();
		
		
		System.out.println("Input another number");
		int secondnum = sc.nextInt();
		
		
		if ((firstnum % 2)== 1)
		{
			System.out.println("Your first number is odd.");
		}
		
		else 
		{
			System.out.println("Your first number is even.");
		}
		
		if ((secondnum % 2)== 1)
		{
			System.out.println("Your second number is odd.");
		}
		
		else 
		{
			System.out.println("Your second number is even.");
		}
		
		if ((firstnum % 3)== 0)
		{
			System.out.println("Your first number is divisible by 3.");
		}
		
		if ((firstnum % 4)== 0)
		{
			System.out.println("Your first number is divsible by 4.");	
		}
		
		if ((firstnum % 5)== 0)
		{
			System.out.println("Your first number is divisible by 5.");	
		}
		
		if ((secondnum % 3)== 0)
		{
			System.out.println("Your second number is divisible by 3.");
		}
		
		if ((secondnum % 4)== 0)
		{
			System.out.println("Your second number is divsible by 4.");	
		}
		
		if ((secondnum % 5)== 0)
		{
			System.out.println("Your second number is divisible by 5.");	
		}
		
		if (((firstnum % 3) != 0) && ((firstnum % 4) != 0) && ((firstnum % 5) != 0))
		{
			System.out.println("Your first number is not divisible by 3, 4, or 5.");
		}
		
			if (((secondnum % 3) != 0) && ((secondnum % 4) != 0) && ((secondnum % 5) != 0))
		{
			System.out.println("Your second number is not divisible by 3, 4, or 5.");
		}
	}
}
