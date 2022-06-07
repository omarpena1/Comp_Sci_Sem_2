import pkg.*;
import java.io.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
	
	Card one = new Card("red", 1, "hearts");
	//one.printCard();
	
	Card two = new Card("black", 12, "spades");
	
	Card three = new Card("red", 10, "diamonds");
	
	one.SetAccessibility(false);
	two.SetAccessibility(false);
	three.SetAccessibility(false);
	//System.out.println(((Card)one).equals(((Card)two)));
	//one.printCardSprite();
	//two.printCardSprite();
	//three.printCardSprite();
	
	
	
	Deck mine = new Deck();
	mine.ShuffleDeck();
	//mine.printDeck();
	
	
	Solitaire newgame = new Solitaire();
	newgame.BoardCreate();
	
	//newgame.PrintBoard();
	//newgame.MakePlay(6,6,3,2);
	newgame.StartGame();

	}
}
