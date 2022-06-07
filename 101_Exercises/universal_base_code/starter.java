import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Ascii testline = new Ascii();
	Ascii objecttwo = new Ascii("dog", 3);
	Ascii three = new Ascii("cactus", "ROY", 2);
	Ascii four = new Ascii("other", "Trunchbull", 1);
	Ascii test = new Ascii("Factory", "Triangle Shirtwaist Factory", 1);
	
	testline.printArt();
	three.printArt();
	objecttwo,printArt();

	four.setAscii(";]");
	four.printArt();
	
	test.printArt();
	}
}
