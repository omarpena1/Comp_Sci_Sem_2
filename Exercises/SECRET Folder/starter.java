
class starter {
	
	
public static int getMode(int[]array){
int c = 0;

int duplicate = 0;

int c2 = array[0];

for(int x : array){
	if(x>c2){
	 c2 = x;
	}
}

 int []finalcount = new int[(c2+1)];

while(true){

for(int i=0 ; i<array.length; i++){
if(array[c]==array[i]){
 duplicate = duplicate+1;}
}

finalcount[c]=duplicate;

duplicate = 0;
c++;

if(c==array.length){
	break;
}

}

int largestindex = finalcount[0];
	int counter = 0;

for(int x:finalcount){
	
		if(x>largestindex){
			largestindex = x;
			counter++;}
			
}

int y = counter;
for(int a = 0 ; a<finalcount.length; a++){
int i= finalcount[y];

	if((finalcount[a])==i){
		
		if((array[a] != array[y])){
			return -1;	}
	}
	
}


return array[(counter)];

	}


public int getMedian(int[]a){
int answer = 0;

	if(a.length%2==0){
		answer=a[((a.length/2)-1)];
		return answer;
	}
	
	else{
		answer=a[(a.length/2)];
		return answer;
	}
}

	
	public static void main(String args[]) {
	
int []test = new int[7];
test[0]=1;
test[1]=2;
test[2]=2;
test[3]=8;
test[4]=8;
test[5]=5;
test[6]=5;

System.out.println(getMode(test));
	
	}
}
