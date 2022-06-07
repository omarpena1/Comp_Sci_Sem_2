import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);

System.out.print("What is your base number? ");
int base = sc.nextInt();

System.out.print("What is your exponent number? ");
int exponent = sc.nextInt();

System.out.print(pow(base,exponent));

		
	}

public static int pow(int a,int b){
	
	int count = 0;
	int total = 1;
	
	while (count<b)
	
	{
	
	
	total = a * total;
	count = count + 1;
	
	
	}
	
	return total;
		
}

}
