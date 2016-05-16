Proceso Guia6
	definir array,previo como real;
	definir i,corte,largo Como Entero;
	Dimension corte[2];
	corte[0]=0;
	corte[1]=0;
	
	Escribir "Ingrese cantidad de alumnos: ";
	Leer largo;
	dimension array[largo];
	
	
	para i=0 hasta largo-1 con paso 1 Hacer
		repetir
			Escribir "Ingrese la Nota del alumno n°",i+1,": (de 1.0 a 7.0)";
			Leer previo;
		Hasta Que previo >0.9 && previo < 7.1
		array[i]= previo;
		Si array[i]>=4.0 Entonces
			corte[0]=corte[0]+1;
		Sino
			corte[1]=corte[1]+1;
		FinSi
	FinPara
	
	Escribir "Numero de Aprobados: ",corte[0];
	Escribir "Numero de Reprobados: ",corte[1];
FinProceso
