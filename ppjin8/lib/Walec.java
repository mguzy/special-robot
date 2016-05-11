package lib;

import static java.lang.Math.*;

public class Walec{
		
	private double promien;
	private double wysokosc;
	
	public double getPromien(){
		
		return promien;
	}
	
	public double getWysokosc(){
		
		return wysokosc;
	}
		
	public Walec(double _promien, double _wysokosc){
			
		promien = _promien;
		wysokosc = _wysokosc;
	}
		
	public void show(){
			
		double polePodstawy = promien*promien*PI;
		double objetosc = polePodstawy*wysokosc;
			
		System.out.println("Pole podstawy: "+polePodstawy);
		System.out.println("Objetosc: "+objetosc+"\n");
	}
}
