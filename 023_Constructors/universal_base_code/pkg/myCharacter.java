package pkg;
import java.util.Scanner;
import java.util.Random;

 public class myCharacter{

	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	
	public myCharacter(){
		role = "No Role";
	}
	
	public myCharacter(String a) {
		if (a.equals("Wizard")) {
			role = "Wizard";
				strength=1;
				dexterity=5;
				intelligence=15;
				constitution=15;
				charisma=11;
			System.out.println("You are a Wizard! Magic is your passion.");
			
		}
		else if (a.equals("Warrior")) {
			role = "Warrior";
			System.out.println("You are a Warrior! Fighting runs thorugh your veins.");
				strength=15;
				dexterity=15;
				intelligence=3;
				constitution=10;
				charisma=6;
		}
		else if (a.equals("Rogue")){
			role = "Rogue";
			System.out.println("This is your passion!");
				strength=8;
				dexterity=15;
				intelligence=7;
				constitution=5;
				charisma=15;
		}
		else {
			role = " No role";
				System.out.println("Error. You have not chosen a role. Rerun Program.");
				strength=0;
				dexterity=0;
				intelligence=0;
				constitution=0;
				charisma=0;
		}
		System.out.println("Your role is " + role);
		}
		
		public void setRole(String a){
					if (a.equals("Wizard")) {
			role = "Wizard";
				strength=1;
				dexterity=5;
				intelligence=15;
				constitution=15;
				charisma=11;
			System.out.println("You are a Wizard! Magic is your passion.");
			
		}
		else if (a.equals("Warrior")) {
			role = "Warrior";
			System.out.println("You are a Warrior! Fighting runs thorugh your veins.");
				strength=15;
				dexterity=15;
				intelligence=3;
				constitution=10;
				charisma=6;
		}
		else if (a.equals("Rogue")){
			role = "Rogue";
			System.out.println("This is your passion!");
				strength=8;
				dexterity=15;
				intelligence=7;
				constitution=5;
				charisma=15;
		}
		else {
			role = " No role";
				System.out.println("Error. You have not chosen a role. Rerun Program.");
				strength=0;
				dexterity=0;
				intelligence=0;
				constitution=0;
				charisma=0;
		}
		System.out.println("Your role is " + role);
		}
		
		public void setStrength(int b){
			strength = b;
		}
		
		public void setDexterity(int c){
			dexterity = c;
		}
		
		public void setIntelligence(int d){
			intelligence = d;
		}
		
		public void setConstitution(int e){
			constitution = e;
		}
		
		public void setCharisma(int f){
			charisma =f;
		}
		
		public boolean setAll(String g, int h, int i, int j, int k, int l){
		role = g; 
		
		strength= h;

		dexterity= i;

		intelligence= j;

		constitution= k;
		
		
		charisma = l;
		return true;
		
 }
		
		public void myToString(){ 
			
			System.out.println("Your updated role is " +role);
			//if (role.equals("Warrior")){
			System.out.println("Your final stats are:");
				System.out.println("Strength: " + strength);
				System.out.println("Dexterity: " + dexterity);
				System.out.println("Intellignece: " + intelligence);
				System.out.println("Constitution: " + constitution);
				System.out.println("Charisma: " + charisma);
			//}
			
		//	else if (role.equals("Wizard")){
		//		System.out.println("Strength: " + strength);
		//		System.out.println("Dexterity: " +dexterity);
		//		System.out.println("Intelligence: " +intelligence);
		//		System.out.println("Constitution: " +constitution);
		//		System.out.println("Charisma: " +charisma);
		//	}
			
		//	else if (role.equals("Rogue")){
		//		System.out.println("Strength: " +strength);
		//		System.out.println("Dexterity: " +dexterity);
		//		System.out.println("Intelligence: " +intelligence);
		//		System.out.println("Constitution: " +constitution);
		//		System.out.println("Charisma: " +charisma);
		//	}
			
		//	else if (role.equals("No Role")){ 
		//		System.out.println("Strength: " +strength);
		//		System.out.println("Dexterity: " +dexterity);
		//		System.out.println("Intelligence: " +intelligence);
		//		System.out.println("Constitution: " +constitution);
		//		System.out.println("Charisma: " +charisma);	}
		}
		
	//	public void setRole(String a)
		
//	}
	
}



