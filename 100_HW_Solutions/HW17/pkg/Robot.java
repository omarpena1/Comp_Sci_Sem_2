package pkg;

public class Robot{		

private boolean forwardMoveBlocked(){
	if(facingRight){
		if(pos==(hall.length-1){
			return true;
		}
		else{ return false; }
	}
		
		else{
			if(pos==0){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
private void move(){
		if(hall[pos] != 0){
			hall[pos]=hall[pos]-1;
		}
		
		if(hallsClear()){
			if(facingRight){
				if(forwardMoveBlocked()){
					facingRight = false;
				}
				else{
					pos++;
				}
			}
			
			else{ 
				if(forwardMoveBlocked()){
					facingRight = true;
				}
				else{
					pos--;
				}
			}
		}
	}
	
public int clearHall(){

	int itemsum = 0;
	int completedmoves = 0;

	while(true){
		
		for(int x : hall){
		itemsum = itemsum+x;
		}
		
		if(itemsum != 0){
		completedmoves++;
		itemsum = 0;
		move();
		}
		
		else{
			break;
		}
	}
	
return completedmoves;

}

}

