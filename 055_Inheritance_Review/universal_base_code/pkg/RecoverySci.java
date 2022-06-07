package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science {
boolean pass;

public RecoverySci(String teacher,int  grade){
    super(teacher,grade);
}

public int calcCredit(){
    if(grade>=60){
        pass=true;
        credit=4;
        return credit;
    }
    if(grade<60){
        pass=false;
        credit=0;
        return credit;
    }
    return credit;
}

public String toString(){
    if(pass){
    return ("Your teacher is " + teacher +  ". You have received " + credit + " credit/s from taking this class because you have passed.");
    }
    else{return ("Your teacher is " + teacher +  ". You have received " + credit + " credit/s from taking this class because you have failed.");}
}

}

