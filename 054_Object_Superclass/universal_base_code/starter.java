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

System.out.println(execute[0].toString());
System.out.println(execute[1].toString());
System.out.println(execute[2].toString());
System.out.println(execute[3].toString());

System.out.println(execute[2].equals(execute[3]));
		
	}
}
