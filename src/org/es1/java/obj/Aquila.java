package org.es1.java.obj;

import org.es1.java.obj.abs.Animal;
import org.es1.java.obj.inter.IVolante;

public class Aquila 
	extends Animal
	implements IVolante{

	@Override
	public void verso() {
		
		System.out.println("Il verso dell' aquila è IIIIIIIIIIII");
	};
	
	@Override
	public void mangia() {
		
		System.out.println("L'aquila mangia pesci");
	}

	@Override
	public void vola() {
		
		System.out.println("Sto volando veloce");
		
	};
}

