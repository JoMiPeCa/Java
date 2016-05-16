/* Este codigo ha sido generado por el modulo psexport 20160408-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Guia6.java."

import java.io.*;
import java.math.*;

public class guia6 {

	public static void main(String args[]) {
		int array[];
		int i;
		int total;
		array = new int[20];
		total = 0;
		for (i=0;i<=19;i++) {
			array[i] = 10*(Math.pow(2,i));
			total = array[i]+total;
		}
		for (i=0;i<=19;i++) {
			System.out.println("El mes n°"+i+1+" debe pagar $"+array[i]);
		}
		System.out.println("Despues de 20 meses pago un total de: $"+total);
	}


}

