package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
String type;

public Actor(){
type = "theater";
}

public Actor(String n, String t){
	super(n);
	type = t;
}

public void practice(){
	System.out.println(super.getName()+ " is reciting the Macbeth monologue.");
}

public void perform(){
	System.out.println(super.getName()+ " is performing the Macbeth play.");
}

public void monologue(){
	System.out.println("To be or not to be, that is the question");
}

}

