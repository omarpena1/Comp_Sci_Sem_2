import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
		System.out.println("What symbol would you like to use?");
		String symbol = sc.nextLine();
		
		System.out.println("What is the width of your box?");
		int width = sc.nextInt();
		
		System.out.println("What is the height of your box?");
		int height = sc.nextInt();
		
		String [][]newbox = new String [height][width];
		
		for(int x = 0; x < newbox.length ; x++){
			for (int y = 0; y < newbox[0].length; y++){
				newbox[x][y]=symbol;
			}
		}
		
			for(int x = 0; x < newbox.length ; x++){
			for (int y = 0; y < newbox[0].length; y++){
				System.out.print(newbox[x][y]);
			}
			System.out.println();
		}
		
		
	}
}
