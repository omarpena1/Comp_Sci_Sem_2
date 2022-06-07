package pkg;
import java.util.Scanner;
import java.util.Random;

 
public class APSci extends Science {

public APSci(String teacher,int  grade){
    super(teacher,grade);
}

public void calcCredit(){
    if(grade>=90){
        credit=5;
    }
    if(grade>=80){
        credit=4;
    }
    if(grade>=70){
        credit=3;
    }
    if(grade>=60){
        credit=2;
    }
    if(grade<60){
        credit=1;
    }
    
    public String toString(){
    return ("Your teacher is " + teacher +  ". You have received " + credit + "from taking this class.")
}
    }
}

