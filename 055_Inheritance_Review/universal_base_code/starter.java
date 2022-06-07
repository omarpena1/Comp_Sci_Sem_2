import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

Course firstperiod = new Course("Schick",90);
Course secondperiod = new RecoverySci("Schick", 40);

System.out.println(firstperiod);
System.out.println(secondperiod);
System.out.println(firstperiod.equals(secondperiod));
	}
}
