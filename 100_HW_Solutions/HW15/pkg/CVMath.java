package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	
	public static void findMagicSquares(int a){
		
		int []answerarray = new int [a];
		
		int aggregatesum = 0;
		int counter = 1;
		int start = 1;
		boolean hashit = false;
		int hitnumber = -1;
		int arrayhit = -5;
		
		while(true){
		//System.out.println(Math.sqrt(a));
		
		while(Math.sqrt(start) == (Math.floor(Math.sqrt(start)))){
			
			aggregatesum = aggregatesum + counter;
			
			if(aggregatesum == start){
				arrayhit = start;
				hashit = true;
				hitnumber++;
				aggregatesum = 0;
				counter = 1;
				break;
			}
			
			counter++;
			
			if(counter == start){
				aggregatesum = 0;
				counter = 1;
				break;
			}
			
		}
		
		if(hashit){
			answerarray[hitnumber]=arrayhit;
		}
		
		hashit = false;
		start++;
		
		if(hitnumber == (answerarray.length-1)){
			break;
		}
		
		}
		
		for(int i=0; i<answerarray.length; i++){
			System.out.print(answerarray[i] + ", ");
		}
		
		System.out.print("are the first " + a + " magic squares.");
		
	}
	
	
}
