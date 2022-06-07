package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;	// Who's the arch nemesis of this Spiderman

	public Spiderman(){			// Default constructor!
		this("Tobey Maguire", 46, "Green Goblin");
	}
	
	public Spiderman(String actor){
		this(actor, 46, "Green Goblin");
	}
	/*
	public Spiderman(String villain){
		this("Tobey Maguire", 46, villain);
	}
	*/
	public Spiderman(int age){
		this("Tobey Maguire", age, "Green Goblin");
	}
	
	public Spiderman(int age, String villain){
		this("Tobey Maguire", age, villain);
	}
	
	public Spiderman(String actor, int age, String villain){
	this.actor=actor;
	this.age=age;
	this.villain=villain;
	
	printArt();
}
	
	public void SetActor(String actor){
		this.actor = actor;
	}
	
	public void SetAge(int age){
		this.age = age;
	}
	
	public void SetVillain(String villain){
		this.villain= villain;
	}
	
	public void SetFullActor(String actor, int age){
		this.actor = actor;
		this.age = age;
	}
	
	public void SetFullMovie(String actor, int age, String villain){
		this.actor = actor;
		this.age = age;
		this.villain = villain;
		
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.

 public String getActor(){
 	return actor;
 }
 
 public int getInt(){
 	return age;
 }
 
 public String getVillain(){
 	return villain;
 }

	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)



	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                  ");   
    System.out.println("         /    			  "); 
	}

	

}
