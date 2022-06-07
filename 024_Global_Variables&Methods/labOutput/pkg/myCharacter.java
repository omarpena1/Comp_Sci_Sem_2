package pkg;
import java.util.Scanner;
import java.util.Random;

 public class myCharacter{

	public String role;
	public myCharacter(){
		role = "No Role";
	}
	
	public myCharacter(String a) {
		if (a.equals("Wizard")) {
			role = " Wizard";
			System.out.println("You are a Wizard! Magic is your passion.");
			
		}
		else if (a.equals("Warrior")) {
			role = " Warrior";
			System.out.println("You are a Warrior! Fighting runs thorugh your veins");
		}
		else if (a.equals("Rogue")){
			role = " Rogue";
			System.out.println("This is your passion!");
		}
		else {
			role = " No role";
				System.out.println("Error. You have not chosen a role. Rerun Program.");
		}
		System.out.println("Your role is" + role);
		
		}
	}
	
	//if (myCharacter.role.equals("Wizard"))
	//{
	//	System.out.println("You are a wizard! Magic is your passion!");
	//}
	
	//else
	//{System.out.println("You have not chosen a role");}



