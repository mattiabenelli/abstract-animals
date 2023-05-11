package org.es1.java;

import org.es1.java.obj.inter.*;

public class AnimalManager {
	
	void FaiVolare(IVolante iVolante) {
		
		iVolante.vola();
	}
	
	void FaiNuotare(INuota iNuota) {
		
		iNuota.nuota();
	}
	
}
