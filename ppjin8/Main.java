import lib.*;

public class Main{
		
	public static void main(String[] args){
		
		//przykładowe użycie zad1
		Kwadrat kw1 = new Kwadrat(34.0d);
		Kwadrat kw2;
		
		kw2 = new Kwadrat(2.0d);
		
		kw1.show();
		kw2.show();
		
		//przykładowe użycie zad2
		Walec w1 = new Walec(3.0d, 8.0d);
		Walec w2;
		
		w2 = new Walec(2.0d, 1.0d);
		
		w1.show();
		w2.show();
	}
}