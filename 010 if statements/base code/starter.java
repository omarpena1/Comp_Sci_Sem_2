import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

		System.out.println("You received a score of 2.");
		System.out.println("The passing score is 5.");
		int PassingScore = 3;
		int StudentScore = 2;
		
		if (StudentScore<PassingScore)
		{
			System.out.println("You did not receive a passing score.");
		}
		
		if (StudentScore==PassingScore)
		{
			System.out.println("You barely passed the exam. Congrats.");
		}
		
		if (StudentScore>PassingScore)
		{
			System.out.println("Congratulations! You passed.");
		}
	}
}
