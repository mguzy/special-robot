import lib.*;

public class Main{
		
	public static void main(String[] args){
		
		//przykładowe użycie zad1
		Kwadrat kw1 = new Kwadrat(4.0d);
		kw1.show();
		
		//przykładowe użycie zad2
		Walec w1 = new Walec(1.0d, 5.0d);
		w1.show();
		
		//przykładowe użycie zad3
		Walec w2 = (new Kwadrat(1.0d)).przygotujWalec();
		w2.show();
		
		//przykładowe użycie zad4
		KulaW k1 = new KulaW(kw1);
		KulaW k2 = new Kula(w1);
		
		k1.show();
		k2.show();
	}
}