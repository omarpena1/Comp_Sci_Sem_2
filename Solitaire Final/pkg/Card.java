package pkg;
import java.io.*;
import java.util.*;


public class Card {
	
	private String color;
	private int rank;
	private String suit;
	private boolean hidden;

	
	public Card(String color, int rank, String suit) {
		this.color=color;
		this.rank=rank;
		this.suit=suit;
		hidden=true;
	}
	
	public static final String ANSI_WHITE_BACKGROUND = 	"\u001B[47m";
	
	public static final String ANSI_BLACK = "\u001B[30m";
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_RED = "\u001B[31m";
	
	public static final String ANSI_BOLD = "\033[0;1m";
	
	public String GetColor(){
		return color;
	}
	
	public int GetRank(){
		return rank;
	}
	
	public String GetSuit(){
		return suit;
	}
	
	public void SetAccessibility(boolean a){
		hidden = a;
	}
	
	public boolean GetAccessibility(){
		return hidden;
	}
	
	public boolean equals(Object compare){
		if(!(compare instanceof Card)){
			return false;
		}
		else{
			return (((this.suit).equals(((Card)compare).GetSuit())) && ((this.rank)==((Card)compare).GetRank()));
		}
	}
	
	public void printCard(){
	
		System.out.println(rank + " of " + suit);
	}
	
	public void printCardSprite(){
		
	//public static final String ANSI_RESET = "\u001B[0m";
	//public static final String ANSI_RED = "\u001B[31m";
	
	
		if(GetAccessibility()){
			System.out.print(" [---] ");
		}
		/*
		if(this==null){
			System.out.print("       ");
		//0 width invisible character above
		}*/
		
		else{
		//ask, how to make the card colored in the terminal
		//how could we move cards by the cursor
		//what is deprecated API
		Integer allranks = (rank);
		String spriterank = "";
		String spritesuit = "";
		
		if(rank == 13){
			spriterank = "K ";}
		
		else if(rank == 12){
			spriterank = "Q ";}
		
		else if(rank == 11){
			spriterank = "J ";}
			
		else if(rank == 1){
			spriterank = "A ";
		}
			
		else if(rank ==10){
			spriterank = allranks.toString();
		}
			
		else{spriterank = allranks.toString() + " "; }
		
		if( suit.equals("hearts")){
			spritesuit = "♥";
			System.out.print(" " + ANSI_WHITE_BACKGROUND + ANSI_BLACK +"[" + ANSI_RESET + ANSI_WHITE_BACKGROUND + ANSI_RED + spriterank + spritesuit + ANSI_BLACK +"]" + ANSI_RESET + " ");
		// Can't you use escape sequences here in order to make a more detailed heart over multiple lines???
		}
		
		if( suit.equals("diamonds")){
			spritesuit = "♦";
			
			System.out.print(" " + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "[" + ANSI_RED + spriterank + spritesuit + ANSI_BLACK +"]" + ANSI_RESET + " ");
		}
		
		if( suit.equals("spades")){
			spritesuit = "♠";
			
			System.out.print(" " + ANSI_WHITE_BACKGROUND + ANSI_BLACK+ "[" + ANSI_BLACK + spriterank + spritesuit + ANSI_BLACK +"]" + ANSI_RESET + " ");
		}
		
		if( suit.equals("clubs")){
			spritesuit = "♣";
			
			System.out.print(" " + ANSI_WHITE_BACKGROUND + ANSI_BLACK +"[" + ANSI_BLACK + spriterank + spritesuit + ANSI_BLACK + "]" + ANSI_RESET + " ");
		}
		
		
		}
	}
	
	/*
	public void PrintCardSpriteNullCase(){
		System.out.print("       ");
	}*/
	
}
