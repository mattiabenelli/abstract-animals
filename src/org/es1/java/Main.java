package org.es1.java;

import org.es1.java.obj.abs.Animal;
import org.es1.java.obj.Aquila;
import org.es1.java.obj.Cane;
import org.es1.java.obj.Passerotto;
import org.es1.java.obj.Delfino;

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
	}
}
