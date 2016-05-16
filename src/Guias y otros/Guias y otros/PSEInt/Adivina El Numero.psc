Proceso AdivinaNumero
	Definir x,num,cont Como Entero;
	Definir boolean como Logico;
	num=0;
	x=azar(100);//Define entre que numeros adivinar
	cont=100; //NUMERO DE INTENTOS
	boolean=falso; //Inicializa la condicion ganadora
	Repetir
		Escribir "Adivina el numero";
		Leer num;
		Si(num<x) Entonces
			Escribir "El numero ingresado es muy bajo";
		Sino
			Si(num>x) entonces
				Escribir "El numero ingresado es muy alto";
			Sino
				boolean=verdadero;
			FinSi
		FinSi
		cont=cont-1;
	Hasta Que cont=0 || boolean
	
	Si (boolean) Entonces
		Escribir "FELICIDADES!!!! GANASTE";
	Sino
		Escribir "Se te acabaron los intentos HAHA!";
	FinSi
	
FinProceso
