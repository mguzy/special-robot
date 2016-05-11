package lib;

public class KulaW{
		
	private double promien;
		
	public KulaW(Walec walec){
			
			//jeszcze zle
			promien = walec.getPromien();
	}
		
	public KulaW(Kwadrat kwadrat){
		
		promien = kwadrat.getBok()/2;			
	}
}
