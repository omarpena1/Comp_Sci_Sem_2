import pkg.*;
import java.util.Scanner;
import java.util.*;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
ArrayList <String> cookiearr = new ArrayList<String>();
	
	System.out.println("How many cookies do you want in your ArrayList?");
	int cookienum = sc.nextInt();
	
	int iterate = 0;
	
	while(cookienum>=iterate){
		cookiearr.add("cookie");
		iterate++;
	}
	
	int increment = 0;
	
	while(increment < cookiearr.size()){
		System.out.println(cookiearr.get(increment));
		increment++;
	}
	
		
	}
}
