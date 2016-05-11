package lib;

public class KulaW{
		
	private double promien;
		
	public KulaW(Walec walec){
			
			promien = 
			walec.getPromien() > walec.getWysokosc() ? 
			walec.getWysokosc()/2 :
			walec.getPromien();
	}
		
	public KulaW(Kwadrat kwadrat){
		
		promien = kwadrat.getBok()/2;			
	}
	
	public double getPromien(){
		
		return promien;
	}
	
	public void show(){
		
		System.out.println("Promien: "+promien);
	}
}
