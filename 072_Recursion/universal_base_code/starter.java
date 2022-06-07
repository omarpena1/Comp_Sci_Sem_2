import pkg.*;
import java.util.*;

class starter {
	public static int recurPower(int base, int exp){
	if(exp==1){
		return base;
	}
	
	int answer= base*(recurPower(base, exp-1));
	return answer;
	
	}	

	public static void main(String args[]) {
		recurPower(3,3);
	}
}
