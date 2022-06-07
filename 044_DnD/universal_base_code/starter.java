import pkg.*;
import java.util.Scanner;
import java.util.Random;


class Paladin{
	String name;
	int health;
	int attack;
	
	Paladin(){
		name = "Geofry";
		health=5;
		attack=7;
		
	}
	
	Paladin(String name){
		this.name = name;
		health=5;
		attack=7;
	}
	
	public void setHealth(int health){
		this.health=health;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Warrior a){
		Random rand = new Random();
		
		int damageinflict = rand.nextInt(a.getHealth())+1;
		a.setHealth(((a.getHealth())-damageinflict));
	}
	
	public void attack(Wizard b){
		Random rand = new Random();
		
		int damageinflict = rand.nextInt(b.getHealth())+1;
		b.setHealth(((b.getHealth())-damageinflict));
	}
	
	public void printArt(){
		System.out.println("");
System.out.println("		  _ " );
System.out.println("/_;-.__ / _\\  _.-;_\\");
System.out.println("   `-._`'`_/'`.-'");
System.out.println("       `\\   /`");
System.out.println("        |  /");
System.out.println("       /-.(");
System.out.println("       \\_._\\");
System.out.println("        \\ \\`;");
System.out.println("         > |/");
System.out.println("        / //");
System.out.println("        |//");
System.out.println(" jgs    \\(\\");

	}
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Wizard WizardEnemy = new Wizard();
	Warrior WarriorEnemy = new Warrior();
	Paladin Player = new Paladin();
	
	System.out.println("Wizard Health b4 attack: " + WizardEnemy.getHealth());
	System.out.println("Warrior Health b4 attack: " + WarriorEnemy.getHealth());
	
	
	Player.attack(WizardEnemy);
	Player.attack(WarriorEnemy);
	System.out.println(WizardEnemy.getHealth());
	System.out.println(WarriorEnemy.getHealth());
	
Player.printArt();
WizardEnemy.printArt();
WarriorEnemy.printArt();
		
	}
}
