
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println("NEW ARRAYLIST:");
		System.out.println("******");
		removeDup(arr1);//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	
		public static void removeDup(ArrayList<Integer> a){
	
		for(int start=0; start<a.size(); start++){
		int x = a.get(start);
		//int ran = -1;
		int indexcompare=1;
		
			while(true){
				
				if((x == a.get(indexcompare)) && (indexcompare != start)){
					
					a.set(indexcompare, -1);
				//	ran++;
				}
				
				indexcompare++;
				
				if(indexcompare==a.size()){
					/*if(ran>-1){
					a.set(start, -1);	
					}*/
					
					break;	
					}
	}
	

	
	}
	
		for(int i = 0; i < a.size(); i++){
		if(a.get(i)==-1){
			a.remove(i);
			i--;
		}

	}
	
	}
	
}
