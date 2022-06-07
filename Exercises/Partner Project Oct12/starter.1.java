import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int a = sc.nextInt();
	
	int count = a-1;
	
	while (true)
	{
	System.out.println(a * (a-count));
	
	 
	count = count - 1;
	
		
	}

	}
	
}
