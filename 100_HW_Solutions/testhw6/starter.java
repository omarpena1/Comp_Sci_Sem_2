import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static boolean checkPrime(int a) {
		
		int operand = a-1;
		
		if (operand==0)
		{
			return false;
		}
		
		while(operand>=2) {
			
			int primeTest= a%operand;
			
			if (primeTest == 0)
			{
				return false;
			}
			
			operand = operand-1;
			
		}
		
	
	return true;
		
	}
	
	public static void printPrimes(int a) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number and I'll print out all the prime numbers at or below the number you have given: ");
	int input = sc.nextInt();
	
	System.out.println("---------------------");
	
	if (checkPrime(input))
	{
		System.out.println(input + " ");
	}
	
	int count = 1;
	
	while((input-1)>=2)
	{
	int underinput = input-count;
	
	if (underinput==1) {
		break;
	}
	
	if (checkPrime(underinput)){
		System.out.println(underinput + " ");
	}
	
	count = count + 1;
	
	}
	

	return; 
	
	}
	
	public static void main(String args[]) {
		// Your code goes below here

System.out.println(checkPrime(5));

printPrimes(200);
	}
}
