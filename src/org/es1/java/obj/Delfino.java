package org.es1.java.obj;

import org.es1.java.obj.abs.Animal;
import org.es1.java.obj.inter.INuota;

public class Delfino 
	extends Animal
	implements INuota{

	@Override
	public void verso() {
		
		System.out.println("Il verso del delfino è AAAAAAAAAAAAAA");
	};
	
	@Override
	public void mangia() {
		
		System.out.println("Il delfino mangia pesci");
	}

	@Override
	public void nuota() {

		System.out.println("So nuotare sium");
		
	};
}