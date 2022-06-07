package pkg;
import java.util.Random;


public class Paladin implements Role{
	String name;
	int health;
	int attack;
	
	public Paladin(){
		name ="Geofry";
		health=5;
		attack=7;
		
	}
	
	/*
	Paladin(String name){
		this.name = name;
		health=5;
		attack=7;
	}
	*/
	public void setHealth(int health){
		this.health=health;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Role a){
		Random rand = new Random();
		
		int damageinflict = rand.nextInt(a.getHealth())+1;
		a.setHealth(((a.getHealth())-damageinflict));
	}
	
	public boolean attack(Creature x){
	Random rand = new Random();
	int a = rand.nextInt(this.attack)+1;
	System.out.println(getName() + " strikes for " + a + " damage on " + x.getName() + ".");
	
		return x.takeDamage(a);
	}
	/*
	public void attack(Wizard b){
		Random rand = new Random();
		
		int damageinflict = rand.nextInt(b.getHealth())+1;
		b.setHealth(((b.getHealth())-damageinflict));
	}
	*/
	
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

