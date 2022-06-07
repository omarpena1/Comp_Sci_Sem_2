package pkg;
import java.util.Scanner;
import java.util.Random;


public class DesignerShirts extends Shirts {
String brand;

public DesignerShirts(){
	brand = "Gucci";
}

public DesignerShirts(String brand){
	this.brand = brand;
}

public DesignerShirts(int b, String c, String brand){
	super(b, c);
	this.brand = brand;
}

public int sale(int a){
	return price;
}

public boolean isHighQuality(){
	return true;
}

}
