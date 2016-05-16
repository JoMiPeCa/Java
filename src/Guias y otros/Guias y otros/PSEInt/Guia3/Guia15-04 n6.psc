Proceso sin_titulo
	Definir array,total,i,cont Como Entero;
	total=0;
	cont=0;
	Dimension array[6];
	
	array[0]=40;
	array[1]=30;
	array[2]=60;
	array[3]=70;
	array[4]=39;
	array[5]=50;
	
	para i=0 hasta 5 Con Paso 1 Hacer
		total =  total+array[i];
		cont=cont+1;
	FinPara
	total=TRUNC(total/cont);
	Escribir "Promedio de las notas: ",total;
	
	para i=0 hasta 5 Con Paso 1 Hacer
		Si array[i] > total entonces
			Escribir "Nota Mayor al Promedio:", array[i];
		FinSi
	FinPara
FinProceso
