package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature{
	String name;
	int health;
	int attack;
	
	public Zombie(){
		Random rand = new Random();
	int rand1 = rand.nextInt(5)+5;
	int rand2 = rand.nextInt(5)+5;
	
		name = "Walker";
		health = rand1;
		attack = rand2;
	}
	
	public String getName(){
	return name;
	}
	
	public void groan(){
		System.out.print("mmuuuhhh");
	}
	
	public boolean takeDamage(int a){
		this.health = health - a;
	return isDead();
	}
	
	public int getHealth(){
		return health;
	}
	
	public boolean isDead(){
		if(getHealth()<0){
			return true;
		}
		
		else {return false;}
	}
	
	public void attack(Role a){
		Random rand = new Random();
		
		int damageinflict = rand.nextInt(a.getHealth())+1;
		a.setHealth(((a.getHealth())-damageinflict));
	}

	public void printArt(){
		System.out.println("");
System.out.println("[¬º-°]¬ " );
System.out.println("    [¬º-°]¬");
System.out.println(" [¬º-°]¬ " );
System.out.println("   [¬º-°]¬");
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
}

