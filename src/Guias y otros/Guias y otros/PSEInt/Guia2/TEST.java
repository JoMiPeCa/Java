/* Este codigo ha sido generado por el modulo psexport 20160408-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Guia_Ejercicios.java."

import java.io.*;

public class guia_ejercicios {

	public static void main(String args[]) {
		int num;
		int sum2;
		int suma;
		num = 0;
		suma = 0;
		sum2 = 0;
		do {
			System.out.println(num);
			if ((num%2==0)) {
				suma = suma+num;
			}
			if ((num%2!==0)) {
				sum2 = sum2+num;
			}
			num = num+1;
		} while ((num<=100));
		System.out.println("La suma de los numeros pares es: "+suma);
		System.out.println("La suma de los numeros impares es: "+sum2);
	}


}

