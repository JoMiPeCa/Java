Proceso Guia2
	Definir notas,cont,promedio Como Real;	
	Dimension notas[3];
	cont=0;
	promedio=0;
	notas[0]=0;
	notas[1]=0;
	notas[2]=0;
	Mientras cont<3 hacer
		Repetir
			notas[cont]= azar(71)+10;
			
		Hasta Que notas[cont] <=70
		//Escribir "Nota",notas[cont]; //Modo DEBUG(Saber las notas)
		promedio = promedio + notas[cont];
		cont=cont+1;
	FinMientras
	
	promedio = promedio / cont;
	
	SI (promedio>=40) Entonces
		Escribir "Aprobado";
	Sino
		Escribir "Desaprobado";
	FinSi
FinProceso
