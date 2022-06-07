package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	String instrument;
	
	public Musician(){
		instrument = "cello";
	}
	
	public Musician(String instrument){
		this.instrument = instrument;
	}
	
	public Musician(String name, String instrument){
		super(name);
		this.instrument = instrument;
	}
	
	public Musician(String name, int age, String instrument){
		super(name, age);
		this.instrument = instrument;
	}
	
	
	
	public String getInstrument(){
		return instrument;
	}
	
	public void playInstrument(){
		System.out.println(getName() + " is playing the " + getInstrument() + ".");
	}
	
	public String toString(){
		return ("This is " + name + ". He or she plays the " + instrument + ".");
	}
}
