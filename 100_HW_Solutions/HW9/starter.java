import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int []hw = new int[20];
		Random rand = new Random();
		int c = 0;
		
		while(c<hw.length){
		int randomarrayvalue = rand.nextInt(50)+1;
		
		hw[c]= randomarrayvalue;
		c = c + 1;
		}
		
		System.out.println("Randomly generated array values first to last");
		for(int i=0; i < hw.length; i++){
			System.out.println(hw[i]);
		}
		
		System.out.println(" ");
		System.out.println("Randomly generated array values last to first:");
		for(int i=19; i > -1; i--){
			System.out.println(hw[i]);
		}


		
	}
}
