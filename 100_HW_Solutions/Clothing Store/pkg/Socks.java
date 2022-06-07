package pkg;
import java.util.Scanner;
import java.util.Random;


public class Socks extends GarmentsOnSale {
String type;

public Socks(){
    type = "long";
}

public Socks(String type){
    this.type= type;
}

public Socks(int b, String c, String type){
    super(b, c);
    this.type = type;
}

}
