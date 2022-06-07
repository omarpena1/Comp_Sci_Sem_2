import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	int [][]arr = new int[4][4];
	
	for(int x = 0; x < arr.length ; x++){
			for (int y = 0; y < arr[0].length; y++){
				arr[x][y] = (((int)(Math.random()*10)+1));
			}
		}
	}
	
	public void RowCalc(int[][] arr, int a){
		int aggregate = 0;
		for(int x=a; x<(a+1); x++){
			for(int y=0; y < arr[0].length; y++){
				aggregate = aggregate + arr[x][y];
			}
		}
		
		System.out.println("The average among all values in row " + a + " of this array is " + (aggregate/(arr[0].length)));
		
	}
	
	public int ArrayAverage(int [][] arr){
	int aggregate = 0;
		for(int x=0; x<arr.length; x++){
			for(int y=0; y < arr[0].length; y++){
				aggregate = aggregate + arr[x][y];
			}
		}
		
		return(aggregate/((arr[0].length)*(arr.length)));
	}
	
	public void PrintArray( int [][] arr){
		
		for(int x = 0; x < arr.length ; x++){
			for (int y = 0; y < arr[0].length; y++){
				System.out.print(arr[x][y]);
			}
			System.out.println();
		}
	}
	
	

}
