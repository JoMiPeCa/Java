Proceso Guia6
	definir array,i,total,final Como Entero;
	dimension array[11];
	Dimension total[11];
	final=0;
	
	array[0]=1;
	array[1]=5;
	array[2]=10;
	array[3]=50;
	array[4]=100;
	array[5]=500;
	array[6]=1000;
	array[7]=2000;
	array[8]=5000;
	array[9]=10000;
	array[10]=20000;
	
	para i=0 hasta 10 con paso 1 Hacer
		Escribir "Ingrese la cantidad de $",array[i],":";
		Leer total[i];
		final=final+(total[i]*array[i]);
	FinPara
	
	Escribir "Total: $",final;
FinProceso
