Proceso sin_titulo
	Definir A Como Caracter;
	Definir largo,i Como Entero;
	largo=0;
	Escribir "Escriba el largo del arreglo: ";
	Leer largo;
	
	Dimension A[largo];
	
	Para i=0 hasta (largo-1) Con Paso 1 Hacer
		Escribir "Escriba el valor ",(i+1),":";
		Leer A[i];
	FinPara
	//El ejercicio no pedia mostrar los valores, aun asi se dejo 
	//por motivos de seguridad, pero puede ser comentado las 3 
	//siguientes lineas.
	Para i=0 hasta (largo-1) Con Paso 1 Hacer
		Escribir A[i];
	FinPara
FinProceso
