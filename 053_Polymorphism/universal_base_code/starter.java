import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

Performer [] execute = new Performer[4];
execute[0]= new Performer();
execute[1]= new Musician();
execute[2]= new Apprentice();
execute[3]= new Actor();

execute[0].perform();
execute[0].practice();

execute[1].perform();
execute[1].practice();

((Apprentice)execute[2]).practiceAtUniversity();
((Apprentice)execute[2]).playInstrument();

((Actor)execute[3]).monologue();
execute[3].perform();




		
	}
}
