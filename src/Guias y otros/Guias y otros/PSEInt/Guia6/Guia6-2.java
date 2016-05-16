/* Este codigo ha sido generado por el modulo psexport 20160408-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Guia6.java."

import java.io.*;

public class guia6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int array[];
		int final;
		int i;
		int total[];
		array = new int[11];
		total = new int[11];
		final = 0;
		array[0] = 1;
		array[1] = 5;
		array[2] = 10;
		array[3] = 50;
		array[4] = 100;
		array[5] = 500;
		array[6] = 1000;
		array[7] = 2000;
		array[8] = 5000;
		array[9] = 10000;
		array[10] = 20000;
		for (i=0;i<=10;i++) {
			System.out.println("Ingrese la cantidad de $"+array[i]+":");
			total[i] = Integer.parseInt(bufEntrada.readLine());
			final = final+(total[i]*array[i]);
		}
		System.out.println("Total: $"+final);
	}


}

