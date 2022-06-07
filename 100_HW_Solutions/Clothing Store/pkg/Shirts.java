package pkg;
import java.util.Scanner;
import java.util.Random;


public class Shirts extends GarmentsOnSale{
String material;

public Shirts(){
	material = "90% cotton, 10% polyester";
}

public Shirts(String material){
	this.material = material;
}

public Shirts(int b, String c, String material){
	super(b, c);
	this.material = material;
}

public boolean isHighQuality(){
	return false;
}


	
}
