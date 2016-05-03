//Zadanie4
public class Zadanie4{
	
	public static void main(String[] args){
	
	//pierwsze 30 wyrazów ciagu fibbonaciego
	for(int i=1; i<31; i++)
		System.out.print(fibonacci(i)+", ");
		
	}
	
	private static int fibonacci(int n){
		
		if(n<1)
			return -1;
		else if(n==1) 
			return 1;
		else if(n==2) 
			return 2;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}