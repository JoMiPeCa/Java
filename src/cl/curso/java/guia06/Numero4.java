package cl.curso.java.guia06;

public class Numero4 {

	public static void main(String args[]) {
		int codigo = 0;// largo 9
		String checksum = ""; // largo 1
		int total = 0, original = 0, aux = 0, aux2 = 0, aux3 = 0;
		char sino = ' ', aux1 = ' ';

		System.out.println("Ingrese el codigo del libro (largo 9)");
		codigo = Leer.datoInt();
		System.out.println("Tiene digito verificador? (s/n)");
		sino = Leer.datoChar();
		if (sino == 's') {
			System.out.println("Ingrese Digito Verificador");
			checksum = Leer.dato();
		}

		//System.out.println("checksum: " + checksum + " codigo: " + codigo);
		original = codigo;
		for (int i = 2; i < 12; i++) {
			aux = codigo % 10;
			codigo = codigo / 10;
			total = total + (aux * i);
		}
		//System.out.println("suma: " + total);
		aux2 = total % 11; // aux2 residuo dividir en 11
		if (aux2 == 0) {
			if (!checksum.isEmpty()) {
				aux = Integer.parseInt(checksum);
				if (aux2 == aux) {
					System.out.println("El libro es correcto!!");
				} else {
					System.out.println("El libro es incorrecto!!");
				}
			} else {
				System.out.println("DV=" + aux2);
			}
		} else if (aux2 == 1) {
			if (!checksum.isEmpty()) {
				// checksum = X
				aux1 = checksum.toUpperCase().charAt(0);
				if ('X' == aux1) {
					System.out.println("El libro es correcto!");
				} else {
					System.out.println("El libro es incorrecto!");
				}
			} else {
				System.out.println("DV= X");
			}
		} else {
			aux3 = 11 - aux2;
			if (!checksum.isEmpty()) {
				
				aux = Integer.parseInt(checksum);
				//System.out.println("aux3 aux"+aux3+" "+aux);
				if (aux == aux3) {
					System.out.println("El libro es correcto");
				} else {
					System.out.println("Hay un error con el codigo!!");
				}
			} else {
				aux3 = 11 - aux2;
				System.out.println("DV=" + aux3);
			}
		}

	}

}
