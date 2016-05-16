Proceso sin_titulo
	Definir num,pos,i,menor Como Entero;
	Dimension num[6];
	pos=0;
	num[0]=90;
	num[1]=1;
	num[2]=38;
	num[3]=0;
	num[4]=29;
	num[5]=4;
	menor = num[0];
	
	para i=0 hasta 5 Con Paso 1 Hacer
		si(menor>num[i]) Entonces
			pos = i;
			menor = num[i];
		FinSi
		
	FinPara
	Escribir "El menor es: ", menor," En la posicion: ",pos;
	//El siguiente codigo funcionaba cuando menor tomaba valor 1000;
//	Si (menor != 1000) entonces
//		Escribir "El menor es: ", menor," En la posicion: ",pos;
//	Sino
//		Escribir "Error";
//	FinSi

FinProceso