import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
	System.out.print("A number between 0 - 1: ");
	int rand_num1 = rand.nextInt(2);
	System.out.println(rand_num1);
	
	System.out.print("A number between 1-100: ");
	int rand_num2 = rand.nextInt((101)+1);
	System.out.println(rand_num2);
	
	System.out.print("A number between 2.5 and 3.5: ");
	double doubleRand = rand.nextDouble()+2.5;
	System.out.println(doubleRand);
	
	System.out.print("A double between 14 and 589: ");
	double doubleRand2 = rand.nextDouble()+14 + rand.nextInt(576);
	System.out.println(doubleRand2);

int joe = 4;
int mary = 5;
System.out.println(mary/joe);

double examplequestion = rand.nextDouble()+12.5 + rand.nextInt(44);

	}
}
