package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role {
    
	public void attack(Role a);
	public void setHealth(int health);
	public int getHealth();
	public void printArt();
	public String getName();
	public boolean attack(Creature x);
}


