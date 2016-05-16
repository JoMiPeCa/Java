Proceso sin_titulo
	Definir num,cont como entero;
	
	Dimension num[5];
	cont=0;
	
	num[0]=0;
	num[1]=28;
	num[2]=30;
	num[3]=10;
	num[4]=4;
	
	Mientras cont<=4 hacer
		escribir num[cont];
		cont=cont+1;
	FinMientras
	
	Escribir "Numero 2";
	cont=cont-1;
	Mientras cont>=0 hacer
		Escribir num[cont];
		cont=cont-1;
	FinMientras
	
FinProceso
