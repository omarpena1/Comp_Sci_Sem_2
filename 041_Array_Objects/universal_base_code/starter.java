import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

Warrior [] battalion = new Warrior[100];
Wizard [] platoon = new Wizard[100];

int n = 0;
int l = 0;

for(int i=0; i<battalion.length; i++){
battalion[i]= new Warrior();
}

for(int i=0; i<platoon.length; i++){
platoon[i]= new Wizard();
}

while (true) {
	
platoon[l].attack(battalion[n]);

if(battalion[n].isDead()){
	n = n+1;
}

if(n==battalion.length){
	break;
}


battalion[n].attack(platoon[l]);

if (platoon[l].isDead()){
	l = l+1;
}

if(l==platoon.length) {
	break;
}
	
}

if(n==battalion.length){
	System.out.println("The Wizards won the battle");
	System.out.println("There are only " + ((platoon.length)-l) + " Wizards left.");
}

if(l==platoon.length){
	System.out.println("The Warriors won the battle");
	System.out.println("There are only " + ((battalion.length)-n) + " Warriors left.");
}



	}
}
