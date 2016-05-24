package cl.curso.java.guia06;

public class Numero5 {

	public static void main(String args[]) {
		String rut="";
		int run =0,suma=0,resto=0,multiplicador=2,original=0,aux=0;
		
		System.out.println("Ingrese Rut: (largo 6,7 u 8) Sin digito Verificador");
		rut = Leer.dato();
		rut = rut.replace(".", "");
		//System.out.println(rut+"  "+rut.length());
		run = Integer.parseInt(rut);
		//System.out.println("Run: "+run);
		original=run;
		for (int i = 0; i < rut.length(); i++) {
			aux=run%10;
			run=run/10;
			suma=suma+aux*multiplicador;
			//System.out.println("suma "+suma);
			multiplicador=multiplicador+1;
			if(multiplicador==8){
				multiplicador=2;
			}
		}
		resto=suma%11;
		aux=11-resto;
		if(aux==11){
			System.out.println("El DV es 0");
		}else if(aux==10){
		System.out.println("El DV es K");
		}
		else{
			System.out.println("El DV es "+aux);
		}
	}
}
