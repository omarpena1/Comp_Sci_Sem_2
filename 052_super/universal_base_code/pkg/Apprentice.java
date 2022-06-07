package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school;
	int yearsOfExperience;

public Apprentice(){
	school = "CVHS";
	yearsOfExperience = 0;
}

public Apprentice(String school, int yearsOfExperience){
	this.school = school;
	this.yearsOfExperience = yearsOfExperience;
}

public Apprentice(String instrument, String school, int yearsOfExperience){
	super(instrument);
	this.school=school;
	this.yearsOfExperience=yearsOfExperience;
}

public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
	super(name, age, instrument);
	this.school = school;
	this.yearsOfExperience=yearsOfExperience;
}

public void playInstrument(){
	System.out.println("The apprentice plays the instrument so badly! Everyone BOOS!");
}

public void practice(){
	super.practice();
	System.out.println("So awful! The apprentice only has " + yearsOfExperience + " years of experience; how would it have gone well?");
}

public void perform(){
	super.perform();
	System.out.println("Everyone BOOS!");
}

public void practiceAtUniversity(){
	super.practice();
	System.out.println("The apprentice is practicing at school.");
}

}




