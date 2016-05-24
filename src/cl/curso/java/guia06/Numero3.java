package cl.curso.java.guia06;
import java.io.*;

public class Numero3 {

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
		for (i=0;i<=largo-1;i++) {
			do {
				System.out.println("Ingrese la Nota del alumno n°"+i+1+": (de 1.0 a 7.0)");
				previo = Double.parseDouble(bufEntrada.readLine());
			} while (!(previo>0.9 && previo<7.1));
			array[i] = previo;
			if (array[i]>=4.0) {
				corte[0] = corte[0]+1;
			} else {
				corte[1] = corte[1]+1;
			}
		}
		System.out.println("Numero de Aprobados: "+corte[0]);
		System.out.println("Numero de Reprobados: "+corte[1]);
	}


}

