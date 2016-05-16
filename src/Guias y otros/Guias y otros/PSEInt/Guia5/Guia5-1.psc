Proceso Guia5
	Definir dias como entero;
	
	Escribir "Ingrese el numero";
	Leer dias;
	
	Si dias%4==0 && dias%100!=0 || dias%400==0 entonces 
		Escribir "El año es bisiesto";
	Sino
		Escribir "El año nO es bisiesto";
	FinSi
	
FinProceso
