package pkg;
import java.io.*;
import java.util.*;

public class Solitaire {
	private Card[][] tableau;
	private Deck playingdeck;
	private ArrayList<Card> wastepile;
	private Card[][] foundation;
	
	public Solitaire(){
		tableau = new Card[13][7];
		foundation = new Card[13][4];
		wastepile = new ArrayList<Card>(52);
		playingdeck = new Deck();
	}
	
	public void BoardCreate(){
		playingdeck.ShuffleDeck();
		
		int startcard = 6;
		
			for(int col=6; col >= 0; col--){
				
			for(int row=startcard; row>=0; row--){
				tableau[row][col]=playingdeck.GetCard();
			}
			startcard--;
			}
			
		int iterate = 1;
		
			for(int row=0; row<7; row++){
				for(int col=row; iterate>0; iterate--){
					tableau[row][col].SetAccessibility(false);
				}
			iterate = 1;
			}
			
	}
	
	
	public void StartGame(){
		Scanner sc = new Scanner(System.in);
		boolean pendinggame = true;
		System.out.println("\nHello! Welcome to the Solitaire Experience.\nPress any key to start.");
		String any = sc.nextLine();
		
		while(pendinggame){
		
		this.PrintBoard();
		
		System.out.println("\nYour board has been created. Press 0 to make a tableau play, Press 1 to Draw, or Press 3 to view your foundation.");
		int next = sc.nextInt();
		
		if(next == 0){
		System.out.println("input the first two coordinates of the card you want to move");
		int movingcardx = sc.nextInt();
		int movingcardy = sc.nextInt();
		System.out.println("input the first two coordinates of the space you want to move to");
		int openspacex= sc.nextInt();
		int openspacey= sc.nextInt();
	
	if(isValidTableauPlay(movingcardy-1, movingcardx-1, openspacey-1, openspacex-1)){
		MakeTableauPlay(movingcardy-1, movingcardx-1, openspacey-1, openspacex-1);
	}
	else{
	while(!(isValidTableauPlay(movingcardy-1, movingcardx-1, openspacey-1, openspacex-1))){
		MakeTableauPlay(movingcardy-1, movingcardx-1, openspacey-1, openspacex-1);
	}
	}
		
		
		
		}
		}
	}
	
	public boolean isValidTableauPlay(int row, int col, int row2, int col2){
			//you still have to insert the ability to add to a foundation
		if(tableau[row][col]==null){
			System.out.println("Error: illegal move, this space is empty. Move an available card");
			return false;
		}
		
		else if(tableau[row][col].GetAccessibility()){
			System.out.println("Error: illegal move, this card is blocked. Move an available card");
			return false;
		}
		
		else if((tableau[row2][col2]!=null) || (tableau[row2-1][col2] == null)){
			System.out.println("Error: illegal move, destination already occupied or is not building on an existing stack");
			return false;
		}
		
		else if((tableau[row2-1][col2].GetColor().equals(tableau[row][col])) || tableau[row2-1][col2].GetRank()<tableau[row][col].GetRank()){
			System.out.println("Error: illegal move, build stacks with alternating colors and/or decreasing rank");
			return false;
		}
		
		else{return true; }
	}
	
	public void MakeTableauPlay(int row, int col, int row2, int col2){
		
			tableau[row2][col2]=tableau[row][col];
			tableau[row][col]=null;
			
			if(row != 0){
			tableau[row-1][col].SetAccessibility(false);
			}
		
			if(tableau[row+1][col] != null){
			for(int count=row; tableau[count][col] != null; count++ ){
				tableau[row2][col2]=tableau[count][col];
				tableau[count][col]=null;
				row2++;
			}
		}
		
		
	//	if(location == 1){
			//if(){}
		//	else{ tableau[row1][col1]=wastepile.remove(wastepile.size()-1); }
	//	}
		
	}
	
	
	public void PrintBoard(){
		for(int row=0; row<tableau.length; row++){
			for(int col=0; col<tableau[0].length; col++){
				
				if(tableau[row][col] != null){
				tableau[row][col].printCardSprite();}
				
				else{
				System.out.print("       ");
				}
			}
			System.out.println("");
		}
		
	System.out.println("[DRAWING DECK]");
	}
	
	
	public void Draw(){
		wastepile.add(playingdeck.GetCard());
		//print out wastepile
		
		
	}
}



