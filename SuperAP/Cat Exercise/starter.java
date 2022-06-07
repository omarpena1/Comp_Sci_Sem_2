import java.util.Scanner;
import java.util.Random;

class Cat{
	String name;
	public Cat() {
		name = "Garfield";
	}
	
	public Cat(String a){
		name = a;
	}
	
	public void meow() {
		System.out.println( name + " meows.");
	}
	
	
}


class starter {
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Cat Clifford = new Cat ("Clifford");
		Clifford.meow();
		
		Cat two = new Cat();
		two.meow();
	}
		

}

