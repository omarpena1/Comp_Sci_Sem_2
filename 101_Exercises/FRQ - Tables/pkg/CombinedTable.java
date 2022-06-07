package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable extends SingleTable{
int seats;
SingleTable a;
SingleTable b;
int desirability;

public CombinedTable(SingleTable t1, SingleTable t2){
	seats = (t1.getNumSeats() + t2.getNumSeats())-2;
	a = t1;
	b = t2;
	desirability = -1;
}

public boolean canSeat(int c){
	if(c>seats){
		return false;
	}
	
	else{
		return true;
	}
}

public int getDesirability(){
	if(a.getHeight == b.getHeight){
		desirability=(a.getViewQuality + b.getViewQuality)/2;
		return desirability;
	}
	
	else{
		desirability=((a.getViewQuality + b.getViewQuality)/2)-10;
		return desirability;
	}
}

}


