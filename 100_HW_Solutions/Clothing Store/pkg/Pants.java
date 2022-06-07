package pkg;
import java.util.Scanner;
import java.util.Random;


public class pants extends GarmentsOnSale {
int length;

public pants(){
    length = 32;
}

public pants(int length){
    this.length = length;
}

public pants(int b, String c, int length){
    super(b, c);
    this.length =length;
}

}
