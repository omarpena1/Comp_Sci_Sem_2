package pkg;
import java.io.*;
import java.util.*;



public class Deck {
	
	private ArrayList<Card> userdeck;
	
	public Deck() {
	userdeck = new ArrayList<Card>();	
	}
	
	
	public void ShuffleDeck(){
		 //int rank=-1;
		 //int suitpicker=-1;
		 String colorpicker ="";
		 String suittype = "";
		 int ran=0;
		 
		int rankpicker =(int)(Math.random()*13)+1;
		 	
		int suitpicker = (int)(Math.random()*4);
		 
		 	if(suitpicker == 0){
		 		suittype = "diamonds";
		 		colorpicker = "red";
		 	}
		 	if(suitpicker == 1){
		 		suittype = "hearts";
		 		colorpicker = "red";
		 	}
		 	if(suitpicker == 2){
		 		suittype = "clubs";
		 		colorpicker = "blacK";
		 	}
		 	if(suitpicker == 3){
		 		suittype = "spades";
		 		colorpicker = "black";
		 	}
		 	
		 //userdeck.add(new Card(colorpicker, rankpicker, suittype));
		 
		 
		 while(userdeck.size()!=52){
		 	
		 	rankpicker =(int)(Math.random()*13)+1;
		 	
		 	suitpicker = (int)(Math.random()*4);
		 	
		 	if(suitpicker == 0){
		 		suittype = "diamonds";
		 		colorpicker = "red";
		 	}
		 	if(suitpicker == 1){
		 		suittype = "hearts";
		 		colorpicker = "red";
		 	}
		 	if(suitpicker == 2){
		 		suittype = "clubs";
		 		colorpicker = "black";
		 	}
		 	if(suitpicker == 3){
		 		suittype = "spades";
		 		colorpicker = "black";
		 	}
		 	
		 		for(int c = 0; c<userdeck.size(); c++){
		 			//System.out.print(c);
		 			if(((Card)(userdeck.get(c))).equals((Card)(new Card(colorpicker, rankpicker, suittype)))){
		 				ran++;
		 			}
		 		}
		 		//System.out.println(ran);
		 		if(ran == 0){
		 		userdeck.add(new Card(colorpicker, rankpicker, suittype));
		 		}
		 		ran=0;

		 }
		 /*
		 int disum = 0;
		 int hesum = 0;
		 int spsum = 0;
		 int clsum = 0;
		 
	for(int c=0; c < userdeck.size(); c++){
		if(((userdeck.get(c)).GetSuit()).equals("diamonds")){
			disum += userdeck.get(c).GetRank();
		}
		if(((userdeck.get(c)).GetSuit()).equals("hearts")){
			hesum += userdeck.get(c).GetRank();
		}
		if(((userdeck.get(c)).GetSuit()).equals("spades")){
			spsum += userdeck.get(c).GetRank();
		}
		if(((userdeck.get(c)).GetSuit()).equals("clubs")){
			clsum += userdeck.get(c).GetRank();
		}
	}
	
	System.out.println(disum);
	System.out.println(hesum);
	System.out.println(spsum);
	System.out.println(clsum);
		
		if(disum != 91){
			int key = 91-disum;
			userdeck.add(new Card("red", key, "diamonds"));
		}
		
		if(hesum != 91){
			int key = 91-hesum;
			userdeck.add(new Card("red", key, "hearts"));
		}
		
		if(spsum != 91){
			int key = 91-spsum;
			userdeck.add(new Card("black", key, "spades"));
		}
		
		if(clsum != 91){
			int key = 91-clsum;
			userdeck.add(new Card("black", key, "clubs"));
		}
		/*
		int disumtwo = 0;
		for(int i=0; i<userdeck.size(); i++){
			if(((userdeck.get(i)).GetSuit()).equals("diamonds")){
			disumtwo += userdeck.get(i).GetRank();
		}
		}
		
			int newkey = 91-disumtwo;
			userdeck.add(new Card("red", newkey, "diamonds")); */
	
	}
		 
	
	
	
	public void printDeck(){
		for(int c = 0; c < userdeck.size() ; c++){
			(userdeck.get(c)).printCard();
		}
	}
		
	public Card GetCard(){
	int lastcard = userdeck.size()-1;
	return userdeck.remove(lastcard);
	}

}
 