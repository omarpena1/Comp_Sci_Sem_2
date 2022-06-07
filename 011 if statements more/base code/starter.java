import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
Scanner sc = new Scanner(System.in);

	System.out.println("What is your favorite number?");
	int FaveNum = sc.nextInt();
	System.out.println("What is your least favorite number?");
	int HateNum = sc.nextInt();
	
	if ((HateNum<FaveNum) || (HateNum>FaveNum))
	{	System.out.println("Your numbers are different.");
	}
	
	if ((HateNum==FaveNum))
	{
		System.out.println("Your numbers are the same. Try again.");
	}
	
	}
}
