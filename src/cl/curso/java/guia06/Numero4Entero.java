package cl.curso.java.guia06;

public class Numero4Entero {

	public static void main(String args[]) {
		int codigo=0;//largo 9
		int checksum=0; //largo 1
		int total=0,original=0,aux=0,aux2=0,aux3=0;
		char check=' ';
		
		System.out.println("Ingrese el codigo del libro (largo 10, solo numeros-Si Checksum es X, ingrese 10)");
		codigo = Leer.datoInt();
		if(codigo%100==10){
			check='X';
			checksum = codigo%100;
			codigo=codigo/100;
		}
		else{
		checksum = codigo%10;
		codigo=codigo/10;
		}
		
		System.out.println("checksum: "+checksum+" codigo: "+codigo);
		original = codigo;
		for (int i = 2; i < 11; i++) {
			aux=codigo%10;
			codigo=codigo/10;
			total=total+(aux*i);
		}
		System.out.println("suma: "+total);
		aux2=total%11; //aux2 residuo dividir en 11
		if(aux2==0){
			aux3=0; //aux3 checksum!!
			boolean ayud=false;
			ayud = (checksum==aux3);
			System.out.println("El libro es correcto!!"+ayud);
		}
		else if(aux2==1){
			// checksum = X
			System.out.println("El libro es correcto!");
		}
		else{
			aux3=11-aux2;
			if(checksum==aux3){
				System.out.println("El libro es correcto");
			}
			else{
				System.out.println("Hay un error con el codigo!!");
			}
		}
		
	}


}

