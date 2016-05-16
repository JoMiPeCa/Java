/* Este codigo ha sido generado por el modulo psexport 20160408-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Guia4.java."

import java.io.*;

public class guia4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int clave;
		double cprod;
		double gfab;
		int matprima;
		double mobra;
		double pventa;
		clave = 0;
		// Costo Produccion = mat prima + mano de obra + gasto fab.
		// Precio venta= cost. prod + 45% cost. prod
		// Mano Obra = 3-4 0.75 matprima; 1-5 0.8 matprima; 2-6 .85 matprim
		while (clave>6 || clave<1) {
			System.out.println("Ingrese clave del producto");
			clave = Integer.parseInt(bufEntrada.readLine());
		}
		System.out.println("Ingrese cantidad materia prima");
		matprima = Integer.parseInt(bufEntrada.readLine());
		switch (clave) {
		case 1:
			mobra = matprima*0.8;
			gfab = matprima*1.28;
			break;
		case 2:
			mobra = matprima*0.85;
			gfab = matprima*1.3;
			break;
		case 3:
			mobra = matprima*0.75;
			gfab = matprima*1.35;
			break;
		case 4:
			mobra = matprima*0.75;
			gfab = matprima*1.28;
			break;
		case 5:
			mobra = matprima*0.8;
			gfab = matprima*1.3;
			break;
		case 6:
			mobra = matprima*0.85;
			gfab = matprima*1.35;
			break;
		default:
			System.out.println("ERROR 404 NOT FOUND ON THIS SERVER");
		}
		// Costo Produccion
		cprod = matprima+mobra+gfab;
		pventa = cprod*1.45;
		System.out.println("Precio de venta es: $"+pventa);
	}


}

