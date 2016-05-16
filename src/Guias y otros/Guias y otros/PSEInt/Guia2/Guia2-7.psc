Proceso Guia2
	Definir num,cont,mayor Como Real;	
	Dimension num[10];
	cont=0;
	//Inicializando valores
	num[0]=0;
	num[1]=0;
	num[2]=0;
	num[3]=0;
	num[4]=0;
	num[5]=0;
	num[6]=0;
	num[7]=0;
	num[8]=0;
	num[9]=0;
	mayor=num[0];
	Mientras cont<10 hacer
		Escribir "Ingrese N°",cont+1;
		Leer num[cont];
		Si(num[cont]> mayor) entonces
			mayor=num[cont];
		FinSi
		cont=cont+1;
	FinMientras
	Escribir "El mayor numero ingresado es: ",mayor;
FinProceso
