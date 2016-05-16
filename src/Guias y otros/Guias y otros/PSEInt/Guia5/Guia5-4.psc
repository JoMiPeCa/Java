Proceso Guia5
	Definir array,i,j,auxiliar,largo,num como entero;
	auxiliar=0;
	
	//Ingreso de un largo via usuario
	
	Escribir "Ingrese un largo para el arreglo: ";
	Leer largo;
	Dimension array[largo];
	
//	//Ingreso de numeros via Usuario
//	
//	Para i=0 hasta largo-1 con paso 1 hacer
//		Escribir "Ingrese N°",i+1;
//		Leer array[i];
//	FinPara
	
//	//Numeros Aleatorios
//	
//	Para i=0 hasta largo-1 con paso 1 hacer
//		array[i]=azar(9999);
//		Escribir array[i];
//	FinPara
	
	//Numeros Aleatorios incluyendo negativos
	
	Para i=0 hasta largo-1 con paso 1 hacer
		num=azar(2);
		SI(num==1) Entonces
			array[i]=azar(10001);
		Sino
			array[i]=azar(10001)*(-1);
		FinSi
//		Escribir array[i];
	FinPara
	
	
//	//Nunmeros por Defecto
//	largo=5;
//	Dimension array[5];
//	array[0]=34;
//	array[1]=3;
//	array[2]=6;
//	array[3]=2;
//	array[4]=50;
	
	Para i<-0 Hasta largo-1 Con Paso 1 Hacer
		para j=0 hasta largo-2-i con paso 1 hacer
			Si array[j+1]<array[j] entonces
				auxiliar = array[j+1];
				array[j+1] = array[j];
				array[j] = auxiliar;
			FinSi
		FinPara
	FinPara
	
	Para i<-0 Hasta largo-1 Con Paso 1 Hacer
		Escribir array[i];
	FinPara
	
FinProceso

