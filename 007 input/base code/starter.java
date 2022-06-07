import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	String namequestion = new String("What is your name?");
	
	System.out.println(namequestion);
	String text = sc.nextLine();
	
	System.out.println("What is your age?");
	int number = sc.nextInt();
	
	System.out.println("What month were you born? (1-12)");
	int number2 = sc.nextInt();
	
		System.out.println("What day were you born? (1-31)");
	int number3 = sc.nextInt();
	
	System.out.println("What year were you born?");
	int number4 = sc.nextInt();
	
	System.out.println("If I have a dollar and two quarters, how much money do I have?");
	double number5 = sc.nextDouble();


	}
}
