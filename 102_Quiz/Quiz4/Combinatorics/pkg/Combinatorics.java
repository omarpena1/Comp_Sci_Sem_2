package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics{
	public static int factorial(int n){
		int c=n-1;
		while(true){
			n = n * c
			c--;
			if(c==0){
				break;
			}
		}
	}
	
	public static void numCombinations(int n, int r){
		if(r>n){
			System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices.");
		}
		
		int comb = (factorial(n))/(factorial(r)(factorial(n-r)));
		
		System.out.println("There are " + comb + " ways of choosing " + r + " items from " + n + "choices."");
	}
}
