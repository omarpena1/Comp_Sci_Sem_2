import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number, and I will count up from it.");
		int startingnumber = sc.nextInt();
		System.out.println(startingnumber);
		System.out.println(startingnumber+1);
		System.out.println(startingnumber+2);
		System.out.println(startingnumber+3);
		System.out.println(startingnumber+4);
		
	}
}
