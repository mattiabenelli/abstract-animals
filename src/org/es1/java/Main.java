package org.es1.java;

import org.es1.java.obj.abs.Animal;
import org.es1.java.obj.Aquila;
import org.es1.java.obj.Cane;
import org.es1.java.obj.Passerotto;
import org.es1.java.obj.Delfino;
import org.es1.java.obj.inter.*;

public class Main {
	
	public static void main(String[] args) {
		
		Cane c = new Cane();
		Aquila a = new Aquila();
		Passerotto p = new Passerotto();
		Delfino d = new Delfino();
		
		Animal[] animals = {c, a, p, d};
		
		for(int i = 0; i < animals.length; i++) {
			
			animals[i].dormi();
			animals[i].verso();
			animals[i].mangia();
			System.out.println("\n");
		}
		
		IVolante[] volatili = {a, p};
		
		for(int i = 0; i < volatili.length; i++) {
			volatili[i].vola();
		}
		
		INuota[] nuotanti = {c, d};
		
		for(int i = 0; i < nuotanti.length; i++) {
			
			nuotanti[i].nuota();
		}
		
		AnimalManager manager = new AnimalManager();
		manager.FaiVolare(p);
		manager.FaiNuotare(c);
		
		manager.FaiVolare(a);
		manager.FaiNuotare(d);
	}
}
