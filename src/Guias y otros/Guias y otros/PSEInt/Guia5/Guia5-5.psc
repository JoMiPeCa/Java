Proceso Guia5
	Definir array como Caracter;
	Definir i,j,auxiliar,arrau,largo como entero;
	auxiliar=0;
	
	//Ingreso de un largo via usuario
	
	Escribir "Ingrese un largo para el arreglo: ";
	Leer largo;
	Dimension array[largo];
	Dimension arrau[largo];
	
	//Ingreso de nombre via Usuario
	
	Para i=0 hasta largo-1 con paso 1 hacer
		Escribir "Ingrese nombre N°",i+1;
		Leer array[i];
	FinPara

	//Largo de Nombres
	
	Para i=0 hasta largo-1 con paso 1 hacer
		arrau[i] = Longitud(array[i]);
	FinPara
	
	//Pantalla
	
	Para i<-0 Hasta largo-1 Con Paso 1 Hacer
		Escribir "El nombre ",array[i]," Tiene largo ",arrau[i];
	FinPara
	
FinProceso

