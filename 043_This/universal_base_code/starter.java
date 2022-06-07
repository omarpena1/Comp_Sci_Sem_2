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
	
	public void Dwarf(String name, int age){
		this.name = name;
		this.age = age;
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
	
	public boolean isSameName(String name){
		if((this.name).equals(name)){
		return true;
			
		}
		
		return false;
	}
}

class starter {
	public static void main(String args[]) {
	Random rand = new Random();

	Dwarf []collection = new Dwarf[100];
	
	String []nameoptions = new String[7];
	nameoptions[0]="Grumpy";
	nameoptions[1]="Dopey";
	nameoptions[2]="Doc";
	nameoptions[3]="Happy";
	nameoptions[4]="Bashful";
	nameoptions[5]="Sneezy";
	nameoptions[6]="Sleepy";

	for(int i=0; i<collection.length; i++){
	 collection[i] = new Dwarf();
	}
	
	int counter=0;
	int counter2=0;
	
	while(true){
		int randomindex = rand.nextInt(7);
		collection[counter].Dwarf( (nameoptions[randomindex]), counter2);
		counter++;
		counter2++;
		
		if(counter==collection.length){
			break;
		}
	}
	
	System.out.println("The first Dwarf is named " +  (collection[0].getName()) + "."); 
	
	int compcounter = 1;
	int duplicates = 0;
	
	while(true){
	
	if(collection[0].isSameName(collection[compcounter].getName())) {
		duplicates = duplicates+1;
	}
	
	compcounter++;
	
	if(compcounter==collection.length){
		break;
	}
	}
	
	System.out.println("There are " + duplicates + " duplicate " + (collection[0].getName()) +"'s." );
		
	}
}
