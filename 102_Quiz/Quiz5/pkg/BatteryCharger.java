package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
private int[] rateTable;

private int getChargingCost(int startHour, int chargeTime){
	int totalprice = 0;
	int incompleteprice = 0;
	int dailycost = 0;

		if(chargeTime > 24){
			
			int incompletestart=chargeTime%24;
			if(incompletestart != 0){
				for(int x = startHour ; x < startHour+incompletestart ; x++)
			{totalprice += rateTable[x];}
			}
			
			int dayselapsed = chargeTime/2;
			
			for(x:rateTable){
			dailycost += x;
			}
			
			(dailycost*dayselapsed)
		}
			

		
	else{	
		for(int x = starthour ; x < startHour+chargeTime ; x++)
		{totalprice += rateTable[x];}
		}
	
	return totalprice;
	
}

public int getChargeStartTime(int chargeTime){
	
}

}
	
	/*
	for(int x = starthour ; x < startHour+chargeTime ; x++){
		totalprice += rateTable[x];
	}
	
	return totalprice;
	*/
}

}

