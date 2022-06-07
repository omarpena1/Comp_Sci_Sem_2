import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf{
	String name;
	int age; 
	
	public void createDwarf(){
		name = "";
		age = 0;
	}
		
	public void setName(String a){
		name = a;
	}
	
	public void setAge(int b){
		age = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();

	Dwarf []prisonerofwar = new Dwarf[100];
	
	String []nameoptions = new String[7];
	nameoptions[0]="Grumpy";
	nameoptions[1]="Dopey";
	nameoptions[2]="Doc";
	nameoptions[3]="Happy";
	nameoptions[4]="Bashful";
	nameoptions[5]="Sneezy";
	nameoptions[6]="Sleepy";

	for(int i=0; i<prisonerofwar.length; i++){
	 prisonerofwar[i] = new Dwarf();
	}
	
	int counter=0;
	
	while(true){
	
	int randomindex = rand.nextInt(7);
	prisonerofwar[counter].setName(nameoptions[randomindex]);
	
	counter++;
	
	if(counter==prisonerofwar.length){
		break;
	}
	
	}
	
	int counter2=0;
	
	
	while(true){
		
	int randomage = (rand.nextInt(100)+1);
	prisonerofwar[counter2].setAge(randomage);
	
	counter2++;
	
	if(counter2==prisonerofwar.length){
		break;
	}
	}
	
	for(int i=0; i<prisonerofwar.length; i++){
		System.out.println("Dwarf " + (i+1) + " is named " + (prisonerofwar[i].getName()) +".");
		System.out.println("He is " + (prisonerofwar[i].getAge()) + " years old." );
		System.out.println("");
	}

		
	}
}
