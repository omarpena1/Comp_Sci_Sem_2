import java.util.Scanner;
	class starter {

	
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int count = 25;
		int a = 26;
		
		while (true)
		{
			
		System.out.println(a-1);
		count = count-1;
		a = a-1;
		
			if (count==4)
			{
			break;
			}
		
		}
		
System.out.println(" ");
		
			Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int b = sc.nextInt();
	
	int count2 = b-1;
	
	while (true)
	{
	System.out.println(b * (b-count2));
	
	 
	count2 = count2 - 1;
	
	if (count2==0)
	{
	break;
	}
	
	}
	
System.out.println(" ");
	
	int y = sc.nextInt();
	int x = y-1;
	
	while (true)
	{
		System.out.println(y);
		y=y*x;
		
			if (x==1)
			{
				break;
			}
		x = x-1;
	}

System.out.println(" ");
int u = sc.nextInt();

int answer = fact(u);

System.out.println( "This is the right answer, ignore all other ones:" + answer);

}
	public static int fact(int yee){
			int y = yee;
			int x = y-1;
	
	while (true)
	{
		System.out.println(y);
		y = y*x;
		
			if (x==1)
			{
				return y;
			}
			
		x = x-1;
		
	}
	  
	}
}
