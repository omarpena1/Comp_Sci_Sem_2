import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a word and I will individually print out each ASCII character:");
String input = sc.nextLine();

int i = 0;

while(true){
	
	String a = input.substring(i,(i+1));
	System.out.println(i +"\t" + a);

	i=i+1;
	//unnecessary code below
	if(i+1 == input.length()){
		String b=input.substring(i);
		System.out.println(i +"\t"+ b);
		
		break;
	}

}

		
	}
}
