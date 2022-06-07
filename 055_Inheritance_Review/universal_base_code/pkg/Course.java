package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
String teacher;
int grade;
int credit;
    public Course(String teacher, int grade){
    this.teacher=teacher;
    this.grade=grade;
    credit=calcCredit();
}

public String getTeacher(){
    return teacher;
}

public int calcCredit(){
    if(grade>=90){
        credit=4;
        return credit;
    }
    if(grade>=80){
        credit=3;
        return credit;
    }
    if(grade>=70){
        credit=2;
        return credit;
    }
    if(grade>=60){
        credit=1;
        return credit;
    }
    if(grade<60){
        credit=0;
        return credit;
    }
    
    return credit;
    }
    
public String toString(){
    return ("Your teacher is " + teacher +  ". You have received " + credit + " credit/s from taking this class.");
}

public boolean equals(Object newt){
    if (!(newt instanceof Course)){
        return false;
    }
    
    return this.teacher == ((Course)newt).getTeacher();
}

}



