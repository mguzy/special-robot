package lib;

public class Kwadrat{
		
	private double bok;
		
	public Kwadrat(double _bok){
			
		bok = _bok;
	}
	
	public double getBok(){
		
		return bok;
	}
		
	public void show(){
			
		double pole = bok*bok;
		double objetosc = pole*bok;
			
		System.out.println("Pole: "+pole);
		System.out.println("Objetosc: "+objetosc);
	}
	
	public Walec przygotujWalec(){
		
		return new Walec(bok/2, bok);
	}
}

