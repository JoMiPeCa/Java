package cl.curso.java.guia06;

import java.io.*;

public class Numero2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int array[];
		int end;
		int i;
		int total[];
		array = new int[11];
		total = new int[11];
		end = 0;
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
			end = end+(total[i]*array[i]);
		}
		System.out.println("Total: $"+end);
	}


}

