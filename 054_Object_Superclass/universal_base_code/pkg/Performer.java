package pkg;
import java.util.Scanner;
import java.util.Random;

public class Performer{
	String name;
	int age;
	
	public Performer(){
		name="Doja Cat";
		age=26;
	}
	
	public Performer(String name){
		this.name = name;
	}
	
	public Performer(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void practice(){
		System.out.println(getName() + " is practicing.");
	}
	
	public void perform(){
		System.out.println(getName() + " is performing.");
		
	}
	
	public String toString(){
		return ("This is " + name + ". He or she is " + age + " years old.");
	}
	
	public boolean equals(Object other){
		if(!(other instanceof Performer)){
			return false;
		}
		else{
			return this.name == ((Performer)other).getName();
		}
	}
	
}
