import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
int []arr = new int[20];
Random rand = new Random();

for(int i=0; i<arr.length; i++){
	int a = rand.nextInt(10)+1;
	arr [i] = a;
}

int targetnumber = rand.nextInt(10)+1;
int x = 0;
int duplicatecounter = 0;

System.out.println("Are there any indexes containing the integer " + targetnumber + "?");

while(true){
	
	int testindex = x;
	
	if(arr[testindex]==targetnumber){
		System.out.println("Duplicate index: " + testindex);
		
	duplicatecounter = duplicatecounter + 1;
		
	}
	
	x = x+1;
	
	if (x==20) {
		break;
	}
	
}

if(duplicatecounter==1){
	System.out.println("There was " + duplicatecounter + " duplicate index.");
}

else{
System.out.println("There were " + duplicatecounter + " duplicate indexes.");
}

System.out.println(" ");

int antecedentconsecutivecounter = 19;
int consecutivecounter = 18;
int endcheck = 1;

while(true){
	
	if (arr[consecutivecounter] == arr[antecedentconsecutivecounter]){
		System.out.println("Indexes " +consecutivecounter+ " and " + antecedentconsecutivecounter + " are consecutive with a value of " + arr[antecedentconsecutivecounter]);
	}
	
	antecedentconsecutivecounter = antecedentconsecutivecounter -1;
	consecutivecounter = consecutivecounter -1;
	
	
	if(consecutivecounter==-1){

		break;
	}
}
	}
}
