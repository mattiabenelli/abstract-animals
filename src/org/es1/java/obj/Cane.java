package org.es1.java.obj;

import org.es1.java.obj.abs.Animal;
import org.es1.java.obj.inter.INuota;

public class Cane 
	extends Animal
	implements INuota{

	@Override
	public void verso() {
		
		System.out.println("Il verso del cane è bau");
	};
	
	@Override
	public void mangia() {
		
		System.out.println("Il cane mangia crocchette");
	}

	@Override
	public void nuota() {

		System.out.println("So nuotare come un cane");
		
	};
	
	
}
