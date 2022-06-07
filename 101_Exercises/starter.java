import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);

System.out.print("Please input a nonzero integer: ");
int factor1 = sc.nextInt();

System.out.print("Please input another nonzero integer: ");
int factor2= sc.nextInt();

int counter = 0;
int nonstaticproduct = factor1*factor2;
int product = factor1*factor2;
int [] array = new int[product];

while(true){
	
	if((nonstaticproduct%factor1 == 0) && (nonstaticproduct%factor2 == 0)){
		array[counter] = nonstaticproduct;
	}
	
	nonstaticproduct--;
	counter++;
	
	if (nonstaticproduct == Math.abs(factor1)-1 || nonstaticproduct == Math.abs(factor2)-1){
		break;
	}
}

int counter2 = 0;

for(int x : array){
	
	if(x == 0){
		array[counter2] = product;
	}
counter2++;

}

int least = product;
for(int x : array){
	
	if(x<least){
	least=x;
	}
}

System.out.println("");
System.out.println(least);


	}
}

double x = 5/2;

if(x = 2.5){
x = x%(x+2);
}


