
import java.util.Scanner;
import java.util.Random;

public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	//Empty Constructor
		// Your code goes here
	public Hangman(){
		guessingword = "Final";
		numTries = 5;
	}
	//Integer Constructor
	public Hangman(int in){
		guessingword = "Firewall";
		numTries = in;
	}
		// Your code goes here
//GIVEN: A WORD IS GENERATED RANDOMLY WITH THIS PRETEND ALGORITHM
	// GIVEN - meaning you can use this, assume it works.
	// @return nothing
	// This method sets your guessingWord to a pre generated lowercase word.
	// This method  is the same as indexOf so no using indexOf.
	public void generateWord(){
		/* implementation not shown */
	}

	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start){
	
		p=0
		String[]test  = new String[guessingword.length];
		while(true);
		test[p]=guessingWord.substring(p,p+1)
		
		if(p=guessingword.length);
		
		for( n: guessingword) {
			if(letter.equals(n)){
				return guessingword.indexOf(n);
			}
			
		i = -1;
		return i;
			}
		}
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		// Your code goes here
	}
}




//second FRQ

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	public static int getMedian(int[] a){
	int total = 0;
		
	for( n :int[] a)
	{
	total=total+ n;
	}
	return total/a.length;
		
	}
	
	public static int getMode(int[] b){
		int assumer = -1000000000000000000000000;
	
	for ( n:int[] b)
	{
	 if(n>assumer){
	 assumer = n;
	 }
	}
	 return assumer;
	}



		
	}
}
