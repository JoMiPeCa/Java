Proceso Guia5
	Definir dias como entero;
	
	Escribir "Ingrese el numero";
	Leer dias;
	
	Si dias%4==0 && dias%100!=0 || dias%400==0 entonces 
		Escribir "El a�o es bisiesto";
	Sino
		Escribir "El a�o nO es bisiesto";
	FinSi
	
FinProceso
