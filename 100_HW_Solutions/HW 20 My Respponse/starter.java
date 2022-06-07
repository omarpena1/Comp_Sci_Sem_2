import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
	
	ArrayList <Integer> homework = new ArrayList<Integer>(100);
	
	for( int i = 0; i<100; i++){
		homework.add(((int)(Math.random()*100))+1);
	}
	
	
	
System.out.println(Selectionsort(homework));
		
printMedianOfSortedList(Selectionsort(homework));

	}
	
	public static ArrayList<Integer> Insertionsort(ArrayList<Integer> sample){
		ArrayList <Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < sample.size() ; i++){
			answer.add(sample.get(i));
		}
		
		int original= -1;
		int adjacent = -1;
		int key =-1;
		
		for(original = 1; original < answer.size(); original++){
			key = answer.get(original);
			adjacent = original-1;
			
			while(adjacent >= 0 && answer.get(adjacent) > key){
				answer.set((adjacent+1),(answer.get(adjacent)) );
				adjacent = adjacent - 1;
			}
			
			answer.set((adjacent+1), key);
		}
		
	return answer;
		
	}
	
	public static ArrayList<Integer> Bubblesort(ArrayList<Integer> sample){
		ArrayList <Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < sample.size() ; i++){
			answer.add(sample.get(i));
		}
		
		for(int control = 0; (control < answer.size()-1) ; control++){
			for(int pointer = 0; (pointer < (answer.size()-control-1)); pointer++){
				if(answer.get(pointer) > answer.get(pointer+1)){
					int temp = answer.get(pointer);
					answer.set(pointer, answer.get(pointer+1));
					answer.set((pointer+1), temp);
				}
			}
		}
		
		return answer;
	}
	
	public static ArrayList<Integer> Selectionsort(ArrayList<Integer> sample){
		ArrayList <Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < sample.size() ; i++){
			answer.add(sample.get(i));
		}
		
		int outer = -1;
		int inner = -1;
		int mindex = -1;
		
		for(outer = 0; outer < answer.size(); outer++){
			mindex = outer;
			for(inner = outer+1; inner < answer.size(); inner++){
				if(answer.get(inner)<answer.get(mindex)){
					mindex = inner;
				}
			}
			
			int temp = answer.get(outer);
			answer.set(outer, answer.get(mindex));
			answer.set(mindex, temp);
		}
		
		return answer;
}

public static void printMedianOfSortedList(ArrayList<Integer> sorted){
	int median = -1;
	
	if((sorted.size()%2) != 0){
		median= sorted.get(((int)sorted.size()/2));
	}
	
	else{
		median=(sorted.get(((int)sorted.size())/2) + sorted.get((((int)sorted.size())/2)-1))/2;
	}
	
	System.out.println("The median of this sorted Integer ArrayList is " + median + ".");
}

}