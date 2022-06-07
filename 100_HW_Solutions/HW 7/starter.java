import java.util.Scanner;
import java.util.Random;

class Dog{
	String name;
	String breed;
	int age;
	
	public Dog() {
		name = "Clifford";
		breed = "big red dog";
		age = 3;
	}
	
	public Dog(String a) {
		name = a;
		breed = "dog dog";
		age = 1;
	}
		
	public Dog(String a, String b) {
		name = a;
		breed = b;
		age = 1;
		
	}
	
	public Dog(String a, int b) {
		name = a;
		breed = "dog dog";
		age = b;
	}
	
	public void setName(String x){
		name = x;
	}
	
	public void setAge(int y){
		age = y;
	}
	
	public void setBreed (String z){
		breed = z;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		Random rand = new Random();
		int randomSleep = rand.nextInt(2);
		
		if (randomSleep == 1){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public void bark(){
		System.out.println( name + " barks!");
	}
	
	}
	

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog test = new Dog ("Rover", 6);
		Dog testtwo = new Dog ("Annie", "Retriever");

		if (test.isSleeping()){
			System.out.println("Shhhhh. Rover is sleeping!");
		}
		
		else {
			test.bark();
			testtwo.bark();
		}
		
	
	}
}
