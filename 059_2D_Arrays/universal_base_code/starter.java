import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
double aggregate = 0.0;

int [][]newarr = new int [2][2];
newarr[0][0]=1;
newarr[0][1]=44;
newarr[1][0]=13;
newarr[1][1]=5;

for(int x=0; x<newarr.length; x++){
	for(int y =0; y<newarr[0].length ; y++){
		aggregate = aggregate + newarr[x][y];
	}
}

System.out.println("The average of this array is: " + aggregate/(newarr.length*newarr[0].length));
		
	}
}
//9d4k22 81010