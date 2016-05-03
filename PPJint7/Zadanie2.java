//Zadanie2
public class Zadanie2{
	
	public static void main(String[] args){
		
		char letter = 'M';
		
		myMethod((int)letter);
		myMethod((double)letter);
	}
	
	private static void myMethod(int arg){
		System.out.println("myMethod(int arg) - arg przed: "+arg+", arg po: "+(++arg));
	}
	
	private static void myMethod(double arg){
		System.out.println("myMethod(double arg) - arg przed: "+arg+", arg po: "+(--arg));
	}
}