/* Este codigo ha sido generado por el modulo psexport 20160408-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Guia6.java."

import java.io.*;

public class guia6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double array[];
		int corte[];
		int i;
		int largo;
		double previo;
		corte = new int[2];
		corte[0] = 0;
		corte[1] = 0;
		System.out.println("Ingrese cantidad de alumnos: ");
		largo = Integer.parseInt(bufEntrada.readLine());
		array = new double[largo];
		System.out.println("Numero de Aprobados: "+corte[0]);
		System.out.println("Numero de Reprobados: "+corte[1]);
	}


}

