package cl.curso.java.guia06;

public class Numero6 {
	public static void main(String args[]) {
		String luhn="123";
		long num=0,aux=0,aux2=0,num2=0,sum=0,sum2=0;
		
		System.out.println("Ingrese el numero ");
		luhn=Leer.dato();
		//System.out.println(luhn);
		num = Long.parseLong(luhn);
		num2 = Long.parseLong(luhn);
		num2=num2*10;
		
		for (int i = 0; i < luhn.length(); i++) {
			num=num/10;
			aux=num%10;
			if(aux*2>9){
				aux2=(aux*2)%10;
				aux=aux*2/10;
				sum2=sum2+aux2;
				aux2=aux%10;
				sum2=sum2+aux2;
			} else{
				sum=sum+(aux*2);
			}
			//System.out.println("aux "+aux);
			num=num/10;
			num2=num2/10;
			aux=num2%10;
			//System.out.println("aux2 "+aux);
			num2=num2/10;
			sum2=sum2+aux;
			if(num==0 && num2==0){
				break;
			}
		}
		//System.out.println("sum "+sum+" sum2 "+sum2);
		sum=sum+sum2;
		//System.out.println("sum "+sum);
		if(sum%10==0){
			System.out.println("El numero de tarjeta "+luhn+" es Correcto! Felicidades :D");
		}
		else{
			System.out.println("El numero de tarjeta "+luhn+" es ERRONEO");
		}
	}
}
