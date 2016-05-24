package cl.curso.java.guia06;

public class Numero1 {

	public static void main(String args[]) {
		int array[];
		int i;
		int total;
		array = new int[20];
		total = 0;
		for (i=0;i<=19;i++) {
			array[i] = (int) (10*(Math.pow(2,i)));
			total = array[i]+total;
		}
		for (i=0;i<=19;i++) {
			System.out.println("El mes n°"+(i+1)+" debe pagar $"+array[i]);
		}
		System.out.println("Despues de 20 meses pago un total de: $"+total);
	}


}
