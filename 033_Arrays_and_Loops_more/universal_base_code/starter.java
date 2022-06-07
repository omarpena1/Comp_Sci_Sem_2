import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int []criticalnumbers = new int [101];
	
	Random rand = new Random();
	int a = 0;
	
	while(a<101){
	int yvalues = rand.nextInt(1000);
	
	criticalnumbers[a] = yvalues;

	a = a+1;
	}
	
	int c=0;
	int min = 999;
	while(true){
		if(criticalnumbers[c]<min){
			min = criticalnumbers[c];
		}
		
		c= c+1;
		
		if (c==criticalnumbers.length) {
				System.out.println("This is the arrays smallest value: " + min);
				break;
		}
	}
	
	int d=0;
	int max = 0;
	while(true){
		if(criticalnumbers[d]>max){
			max = criticalnumbers[d];
		}
		
		d=d+1;
		
		if (d==criticalnumbers.length) {
				System.out.println("This is the arrays largest value: " + max);
				break;}
		
	}
	
	int startersum = 0;
	int i=0;
	
	while(true){
	int aggregatesum = startersum + criticalnumbers[i];
	
	i = i+1;
	
	startersum = aggregatesum;
	
	if (i==criticalnumbers.length){
		double arithmeticmean = startersum/101;
		System.out.println("This is the average value in the array: " + arithmeticmean);
		break;
	}
	
	}
	
//	for (int i = 0; i < array.length; i++) {
//	int x = criticalnumbers[i];
//	 x
	 
//	 aggregatesum = 
//	}


	System.out.println("Our array length: " + criticalnumbers.length);

		
	}
}
