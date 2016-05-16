Proceso Guia5
	Definir array como Real;
	Definir i,j,auxiliar,num,largo como entero;
	auxiliar=0;
	
	//Ingreso de un largo via usuario + numero del multiplo
	
	Escribir "Ingrese un largo para el arreglo: ";
	Leer largo;
	Dimension array[largo];
	Escribir "Ingrese numero para el multiplo: ";
	Leer num;
	
	auxiliar=largo*num;
	
	//Impresion de los numeros
	
	Para i=0 hasta largo-1 con paso 1 hacer
		array[i]=num*(i+1);
		Escribir array[i];
	FinPara

FinProceso

