Proceso sin_titulo
	Definir num,total,i Como Entero;
	total=0;
	Dimension num[5];
	
	num[0]=1;
	num[1]=3;
	num[2]=6;
	num[3]=82;
	num[4]=23;
	
	para i=0 hasta 4 Con Paso 1 Hacer
		total = total + num[i];
	FinPara
	
	Escribir "La suma total es: ", total;
FinProceso
