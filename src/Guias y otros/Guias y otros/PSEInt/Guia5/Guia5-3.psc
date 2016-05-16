Proceso Guia5
	Definir dias como entero;
	Definir array como Caracter;
	Dimension array[7];
	
	array[0]="Lunes";
	array[1]="Martes";
	array[2]="Miercoles";
	array[3]="Jueves";
	array[4]="Viernes";
	array[5]="Sabado";
	array[6]="Domingo";
	
	Repetir 
		Escribir "Ingrese un numero (1-7)";
		leer dias;
	Hasta Que (dias<8 && dias>0)
	
	Escribir "Dia de la semana correspondiente: ",array[dias-1];
	
FinProceso
