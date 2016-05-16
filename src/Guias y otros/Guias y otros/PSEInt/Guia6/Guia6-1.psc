Proceso Guia6
	definir array,i,total Como Entero;
	dimension array[20];
	total=0;
	
	para i=0 hasta 19 con paso 1 Hacer
		array[i]=10*(2^i);
		total=array[i]+total;
	FinPara
	
	para i=0 hasta 19 con paso 1 Hacer
		Escribir "El mes n°",i+1," debe pagar $",array[i];
	FinPara
	
	Escribir "Despues de 20 meses pago un total de: $",total;
FinProceso
