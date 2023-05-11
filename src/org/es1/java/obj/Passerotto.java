package org.es1.java.obj;

import org.es1.java.obj.abs.Animal;
import org.es1.java.obj.inter.IVolante;

public class Passerotto 
	extends Animal 
	implements IVolante{

	@Override
	public void verso() {
		
		System.out.println("Il verso del passerotto è chip");
	};
	
	@Override
	public void mangia() {
		
		System.out.println("Il passerotto mangia semi");
	};
	
	@Override
	public void vola() {

		System.out.println("Sto volando lento");
		
	}
}



