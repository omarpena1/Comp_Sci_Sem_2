import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		bubbleSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void bubbleSort(ArrayList<Integer> arrsample){
		for(int outer =0; outer < arrsample.size() ; outer++){
			for(int inner =0; inner < arrsample.size()-outer-1 ; inner ++){
				if(arrsample.get(inner) > arrsample.get(inner+1)){
					int temp = arrsample.get(inner);
					arrsample.set(inner, arrsample.get(inner+1));
					arrsample.set(inner+1, temp);
					
				}
			}
		}
	}
}
