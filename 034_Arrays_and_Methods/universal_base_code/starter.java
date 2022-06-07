import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray( int[]x){
		for (int i=0; i< x.length; i++){
			System.out.println(x[i]);
		}
		
	}
	
	public static int getArrayAverage( int[]x){
	int startersum= 0;
	int j = 0;
		
		while(true){
	int aggregatesum = startersum + x[j];
	
	j = j+1;
	
	startersum = aggregatesum;
	
	if (j==x.length){
		return (startersum/j);
	}
	}
	}
	
	public static int getArrayMax (int []x){
	int d=0;
	int max = 0;
	while(true){
		if(x[d]>max){
			max = x[d];
		}
		
		d=d+1;
		
		if (d==x.length) {break;}
		//return max;
		
	}
	return max;
	}
		
	public static int getArrayMin (int []x){
			int c=0;
	int min = 999;
	while(true){
		if(x[c]<min){
			min = x[c];
		}
		
		c= c+1;
		
		if (c==x.length) {
				break;	}
	}
	return min;
	}
	
	
	
	public static void main(String args[]) {
		// Your code goes below here

	int []arr = new int [100];
	
	Random rand = new Random();
	int a = 0;
	
	while(a<100){
	int values = rand.nextInt(100)+1;
	
	arr[a] = values;

	a = a+1;
	}
	
	toStringArray(arr);
	System.out.println("Array Average: " + getArrayAverage(arr));
	System.out.println("Array Max: " + getArrayMax(arr));
	System.out.println("Array Min: " + getArrayMin(arr));
	
	}
}
