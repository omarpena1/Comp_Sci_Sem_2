import java.util.*;

class starter {
	//Methods go here

	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	System.out.println("How many values do you want to add to your ArrayList?");
	int capacity = sc.nextInt();
	
	addValuesArrayList(arr,capacity);
	
	printArrayList(arr);

	}
	
	public static void printArrayList(ArrayList<Integer> a){
	int increment = 0;
	
	while(increment < a.size()){
		System.out.println(a.get(increment));
		increment++;
	}
	}
	
	public static void addValuesArrayList(ArrayList<Integer> a, int b){
		int increment = 0;
		
		while(increment<b){
		int x = ((int)(Math.random()*100)+1);
		a.add(increment, x);
		}
	}
	/*
	public static void RemoveDup(ArrayList<Integer> a){
	
		for(int start=0; start<a.size(); start++){
		int x = a.get(start);
			while(true){
				int indexcompare=0;
				int ran = -1;
				if((x == get(indexcompare)) && (indexcompare != start)){
					
					a.remove(indexcompare);
					a.set(indexcompare, -1);
					int ran++;
				}
				
				
				if(indexcompare>a.size){
					if(ran>-1){
					a.set(start, -1);	
					}
					
					break;
				}
			}
		}
	}
	
	*/
}

